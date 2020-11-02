package service;

import io.grpc.stub.StreamObserver;
import service.Stream.RequestData;
import service.Stream.ResponseData;

public class StreamServiceImpl extends StreamServiceGrpc.StreamServiceImplBase {
    @Override
    public void simpleService(
            RequestData request,
            StreamObserver<ResponseData> responseObserver) {

        String requestor = request.getName();
        String req_message = request.getMessage();

        System.out.println("Requestor：" + requestor);
        System.out.println("Request Message：" + req_message);
        String greeting_message = "Receive message '" + req_message + "' from " + requestor;
        responseObserver.onNext(ResponseData.newBuilder().setMessage(greeting_message).build());
        responseObserver.onCompleted();
    }

    @Override
    public void serverSideStreamService(
            RequestData request,
            StreamObserver<ResponseData> responseObserver) {
        String requestor = request.getName();
        String req_message = request.getMessage();

        System.out.println("Requestor：" + requestor);
        System.out.println("Request Message：" + req_message);
        for (int i = 0; i < 10; i++) {
            responseObserver.onNext(ResponseData.newBuilder().setMessage("Hello " + requestor + " x" + i).build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<RequestData> clientSideStreamService(StreamObserver<ResponseData> responseObserver) {
        // TODO Auto-generated method stub
        return new StreamObserver<RequestData>() {
            private ResponseData.Builder builder = ResponseData.newBuilder();


            @Override
            public void onNext(RequestData request) {
                // TODO Auto-generated method stub
                System.out.println("Requestor：" + request.getName());
                System.out.println("Request Message：" + request.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onCompleted() {
                // TODO Auto-generated method stub
                builder.setMessage("All request data received completely!");
                responseObserver.onNext(builder.build());
                responseObserver.onCompleted();
            }

        };
    }

    @Override
    public StreamObserver<RequestData> biDirectionalStreamService(StreamObserver<ResponseData> responseObserver) {
        // TODO Auto-generated method stub
        return new StreamObserver<RequestData>() {

            @Override
            public void onNext(RequestData request) {
                // TODO Auto-generated method stub
                System.out.println("Requestor：" + request.getName());
                System.out.println("Request Message：" + request.getMessage());
                responseObserver.onNext(ResponseData.newBuilder().setMessage(request.getMessage() + " - " + request.getName()).build());
            }

            @Override
            public void onError(Throwable t) {
                // TODO Auto-generated method stub
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                // TODO Auto-generated method stub
                responseObserver.onCompleted();
            }
        };
    }
}
