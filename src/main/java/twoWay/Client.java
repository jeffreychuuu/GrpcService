package twoWay;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import service.StreamServiceGrpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Logger;

import service.StreamServiceGrpc.*;
import service.Stream.*;

public class Client {
    private static final Logger logger = Logger.getLogger(simple.Client.class.getName());
    private final StreamServiceStub asyncStub;

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

    public Client(Channel channel) {
        asyncStub = StreamServiceGrpc.newStub(channel);
    }

    public void send(String name, String message) {
        StreamObserver<ResponseData> responseData = new StreamObserver<ResponseData>() {
            @Override
            public void onNext(ResponseData value) {
                // TODO Auto-generated method stub
                System.out.println(value.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                // TODO Auto-generated method stub
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                // TODO Auto-generated method stub
                // 關閉channel
                channel.shutdown();
            }
        };

        StreamObserver<RequestData> request = asyncStub.biDirectionStreamService(responseData);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            request.onNext(RequestData.newBuilder()
                    .setName(name)
                    .setMessage(message + " " + name + " " + i).build());
        }
        request.onCompleted();
        System.out.println(System.currentTimeMillis() - start + " MS");

        try{
            // 由於是異步獲得結果，所以sleep 10秒
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

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
