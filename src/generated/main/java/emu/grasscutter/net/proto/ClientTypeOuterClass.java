// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientType.proto

package emu.grasscutter.net.proto;

public final class ClientTypeOuterClass {
  private ClientTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ClientType}
   */
  public enum ClientType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CLIENT_TYPE_PRODUCT = 0;</code>
     */
    CLIENT_TYPE_PRODUCT(0),
    /**
     * <code>CLIENT_TYPE_DEV = 1;</code>
     */
    CLIENT_TYPE_DEV(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CLIENT_TYPE_PRODUCT = 0;</code>
     */
    public static final int CLIENT_TYPE_PRODUCT_VALUE = 0;
    /**
     * <code>CLIENT_TYPE_DEV = 1;</code>
     */
    public static final int CLIENT_TYPE_DEV_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ClientType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ClientType forNumber(int value) {
      switch (value) {
        case 0: return CLIENT_TYPE_PRODUCT;
        case 1: return CLIENT_TYPE_DEV;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ClientType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ClientType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ClientType>() {
            public ClientType findValueByNumber(int number) {
              return ClientType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ClientTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ClientType[] VALUES = values();

    public static ClientType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ClientType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ClientType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020ClientType.proto*:\n\nClientType\022\027\n\023CLIE" +
      "NT_TYPE_PRODUCT\020\000\022\023\n\017CLIENT_TYPE_DEV\020\001B\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
