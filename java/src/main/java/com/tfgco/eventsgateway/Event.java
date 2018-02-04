/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.tfgco.eventsgateway;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Event extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5175532018705702743L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"com.tfgco.eventsgateway\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"props\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"default\":{}},{\"name\":\"serverTimestamp\",\"type\":\"long\"},{\"name\":\"clientTimestamp\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> props;
  @Deprecated public long serverTimestamp;
  @Deprecated public long clientTimestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Event() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param props The new value for props
   * @param serverTimestamp The new value for serverTimestamp
   * @param clientTimestamp The new value for clientTimestamp
   */
  public Event(java.lang.CharSequence id, java.lang.CharSequence name, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> props, java.lang.Long serverTimestamp, java.lang.Long clientTimestamp) {
    this.id = id;
    this.name = name;
    this.props = props;
    this.serverTimestamp = serverTimestamp;
    this.clientTimestamp = clientTimestamp;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return props;
    case 3: return serverTimestamp;
    case 4: return clientTimestamp;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: props = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 3: serverTimestamp = (java.lang.Long)value$; break;
    case 4: clientTimestamp = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'props' field.
   * @return The value of the 'props' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getProps() {
    return props;
  }

  /**
   * Sets the value of the 'props' field.
   * @param value the value to set.
   */
  public void setProps(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.props = value;
  }

  /**
   * Gets the value of the 'serverTimestamp' field.
   * @return The value of the 'serverTimestamp' field.
   */
  public java.lang.Long getServerTimestamp() {
    return serverTimestamp;
  }

  /**
   * Sets the value of the 'serverTimestamp' field.
   * @param value the value to set.
   */
  public void setServerTimestamp(java.lang.Long value) {
    this.serverTimestamp = value;
  }

  /**
   * Gets the value of the 'clientTimestamp' field.
   * @return The value of the 'clientTimestamp' field.
   */
  public java.lang.Long getClientTimestamp() {
    return clientTimestamp;
  }

  /**
   * Sets the value of the 'clientTimestamp' field.
   * @param value the value to set.
   */
  public void setClientTimestamp(java.lang.Long value) {
    this.clientTimestamp = value;
  }

  /**
   * Creates a new Event RecordBuilder.
   * @return A new Event RecordBuilder
   */
  public static com.tfgco.eventsgateway.Event.Builder newBuilder() {
    return new com.tfgco.eventsgateway.Event.Builder();
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Event RecordBuilder
   */
  public static com.tfgco.eventsgateway.Event.Builder newBuilder(com.tfgco.eventsgateway.Event.Builder other) {
    return new com.tfgco.eventsgateway.Event.Builder(other);
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Event instance.
   * @param other The existing instance to copy.
   * @return A new Event RecordBuilder
   */
  public static com.tfgco.eventsgateway.Event.Builder newBuilder(com.tfgco.eventsgateway.Event other) {
    return new com.tfgco.eventsgateway.Event.Builder(other);
  }

  /**
   * RecordBuilder for Event instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Event>
    implements org.apache.avro.data.RecordBuilder<Event> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> props;
    private long serverTimestamp;
    private long clientTimestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.tfgco.eventsgateway.Event.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.props)) {
        this.props = data().deepCopy(fields()[2].schema(), other.props);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.serverTimestamp)) {
        this.serverTimestamp = data().deepCopy(fields()[3].schema(), other.serverTimestamp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.clientTimestamp)) {
        this.clientTimestamp = data().deepCopy(fields()[4].schema(), other.clientTimestamp);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Event instance
     * @param other The existing instance to copy.
     */
    private Builder(com.tfgco.eventsgateway.Event other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.props)) {
        this.props = data().deepCopy(fields()[2].schema(), other.props);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.serverTimestamp)) {
        this.serverTimestamp = data().deepCopy(fields()[3].schema(), other.serverTimestamp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.clientTimestamp)) {
        this.clientTimestamp = data().deepCopy(fields()[4].schema(), other.clientTimestamp);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.tfgco.eventsgateway.Event.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.tfgco.eventsgateway.Event.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.tfgco.eventsgateway.Event.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.tfgco.eventsgateway.Event.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'props' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getProps() {
      return props;
    }

    /**
      * Sets the value of the 'props' field.
      * @param value The value of 'props'.
      * @return This builder.
      */
    public com.tfgco.eventsgateway.Event.Builder setProps(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.props = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'props' field has been set.
      * @return True if the 'props' field has been set, false otherwise.
      */
    public boolean hasProps() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'props' field.
      * @return This builder.
      */
    public com.tfgco.eventsgateway.Event.Builder clearProps() {
      props = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'serverTimestamp' field.
      * @return The value.
      */
    public java.lang.Long getServerTimestamp() {
      return serverTimestamp;
    }

    /**
      * Sets the value of the 'serverTimestamp' field.
      * @param value The value of 'serverTimestamp'.
      * @return This builder.
      */
    public com.tfgco.eventsgateway.Event.Builder setServerTimestamp(long value) {
      validate(fields()[3], value);
      this.serverTimestamp = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'serverTimestamp' field has been set.
      * @return True if the 'serverTimestamp' field has been set, false otherwise.
      */
    public boolean hasServerTimestamp() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'serverTimestamp' field.
      * @return This builder.
      */
    public com.tfgco.eventsgateway.Event.Builder clearServerTimestamp() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'clientTimestamp' field.
      * @return The value.
      */
    public java.lang.Long getClientTimestamp() {
      return clientTimestamp;
    }

    /**
      * Sets the value of the 'clientTimestamp' field.
      * @param value The value of 'clientTimestamp'.
      * @return This builder.
      */
    public com.tfgco.eventsgateway.Event.Builder setClientTimestamp(long value) {
      validate(fields()[4], value);
      this.clientTimestamp = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'clientTimestamp' field has been set.
      * @return True if the 'clientTimestamp' field has been set, false otherwise.
      */
    public boolean hasClientTimestamp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'clientTimestamp' field.
      * @return This builder.
      */
    public com.tfgco.eventsgateway.Event.Builder clearClientTimestamp() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Event build() {
      try {
        Event record = new Event();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.props = fieldSetFlags()[2] ? this.props : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[2]);
        record.serverTimestamp = fieldSetFlags()[3] ? this.serverTimestamp : (java.lang.Long) defaultValue(fields()[3]);
        record.clientTimestamp = fieldSetFlags()[4] ? this.clientTimestamp : (java.lang.Long) defaultValue(fields()[4]);
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