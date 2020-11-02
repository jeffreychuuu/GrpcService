package serverside;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import service.StreamServiceGrpc;
import service.StreamServiceGrpc.StreamServiceBlockingStub;
import service.Stream.RequestData;
import service.Stream.ResponseData;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    private static final Logger logger = Logger.getLogger(simple.Client.class.getName());
    private final StreamServiceBlockingStub blockingStub;

    public Client(Channel channel) {
        blockingStub = StreamServiceGrpc.newBlockingStub(channel);
    }

    public void send(String name, String message) {
        logger.info("Will try to send '" + message + "' to server by " + name + "...");
        RequestData request = RequestData.newBuilder()
                .setName(name)
                .setMessage(message)
                .build();

        Iterator<ResponseData> response;
        try {
            response = blockingStub.serverSideStreamService(request);
            long start = System.currentTimeMillis();
            while (response.hasNext()) {
                System.out.println(response.next().getMessage());
            }
            System.out.println(System.currentTimeMillis() - start + " MS");
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
    }

    public static void main(String[] args) throws Exception {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("What message you would like to send to server?");
        String message = br.readLine();

        try {
            Client client = new Client(channel);
            client.send(name, message);
        } finally {
            channel.shutdown();
        }
    }
}
