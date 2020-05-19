// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zero.status.proto

package io.vertx.tp.ipc.eon;

/**
 * Protobuf type {@code io.vertx.tp.ipc.eon.RetryInfo}
 */
public final class RetryInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.vertx.tp.ipc.eon.RetryInfo)
    RetryInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RetryInfo.newBuilder() to construct.
  private RetryInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RetryInfo() {
    backoffMs_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RetryInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RetryInfo(
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
          case 8: {

            passed_ = input.readBool();
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              backoffMs_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            backoffMs_.addInt(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              backoffMs_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              backoffMs_.addInt(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        backoffMs_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.vertx.tp.ipc.eon.UpStatus.internal_static_io_vertx_tp_ipc_eon_RetryInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.vertx.tp.ipc.eon.UpStatus.internal_static_io_vertx_tp_ipc_eon_RetryInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.vertx.tp.ipc.eon.RetryInfo.class, io.vertx.tp.ipc.eon.RetryInfo.Builder.class);
  }

  public static final int PASSED_FIELD_NUMBER = 1;
  private boolean passed_;
  /**
   * <pre>
   * Whether authorized
   * </pre>
   *
   * <code>bool passed = 1;</code>
   * @return The passed.
   */
  @java.lang.Override
  public boolean getPassed() {
    return passed_;
  }

  public static final int BACKOFF_MS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList backoffMs_;
  /**
   * <pre>
   * Backoff
   * </pre>
   *
   * <code>repeated int32 backoff_ms = 2;</code>
   * @return A list containing the backoffMs.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getBackoffMsList() {
    return backoffMs_;
  }
  /**
   * <pre>
   * Backoff
   * </pre>
   *
   * <code>repeated int32 backoff_ms = 2;</code>
   * @return The count of backoffMs.
   */
  public int getBackoffMsCount() {
    return backoffMs_.size();
  }
  /**
   * <pre>
   * Backoff
   * </pre>
   *
   * <code>repeated int32 backoff_ms = 2;</code>
   * @param index The index of the element to return.
   * @return The backoffMs at the given index.
   */
  public int getBackoffMs(int index) {
    return backoffMs_.getInt(index);
  }
  private int backoffMsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (passed_ != false) {
      output.writeBool(1, passed_);
    }
    if (getBackoffMsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(backoffMsMemoizedSerializedSize);
    }
    for (int i = 0; i < backoffMs_.size(); i++) {
      output.writeInt32NoTag(backoffMs_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (passed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, passed_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < backoffMs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(backoffMs_.getInt(i));
      }
      size += dataSize;
      if (!getBackoffMsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      backoffMsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof io.vertx.tp.ipc.eon.RetryInfo)) {
      return super.equals(obj);
    }
    io.vertx.tp.ipc.eon.RetryInfo other = (io.vertx.tp.ipc.eon.RetryInfo) obj;

    if (getPassed()
        != other.getPassed()) return false;
    if (!getBackoffMsList()
        .equals(other.getBackoffMsList())) return false;
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
    hash = (37 * hash) + PASSED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPassed());
    if (getBackoffMsCount() > 0) {
      hash = (37 * hash) + BACKOFF_MS_FIELD_NUMBER;
      hash = (53 * hash) + getBackoffMsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.vertx.tp.ipc.eon.RetryInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.vertx.tp.ipc.eon.RetryInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.RetryInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.vertx.tp.ipc.eon.RetryInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.RetryInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.vertx.tp.ipc.eon.RetryInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.RetryInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.vertx.tp.ipc.eon.RetryInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.RetryInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.vertx.tp.ipc.eon.RetryInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.RetryInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.vertx.tp.ipc.eon.RetryInfo parseFrom(
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
  public static Builder newBuilder(io.vertx.tp.ipc.eon.RetryInfo prototype) {
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
   * Protobuf type {@code io.vertx.tp.ipc.eon.RetryInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.vertx.tp.ipc.eon.RetryInfo)
      io.vertx.tp.ipc.eon.RetryInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.vertx.tp.ipc.eon.UpStatus.internal_static_io_vertx_tp_ipc_eon_RetryInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.vertx.tp.ipc.eon.UpStatus.internal_static_io_vertx_tp_ipc_eon_RetryInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.vertx.tp.ipc.eon.RetryInfo.class, io.vertx.tp.ipc.eon.RetryInfo.Builder.class);
    }

    // Construct using io.vertx.tp.ipc.eon.RetryInfo.newBuilder()
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
      passed_ = false;

      backoffMs_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.vertx.tp.ipc.eon.UpStatus.internal_static_io_vertx_tp_ipc_eon_RetryInfo_descriptor;
    }

    @java.lang.Override
    public io.vertx.tp.ipc.eon.RetryInfo getDefaultInstanceForType() {
      return io.vertx.tp.ipc.eon.RetryInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.vertx.tp.ipc.eon.RetryInfo build() {
      io.vertx.tp.ipc.eon.RetryInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.vertx.tp.ipc.eon.RetryInfo buildPartial() {
      io.vertx.tp.ipc.eon.RetryInfo result = new io.vertx.tp.ipc.eon.RetryInfo(this);
      int from_bitField0_ = bitField0_;
      result.passed_ = passed_;
      if (((bitField0_ & 0x00000001) != 0)) {
        backoffMs_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.backoffMs_ = backoffMs_;
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
      if (other instanceof io.vertx.tp.ipc.eon.RetryInfo) {
        return mergeFrom((io.vertx.tp.ipc.eon.RetryInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.vertx.tp.ipc.eon.RetryInfo other) {
      if (other == io.vertx.tp.ipc.eon.RetryInfo.getDefaultInstance()) return this;
      if (other.getPassed() != false) {
        setPassed(other.getPassed());
      }
      if (!other.backoffMs_.isEmpty()) {
        if (backoffMs_.isEmpty()) {
          backoffMs_ = other.backoffMs_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBackoffMsIsMutable();
          backoffMs_.addAll(other.backoffMs_);
        }
        onChanged();
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
      io.vertx.tp.ipc.eon.RetryInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.vertx.tp.ipc.eon.RetryInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean passed_ ;
    /**
     * <pre>
     * Whether authorized
     * </pre>
     *
     * <code>bool passed = 1;</code>
     * @return The passed.
     */
    @java.lang.Override
    public boolean getPassed() {
      return passed_;
    }
    /**
     * <pre>
     * Whether authorized
     * </pre>
     *
     * <code>bool passed = 1;</code>
     * @param value The passed to set.
     * @return This builder for chaining.
     */
    public Builder setPassed(boolean value) {
      
      passed_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether authorized
     * </pre>
     *
     * <code>bool passed = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassed() {
      
      passed_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList backoffMs_ = emptyIntList();
    private void ensureBackoffMsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        backoffMs_ = mutableCopy(backoffMs_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Backoff
     * </pre>
     *
     * <code>repeated int32 backoff_ms = 2;</code>
     * @return A list containing the backoffMs.
     */
    public java.util.List<java.lang.Integer>
        getBackoffMsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(backoffMs_) : backoffMs_;
    }
    /**
     * <pre>
     * Backoff
     * </pre>
     *
     * <code>repeated int32 backoff_ms = 2;</code>
     * @return The count of backoffMs.
     */
    public int getBackoffMsCount() {
      return backoffMs_.size();
    }
    /**
     * <pre>
     * Backoff
     * </pre>
     *
     * <code>repeated int32 backoff_ms = 2;</code>
     * @param index The index of the element to return.
     * @return The backoffMs at the given index.
     */
    public int getBackoffMs(int index) {
      return backoffMs_.getInt(index);
    }
    /**
     * <pre>
     * Backoff
     * </pre>
     *
     * <code>repeated int32 backoff_ms = 2;</code>
     * @param index The index to set the value at.
     * @param value The backoffMs to set.
     * @return This builder for chaining.
     */
    public Builder setBackoffMs(
        int index, int value) {
      ensureBackoffMsIsMutable();
      backoffMs_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Backoff
     * </pre>
     *
     * <code>repeated int32 backoff_ms = 2;</code>
     * @param value The backoffMs to add.
     * @return This builder for chaining.
     */
    public Builder addBackoffMs(int value) {
      ensureBackoffMsIsMutable();
      backoffMs_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Backoff
     * </pre>
     *
     * <code>repeated int32 backoff_ms = 2;</code>
     * @param values The backoffMs to add.
     * @return This builder for chaining.
     */
    public Builder addAllBackoffMs(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureBackoffMsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, backoffMs_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Backoff
     * </pre>
     *
     * <code>repeated int32 backoff_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBackoffMs() {
      backoffMs_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:io.vertx.tp.ipc.eon.RetryInfo)
  }

  // @@protoc_insertion_point(class_scope:io.vertx.tp.ipc.eon.RetryInfo)
  private static final io.vertx.tp.ipc.eon.RetryInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.vertx.tp.ipc.eon.RetryInfo();
  }

  public static io.vertx.tp.ipc.eon.RetryInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetryInfo>
      PARSER = new com.google.protobuf.AbstractParser<RetryInfo>() {
    @java.lang.Override
    public RetryInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RetryInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RetryInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetryInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.vertx.tp.ipc.eon.RetryInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

