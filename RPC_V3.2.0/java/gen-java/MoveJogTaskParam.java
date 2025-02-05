/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2024-01-19")
public class MoveJogTaskParam implements org.apache.thrift.TBase<MoveJogTaskParam, MoveJogTaskParam._Fields>, java.io.Serializable, Cloneable, Comparable<MoveJogTaskParam> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MoveJogTaskParam");

  private static final org.apache.thrift.protocol.TField JOG_DIRECTION_FIELD_DESC = new org.apache.thrift.protocol.TField("jog_direction", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField JOG_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("jog_type", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField AXIS_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("axis_num", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField VEL_FIELD_DESC = new org.apache.thrift.protocol.TField("vel", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField JOG_COORDINATE_FIELD_DESC = new org.apache.thrift.protocol.TField("jog_coordinate", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField USE_STEP_FIELD_DESC = new org.apache.thrift.protocol.TField("use_step", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField STEP_JOINT_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("step_jointValue", org.apache.thrift.protocol.TType.DOUBLE, (short)7);
  private static final org.apache.thrift.protocol.TField STEP_CARTVALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("step_cartvalue", org.apache.thrift.protocol.TType.DOUBLE, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MoveJogTaskParamStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MoveJogTaskParamTupleSchemeFactory();

  public int jog_direction; // required
  public int jog_type; // required
  public int axis_num; // required
  public double vel; // required
  public int jog_coordinate; // required
  public boolean use_step; // required
  public double step_jointValue; // required
  public double step_cartvalue; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOG_DIRECTION((short)1, "jog_direction"),
    JOG_TYPE((short)2, "jog_type"),
    AXIS_NUM((short)3, "axis_num"),
    VEL((short)4, "vel"),
    JOG_COORDINATE((short)5, "jog_coordinate"),
    USE_STEP((short)6, "use_step"),
    STEP_JOINT_VALUE((short)7, "step_jointValue"),
    STEP_CARTVALUE((short)8, "step_cartvalue");

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
        case 1: // JOG_DIRECTION
          return JOG_DIRECTION;
        case 2: // JOG_TYPE
          return JOG_TYPE;
        case 3: // AXIS_NUM
          return AXIS_NUM;
        case 4: // VEL
          return VEL;
        case 5: // JOG_COORDINATE
          return JOG_COORDINATE;
        case 6: // USE_STEP
          return USE_STEP;
        case 7: // STEP_JOINT_VALUE
          return STEP_JOINT_VALUE;
        case 8: // STEP_CARTVALUE
          return STEP_CARTVALUE;
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
  private static final int __JOG_DIRECTION_ISSET_ID = 0;
  private static final int __JOG_TYPE_ISSET_ID = 1;
  private static final int __AXIS_NUM_ISSET_ID = 2;
  private static final int __VEL_ISSET_ID = 3;
  private static final int __JOG_COORDINATE_ISSET_ID = 4;
  private static final int __USE_STEP_ISSET_ID = 5;
  private static final int __STEP_JOINTVALUE_ISSET_ID = 6;
  private static final int __STEP_CARTVALUE_ISSET_ID = 7;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOG_DIRECTION, new org.apache.thrift.meta_data.FieldMetaData("jog_direction", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.JOG_TYPE, new org.apache.thrift.meta_data.FieldMetaData("jog_type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AXIS_NUM, new org.apache.thrift.meta_data.FieldMetaData("axis_num", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VEL, new org.apache.thrift.meta_data.FieldMetaData("vel", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.JOG_COORDINATE, new org.apache.thrift.meta_data.FieldMetaData("jog_coordinate", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USE_STEP, new org.apache.thrift.meta_data.FieldMetaData("use_step", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.STEP_JOINT_VALUE, new org.apache.thrift.meta_data.FieldMetaData("step_jointValue", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.STEP_CARTVALUE, new org.apache.thrift.meta_data.FieldMetaData("step_cartvalue", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MoveJogTaskParam.class, metaDataMap);
  }

  public MoveJogTaskParam() {
  }

  public MoveJogTaskParam(
    int jog_direction,
    int jog_type,
    int axis_num,
    double vel,
    int jog_coordinate,
    boolean use_step,
    double step_jointValue,
    double step_cartvalue)
  {
    this();
    this.jog_direction = jog_direction;
    setJog_directionIsSet(true);
    this.jog_type = jog_type;
    setJog_typeIsSet(true);
    this.axis_num = axis_num;
    setAxis_numIsSet(true);
    this.vel = vel;
    setVelIsSet(true);
    this.jog_coordinate = jog_coordinate;
    setJog_coordinateIsSet(true);
    this.use_step = use_step;
    setUse_stepIsSet(true);
    this.step_jointValue = step_jointValue;
    setStep_jointValueIsSet(true);
    this.step_cartvalue = step_cartvalue;
    setStep_cartvalueIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MoveJogTaskParam(MoveJogTaskParam other) {
    __isset_bitfield = other.__isset_bitfield;
    this.jog_direction = other.jog_direction;
    this.jog_type = other.jog_type;
    this.axis_num = other.axis_num;
    this.vel = other.vel;
    this.jog_coordinate = other.jog_coordinate;
    this.use_step = other.use_step;
    this.step_jointValue = other.step_jointValue;
    this.step_cartvalue = other.step_cartvalue;
  }

  public MoveJogTaskParam deepCopy() {
    return new MoveJogTaskParam(this);
  }

  @Override
  public void clear() {
    setJog_directionIsSet(false);
    this.jog_direction = 0;
    setJog_typeIsSet(false);
    this.jog_type = 0;
    setAxis_numIsSet(false);
    this.axis_num = 0;
    setVelIsSet(false);
    this.vel = 0.0;
    setJog_coordinateIsSet(false);
    this.jog_coordinate = 0;
    setUse_stepIsSet(false);
    this.use_step = false;
    setStep_jointValueIsSet(false);
    this.step_jointValue = 0.0;
    setStep_cartvalueIsSet(false);
    this.step_cartvalue = 0.0;
  }

  public int getJog_direction() {
    return this.jog_direction;
  }

  public MoveJogTaskParam setJog_direction(int jog_direction) {
    this.jog_direction = jog_direction;
    setJog_directionIsSet(true);
    return this;
  }

  public void unsetJog_direction() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JOG_DIRECTION_ISSET_ID);
  }

  /** Returns true if field jog_direction is set (has been assigned a value) and false otherwise */
  public boolean isSetJog_direction() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JOG_DIRECTION_ISSET_ID);
  }

  public void setJog_directionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JOG_DIRECTION_ISSET_ID, value);
  }

  public int getJog_type() {
    return this.jog_type;
  }

  public MoveJogTaskParam setJog_type(int jog_type) {
    this.jog_type = jog_type;
    setJog_typeIsSet(true);
    return this;
  }

  public void unsetJog_type() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JOG_TYPE_ISSET_ID);
  }

  /** Returns true if field jog_type is set (has been assigned a value) and false otherwise */
  public boolean isSetJog_type() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JOG_TYPE_ISSET_ID);
  }

  public void setJog_typeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JOG_TYPE_ISSET_ID, value);
  }

  public int getAxis_num() {
    return this.axis_num;
  }

  public MoveJogTaskParam setAxis_num(int axis_num) {
    this.axis_num = axis_num;
    setAxis_numIsSet(true);
    return this;
  }

  public void unsetAxis_num() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AXIS_NUM_ISSET_ID);
  }

  /** Returns true if field axis_num is set (has been assigned a value) and false otherwise */
  public boolean isSetAxis_num() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AXIS_NUM_ISSET_ID);
  }

  public void setAxis_numIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AXIS_NUM_ISSET_ID, value);
  }

  public double getVel() {
    return this.vel;
  }

  public MoveJogTaskParam setVel(double vel) {
    this.vel = vel;
    setVelIsSet(true);
    return this;
  }

  public void unsetVel() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VEL_ISSET_ID);
  }

  /** Returns true if field vel is set (has been assigned a value) and false otherwise */
  public boolean isSetVel() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VEL_ISSET_ID);
  }

  public void setVelIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VEL_ISSET_ID, value);
  }

  public int getJog_coordinate() {
    return this.jog_coordinate;
  }

  public MoveJogTaskParam setJog_coordinate(int jog_coordinate) {
    this.jog_coordinate = jog_coordinate;
    setJog_coordinateIsSet(true);
    return this;
  }

  public void unsetJog_coordinate() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JOG_COORDINATE_ISSET_ID);
  }

  /** Returns true if field jog_coordinate is set (has been assigned a value) and false otherwise */
  public boolean isSetJog_coordinate() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JOG_COORDINATE_ISSET_ID);
  }

  public void setJog_coordinateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JOG_COORDINATE_ISSET_ID, value);
  }

  public boolean isUse_step() {
    return this.use_step;
  }

  public MoveJogTaskParam setUse_step(boolean use_step) {
    this.use_step = use_step;
    setUse_stepIsSet(true);
    return this;
  }

  public void unsetUse_step() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USE_STEP_ISSET_ID);
  }

  /** Returns true if field use_step is set (has been assigned a value) and false otherwise */
  public boolean isSetUse_step() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USE_STEP_ISSET_ID);
  }

  public void setUse_stepIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USE_STEP_ISSET_ID, value);
  }

  public double getStep_jointValue() {
    return this.step_jointValue;
  }

  public MoveJogTaskParam setStep_jointValue(double step_jointValue) {
    this.step_jointValue = step_jointValue;
    setStep_jointValueIsSet(true);
    return this;
  }

  public void unsetStep_jointValue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STEP_JOINTVALUE_ISSET_ID);
  }

  /** Returns true if field step_jointValue is set (has been assigned a value) and false otherwise */
  public boolean isSetStep_jointValue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STEP_JOINTVALUE_ISSET_ID);
  }

  public void setStep_jointValueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STEP_JOINTVALUE_ISSET_ID, value);
  }

  public double getStep_cartvalue() {
    return this.step_cartvalue;
  }

  public MoveJogTaskParam setStep_cartvalue(double step_cartvalue) {
    this.step_cartvalue = step_cartvalue;
    setStep_cartvalueIsSet(true);
    return this;
  }

  public void unsetStep_cartvalue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STEP_CARTVALUE_ISSET_ID);
  }

  /** Returns true if field step_cartvalue is set (has been assigned a value) and false otherwise */
  public boolean isSetStep_cartvalue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STEP_CARTVALUE_ISSET_ID);
  }

  public void setStep_cartvalueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STEP_CARTVALUE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case JOG_DIRECTION:
      if (value == null) {
        unsetJog_direction();
      } else {
        setJog_direction((java.lang.Integer)value);
      }
      break;

    case JOG_TYPE:
      if (value == null) {
        unsetJog_type();
      } else {
        setJog_type((java.lang.Integer)value);
      }
      break;

    case AXIS_NUM:
      if (value == null) {
        unsetAxis_num();
      } else {
        setAxis_num((java.lang.Integer)value);
      }
      break;

    case VEL:
      if (value == null) {
        unsetVel();
      } else {
        setVel((java.lang.Double)value);
      }
      break;

    case JOG_COORDINATE:
      if (value == null) {
        unsetJog_coordinate();
      } else {
        setJog_coordinate((java.lang.Integer)value);
      }
      break;

    case USE_STEP:
      if (value == null) {
        unsetUse_step();
      } else {
        setUse_step((java.lang.Boolean)value);
      }
      break;

    case STEP_JOINT_VALUE:
      if (value == null) {
        unsetStep_jointValue();
      } else {
        setStep_jointValue((java.lang.Double)value);
      }
      break;

    case STEP_CARTVALUE:
      if (value == null) {
        unsetStep_cartvalue();
      } else {
        setStep_cartvalue((java.lang.Double)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case JOG_DIRECTION:
      return getJog_direction();

    case JOG_TYPE:
      return getJog_type();

    case AXIS_NUM:
      return getAxis_num();

    case VEL:
      return getVel();

    case JOG_COORDINATE:
      return getJog_coordinate();

    case USE_STEP:
      return isUse_step();

    case STEP_JOINT_VALUE:
      return getStep_jointValue();

    case STEP_CARTVALUE:
      return getStep_cartvalue();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case JOG_DIRECTION:
      return isSetJog_direction();
    case JOG_TYPE:
      return isSetJog_type();
    case AXIS_NUM:
      return isSetAxis_num();
    case VEL:
      return isSetVel();
    case JOG_COORDINATE:
      return isSetJog_coordinate();
    case USE_STEP:
      return isSetUse_step();
    case STEP_JOINT_VALUE:
      return isSetStep_jointValue();
    case STEP_CARTVALUE:
      return isSetStep_cartvalue();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MoveJogTaskParam)
      return this.equals((MoveJogTaskParam)that);
    return false;
  }

  public boolean equals(MoveJogTaskParam that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_jog_direction = true;
    boolean that_present_jog_direction = true;
    if (this_present_jog_direction || that_present_jog_direction) {
      if (!(this_present_jog_direction && that_present_jog_direction))
        return false;
      if (this.jog_direction != that.jog_direction)
        return false;
    }

    boolean this_present_jog_type = true;
    boolean that_present_jog_type = true;
    if (this_present_jog_type || that_present_jog_type) {
      if (!(this_present_jog_type && that_present_jog_type))
        return false;
      if (this.jog_type != that.jog_type)
        return false;
    }

    boolean this_present_axis_num = true;
    boolean that_present_axis_num = true;
    if (this_present_axis_num || that_present_axis_num) {
      if (!(this_present_axis_num && that_present_axis_num))
        return false;
      if (this.axis_num != that.axis_num)
        return false;
    }

    boolean this_present_vel = true;
    boolean that_present_vel = true;
    if (this_present_vel || that_present_vel) {
      if (!(this_present_vel && that_present_vel))
        return false;
      if (this.vel != that.vel)
        return false;
    }

    boolean this_present_jog_coordinate = true;
    boolean that_present_jog_coordinate = true;
    if (this_present_jog_coordinate || that_present_jog_coordinate) {
      if (!(this_present_jog_coordinate && that_present_jog_coordinate))
        return false;
      if (this.jog_coordinate != that.jog_coordinate)
        return false;
    }

    boolean this_present_use_step = true;
    boolean that_present_use_step = true;
    if (this_present_use_step || that_present_use_step) {
      if (!(this_present_use_step && that_present_use_step))
        return false;
      if (this.use_step != that.use_step)
        return false;
    }

    boolean this_present_step_jointValue = true;
    boolean that_present_step_jointValue = true;
    if (this_present_step_jointValue || that_present_step_jointValue) {
      if (!(this_present_step_jointValue && that_present_step_jointValue))
        return false;
      if (this.step_jointValue != that.step_jointValue)
        return false;
    }

    boolean this_present_step_cartvalue = true;
    boolean that_present_step_cartvalue = true;
    if (this_present_step_cartvalue || that_present_step_cartvalue) {
      if (!(this_present_step_cartvalue && that_present_step_cartvalue))
        return false;
      if (this.step_cartvalue != that.step_cartvalue)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + jog_direction;

    hashCode = hashCode * 8191 + jog_type;

    hashCode = hashCode * 8191 + axis_num;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(vel);

    hashCode = hashCode * 8191 + jog_coordinate;

    hashCode = hashCode * 8191 + ((use_step) ? 131071 : 524287);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(step_jointValue);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(step_cartvalue);

    return hashCode;
  }

  @Override
  public int compareTo(MoveJogTaskParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetJog_direction()).compareTo(other.isSetJog_direction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJog_direction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jog_direction, other.jog_direction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetJog_type()).compareTo(other.isSetJog_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJog_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jog_type, other.jog_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAxis_num()).compareTo(other.isSetAxis_num());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAxis_num()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.axis_num, other.axis_num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVel()).compareTo(other.isSetVel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vel, other.vel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetJog_coordinate()).compareTo(other.isSetJog_coordinate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJog_coordinate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jog_coordinate, other.jog_coordinate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUse_step()).compareTo(other.isSetUse_step());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUse_step()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.use_step, other.use_step);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStep_jointValue()).compareTo(other.isSetStep_jointValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStep_jointValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.step_jointValue, other.step_jointValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStep_cartvalue()).compareTo(other.isSetStep_cartvalue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStep_cartvalue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.step_cartvalue, other.step_cartvalue);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MoveJogTaskParam(");
    boolean first = true;

    sb.append("jog_direction:");
    sb.append(this.jog_direction);
    first = false;
    if (!first) sb.append(", ");
    sb.append("jog_type:");
    sb.append(this.jog_type);
    first = false;
    if (!first) sb.append(", ");
    sb.append("axis_num:");
    sb.append(this.axis_num);
    first = false;
    if (!first) sb.append(", ");
    sb.append("vel:");
    sb.append(this.vel);
    first = false;
    if (!first) sb.append(", ");
    sb.append("jog_coordinate:");
    sb.append(this.jog_coordinate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("use_step:");
    sb.append(this.use_step);
    first = false;
    if (!first) sb.append(", ");
    sb.append("step_jointValue:");
    sb.append(this.step_jointValue);
    first = false;
    if (!first) sb.append(", ");
    sb.append("step_cartvalue:");
    sb.append(this.step_cartvalue);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'jog_direction' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'jog_type' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'axis_num' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'vel' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'jog_coordinate' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'use_step' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'step_jointValue' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'step_cartvalue' because it's a primitive and you chose the non-beans generator.
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

  private static class MoveJogTaskParamStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MoveJogTaskParamStandardScheme getScheme() {
      return new MoveJogTaskParamStandardScheme();
    }
  }

  private static class MoveJogTaskParamStandardScheme extends org.apache.thrift.scheme.StandardScheme<MoveJogTaskParam> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MoveJogTaskParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOG_DIRECTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jog_direction = iprot.readI32();
              struct.setJog_directionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JOG_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jog_type = iprot.readI32();
              struct.setJog_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AXIS_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.axis_num = iprot.readI32();
              struct.setAxis_numIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VEL
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.vel = iprot.readDouble();
              struct.setVelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // JOG_COORDINATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jog_coordinate = iprot.readI32();
              struct.setJog_coordinateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // USE_STEP
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.use_step = iprot.readBool();
              struct.setUse_stepIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // STEP_JOINT_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.step_jointValue = iprot.readDouble();
              struct.setStep_jointValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // STEP_CARTVALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.step_cartvalue = iprot.readDouble();
              struct.setStep_cartvalueIsSet(true);
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
      if (!struct.isSetJog_direction()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'jog_direction' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetJog_type()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'jog_type' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetAxis_num()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'axis_num' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetVel()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'vel' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetJog_coordinate()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'jog_coordinate' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetUse_step()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'use_step' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetStep_jointValue()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'step_jointValue' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetStep_cartvalue()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'step_cartvalue' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MoveJogTaskParam struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(JOG_DIRECTION_FIELD_DESC);
      oprot.writeI32(struct.jog_direction);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(JOG_TYPE_FIELD_DESC);
      oprot.writeI32(struct.jog_type);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AXIS_NUM_FIELD_DESC);
      oprot.writeI32(struct.axis_num);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VEL_FIELD_DESC);
      oprot.writeDouble(struct.vel);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(JOG_COORDINATE_FIELD_DESC);
      oprot.writeI32(struct.jog_coordinate);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(USE_STEP_FIELD_DESC);
      oprot.writeBool(struct.use_step);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STEP_JOINT_VALUE_FIELD_DESC);
      oprot.writeDouble(struct.step_jointValue);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STEP_CARTVALUE_FIELD_DESC);
      oprot.writeDouble(struct.step_cartvalue);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MoveJogTaskParamTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MoveJogTaskParamTupleScheme getScheme() {
      return new MoveJogTaskParamTupleScheme();
    }
  }

  private static class MoveJogTaskParamTupleScheme extends org.apache.thrift.scheme.TupleScheme<MoveJogTaskParam> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MoveJogTaskParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.jog_direction);
      oprot.writeI32(struct.jog_type);
      oprot.writeI32(struct.axis_num);
      oprot.writeDouble(struct.vel);
      oprot.writeI32(struct.jog_coordinate);
      oprot.writeBool(struct.use_step);
      oprot.writeDouble(struct.step_jointValue);
      oprot.writeDouble(struct.step_cartvalue);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MoveJogTaskParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.jog_direction = iprot.readI32();
      struct.setJog_directionIsSet(true);
      struct.jog_type = iprot.readI32();
      struct.setJog_typeIsSet(true);
      struct.axis_num = iprot.readI32();
      struct.setAxis_numIsSet(true);
      struct.vel = iprot.readDouble();
      struct.setVelIsSet(true);
      struct.jog_coordinate = iprot.readI32();
      struct.setJog_coordinateIsSet(true);
      struct.use_step = iprot.readBool();
      struct.setUse_stepIsSet(true);
      struct.step_jointValue = iprot.readDouble();
      struct.setStep_jointValueIsSet(true);
      struct.step_cartvalue = iprot.readDouble();
      struct.setStep_cartvalueIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

