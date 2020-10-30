import io.grpc.stub.StreamObserver;

public class HelloWorldServiceImpl extends HelloWorldServiceGrpc.HelloWorldServiceImplBase {
    @Override
    public void hello(
            Hello.HelloRequest request,
            StreamObserver<Hello.HelloResponse> responseObserver) {
        String requestor = request.getName();
        String req_message = request.getMessage();

        System.out.println("Requestor: " + requestor);
        System.out.println("Message to server: " + req_message);


        String greeting_message = "Receive message '" + req_message + "' from " + requestor;

        Hello.HelloResponse response =
                Hello.HelloResponse.newBuilder()
                        .setMessage(greeting_message).build();

        System.out.println("Response: " + response.getMessage());

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
