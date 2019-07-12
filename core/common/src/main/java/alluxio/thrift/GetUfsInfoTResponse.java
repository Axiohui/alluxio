/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class GetUfsInfoTResponse implements org.apache.thrift.TBase<GetUfsInfoTResponse, GetUfsInfoTResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetUfsInfoTResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetUfsInfoTResponse");

  private static final org.apache.thrift.protocol.TField UFS_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("ufsInfo", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetUfsInfoTResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetUfsInfoTResponseTupleSchemeFactory());
  }

  private UfsInfo ufsInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UFS_INFO((short)1, "ufsInfo");

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
        case 1: // UFS_INFO
          return UFS_INFO;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UFS_INFO, new org.apache.thrift.meta_data.FieldMetaData("ufsInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, UfsInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetUfsInfoTResponse.class, metaDataMap);
  }

  public GetUfsInfoTResponse() {
  }

  public GetUfsInfoTResponse(
    UfsInfo ufsInfo)
  {
    this();
    this.ufsInfo = ufsInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetUfsInfoTResponse(GetUfsInfoTResponse other) {
    if (other.isSetUfsInfo()) {
      this.ufsInfo = new UfsInfo(other.ufsInfo);
    }
  }

  public GetUfsInfoTResponse deepCopy() {
    return new GetUfsInfoTResponse(this);
  }

  @Override
  public void clear() {
    this.ufsInfo = null;
  }

  public UfsInfo getUfsInfo() {
    return this.ufsInfo;
  }

  public GetUfsInfoTResponse setUfsInfo(UfsInfo ufsInfo) {
    this.ufsInfo = ufsInfo;
    return this;
  }

  public void unsetUfsInfo() {
    this.ufsInfo = null;
  }

  /** Returns true if field ufsInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetUfsInfo() {
    return this.ufsInfo != null;
  }

  public void setUfsInfoIsSet(boolean value) {
    if (!value) {
      this.ufsInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UFS_INFO:
      if (value == null) {
        unsetUfsInfo();
      } else {
        setUfsInfo((UfsInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UFS_INFO:
      return getUfsInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UFS_INFO:
      return isSetUfsInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetUfsInfoTResponse)
      return this.equals((GetUfsInfoTResponse)that);
    return false;
  }

  public boolean equals(GetUfsInfoTResponse that) {
    if (that == null)
      return false;

    boolean this_present_ufsInfo = true && this.isSetUfsInfo();
    boolean that_present_ufsInfo = true && that.isSetUfsInfo();
    if (this_present_ufsInfo || that_present_ufsInfo) {
      if (!(this_present_ufsInfo && that_present_ufsInfo))
        return false;
      if (!this.ufsInfo.equals(that.ufsInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_ufsInfo = true && (isSetUfsInfo());
    list.add(present_ufsInfo);
    if (present_ufsInfo)
      list.add(ufsInfo);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetUfsInfoTResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUfsInfo()).compareTo(other.isSetUfsInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUfsInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ufsInfo, other.ufsInfo);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetUfsInfoTResponse(");
    boolean first = true;

    sb.append("ufsInfo:");
    if (this.ufsInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.ufsInfo);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (ufsInfo != null) {
      ufsInfo.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetUfsInfoTResponseStandardSchemeFactory implements SchemeFactory {
    public GetUfsInfoTResponseStandardScheme getScheme() {
      return new GetUfsInfoTResponseStandardScheme();
    }
  }

  private static class GetUfsInfoTResponseStandardScheme extends StandardScheme<GetUfsInfoTResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetUfsInfoTResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UFS_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ufsInfo = new UfsInfo();
              struct.ufsInfo.read(iprot);
              struct.setUfsInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetUfsInfoTResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ufsInfo != null) {
        oprot.writeFieldBegin(UFS_INFO_FIELD_DESC);
        struct.ufsInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetUfsInfoTResponseTupleSchemeFactory implements SchemeFactory {
    public GetUfsInfoTResponseTupleScheme getScheme() {
      return new GetUfsInfoTResponseTupleScheme();
    }
  }

  private static class GetUfsInfoTResponseTupleScheme extends TupleScheme<GetUfsInfoTResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetUfsInfoTResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUfsInfo()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetUfsInfo()) {
        struct.ufsInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetUfsInfoTResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.ufsInfo = new UfsInfo();
        struct.ufsInfo.read(iprot);
        struct.setUfsInfoIsSet(true);
      }
    }
  }

}
