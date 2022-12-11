// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrialAvatarActivityRewardDetailInfo.proto

package emu.grasscutter.net.proto;

public final class TrialAvatarActivityRewardDetailInfoOuterClass {
  private TrialAvatarActivityRewardDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TrialAvatarActivityRewardDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TrialAvatarActivityRewardDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 trial_avatar_index_id = 4;</code>
     * @return The trialAvatarIndexId.
     */
    int getTrialAvatarIndexId();

    /**
     * <code>bool Unk3300_IFEPGCKHODL = 14;</code>
     * @return The unk3300IFEPGCKHODL.
     */
    boolean getUnk3300IFEPGCKHODL();

    /**
     * <code>bool Unk3300_NEJLGBBFDPH = 5;</code>
     * @return The unk3300NEJLGBBFDPH.
     */
    boolean getUnk3300NEJLGBBFDPH();

    /**
     * <code>uint32 reward_id = 11;</code>
     * @return The rewardId.
     */
    int getRewardId();
  }
  /**
   * Protobuf type {@code TrialAvatarActivityRewardDetailInfo}
   */
  public static final class TrialAvatarActivityRewardDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TrialAvatarActivityRewardDetailInfo)
      TrialAvatarActivityRewardDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TrialAvatarActivityRewardDetailInfo.newBuilder() to construct.
    private TrialAvatarActivityRewardDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TrialAvatarActivityRewardDetailInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TrialAvatarActivityRewardDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TrialAvatarActivityRewardDetailInfo(
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
            case 32: {

              trialAvatarIndexId_ = input.readUInt32();
              break;
            }
            case 40: {

              unk3300NEJLGBBFDPH_ = input.readBool();
              break;
            }
            case 88: {

              rewardId_ = input.readUInt32();
              break;
            }
            case 112: {

              unk3300IFEPGCKHODL_ = input.readBool();
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
      return emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.internal_static_TrialAvatarActivityRewardDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.internal_static_TrialAvatarActivityRewardDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.class, emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder.class);
    }

    public static final int TRIAL_AVATAR_INDEX_ID_FIELD_NUMBER = 4;
    private int trialAvatarIndexId_;
    /**
     * <code>uint32 trial_avatar_index_id = 4;</code>
     * @return The trialAvatarIndexId.
     */
    @java.lang.Override
    public int getTrialAvatarIndexId() {
      return trialAvatarIndexId_;
    }

    public static final int UNK3300_IFEPGCKHODL_FIELD_NUMBER = 14;
    private boolean unk3300IFEPGCKHODL_;
    /**
     * <code>bool Unk3300_IFEPGCKHODL = 14;</code>
     * @return The unk3300IFEPGCKHODL.
     */
    @java.lang.Override
    public boolean getUnk3300IFEPGCKHODL() {
      return unk3300IFEPGCKHODL_;
    }

    public static final int UNK3300_NEJLGBBFDPH_FIELD_NUMBER = 5;
    private boolean unk3300NEJLGBBFDPH_;
    /**
     * <code>bool Unk3300_NEJLGBBFDPH = 5;</code>
     * @return The unk3300NEJLGBBFDPH.
     */
    @java.lang.Override
    public boolean getUnk3300NEJLGBBFDPH() {
      return unk3300NEJLGBBFDPH_;
    }

    public static final int REWARD_ID_FIELD_NUMBER = 11;
    private int rewardId_;
    /**
     * <code>uint32 reward_id = 11;</code>
     * @return The rewardId.
     */
    @java.lang.Override
    public int getRewardId() {
      return rewardId_;
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
      if (trialAvatarIndexId_ != 0) {
        output.writeUInt32(4, trialAvatarIndexId_);
      }
      if (unk3300NEJLGBBFDPH_ != false) {
        output.writeBool(5, unk3300NEJLGBBFDPH_);
      }
      if (rewardId_ != 0) {
        output.writeUInt32(11, rewardId_);
      }
      if (unk3300IFEPGCKHODL_ != false) {
        output.writeBool(14, unk3300IFEPGCKHODL_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (trialAvatarIndexId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, trialAvatarIndexId_);
      }
      if (unk3300NEJLGBBFDPH_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, unk3300NEJLGBBFDPH_);
      }
      if (rewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, rewardId_);
      }
      if (unk3300IFEPGCKHODL_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, unk3300IFEPGCKHODL_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo other = (emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo) obj;

      if (getTrialAvatarIndexId()
          != other.getTrialAvatarIndexId()) return false;
      if (getUnk3300IFEPGCKHODL()
          != other.getUnk3300IFEPGCKHODL()) return false;
      if (getUnk3300NEJLGBBFDPH()
          != other.getUnk3300NEJLGBBFDPH()) return false;
      if (getRewardId()
          != other.getRewardId()) return false;
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
      hash = (37 * hash) + TRIAL_AVATAR_INDEX_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTrialAvatarIndexId();
      hash = (37 * hash) + UNK3300_IFEPGCKHODL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300IFEPGCKHODL());
      hash = (37 * hash) + UNK3300_NEJLGBBFDPH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300NEJLGBBFDPH());
      hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo prototype) {
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
     * Protobuf type {@code TrialAvatarActivityRewardDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TrialAvatarActivityRewardDetailInfo)
        emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.internal_static_TrialAvatarActivityRewardDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.internal_static_TrialAvatarActivityRewardDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.class, emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.newBuilder()
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
        trialAvatarIndexId_ = 0;

        unk3300IFEPGCKHODL_ = false;

        unk3300NEJLGBBFDPH_ = false;

        rewardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.internal_static_TrialAvatarActivityRewardDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo build() {
        emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo buildPartial() {
        emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo result = new emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo(this);
        result.trialAvatarIndexId_ = trialAvatarIndexId_;
        result.unk3300IFEPGCKHODL_ = unk3300IFEPGCKHODL_;
        result.unk3300NEJLGBBFDPH_ = unk3300NEJLGBBFDPH_;
        result.rewardId_ = rewardId_;
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
        if (other instanceof emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo other) {
        if (other == emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.getDefaultInstance()) return this;
        if (other.getTrialAvatarIndexId() != 0) {
          setTrialAvatarIndexId(other.getTrialAvatarIndexId());
        }
        if (other.getUnk3300IFEPGCKHODL() != false) {
          setUnk3300IFEPGCKHODL(other.getUnk3300IFEPGCKHODL());
        }
        if (other.getUnk3300NEJLGBBFDPH() != false) {
          setUnk3300NEJLGBBFDPH(other.getUnk3300NEJLGBBFDPH());
        }
        if (other.getRewardId() != 0) {
          setRewardId(other.getRewardId());
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
        emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int trialAvatarIndexId_ ;
      /**
       * <code>uint32 trial_avatar_index_id = 4;</code>
       * @return The trialAvatarIndexId.
       */
      @java.lang.Override
      public int getTrialAvatarIndexId() {
        return trialAvatarIndexId_;
      }
      /**
       * <code>uint32 trial_avatar_index_id = 4;</code>
       * @param value The trialAvatarIndexId to set.
       * @return This builder for chaining.
       */
      public Builder setTrialAvatarIndexId(int value) {
        
        trialAvatarIndexId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trial_avatar_index_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTrialAvatarIndexId() {
        
        trialAvatarIndexId_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3300IFEPGCKHODL_ ;
      /**
       * <code>bool Unk3300_IFEPGCKHODL = 14;</code>
       * @return The unk3300IFEPGCKHODL.
       */
      @java.lang.Override
      public boolean getUnk3300IFEPGCKHODL() {
        return unk3300IFEPGCKHODL_;
      }
      /**
       * <code>bool Unk3300_IFEPGCKHODL = 14;</code>
       * @param value The unk3300IFEPGCKHODL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IFEPGCKHODL(boolean value) {
        
        unk3300IFEPGCKHODL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_IFEPGCKHODL = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IFEPGCKHODL() {
        
        unk3300IFEPGCKHODL_ = false;
        onChanged();
        return this;
      }

      private boolean unk3300NEJLGBBFDPH_ ;
      /**
       * <code>bool Unk3300_NEJLGBBFDPH = 5;</code>
       * @return The unk3300NEJLGBBFDPH.
       */
      @java.lang.Override
      public boolean getUnk3300NEJLGBBFDPH() {
        return unk3300NEJLGBBFDPH_;
      }
      /**
       * <code>bool Unk3300_NEJLGBBFDPH = 5;</code>
       * @param value The unk3300NEJLGBBFDPH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NEJLGBBFDPH(boolean value) {
        
        unk3300NEJLGBBFDPH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_NEJLGBBFDPH = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300NEJLGBBFDPH() {
        
        unk3300NEJLGBBFDPH_ = false;
        onChanged();
        return this;
      }

      private int rewardId_ ;
      /**
       * <code>uint32 reward_id = 11;</code>
       * @return The rewardId.
       */
      @java.lang.Override
      public int getRewardId() {
        return rewardId_;
      }
      /**
       * <code>uint32 reward_id = 11;</code>
       * @param value The rewardId to set.
       * @return This builder for chaining.
       */
      public Builder setRewardId(int value) {
        
        rewardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardId() {
        
        rewardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TrialAvatarActivityRewardDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:TrialAvatarActivityRewardDetailInfo)
    private static final emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo();
    }

    public static emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TrialAvatarActivityRewardDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<TrialAvatarActivityRewardDetailInfo>() {
      @java.lang.Override
      public TrialAvatarActivityRewardDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TrialAvatarActivityRewardDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TrialAvatarActivityRewardDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TrialAvatarActivityRewardDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TrialAvatarActivityRewardDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TrialAvatarActivityRewardDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)TrialAvatarActivityRewardDetailInfo.pr" +
      "oto\"\221\001\n#TrialAvatarActivityRewardDetailI" +
      "nfo\022\035\n\025trial_avatar_index_id\030\004 \001(\r\022\033\n\023Un" +
      "k3300_IFEPGCKHODL\030\016 \001(\010\022\033\n\023Unk3300_NEJLG" +
      "BBFDPH\030\005 \001(\010\022\021\n\treward_id\030\013 \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TrialAvatarActivityRewardDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TrialAvatarActivityRewardDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TrialAvatarActivityRewardDetailInfo_descriptor,
        new java.lang.String[] { "TrialAvatarIndexId", "Unk3300IFEPGCKHODL", "Unk3300NEJLGBBFDPH", "RewardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
