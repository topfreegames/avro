/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.tfgco.pushnotification;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PushNotification extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2314721379987503542L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PushNotification\",\"namespace\":\"com.tfgco.pushnotification\",\"fields\":[{\"name\":\"push_expiry\",\"type\":\"long\"},{\"name\":\"metadata\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"default\":{}},{\"name\":\"data\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"default\":{}},{\"name\":\"token\",\"type\":\"string\"},{\"name\":\"dry_run\",\"type\":\"boolean\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long push_expiry;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> metadata;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> data;
  @Deprecated public java.lang.CharSequence token;
  @Deprecated public boolean dry_run;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PushNotification() {}

  /**
   * All-args constructor.
   * @param push_expiry The new value for push_expiry
   * @param metadata The new value for metadata
   * @param data The new value for data
   * @param token The new value for token
   * @param dry_run The new value for dry_run
   */
  public PushNotification(java.lang.Long push_expiry, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> metadata, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> data, java.lang.CharSequence token, java.lang.Boolean dry_run) {
    this.push_expiry = push_expiry;
    this.metadata = metadata;
    this.data = data;
    this.token = token;
    this.dry_run = dry_run;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return push_expiry;
    case 1: return metadata;
    case 2: return data;
    case 3: return token;
    case 4: return dry_run;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: push_expiry = (java.lang.Long)value$; break;
    case 1: metadata = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 2: data = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 3: token = (java.lang.CharSequence)value$; break;
    case 4: dry_run = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'push_expiry' field.
   * @return The value of the 'push_expiry' field.
   */
  public java.lang.Long getPushExpiry() {
    return push_expiry;
  }

  /**
   * Sets the value of the 'push_expiry' field.
   * @param value the value to set.
   */
  public void setPushExpiry(java.lang.Long value) {
    this.push_expiry = value;
  }

  /**
   * Gets the value of the 'metadata' field.
   * @return The value of the 'metadata' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getMetadata() {
    return metadata;
  }

  /**
   * Sets the value of the 'metadata' field.
   * @param value the value to set.
   */
  public void setMetadata(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.metadata = value;
  }

  /**
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.data = value;
  }

  /**
   * Gets the value of the 'token' field.
   * @return The value of the 'token' field.
   */
  public java.lang.CharSequence getToken() {
    return token;
  }

  /**
   * Sets the value of the 'token' field.
   * @param value the value to set.
   */
  public void setToken(java.lang.CharSequence value) {
    this.token = value;
  }

  /**
   * Gets the value of the 'dry_run' field.
   * @return The value of the 'dry_run' field.
   */
  public java.lang.Boolean getDryRun() {
    return dry_run;
  }

  /**
   * Sets the value of the 'dry_run' field.
   * @param value the value to set.
   */
  public void setDryRun(java.lang.Boolean value) {
    this.dry_run = value;
  }

  /**
   * Creates a new PushNotification RecordBuilder.
   * @return A new PushNotification RecordBuilder
   */
  public static com.tfgco.pushnotification.PushNotification.Builder newBuilder() {
    return new com.tfgco.pushnotification.PushNotification.Builder();
  }

  /**
   * Creates a new PushNotification RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PushNotification RecordBuilder
   */
  public static com.tfgco.pushnotification.PushNotification.Builder newBuilder(com.tfgco.pushnotification.PushNotification.Builder other) {
    return new com.tfgco.pushnotification.PushNotification.Builder(other);
  }

  /**
   * Creates a new PushNotification RecordBuilder by copying an existing PushNotification instance.
   * @param other The existing instance to copy.
   * @return A new PushNotification RecordBuilder
   */
  public static com.tfgco.pushnotification.PushNotification.Builder newBuilder(com.tfgco.pushnotification.PushNotification other) {
    return new com.tfgco.pushnotification.PushNotification.Builder(other);
  }

  /**
   * RecordBuilder for PushNotification instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PushNotification>
    implements org.apache.avro.data.RecordBuilder<PushNotification> {

    private long push_expiry;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> metadata;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> data;
    private java.lang.CharSequence token;
    private boolean dry_run;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.tfgco.pushnotification.PushNotification.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.push_expiry)) {
        this.push_expiry = data().deepCopy(fields()[0].schema(), other.push_expiry);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.metadata)) {
        this.metadata = data().deepCopy(fields()[1].schema(), other.metadata);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.data)) {
        this.data = data().deepCopy(fields()[2].schema(), other.data);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.token)) {
        this.token = data().deepCopy(fields()[3].schema(), other.token);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.dry_run)) {
        this.dry_run = data().deepCopy(fields()[4].schema(), other.dry_run);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PushNotification instance
     * @param other The existing instance to copy.
     */
    private Builder(com.tfgco.pushnotification.PushNotification other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.push_expiry)) {
        this.push_expiry = data().deepCopy(fields()[0].schema(), other.push_expiry);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.metadata)) {
        this.metadata = data().deepCopy(fields()[1].schema(), other.metadata);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.data)) {
        this.data = data().deepCopy(fields()[2].schema(), other.data);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.token)) {
        this.token = data().deepCopy(fields()[3].schema(), other.token);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.dry_run)) {
        this.dry_run = data().deepCopy(fields()[4].schema(), other.dry_run);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'push_expiry' field.
      * @return The value.
      */
    public java.lang.Long getPushExpiry() {
      return push_expiry;
    }

    /**
      * Sets the value of the 'push_expiry' field.
      * @param value The value of 'push_expiry'.
      * @return This builder.
      */
    public com.tfgco.pushnotification.PushNotification.Builder setPushExpiry(long value) {
      validate(fields()[0], value);
      this.push_expiry = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'push_expiry' field has been set.
      * @return True if the 'push_expiry' field has been set, false otherwise.
      */
    public boolean hasPushExpiry() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'push_expiry' field.
      * @return This builder.
      */
    public com.tfgco.pushnotification.PushNotification.Builder clearPushExpiry() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'metadata' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getMetadata() {
      return metadata;
    }

    /**
      * Sets the value of the 'metadata' field.
      * @param value The value of 'metadata'.
      * @return This builder.
      */
    public com.tfgco.pushnotification.PushNotification.Builder setMetadata(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[1], value);
      this.metadata = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'metadata' field has been set.
      * @return True if the 'metadata' field has been set, false otherwise.
      */
    public boolean hasMetadata() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'metadata' field.
      * @return This builder.
      */
    public com.tfgco.pushnotification.PushNotification.Builder clearMetadata() {
      metadata = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getData() {
      return data;
    }

    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public com.tfgco.pushnotification.PushNotification.Builder setData(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.data = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public com.tfgco.pushnotification.PushNotification.Builder clearData() {
      data = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'token' field.
      * @return The value.
      */
    public java.lang.CharSequence getToken() {
      return token;
    }

    /**
      * Sets the value of the 'token' field.
      * @param value The value of 'token'.
      * @return This builder.
      */
    public com.tfgco.pushnotification.PushNotification.Builder setToken(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.token = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'token' field has been set.
      * @return True if the 'token' field has been set, false otherwise.
      */
    public boolean hasToken() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'token' field.
      * @return This builder.
      */
    public com.tfgco.pushnotification.PushNotification.Builder clearToken() {
      token = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'dry_run' field.
      * @return The value.
      */
    public java.lang.Boolean getDryRun() {
      return dry_run;
    }

    /**
      * Sets the value of the 'dry_run' field.
      * @param value The value of 'dry_run'.
      * @return This builder.
      */
    public com.tfgco.pushnotification.PushNotification.Builder setDryRun(boolean value) {
      validate(fields()[4], value);
      this.dry_run = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'dry_run' field has been set.
      * @return True if the 'dry_run' field has been set, false otherwise.
      */
    public boolean hasDryRun() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'dry_run' field.
      * @return This builder.
      */
    public com.tfgco.pushnotification.PushNotification.Builder clearDryRun() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public PushNotification build() {
      try {
        PushNotification record = new PushNotification();
        record.push_expiry = fieldSetFlags()[0] ? this.push_expiry : (java.lang.Long) defaultValue(fields()[0]);
        record.metadata = fieldSetFlags()[1] ? this.metadata : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[1]);
        record.data = fieldSetFlags()[2] ? this.data : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[2]);
        record.token = fieldSetFlags()[3] ? this.token : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.dry_run = fieldSetFlags()[4] ? this.dry_run : (java.lang.Boolean) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}