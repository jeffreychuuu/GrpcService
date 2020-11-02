package twoWay;

import io.grpc.ServerBuilder;
import service.StreamServiceImpl;

import java.io.IOException;

public class Server {
    private static final int PORT = 50051;
    private io.grpc.Server server;

    public void start() throws IOException {
        server = ServerBuilder.forPort(PORT)
                .addService(new StreamServiceImpl())
                .build()
                .start();
        System.out.println("Server start success on port:" + PORT);
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server == null) {
            return;
        }

        server.awaitTermination();
    }

    public static void main(String[] args)
            throws InterruptedException, IOException {
        Server server = new Server();
        server.start();
        server.blockUntilShutdown();
    }
}