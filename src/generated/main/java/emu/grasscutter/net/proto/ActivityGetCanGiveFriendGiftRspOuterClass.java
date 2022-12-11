// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityGetCanGiveFriendGiftRsp.proto

package emu.grasscutter.net.proto;

public final class ActivityGetCanGiveFriendGiftRspOuterClass {
  private ActivityGetCanGiveFriendGiftRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityGetCanGiveFriendGiftRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityGetCanGiveFriendGiftRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
     */
    int getGiftNumMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
     */
    boolean containsGiftNumMap(
        int key);
    /**
     * Use {@link #getGiftNumMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getGiftNumMap();
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getGiftNumMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
     */

    int getGiftNumMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
     */

    int getGiftNumMapOrThrow(
        int key);

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 schedule_id = 12;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8374;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ActivityGetCanGiveFriendGiftRsp}
   */
  public static final class ActivityGetCanGiveFriendGiftRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityGetCanGiveFriendGiftRsp)
      ActivityGetCanGiveFriendGiftRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityGetCanGiveFriendGiftRsp.newBuilder() to construct.
    private ActivityGetCanGiveFriendGiftRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityGetCanGiveFriendGiftRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityGetCanGiveFriendGiftRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityGetCanGiveFriendGiftRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 58: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                giftNumMap_ = com.google.protobuf.MapField.newMapField(
                    GiftNumMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              giftNumMap__ = input.readMessage(
                  GiftNumMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              giftNumMap_.getMutableMap().put(
                  giftNumMap__.getKey(), giftNumMap__.getValue());
              break;
            }
            case 88: {

              retcode_ = input.readInt32();
              break;
            }
            case 96: {

              scheduleId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.internal_static_ActivityGetCanGiveFriendGiftRsp_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 7:
          return internalGetGiftNumMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.internal_static_ActivityGetCanGiveFriendGiftRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp.class, emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp.Builder.class);
    }

    public static final int GIFT_NUM_MAP_FIELD_NUMBER = 7;
    private static final class GiftNumMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.internal_static_ActivityGetCanGiveFriendGiftRsp_GiftNumMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> giftNumMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetGiftNumMap() {
      if (giftNumMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            GiftNumMapDefaultEntryHolder.defaultEntry);
      }
      return giftNumMap_;
    }

    public int getGiftNumMapCount() {
      return internalGetGiftNumMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
     */

    @java.lang.Override
    public boolean containsGiftNumMap(
        int key) {
      
      return internalGetGiftNumMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getGiftNumMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getGiftNumMap() {
      return getGiftNumMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getGiftNumMapMap() {
      return internalGetGiftNumMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
     */
    @java.lang.Override

    public int getGiftNumMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetGiftNumMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
     */
    @java.lang.Override

    public int getGiftNumMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetGiftNumMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 12;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 12;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetGiftNumMap(),
          GiftNumMapDefaultEntryHolder.defaultEntry,
          7);
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(12, scheduleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetGiftNumMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        giftNumMap__ = GiftNumMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(7, giftNumMap__);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, scheduleId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp other = (emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp) obj;

      if (!internalGetGiftNumMap().equals(
          other.internalGetGiftNumMap())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
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
      if (!internalGetGiftNumMap().getMap().isEmpty()) {
        hash = (37 * hash) + GIFT_NUM_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetGiftNumMap().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp prototype) {
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
     *   CMD_ID = 8374;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ActivityGetCanGiveFriendGiftRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityGetCanGiveFriendGiftRsp)
        emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.internal_static_ActivityGetCanGiveFriendGiftRsp_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 7:
            return internalGetGiftNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 7:
            return internalGetMutableGiftNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.internal_static_ActivityGetCanGiveFriendGiftRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp.class, emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp.newBuilder()
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
        internalGetMutableGiftNumMap().clear();
        retcode_ = 0;

        scheduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.internal_static_ActivityGetCanGiveFriendGiftRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp build() {
        emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp buildPartial() {
        emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp result = new emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp(this);
        int from_bitField0_ = bitField0_;
        result.giftNumMap_ = internalGetGiftNumMap();
        result.giftNumMap_.makeImmutable();
        result.retcode_ = retcode_;
        result.scheduleId_ = scheduleId_;
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
        if (other instanceof emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp other) {
        if (other == emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp.getDefaultInstance()) return this;
        internalGetMutableGiftNumMap().mergeFrom(
            other.internalGetGiftNumMap());
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
        emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> giftNumMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetGiftNumMap() {
        if (giftNumMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              GiftNumMapDefaultEntryHolder.defaultEntry);
        }
        return giftNumMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableGiftNumMap() {
        onChanged();;
        if (giftNumMap_ == null) {
          giftNumMap_ = com.google.protobuf.MapField.newMapField(
              GiftNumMapDefaultEntryHolder.defaultEntry);
        }
        if (!giftNumMap_.isMutable()) {
          giftNumMap_ = giftNumMap_.copy();
        }
        return giftNumMap_;
      }

      public int getGiftNumMapCount() {
        return internalGetGiftNumMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
       */

      @java.lang.Override
      public boolean containsGiftNumMap(
          int key) {
        
        return internalGetGiftNumMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getGiftNumMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getGiftNumMap() {
        return getGiftNumMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getGiftNumMapMap() {
        return internalGetGiftNumMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
       */
      @java.lang.Override

      public int getGiftNumMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetGiftNumMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
       */
      @java.lang.Override

      public int getGiftNumMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetGiftNumMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearGiftNumMap() {
        internalGetMutableGiftNumMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
       */

      public Builder removeGiftNumMap(
          int key) {
        
        internalGetMutableGiftNumMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableGiftNumMap() {
        return internalGetMutableGiftNumMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
       */
      public Builder putGiftNumMap(
          int key,
          int value) {
        
        
        internalGetMutableGiftNumMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 7;</code>
       */

      public Builder putAllGiftNumMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableGiftNumMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 12;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 12;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityGetCanGiveFriendGiftRsp)
    }

    // @@protoc_insertion_point(class_scope:ActivityGetCanGiveFriendGiftRsp)
    private static final emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp();
    }

    public static emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityGetCanGiveFriendGiftRsp>
        PARSER = new com.google.protobuf.AbstractParser<ActivityGetCanGiveFriendGiftRsp>() {
      @java.lang.Override
      public ActivityGetCanGiveFriendGiftRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityGetCanGiveFriendGiftRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityGetCanGiveFriendGiftRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityGetCanGiveFriendGiftRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityGetCanGiveFriendGiftRspOuterClass.ActivityGetCanGiveFriendGiftRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityGetCanGiveFriendGiftRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityGetCanGiveFriendGiftRsp_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityGetCanGiveFriendGiftRsp_GiftNumMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityGetCanGiveFriendGiftRsp_GiftNumMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%ActivityGetCanGiveFriendGiftRsp.proto\"" +
      "\302\001\n\037ActivityGetCanGiveFriendGiftRsp\022F\n\014g" +
      "ift_num_map\030\007 \003(\01320.ActivityGetCanGiveFr" +
      "iendGiftRsp.GiftNumMapEntry\022\017\n\007retcode\030\013" +
      " \001(\005\022\023\n\013schedule_id\030\014 \001(\r\0321\n\017GiftNumMapE" +
      "ntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityGetCanGiveFriendGiftRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityGetCanGiveFriendGiftRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityGetCanGiveFriendGiftRsp_descriptor,
        new java.lang.String[] { "GiftNumMap", "Retcode", "ScheduleId", });
    internal_static_ActivityGetCanGiveFriendGiftRsp_GiftNumMapEntry_descriptor =
      internal_static_ActivityGetCanGiveFriendGiftRsp_descriptor.getNestedTypes().get(0);
    internal_static_ActivityGetCanGiveFriendGiftRsp_GiftNumMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityGetCanGiveFriendGiftRsp_GiftNumMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
