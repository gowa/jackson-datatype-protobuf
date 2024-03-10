// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package com.hubspot.jackson.datatype.protobuf.util;

public final class CompileCustomProtobufs {

  private CompileCustomProtobufs() {}

  public static void registerAllExtensions(
    com.google.protobuf.ExtensionRegistryLite registry
  ) {}

  public static void registerAllExtensions(
    com.google.protobuf.ExtensionRegistry registry
  ) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface MixedJsonNameOrBuilder
    extends
      // @@protoc_insertion_point(interface_extends:com.hubspot.jackson.datatype.protobuf.util.MixedJsonName)
      com.google.protobuf.MessageOrBuilder {
    /**
     * <code>int32 field_with_no_json_name = 1 [json_name = "fieldWithNoJsonName"];</code>
     * @return The fieldWithNoJsonName.
     */
    int getFieldWithNoJsonName();

    /**
     * <code>int32 field_with_json_name = 2 [json_name = "custom-name"];</code>
     * @return The fieldWithJsonName.
     */
    int getFieldWithJsonName();
  }

  /**
   * Protobuf type {@code com.hubspot.jackson.datatype.protobuf.util.MixedJsonName}
   */
  public static final class MixedJsonName
    extends com.google.protobuf.GeneratedMessageV3
    implements
      // @@protoc_insertion_point(message_implements:com.hubspot.jackson.datatype.protobuf.util.MixedJsonName)
      MixedJsonNameOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use MixedJsonName.newBuilder() to construct.
    private MixedJsonName(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private MixedJsonName() {}

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new MixedJsonName();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private MixedJsonName(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry
    ) throws com.google.protobuf.InvalidProtocolBufferException {
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
            case 8:
              {
                fieldWithNoJsonName_ = input.readInt32();
                break;
              }
            case 16:
              {
                fieldWithJsonName_ = input.readInt32();
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
          .setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.internal_static_com_hubspot_jackson_datatype_protobuf_util_MixedJsonName_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.internal_static_com_hubspot_jackson_datatype_protobuf_util_MixedJsonName_fieldAccessorTable.ensureFieldAccessorsInitialized(
        com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName.class,
        com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName.Builder.class
      );
    }

    public static final int FIELD_WITH_NO_JSON_NAME_FIELD_NUMBER = 1;
    private int fieldWithNoJsonName_;

    /**
     * <code>int32 field_with_no_json_name = 1 [json_name = "fieldWithNoJsonName"];</code>
     * @return The fieldWithNoJsonName.
     */
    @java.lang.Override
    public int getFieldWithNoJsonName() {
      return fieldWithNoJsonName_;
    }

    public static final int FIELD_WITH_JSON_NAME_FIELD_NUMBER = 2;
    private int fieldWithJsonName_;

    /**
     * <code>int32 field_with_json_name = 2 [json_name = "custom-name"];</code>
     * @return The fieldWithJsonName.
     */
    @java.lang.Override
    public int getFieldWithJsonName() {
      return fieldWithJsonName_;
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
      if (fieldWithNoJsonName_ != 0) {
        output.writeInt32(1, fieldWithNoJsonName_);
      }
      if (fieldWithJsonName_ != 0) {
        output.writeInt32(2, fieldWithJsonName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fieldWithNoJsonName_ != 0) {
        size +=
          com.google.protobuf.CodedOutputStream.computeInt32Size(1, fieldWithNoJsonName_);
      }
      if (fieldWithJsonName_ != 0) {
        size +=
          com.google.protobuf.CodedOutputStream.computeInt32Size(2, fieldWithJsonName_);
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
      if (
        !(
          obj instanceof com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName
        )
      ) {
        return super.equals(obj);
      }
      com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName other =
        (com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName) obj;

      if (getFieldWithNoJsonName() != other.getFieldWithNoJsonName()) return false;
      if (getFieldWithJsonName() != other.getFieldWithJsonName()) return false;
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
      hash = (37 * hash) + FIELD_WITH_NO_JSON_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getFieldWithNoJsonName();
      hash = (37 * hash) + FIELD_WITH_JSON_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getFieldWithJsonName();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName parseFrom(
      java.nio.ByteBuffer data
    ) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry
    ) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName parseFrom(
      com.google.protobuf.ByteString data
    ) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry
    ) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName parseFrom(
      byte[] data
    ) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry
    ) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName parseFrom(
      java.io.InputStream input
    ) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry
    ) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER,
        input,
        extensionRegistry
      );
    }

    public static com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName parseDelimitedFrom(
      java.io.InputStream input
    ) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER,
        input
      );
    }

    public static com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry
    ) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER,
        input,
        extensionRegistry
      );
    }

    public static com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName parseFrom(
      com.google.protobuf.CodedInputStream input
    ) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry
    ) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER,
        input,
        extensionRegistry
      );
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
      com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName prototype
    ) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent
    ) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code com.hubspot.jackson.datatype.protobuf.util.MixedJsonName}
     */
    public static final class Builder
      extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
        // @@protoc_insertion_point(builder_implements:com.hubspot.jackson.datatype.protobuf.util.MixedJsonName)
        com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonNameOrBuilder {

      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.internal_static_com_hubspot_jackson_datatype_protobuf_util_MixedJsonName_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.internal_static_com_hubspot_jackson_datatype_protobuf_util_MixedJsonName_fieldAccessorTable.ensureFieldAccessorsInitialized(
          com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName.class,
          com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName.Builder.class
        );
      }

      // Construct using com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        fieldWithNoJsonName_ = 0;

        fieldWithJsonName_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.internal_static_com_hubspot_jackson_datatype_protobuf_util_MixedJsonName_descriptor;
      }

      @java.lang.Override
      public com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName getDefaultInstanceForType() {
        return com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName.getDefaultInstance();
      }

      @java.lang.Override
      public com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName build() {
        com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName result =
          buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName buildPartial() {
        com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName result =
          new com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName(
            this
          );
        result.fieldWithNoJsonName_ = fieldWithNoJsonName_;
        result.fieldWithJsonName_ = fieldWithJsonName_;
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
        java.lang.Object value
      ) {
        return super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index,
        java.lang.Object value
      ) {
        return super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value
      ) {
        return super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (
          other instanceof com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName
        ) {
          return mergeFrom(
            (com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName) other
          );
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
        com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName other
      ) {
        if (
          other ==
          com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName.getDefaultInstance()
        ) return this;
        if (other.getFieldWithNoJsonName() != 0) {
          setFieldWithNoJsonName(other.getFieldWithNoJsonName());
        }
        if (other.getFieldWithJsonName() != 0) {
          setFieldWithJsonName(other.getFieldWithJsonName());
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
        com.google.protobuf.ExtensionRegistryLite extensionRegistry
      ) throws java.io.IOException {
        com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName parsedMessage =
          null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
            (com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int fieldWithNoJsonName_;

      /**
       * <code>int32 field_with_no_json_name = 1 [json_name = "fieldWithNoJsonName"];</code>
       * @return The fieldWithNoJsonName.
       */
      @java.lang.Override
      public int getFieldWithNoJsonName() {
        return fieldWithNoJsonName_;
      }

      /**
       * <code>int32 field_with_no_json_name = 1 [json_name = "fieldWithNoJsonName"];</code>
       * @param value The fieldWithNoJsonName to set.
       * @return This builder for chaining.
       */
      public Builder setFieldWithNoJsonName(int value) {
        fieldWithNoJsonName_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>int32 field_with_no_json_name = 1 [json_name = "fieldWithNoJsonName"];</code>
       * @return This builder for chaining.
       */
      public Builder clearFieldWithNoJsonName() {
        fieldWithNoJsonName_ = 0;
        onChanged();
        return this;
      }

      private int fieldWithJsonName_;

      /**
       * <code>int32 field_with_json_name = 2 [json_name = "custom-name"];</code>
       * @return The fieldWithJsonName.
       */
      @java.lang.Override
      public int getFieldWithJsonName() {
        return fieldWithJsonName_;
      }

      /**
       * <code>int32 field_with_json_name = 2 [json_name = "custom-name"];</code>
       * @param value The fieldWithJsonName to set.
       * @return This builder for chaining.
       */
      public Builder setFieldWithJsonName(int value) {
        fieldWithJsonName_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>int32 field_with_json_name = 2 [json_name = "custom-name"];</code>
       * @return This builder for chaining.
       */
      public Builder clearFieldWithJsonName() {
        fieldWithJsonName_ = 0;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields
      ) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields
      ) {
        return super.mergeUnknownFields(unknownFields);
      }
      // @@protoc_insertion_point(builder_scope:com.hubspot.jackson.datatype.protobuf.util.MixedJsonName)
    }

    // @@protoc_insertion_point(class_scope:com.hubspot.jackson.datatype.protobuf.util.MixedJsonName)
    private static final com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
        new com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName();
    }

    public static com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MixedJsonName> PARSER =
      new com.google.protobuf.AbstractParser<MixedJsonName>() {
        @java.lang.Override
        public MixedJsonName parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry
        ) throws com.google.protobuf.InvalidProtocolBufferException {
          return new MixedJsonName(input, extensionRegistry);
        }
      };

    public static com.google.protobuf.Parser<MixedJsonName> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MixedJsonName> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.hubspot.jackson.datatype.protobuf.util.CompileCustomProtobufs.MixedJsonName getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor internal_static_com_hubspot_jackson_datatype_protobuf_util_MixedJsonName_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_com_hubspot_jackson_datatype_protobuf_util_MixedJsonName_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\ntest.proto\022*com.hubspot.jackson.dataty" +
      "pe.protobuf.util\"p\n\rMixedJsonName\0224\n\027fie" +
      "ld_with_no_json_name\030\001 \001(\005R\023fieldWithNoJ" +
      "sonName\022)\n\024field_with_json_name\030\002 \001(\005R\013c" +
      "ustom-nameB\030B\026CompileCustomProtobufsb\006pr" +
      "oto3",
    };
    descriptor =
      com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {}
      );
    internal_static_com_hubspot_jackson_datatype_protobuf_util_MixedJsonName_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hubspot_jackson_datatype_protobuf_util_MixedJsonName_fieldAccessorTable =
      new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hubspot_jackson_datatype_protobuf_util_MixedJsonName_descriptor,
        new java.lang.String[] { "FieldWithNoJsonName", "FieldWithJsonName" }
      );
  }
  // @@protoc_insertion_point(outer_class_scope)
}
