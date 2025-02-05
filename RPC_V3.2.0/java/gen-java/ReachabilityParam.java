/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2024-01-19")
public class ReachabilityParam implements org.apache.thrift.TBase<ReachabilityParam, ReachabilityParam._Fields>, java.io.Serializable, Cloneable, Comparable<ReachabilityParam> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReachabilityParam");

  private static final org.apache.thrift.protocol.TField RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("result", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField JOINTS_POS_FIELD_DESC = new org.apache.thrift.protocol.TField("joints_pos", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ReachabilityParamStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ReachabilityParamTupleSchemeFactory();

  public boolean result; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.util.List<java.lang.Double>> joints_pos; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESULT((short)1, "result"),
    JOINTS_POS((short)2, "joints_pos");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RESULT
          return RESULT;
        case 2: // JOINTS_POS
          return JOINTS_POS;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RESULT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULT, new org.apache.thrift.meta_data.FieldMetaData("result", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.JOINTS_POS, new org.apache.thrift.meta_data.FieldMetaData("joints_pos", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReachabilityParam.class, metaDataMap);
  }

  public ReachabilityParam() {
  }

  public ReachabilityParam(
    boolean result,
    java.util.List<java.util.List<java.lang.Double>> joints_pos)
  {
    this();
    this.result = result;
    setResultIsSet(true);
    this.joints_pos = joints_pos;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReachabilityParam(ReachabilityParam other) {
    __isset_bitfield = other.__isset_bitfield;
    this.result = other.result;
    if (other.isSetJoints_pos()) {
      java.util.List<java.util.List<java.lang.Double>> __this__joints_pos = new java.util.ArrayList<java.util.List<java.lang.Double>>(other.joints_pos.size());
      for (java.util.List<java.lang.Double> other_element : other.joints_pos) {
        java.util.List<java.lang.Double> __this__joints_pos_copy = new java.util.ArrayList<java.lang.Double>(other_element);
        __this__joints_pos.add(__this__joints_pos_copy);
      }
      this.joints_pos = __this__joints_pos;
    }
  }

  public ReachabilityParam deepCopy() {
    return new ReachabilityParam(this);
  }

  @Override
  public void clear() {
    setResultIsSet(false);
    this.result = false;
    this.joints_pos = null;
  }

  public boolean isResult() {
    return this.result;
  }

  public ReachabilityParam setResult(boolean result) {
    this.result = result;
    setResultIsSet(true);
    return this;
  }

  public void unsetResult() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RESULT_ISSET_ID);
  }

  /** Returns true if field result is set (has been assigned a value) and false otherwise */
  public boolean isSetResult() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RESULT_ISSET_ID);
  }

  public void setResultIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RESULT_ISSET_ID, value);
  }

  public int getJoints_posSize() {
    return (this.joints_pos == null) ? 0 : this.joints_pos.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.util.List<java.lang.Double>> getJoints_posIterator() {
    return (this.joints_pos == null) ? null : this.joints_pos.iterator();
  }

  public void addToJoints_pos(java.util.List<java.lang.Double> elem) {
    if (this.joints_pos == null) {
      this.joints_pos = new java.util.ArrayList<java.util.List<java.lang.Double>>();
    }
    this.joints_pos.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.util.List<java.lang.Double>> getJoints_pos() {
    return this.joints_pos;
  }

  public ReachabilityParam setJoints_pos(@org.apache.thrift.annotation.Nullable java.util.List<java.util.List<java.lang.Double>> joints_pos) {
    this.joints_pos = joints_pos;
    return this;
  }

  public void unsetJoints_pos() {
    this.joints_pos = null;
  }

  /** Returns true if field joints_pos is set (has been assigned a value) and false otherwise */
  public boolean isSetJoints_pos() {
    return this.joints_pos != null;
  }

  public void setJoints_posIsSet(boolean value) {
    if (!value) {
      this.joints_pos = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((java.lang.Boolean)value);
      }
      break;

    case JOINTS_POS:
      if (value == null) {
        unsetJoints_pos();
      } else {
        setJoints_pos((java.util.List<java.util.List<java.lang.Double>>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT:
      return isResult();

    case JOINTS_POS:
      return getJoints_pos();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RESULT:
      return isSetResult();
    case JOINTS_POS:
      return isSetJoints_pos();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ReachabilityParam)
      return this.equals((ReachabilityParam)that);
    return false;
  }

  public boolean equals(ReachabilityParam that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_result = true;
    boolean that_present_result = true;
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (this.result != that.result)
        return false;
    }

    boolean this_present_joints_pos = true && this.isSetJoints_pos();
    boolean that_present_joints_pos = true && that.isSetJoints_pos();
    if (this_present_joints_pos || that_present_joints_pos) {
      if (!(this_present_joints_pos && that_present_joints_pos))
        return false;
      if (!this.joints_pos.equals(that.joints_pos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((result) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetJoints_pos()) ? 131071 : 524287);
    if (isSetJoints_pos())
      hashCode = hashCode * 8191 + joints_pos.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ReachabilityParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetResult()).compareTo(other.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result, other.result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetJoints_pos()).compareTo(other.isSetJoints_pos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJoints_pos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.joints_pos, other.joints_pos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ReachabilityParam(");
    boolean first = true;

    sb.append("result:");
    sb.append(this.result);
    first = false;
    if (!first) sb.append(", ");
    sb.append("joints_pos:");
    if (this.joints_pos == null) {
      sb.append("null");
    } else {
      sb.append(this.joints_pos);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'result' because it's a primitive and you chose the non-beans generator.
    if (joints_pos == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'joints_pos' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ReachabilityParamStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReachabilityParamStandardScheme getScheme() {
      return new ReachabilityParamStandardScheme();
    }
  }

  private static class ReachabilityParamStandardScheme extends org.apache.thrift.scheme.StandardScheme<ReachabilityParam> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReachabilityParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.result = iprot.readBool();
              struct.setResultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JOINTS_POS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list304 = iprot.readListBegin();
                struct.joints_pos = new java.util.ArrayList<java.util.List<java.lang.Double>>(_list304.size);
                @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Double> _elem305;
                for (int _i306 = 0; _i306 < _list304.size; ++_i306)
                {
                  {
                    org.apache.thrift.protocol.TList _list307 = iprot.readListBegin();
                    _elem305 = new java.util.ArrayList<java.lang.Double>(_list307.size);
                    double _elem308;
                    for (int _i309 = 0; _i309 < _list307.size; ++_i309)
                    {
                      _elem308 = iprot.readDouble();
                      _elem305.add(_elem308);
                    }
                    iprot.readListEnd();
                  }
                  struct.joints_pos.add(_elem305);
                }
                iprot.readListEnd();
              }
              struct.setJoints_posIsSet(true);
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
      if (!struct.isSetResult()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'result' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReachabilityParam struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      oprot.writeBool(struct.result);
      oprot.writeFieldEnd();
      if (struct.joints_pos != null) {
        oprot.writeFieldBegin(JOINTS_POS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.joints_pos.size()));
          for (java.util.List<java.lang.Double> _iter310 : struct.joints_pos)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, _iter310.size()));
              for (double _iter311 : _iter310)
              {
                oprot.writeDouble(_iter311);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReachabilityParamTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReachabilityParamTupleScheme getScheme() {
      return new ReachabilityParamTupleScheme();
    }
  }

  private static class ReachabilityParamTupleScheme extends org.apache.thrift.scheme.TupleScheme<ReachabilityParam> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReachabilityParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeBool(struct.result);
      {
        oprot.writeI32(struct.joints_pos.size());
        for (java.util.List<java.lang.Double> _iter312 : struct.joints_pos)
        {
          {
            oprot.writeI32(_iter312.size());
            for (double _iter313 : _iter312)
            {
              oprot.writeDouble(_iter313);
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReachabilityParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.result = iprot.readBool();
      struct.setResultIsSet(true);
      {
        org.apache.thrift.protocol.TList _list314 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
        struct.joints_pos = new java.util.ArrayList<java.util.List<java.lang.Double>>(_list314.size);
        @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Double> _elem315;
        for (int _i316 = 0; _i316 < _list314.size; ++_i316)
        {
          {
            org.apache.thrift.protocol.TList _list317 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
            _elem315 = new java.util.ArrayList<java.lang.Double>(_list317.size);
            double _elem318;
            for (int _i319 = 0; _i319 < _list317.size; ++_i319)
            {
              _elem318 = iprot.readDouble();
              _elem315.add(_elem318);
            }
          }
          struct.joints_pos.add(_elem315);
        }
      }
      struct.setJoints_posIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

