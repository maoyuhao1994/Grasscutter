// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameplayRecommendationElementReliquaryRequest.proto

package emu.grasscutter.net.proto;

public final class GameplayRecommendationElementReliquaryRequestOuterClass {
  private GameplayRecommendationElementReliquaryRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GameplayRecommendationElementReliquaryRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GameplayRecommendationElementReliquaryRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 element_type = 2;</code>
     * @return The elementType.
     */
    int getElementType();

    /**
     * <code>uint32 equip_type = 3;</code>
     * @return The equipType.
     */
    int getEquipType();
  }
  /**
   * Protobuf type {@code GameplayRecommendationElementReliquaryRequest}
   */
  public static final class GameplayRecommendationElementReliquaryRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GameplayRecommendationElementReliquaryRequest)
      GameplayRecommendationElementReliquaryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GameplayRecommendationElementReliquaryRequest.newBuilder() to construct.
    private GameplayRecommendationElementReliquaryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GameplayRecommendationElementReliquaryRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GameplayRecommendationElementReliquaryRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GameplayRecommendationElementReliquaryRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 16: {

              elementType_ = input.readUInt32();
              break;
            }
            case 24: {

              equipType_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.internal_static_GameplayRecommendationElementReliquaryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.internal_static_GameplayRecommendationElementReliquaryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest.class, emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest.Builder.class);
    }

    public static final int ELEMENT_TYPE_FIELD_NUMBER = 2;
    private int elementType_;
    /**
     * <code>uint32 element_type = 2;</code>
     * @return The elementType.
     */
    @java.lang.Override
    public int getElementType() {
      return elementType_;
    }

    public static final int EQUIP_TYPE_FIELD_NUMBER = 3;
    private int equipType_;
    /**
     * <code>uint32 equip_type = 3;</code>
     * @return The equipType.
     */
    @java.lang.Override
    public int getEquipType() {
      return equipType_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (elementType_ != 0) {
        output.writeUInt32(2, elementType_);
      }
      if (equipType_ != 0) {
        output.writeUInt32(3, equipType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (elementType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, elementType_);
      }
      if (equipType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, equipType_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest other = (emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest) obj;

      if (getElementType()
          != other.getElementType()) return false;
      if (getEquipType()
          != other.getEquipType()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ELEMENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getElementType();
      hash = (37 * hash) + EQUIP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getEquipType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code GameplayRecommendationElementReliquaryRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GameplayRecommendationElementReliquaryRequest)
        emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.internal_static_GameplayRecommendationElementReliquaryRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.internal_static_GameplayRecommendationElementReliquaryRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest.class, emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        elementType_ = 0;

        equipType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.internal_static_GameplayRecommendationElementReliquaryRequest_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest build() {
        emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest buildPartial() {
        emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest result = new emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest(this);
        result.elementType_ = elementType_;
        result.equipType_ = equipType_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest) {
          return mergeFrom((emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest other) {
        if (other == emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest.getDefaultInstance()) return this;
        if (other.getElementType() != 0) {
          setElementType(other.getElementType());
        }
        if (other.getEquipType() != 0) {
          setEquipType(other.getEquipType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int elementType_ ;
      /**
       * <code>uint32 element_type = 2;</code>
       * @return The elementType.
       */
      @java.lang.Override
      public int getElementType() {
        return elementType_;
      }
      /**
       * <code>uint32 element_type = 2;</code>
       * @param value The elementType to set.
       * @return This builder for chaining.
       */
      public Builder setElementType(int value) {
        
        elementType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 element_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementType() {
        
        elementType_ = 0;
        onChanged();
        return this;
      }

      private int equipType_ ;
      /**
       * <code>uint32 equip_type = 3;</code>
       * @return The equipType.
       */
      @java.lang.Override
      public int getEquipType() {
        return equipType_;
      }
      /**
       * <code>uint32 equip_type = 3;</code>
       * @param value The equipType to set.
       * @return This builder for chaining.
       */
      public Builder setEquipType(int value) {
        
        equipType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 equip_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEquipType() {
        
        equipType_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GameplayRecommendationElementReliquaryRequest)
    }

    // @@protoc_insertion_point(class_scope:GameplayRecommendationElementReliquaryRequest)
    private static final emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest();
    }

    public static emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GameplayRecommendationElementReliquaryRequest>
        PARSER = new com.google.protobuf.AbstractParser<GameplayRecommendationElementReliquaryRequest>() {
      @java.lang.Override
      public GameplayRecommendationElementReliquaryRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GameplayRecommendationElementReliquaryRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GameplayRecommendationElementReliquaryRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GameplayRecommendationElementReliquaryRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GameplayRecommendationElementReliquaryRequestOuterClass.GameplayRecommendationElementReliquaryRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GameplayRecommendationElementReliquaryRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GameplayRecommendationElementReliquaryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3GameplayRecommendationElementReliquary" +
      "Request.proto\"Y\n-GameplayRecommendationE" +
      "lementReliquaryRequest\022\024\n\014element_type\030\002" +
      " \001(\r\022\022\n\nequip_type\030\003 \001(\rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GameplayRecommendationElementReliquaryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GameplayRecommendationElementReliquaryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GameplayRecommendationElementReliquaryRequest_descriptor,
        new java.lang.String[] { "ElementType", "EquipType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
