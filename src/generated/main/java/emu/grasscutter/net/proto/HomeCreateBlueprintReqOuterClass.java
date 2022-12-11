// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeCreateBlueprintReq.proto

package emu.grasscutter.net.proto;

public final class HomeCreateBlueprintReqOuterClass {
  private HomeCreateBlueprintReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeCreateBlueprintReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeCreateBlueprintReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
     * @return Whether the sceneArrangementInfo field is set.
     */
    boolean hasSceneArrangementInfo();
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
     * @return The sceneArrangementInfo.
     */
    emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo();
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
     */
    emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder();

    /**
     * <code>uint32 gen_share_code_count = 9;</code>
     * @return The genShareCodeCount.
     */
    int getGenShareCodeCount();

    /**
     * <code>string server_share_code = 5;</code>
     * @return The serverShareCode.
     */
    java.lang.String getServerShareCode();
    /**
     * <code>string server_share_code = 5;</code>
     * @return The bytes for serverShareCode.
     */
    com.google.protobuf.ByteString
        getServerShareCodeBytes();

    /**
     * <code>uint32 slot_id = 15;</code>
     * @return The slotId.
     */
    int getSlotId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4539;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HomeCreateBlueprintReq}
   */
  public static final class HomeCreateBlueprintReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeCreateBlueprintReq)
      HomeCreateBlueprintReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeCreateBlueprintReq.newBuilder() to construct.
    private HomeCreateBlueprintReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeCreateBlueprintReq() {
      serverShareCode_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeCreateBlueprintReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeCreateBlueprintReq(
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
            case 34: {
              emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder subBuilder = null;
              if (sceneArrangementInfo_ != null) {
                subBuilder = sceneArrangementInfo_.toBuilder();
              }
              sceneArrangementInfo_ = input.readMessage(emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(sceneArrangementInfo_);
                sceneArrangementInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              serverShareCode_ = s;
              break;
            }
            case 72: {

              genShareCodeCount_ = input.readUInt32();
              break;
            }
            case 120: {

              slotId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.internal_static_HomeCreateBlueprintReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.internal_static_HomeCreateBlueprintReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.class, emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.Builder.class);
    }

    public static final int SCENE_ARRANGEMENT_INFO_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo sceneArrangementInfo_;
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
     * @return Whether the sceneArrangementInfo field is set.
     */
    @java.lang.Override
    public boolean hasSceneArrangementInfo() {
      return sceneArrangementInfo_ != null;
    }
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
     * @return The sceneArrangementInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo() {
      return sceneArrangementInfo_ == null ? emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : sceneArrangementInfo_;
    }
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder() {
      return getSceneArrangementInfo();
    }

    public static final int GEN_SHARE_CODE_COUNT_FIELD_NUMBER = 9;
    private int genShareCodeCount_;
    /**
     * <code>uint32 gen_share_code_count = 9;</code>
     * @return The genShareCodeCount.
     */
    @java.lang.Override
    public int getGenShareCodeCount() {
      return genShareCodeCount_;
    }

    public static final int SERVER_SHARE_CODE_FIELD_NUMBER = 5;
    private volatile java.lang.Object serverShareCode_;
    /**
     * <code>string server_share_code = 5;</code>
     * @return The serverShareCode.
     */
    @java.lang.Override
    public java.lang.String getServerShareCode() {
      java.lang.Object ref = serverShareCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serverShareCode_ = s;
        return s;
      }
    }
    /**
     * <code>string server_share_code = 5;</code>
     * @return The bytes for serverShareCode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getServerShareCodeBytes() {
      java.lang.Object ref = serverShareCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverShareCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SLOT_ID_FIELD_NUMBER = 15;
    private int slotId_;
    /**
     * <code>uint32 slot_id = 15;</code>
     * @return The slotId.
     */
    @java.lang.Override
    public int getSlotId() {
      return slotId_;
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
      if (sceneArrangementInfo_ != null) {
        output.writeMessage(4, getSceneArrangementInfo());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverShareCode_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, serverShareCode_);
      }
      if (genShareCodeCount_ != 0) {
        output.writeUInt32(9, genShareCodeCount_);
      }
      if (slotId_ != 0) {
        output.writeUInt32(15, slotId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneArrangementInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getSceneArrangementInfo());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverShareCode_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, serverShareCode_);
      }
      if (genShareCodeCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, genShareCodeCount_);
      }
      if (slotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, slotId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq other = (emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq) obj;

      if (hasSceneArrangementInfo() != other.hasSceneArrangementInfo()) return false;
      if (hasSceneArrangementInfo()) {
        if (!getSceneArrangementInfo()
            .equals(other.getSceneArrangementInfo())) return false;
      }
      if (getGenShareCodeCount()
          != other.getGenShareCodeCount()) return false;
      if (!getServerShareCode()
          .equals(other.getServerShareCode())) return false;
      if (getSlotId()
          != other.getSlotId()) return false;
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
      if (hasSceneArrangementInfo()) {
        hash = (37 * hash) + SCENE_ARRANGEMENT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSceneArrangementInfo().hashCode();
      }
      hash = (37 * hash) + GEN_SHARE_CODE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getGenShareCodeCount();
      hash = (37 * hash) + SERVER_SHARE_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getServerShareCode().hashCode();
      hash = (37 * hash) + SLOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSlotId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq prototype) {
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
     * <pre>
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 4539;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HomeCreateBlueprintReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeCreateBlueprintReq)
        emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.internal_static_HomeCreateBlueprintReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.internal_static_HomeCreateBlueprintReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.class, emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.newBuilder()
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
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfo_ = null;
        } else {
          sceneArrangementInfo_ = null;
          sceneArrangementInfoBuilder_ = null;
        }
        genShareCodeCount_ = 0;

        serverShareCode_ = "";

        slotId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.internal_static_HomeCreateBlueprintReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq build() {
        emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq buildPartial() {
        emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq result = new emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq(this);
        if (sceneArrangementInfoBuilder_ == null) {
          result.sceneArrangementInfo_ = sceneArrangementInfo_;
        } else {
          result.sceneArrangementInfo_ = sceneArrangementInfoBuilder_.build();
        }
        result.genShareCodeCount_ = genShareCodeCount_;
        result.serverShareCode_ = serverShareCode_;
        result.slotId_ = slotId_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq) {
          return mergeFrom((emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq other) {
        if (other == emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.getDefaultInstance()) return this;
        if (other.hasSceneArrangementInfo()) {
          mergeSceneArrangementInfo(other.getSceneArrangementInfo());
        }
        if (other.getGenShareCodeCount() != 0) {
          setGenShareCodeCount(other.getGenShareCodeCount());
        }
        if (!other.getServerShareCode().isEmpty()) {
          serverShareCode_ = other.serverShareCode_;
          onChanged();
        }
        if (other.getSlotId() != 0) {
          setSlotId(other.getSlotId());
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
        emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo sceneArrangementInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> sceneArrangementInfoBuilder_;
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
       * @return Whether the sceneArrangementInfo field is set.
       */
      public boolean hasSceneArrangementInfo() {
        return sceneArrangementInfoBuilder_ != null || sceneArrangementInfo_ != null;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
       * @return The sceneArrangementInfo.
       */
      public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo() {
        if (sceneArrangementInfoBuilder_ == null) {
          return sceneArrangementInfo_ == null ? emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : sceneArrangementInfo_;
        } else {
          return sceneArrangementInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
       */
      public Builder setSceneArrangementInfo(emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
        if (sceneArrangementInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          sceneArrangementInfo_ = value;
          onChanged();
        } else {
          sceneArrangementInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
       */
      public Builder setSceneArrangementInfo(
          emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder builderForValue) {
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfo_ = builderForValue.build();
          onChanged();
        } else {
          sceneArrangementInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
       */
      public Builder mergeSceneArrangementInfo(emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
        if (sceneArrangementInfoBuilder_ == null) {
          if (sceneArrangementInfo_ != null) {
            sceneArrangementInfo_ =
              emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.newBuilder(sceneArrangementInfo_).mergeFrom(value).buildPartial();
          } else {
            sceneArrangementInfo_ = value;
          }
          onChanged();
        } else {
          sceneArrangementInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
       */
      public Builder clearSceneArrangementInfo() {
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfo_ = null;
          onChanged();
        } else {
          sceneArrangementInfo_ = null;
          sceneArrangementInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
       */
      public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder getSceneArrangementInfoBuilder() {
        
        onChanged();
        return getSceneArrangementInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
       */
      public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder() {
        if (sceneArrangementInfoBuilder_ != null) {
          return sceneArrangementInfoBuilder_.getMessageOrBuilder();
        } else {
          return sceneArrangementInfo_ == null ?
              emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : sceneArrangementInfo_;
        }
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> 
          getSceneArrangementInfoFieldBuilder() {
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder>(
                  getSceneArrangementInfo(),
                  getParentForChildren(),
                  isClean());
          sceneArrangementInfo_ = null;
        }
        return sceneArrangementInfoBuilder_;
      }

      private int genShareCodeCount_ ;
      /**
       * <code>uint32 gen_share_code_count = 9;</code>
       * @return The genShareCodeCount.
       */
      @java.lang.Override
      public int getGenShareCodeCount() {
        return genShareCodeCount_;
      }
      /**
       * <code>uint32 gen_share_code_count = 9;</code>
       * @param value The genShareCodeCount to set.
       * @return This builder for chaining.
       */
      public Builder setGenShareCodeCount(int value) {
        
        genShareCodeCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gen_share_code_count = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGenShareCodeCount() {
        
        genShareCodeCount_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object serverShareCode_ = "";
      /**
       * <code>string server_share_code = 5;</code>
       * @return The serverShareCode.
       */
      public java.lang.String getServerShareCode() {
        java.lang.Object ref = serverShareCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          serverShareCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string server_share_code = 5;</code>
       * @return The bytes for serverShareCode.
       */
      public com.google.protobuf.ByteString
          getServerShareCodeBytes() {
        java.lang.Object ref = serverShareCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serverShareCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string server_share_code = 5;</code>
       * @param value The serverShareCode to set.
       * @return This builder for chaining.
       */
      public Builder setServerShareCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        serverShareCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string server_share_code = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerShareCode() {
        
        serverShareCode_ = getDefaultInstance().getServerShareCode();
        onChanged();
        return this;
      }
      /**
       * <code>string server_share_code = 5;</code>
       * @param value The bytes for serverShareCode to set.
       * @return This builder for chaining.
       */
      public Builder setServerShareCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        serverShareCode_ = value;
        onChanged();
        return this;
      }

      private int slotId_ ;
      /**
       * <code>uint32 slot_id = 15;</code>
       * @return The slotId.
       */
      @java.lang.Override
      public int getSlotId() {
        return slotId_;
      }
      /**
       * <code>uint32 slot_id = 15;</code>
       * @param value The slotId to set.
       * @return This builder for chaining.
       */
      public Builder setSlotId(int value) {
        
        slotId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slot_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlotId() {
        
        slotId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeCreateBlueprintReq)
    }

    // @@protoc_insertion_point(class_scope:HomeCreateBlueprintReq)
    private static final emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq();
    }

    public static emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeCreateBlueprintReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeCreateBlueprintReq>() {
      @java.lang.Override
      public HomeCreateBlueprintReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeCreateBlueprintReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeCreateBlueprintReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeCreateBlueprintReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeCreateBlueprintReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeCreateBlueprintReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034HomeCreateBlueprintReq.proto\032\036HomeScen" +
      "eArrangementInfo.proto\"\235\001\n\026HomeCreateBlu" +
      "eprintReq\0229\n\026scene_arrangement_info\030\004 \001(" +
      "\0132\031.HomeSceneArrangementInfo\022\034\n\024gen_shar" +
      "e_code_count\030\t \001(\r\022\031\n\021server_share_code\030" +
      "\005 \001(\t\022\017\n\007slot_id\030\017 \001(\rB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeCreateBlueprintReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeCreateBlueprintReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeCreateBlueprintReq_descriptor,
        new java.lang.String[] { "SceneArrangementInfo", "GenShareCodeCount", "ServerShareCode", "SlotId", });
    emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
