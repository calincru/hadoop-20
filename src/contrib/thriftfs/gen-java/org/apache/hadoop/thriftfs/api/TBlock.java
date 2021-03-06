/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TBlock implements org.apache.thrift.TBase<TBlock, TBlock._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBlock");

  private static final org.apache.thrift.protocol.TField BLOCK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("blockId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_BYTES_FIELD_DESC = new org.apache.thrift.protocol.TField("numBytes", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField GENERATION_STAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("generationStamp", org.apache.thrift.protocol.TType.I64, (short)3);

  public long blockId; // required
  public long numBytes; // required
  public long generationStamp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BLOCK_ID((short)1, "blockId"),
    NUM_BYTES((short)2, "numBytes"),
    GENERATION_STAMP((short)3, "generationStamp");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BLOCK_ID
          return BLOCK_ID;
        case 2: // NUM_BYTES
          return NUM_BYTES;
        case 3: // GENERATION_STAMP
          return GENERATION_STAMP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __BLOCKID_ISSET_ID = 0;
  private static final int __NUMBYTES_ISSET_ID = 1;
  private static final int __GENERATIONSTAMP_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BLOCK_ID, new org.apache.thrift.meta_data.FieldMetaData("blockId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NUM_BYTES, new org.apache.thrift.meta_data.FieldMetaData("numBytes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.GENERATION_STAMP, new org.apache.thrift.meta_data.FieldMetaData("generationStamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBlock.class, metaDataMap);
  }

  public TBlock() {
  }

  public TBlock(
    long blockId,
    long numBytes,
    long generationStamp)
  {
    this();
    this.blockId = blockId;
    setBlockIdIsSet(true);
    this.numBytes = numBytes;
    setNumBytesIsSet(true);
    this.generationStamp = generationStamp;
    setGenerationStampIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBlock(TBlock other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.blockId = other.blockId;
    this.numBytes = other.numBytes;
    this.generationStamp = other.generationStamp;
  }

  public TBlock deepCopy() {
    return new TBlock(this);
  }

  @Override
  public void clear() {
    setBlockIdIsSet(false);
    this.blockId = 0;
    setNumBytesIsSet(false);
    this.numBytes = 0;
    setGenerationStampIsSet(false);
    this.generationStamp = 0;
  }

  public long getBlockId() {
    return this.blockId;
  }

  public TBlock setBlockId(long blockId) {
    this.blockId = blockId;
    setBlockIdIsSet(true);
    return this;
  }

  public void unsetBlockId() {
    __isset_bit_vector.clear(__BLOCKID_ISSET_ID);
  }

  /** Returns true if field blockId is set (has been assigned a value) and false otherwise */
  public boolean isSetBlockId() {
    return __isset_bit_vector.get(__BLOCKID_ISSET_ID);
  }

  public void setBlockIdIsSet(boolean value) {
    __isset_bit_vector.set(__BLOCKID_ISSET_ID, value);
  }

  public long getNumBytes() {
    return this.numBytes;
  }

  public TBlock setNumBytes(long numBytes) {
    this.numBytes = numBytes;
    setNumBytesIsSet(true);
    return this;
  }

  public void unsetNumBytes() {
    __isset_bit_vector.clear(__NUMBYTES_ISSET_ID);
  }

  /** Returns true if field numBytes is set (has been assigned a value) and false otherwise */
  public boolean isSetNumBytes() {
    return __isset_bit_vector.get(__NUMBYTES_ISSET_ID);
  }

  public void setNumBytesIsSet(boolean value) {
    __isset_bit_vector.set(__NUMBYTES_ISSET_ID, value);
  }

  public long getGenerationStamp() {
    return this.generationStamp;
  }

  public TBlock setGenerationStamp(long generationStamp) {
    this.generationStamp = generationStamp;
    setGenerationStampIsSet(true);
    return this;
  }

  public void unsetGenerationStamp() {
    __isset_bit_vector.clear(__GENERATIONSTAMP_ISSET_ID);
  }

  /** Returns true if field generationStamp is set (has been assigned a value) and false otherwise */
  public boolean isSetGenerationStamp() {
    return __isset_bit_vector.get(__GENERATIONSTAMP_ISSET_ID);
  }

  public void setGenerationStampIsSet(boolean value) {
    __isset_bit_vector.set(__GENERATIONSTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BLOCK_ID:
      if (value == null) {
        unsetBlockId();
      } else {
        setBlockId((Long)value);
      }
      break;

    case NUM_BYTES:
      if (value == null) {
        unsetNumBytes();
      } else {
        setNumBytes((Long)value);
      }
      break;

    case GENERATION_STAMP:
      if (value == null) {
        unsetGenerationStamp();
      } else {
        setGenerationStamp((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BLOCK_ID:
      return Long.valueOf(getBlockId());

    case NUM_BYTES:
      return Long.valueOf(getNumBytes());

    case GENERATION_STAMP:
      return Long.valueOf(getGenerationStamp());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BLOCK_ID:
      return isSetBlockId();
    case NUM_BYTES:
      return isSetNumBytes();
    case GENERATION_STAMP:
      return isSetGenerationStamp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TBlock)
      return this.equals((TBlock)that);
    return false;
  }

  public boolean equals(TBlock that) {
    if (that == null)
      return false;

    boolean this_present_blockId = true;
    boolean that_present_blockId = true;
    if (this_present_blockId || that_present_blockId) {
      if (!(this_present_blockId && that_present_blockId))
        return false;
      if (this.blockId != that.blockId)
        return false;
    }

    boolean this_present_numBytes = true;
    boolean that_present_numBytes = true;
    if (this_present_numBytes || that_present_numBytes) {
      if (!(this_present_numBytes && that_present_numBytes))
        return false;
      if (this.numBytes != that.numBytes)
        return false;
    }

    boolean this_present_generationStamp = true;
    boolean that_present_generationStamp = true;
    if (this_present_generationStamp || that_present_generationStamp) {
      if (!(this_present_generationStamp && that_present_generationStamp))
        return false;
      if (this.generationStamp != that.generationStamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TBlock other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TBlock typedOther = (TBlock)other;

    lastComparison = Boolean.valueOf(isSetBlockId()).compareTo(typedOther.isSetBlockId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlockId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blockId, typedOther.blockId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumBytes()).compareTo(typedOther.isSetNumBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumBytes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numBytes, typedOther.numBytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGenerationStamp()).compareTo(typedOther.isSetGenerationStamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGenerationStamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.generationStamp, typedOther.generationStamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // BLOCK_ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.blockId = iprot.readI64();
            setBlockIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NUM_BYTES
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.numBytes = iprot.readI64();
            setNumBytesIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // GENERATION_STAMP
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.generationStamp = iprot.readI64();
            setGenerationStampIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(BLOCK_ID_FIELD_DESC);
    oprot.writeI64(this.blockId);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(NUM_BYTES_FIELD_DESC);
    oprot.writeI64(this.numBytes);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(GENERATION_STAMP_FIELD_DESC);
    oprot.writeI64(this.generationStamp);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TBlock(");
    boolean first = true;

    sb.append("blockId:");
    sb.append(this.blockId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("numBytes:");
    sb.append(this.numBytes);
    first = false;
    if (!first) sb.append(", ");
    sb.append("generationStamp:");
    sb.append(this.generationStamp);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

