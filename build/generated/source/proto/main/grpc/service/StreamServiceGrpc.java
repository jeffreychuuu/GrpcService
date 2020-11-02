package service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: stream.proto")
public final class StreamServiceGrpc {

  private StreamServiceGrpc() {}

  public static final String SERVICE_NAME = "service.StreamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.Stream.RequestData,
      service.Stream.ResponseData> getSimpleServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimpleService",
      requestType = service.Stream.RequestData.class,
      responseType = service.Stream.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.Stream.RequestData,
      service.Stream.ResponseData> getSimpleServiceMethod() {
    io.grpc.MethodDescriptor<service.Stream.RequestData, service.Stream.ResponseData> getSimpleServiceMethod;
    if ((getSimpleServiceMethod = StreamServiceGrpc.getSimpleServiceMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getSimpleServiceMethod = StreamServiceGrpc.getSimpleServiceMethod) == null) {
          StreamServiceGrpc.getSimpleServiceMethod = getSimpleServiceMethod =
              io.grpc.MethodDescriptor.<service.Stream.RequestData, service.Stream.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SimpleService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Stream.RequestData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Stream.ResponseData.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("SimpleService"))
              .build();
        }
      }
    }
    return getSimpleServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.Stream.RequestData,
      service.Stream.ResponseData> getServerSideStreamServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerSideStreamService",
      requestType = service.Stream.RequestData.class,
      responseType = service.Stream.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<service.Stream.RequestData,
      service.Stream.ResponseData> getServerSideStreamServiceMethod() {
    io.grpc.MethodDescriptor<service.Stream.RequestData, service.Stream.ResponseData> getServerSideStreamServiceMethod;
    if ((getServerSideStreamServiceMethod = StreamServiceGrpc.getServerSideStreamServiceMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getServerSideStreamServiceMethod = StreamServiceGrpc.getServerSideStreamServiceMethod) == null) {
          StreamServiceGrpc.getServerSideStreamServiceMethod = getServerSideStreamServiceMethod =
              io.grpc.MethodDescriptor.<service.Stream.RequestData, service.Stream.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerSideStreamService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Stream.RequestData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Stream.ResponseData.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("ServerSideStreamService"))
              .build();
        }
      }
    }
    return getServerSideStreamServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.Stream.RequestData,
      service.Stream.ResponseData> getClientSideStreamServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientSideStreamService",
      requestType = service.Stream.RequestData.class,
      responseType = service.Stream.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<service.Stream.RequestData,
      service.Stream.ResponseData> getClientSideStreamServiceMethod() {
    io.grpc.MethodDescriptor<service.Stream.RequestData, service.Stream.ResponseData> getClientSideStreamServiceMethod;
    if ((getClientSideStreamServiceMethod = StreamServiceGrpc.getClientSideStreamServiceMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getClientSideStreamServiceMethod = StreamServiceGrpc.getClientSideStreamServiceMethod) == null) {
          StreamServiceGrpc.getClientSideStreamServiceMethod = getClientSideStreamServiceMethod =
              io.grpc.MethodDescriptor.<service.Stream.RequestData, service.Stream.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClientSideStreamService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Stream.RequestData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Stream.ResponseData.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("ClientSideStreamService"))
              .build();
        }
      }
    }
    return getClientSideStreamServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.Stream.RequestData,
      service.Stream.ResponseData> getBiDirectionalStreamServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BiDirectionalStreamService",
      requestType = service.Stream.RequestData.class,
      responseType = service.Stream.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<service.Stream.RequestData,
      service.Stream.ResponseData> getBiDirectionalStreamServiceMethod() {
    io.grpc.MethodDescriptor<service.Stream.RequestData, service.Stream.ResponseData> getBiDirectionalStreamServiceMethod;
    if ((getBiDirectionalStreamServiceMethod = StreamServiceGrpc.getBiDirectionalStreamServiceMethod) == null) {
      synchronized (StreamServiceGrpc.class) {
        if ((getBiDirectionalStreamServiceMethod = StreamServiceGrpc.getBiDirectionalStreamServiceMethod) == null) {
          StreamServiceGrpc.getBiDirectionalStreamServiceMethod = getBiDirectionalStreamServiceMethod =
              io.grpc.MethodDescriptor.<service.Stream.RequestData, service.Stream.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BiDirectionalStreamService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Stream.RequestData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.Stream.ResponseData.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServiceMethodDescriptorSupplier("BiDirectionalStreamService"))
              .build();
        }
      }
    }
    return getBiDirectionalStreamServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamServiceStub>() {
        @java.lang.Override
        public StreamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamServiceStub(channel, callOptions);
        }
      };
    return StreamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamServiceBlockingStub>() {
        @java.lang.Override
        public StreamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamServiceBlockingStub(channel, callOptions);
        }
      };
    return StreamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StreamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamServiceFutureStub>() {
        @java.lang.Override
        public StreamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamServiceFutureStub(channel, callOptions);
        }
      };
    return StreamServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StreamServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void simpleService(service.Stream.RequestData request,
        io.grpc.stub.StreamObserver<service.Stream.ResponseData> responseObserver) {
      asyncUnimplementedUnaryCall(getSimpleServiceMethod(), responseObserver);
    }

    /**
     */
    public void serverSideStreamService(service.Stream.RequestData request,
        io.grpc.stub.StreamObserver<service.Stream.ResponseData> responseObserver) {
      asyncUnimplementedUnaryCall(getServerSideStreamServiceMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<service.Stream.RequestData> clientSideStreamService(
        io.grpc.stub.StreamObserver<service.Stream.ResponseData> responseObserver) {
      return asyncUnimplementedStreamingCall(getClientSideStreamServiceMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<service.Stream.RequestData> biDirectionalStreamService(
        io.grpc.stub.StreamObserver<service.Stream.ResponseData> responseObserver) {
      return asyncUnimplementedStreamingCall(getBiDirectionalStreamServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSimpleServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.Stream.RequestData,
                service.Stream.ResponseData>(
                  this, METHODID_SIMPLE_SERVICE)))
          .addMethod(
            getServerSideStreamServiceMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                service.Stream.RequestData,
                service.Stream.ResponseData>(
                  this, METHODID_SERVER_SIDE_STREAM_SERVICE)))
          .addMethod(
            getClientSideStreamServiceMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                service.Stream.RequestData,
                service.Stream.ResponseData>(
                  this, METHODID_CLIENT_SIDE_STREAM_SERVICE)))
          .addMethod(
            getBiDirectionalStreamServiceMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                service.Stream.RequestData,
                service.Stream.ResponseData>(
                  this, METHODID_BI_DIRECTIONAL_STREAM_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class StreamServiceStub extends io.grpc.stub.AbstractAsyncStub<StreamServiceStub> {
    private StreamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamServiceStub(channel, callOptions);
    }

    /**
     */
    public void simpleService(service.Stream.RequestData request,
        io.grpc.stub.StreamObserver<service.Stream.ResponseData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSimpleServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverSideStreamService(service.Stream.RequestData request,
        io.grpc.stub.StreamObserver<service.Stream.ResponseData> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getServerSideStreamServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<service.Stream.RequestData> clientSideStreamService(
        io.grpc.stub.StreamObserver<service.Stream.ResponseData> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClientSideStreamServiceMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<service.Stream.RequestData> biDirectionalStreamService(
        io.grpc.stub.StreamObserver<service.Stream.ResponseData> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBiDirectionalStreamServiceMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StreamServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StreamServiceBlockingStub> {
    private StreamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.Stream.ResponseData simpleService(service.Stream.RequestData request) {
      return blockingUnaryCall(
          getChannel(), getSimpleServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<service.Stream.ResponseData> serverSideStreamService(
        service.Stream.RequestData request) {
      return blockingServerStreamingCall(
          getChannel(), getServerSideStreamServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StreamServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StreamServiceFutureStub> {
    private StreamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.Stream.ResponseData> simpleService(
        service.Stream.RequestData request) {
      return futureUnaryCall(
          getChannel().newCall(getSimpleServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIMPLE_SERVICE = 0;
  private static final int METHODID_SERVER_SIDE_STREAM_SERVICE = 1;
  private static final int METHODID_CLIENT_SIDE_STREAM_SERVICE = 2;
  private static final int METHODID_BI_DIRECTIONAL_STREAM_SERVICE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StreamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIMPLE_SERVICE:
          serviceImpl.simpleService((service.Stream.RequestData) request,
              (io.grpc.stub.StreamObserver<service.Stream.ResponseData>) responseObserver);
          break;
        case METHODID_SERVER_SIDE_STREAM_SERVICE:
          serviceImpl.serverSideStreamService((service.Stream.RequestData) request,
              (io.grpc.stub.StreamObserver<service.Stream.ResponseData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLIENT_SIDE_STREAM_SERVICE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientSideStreamService(
              (io.grpc.stub.StreamObserver<service.Stream.ResponseData>) responseObserver);
        case METHODID_BI_DIRECTIONAL_STREAM_SERVICE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biDirectionalStreamService(
              (io.grpc.stub.StreamObserver<service.Stream.ResponseData>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.Stream.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StreamService");
    }
  }

  private static final class StreamServiceFileDescriptorSupplier
      extends StreamServiceBaseDescriptorSupplier {
    StreamServiceFileDescriptorSupplier() {}
  }

  private static final class StreamServiceMethodDescriptorSupplier
      extends StreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StreamServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreamServiceFileDescriptorSupplier())
              .addMethod(getSimpleServiceMethod())
              .addMethod(getServerSideStreamServiceMethod())
              .addMethod(getClientSideStreamServiceMethod())
              .addMethod(getBiDirectionalStreamServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
