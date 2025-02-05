/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2024-01-19")
public class EAxisSchemeParam implements org.apache.thrift.TBase<EAxisSchemeParam, EAxisSchemeParam._Fields>, java.io.Serializable, Cloneable, Comparable<EAxisSchemeParam> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EAxisSchemeParam");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField AXIS_LINK_FIELD_DESC = new org.apache.thrift.protocol.TField("axis_link", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("base", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField DH_FIELD_DESC = new org.apache.thrift.protocol.TField("dh", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField INSTALL_FIELD_DESC = new org.apache.thrift.protocol.TField("install", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new EAxisSchemeParamStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new EAxisSchemeParamTupleSchemeFactory();

  public int type; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> axis_link; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Double> base; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.util.List<java.lang.Double>> dh; // required
  public int install; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE((short)1, "type"),
    AXIS_LINK((short)2, "axis_link"),
    BASE((short)3, "base"),
    DH((short)4, "dh"),
    INSTALL((short)5, "install");

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
        case 1: // TYPE
          return TYPE;
        case 2: // AXIS_LINK
          return AXIS_LINK;
        case 3: // BASE
          return BASE;
        case 4: // DH
          return DH;
        case 5: // INSTALL
          return INSTALL;
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
  private static final int __TYPE_ISSET_ID = 0;
  private static final int __INSTALL_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AXIS_LINK, new org.apache.thrift.meta_data.FieldMetaData("axis_link", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.BASE, new org.apache.thrift.meta_data.FieldMetaData("base", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.DH, new org.apache.thrift.meta_data.FieldMetaData("dh", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)))));
    tmpMap.put(_Fields.INSTALL, new org.apache.thrift.meta_data.FieldMetaData("install", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EAxisSchemeParam.class, metaDataMap);
  }

  public EAxisSchemeParam() {
  }

  public EAxisSchemeParam(
    int type,
    java.util.List<java.lang.Integer> axis_link,
    java.util.List<java.lang.Double> base,
    java.util.List<java.util.List<java.lang.Double>> dh,
    int install)
  {
    this();
    this.type = type;
    setTypeIsSet(true);
    this.axis_link = axis_link;
    this.base = base;
    this.dh = dh;
    this.install = install;
    setInstallIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EAxisSchemeParam(EAxisSchemeParam other) {
    __isset_bitfield = other.__isset_bitfield;
    this.type = other.type;
    if (other.isSetAxis_link()) {
      java.util.List<java.lang.Integer> __this__axis_link = new java.util.ArrayList<java.lang.Integer>(other.axis_link);
      this.axis_link = __this__axis_link;
    }
    if (other.isSetBase()) {
      java.util.List<java.lang.Double> __this__base = new java.util.ArrayList<java.lang.Double>(other.base);
      this.base = __this__base;
    }
    if (other.isSetDh()) {
      java.util.List<java.util.List<java.lang.Double>> __this__dh = new java.util.ArrayList<java.util.List<java.lang.Double>>(other.dh.size());
      for (java.util.List<java.lang.Double> other_element : other.dh) {
        java.util.List<java.lang.Double> __this__dh_copy = new java.util.ArrayList<java.lang.Double>(other_element);
        __this__dh.add(__this__dh_copy);
      }
      this.dh = __this__dh;
    }
    this.install = other.install;
  }

  public EAxisSchemeParam deepCopy() {
    return new EAxisSchemeParam(this);
  }

  @Override
  public void clear() {
    setTypeIsSet(false);
    this.type = 0;
    this.axis_link = null;
    this.base = null;
    this.dh = null;
    setInstallIsSet(false);
    this.install = 0;
  }

  public int getType() {
    return this.type;
  }

  public EAxisSchemeParam setType(int type) {
    this.type = type;
    setTypeIsSet(true);
    return this;
  }

  public void unsetType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TYPE_ISSET_ID, value);
  }

  public int getAxis_linkSize() {
    return (this.axis_link == null) ? 0 : this.axis_link.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getAxis_linkIterator() {
    return (this.axis_link == null) ? null : this.axis_link.iterator();
  }

  public void addToAxis_link(int elem) {
    if (this.axis_link == null) {
      this.axis_link = new java.util.ArrayList<java.lang.Integer>();
    }
    this.axis_link.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getAxis_link() {
    return this.axis_link;
  }

  public EAxisSchemeParam setAxis_link(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> axis_link) {
    this.axis_link = axis_link;
    return this;
  }

  public void unsetAxis_link() {
    this.axis_link = null;
  }

  /** Returns true if field axis_link is set (has been assigned a value) and false otherwise */
  public boolean isSetAxis_link() {
    return this.axis_link != null;
  }

  public void setAxis_linkIsSet(boolean value) {
    if (!value) {
      this.axis_link = null;
    }
  }

  public int getBaseSize() {
    return (this.base == null) ? 0 : this.base.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Double> getBaseIterator() {
    return (this.base == null) ? null : this.base.iterator();
  }

  public void addToBase(double elem) {
    if (this.base == null) {
      this.base = new java.util.ArrayList<java.lang.Double>();
    }
    this.base.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Double> getBase() {
    return this.base;
  }

  public EAxisSchemeParam setBase(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Double> base) {
    this.base = base;
    return this;
  }

  public void unsetBase() {
    this.base = null;
  }

  /** Returns true if field base is set (has been assigned a value) and false otherwise */
  public boolean isSetBase() {
    return this.base != null;
  }

  public void setBaseIsSet(boolean value) {
    if (!value) {
      this.base = null;
    }
  }

  public int getDhSize() {
    return (this.dh == null) ? 0 : this.dh.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.util.List<java.lang.Double>> getDhIterator() {
    return (this.dh == null) ? null : this.dh.iterator();
  }

  public void addToDh(java.util.List<java.lang.Double> elem) {
    if (this.dh == null) {
      this.dh = new java.util.ArrayList<java.util.List<java.lang.Double>>();
    }
    this.dh.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.util.List<java.lang.Double>> getDh() {
    return this.dh;
  }

  public EAxisSchemeParam setDh(@org.apache.thrift.annotation.Nullable java.util.List<java.util.List<java.lang.Double>> dh) {
    this.dh = dh;
    return this;
  }

  public void unsetDh() {
    this.dh = null;
  }

  /** Returns true if field dh is set (has been assigned a value) and false otherwise */
  public boolean isSetDh() {
    return this.dh != null;
  }

  public void setDhIsSet(boolean value) {
    if (!value) {
      this.dh = null;
    }
  }

  public int getInstall() {
    return this.install;
  }

  public EAxisSchemeParam setInstall(int install) {
    this.install = install;
    setInstallIsSet(true);
    return this;
  }

  public void unsetInstall() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INSTALL_ISSET_ID);
  }

  /** Returns true if field install is set (has been assigned a value) and false otherwise */
  public boolean isSetInstall() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INSTALL_ISSET_ID);
  }

  public void setInstallIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INSTALL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((java.lang.Integer)value);
      }
      break;

    case AXIS_LINK:
      if (value == null) {
        unsetAxis_link();
      } else {
        setAxis_link((java.util.List<java.lang.Integer>)value);
      }
      break;

    case BASE:
      if (value == null) {
        unsetBase();
      } else {
        setBase((java.util.List<java.lang.Double>)value);
      }
      break;

    case DH:
      if (value == null) {
        unsetDh();
      } else {
        setDh((java.util.List<java.util.List<java.lang.Double>>)value);
      }
      break;

    case INSTALL:
      if (value == null) {
        unsetInstall();
      } else {
        setInstall((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case AXIS_LINK:
      return getAxis_link();

    case BASE:
      return getBase();

    case DH:
      return getDh();

    case INSTALL:
      return getInstall();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case AXIS_LINK:
      return isSetAxis_link();
    case BASE:
      return isSetBase();
    case DH:
      return isSetDh();
    case INSTALL:
      return isSetInstall();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof EAxisSchemeParam)
      return this.equals((EAxisSchemeParam)that);
    return false;
  }

  public boolean equals(EAxisSchemeParam that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true;
    boolean that_present_type = true;
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (this.type != that.type)
        return false;
    }

    boolean this_present_axis_link = true && this.isSetAxis_link();
    boolean that_present_axis_link = true && that.isSetAxis_link();
    if (this_present_axis_link || that_present_axis_link) {
      if (!(this_present_axis_link && that_present_axis_link))
        return false;
      if (!this.axis_link.equals(that.axis_link))
        return false;
    }

    boolean this_present_base = true && this.isSetBase();
    boolean that_present_base = true && that.isSetBase();
    if (this_present_base || that_present_base) {
      if (!(this_present_base && that_present_base))
        return false;
      if (!this.base.equals(that.base))
        return false;
    }

    boolean this_present_dh = true && this.isSetDh();
    boolean that_present_dh = true && that.isSetDh();
    if (this_present_dh || that_present_dh) {
      if (!(this_present_dh && that_present_dh))
        return false;
      if (!this.dh.equals(that.dh))
        return false;
    }

    boolean this_present_install = true;
    boolean that_present_install = true;
    if (this_present_install || that_present_install) {
      if (!(this_present_install && that_present_install))
        return false;
      if (this.install != that.install)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + type;

    hashCode = hashCode * 8191 + ((isSetAxis_link()) ? 131071 : 524287);
    if (isSetAxis_link())
      hashCode = hashCode * 8191 + axis_link.hashCode();

    hashCode = hashCode * 8191 + ((isSetBase()) ? 131071 : 524287);
    if (isSetBase())
      hashCode = hashCode * 8191 + base.hashCode();

    hashCode = hashCode * 8191 + ((isSetDh()) ? 131071 : 524287);
    if (isSetDh())
      hashCode = hashCode * 8191 + dh.hashCode();

    hashCode = hashCode * 8191 + install;

    return hashCode;
  }

  @Override
  public int compareTo(EAxisSchemeParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAxis_link()).compareTo(other.isSetAxis_link());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAxis_link()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.axis_link, other.axis_link);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBase()).compareTo(other.isSetBase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.base, other.base);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDh()).compareTo(other.isSetDh());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDh()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dh, other.dh);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInstall()).compareTo(other.isSetInstall());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstall()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.install, other.install);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("EAxisSchemeParam(");
    boolean first = true;

    sb.append("type:");
    sb.append(this.type);
    first = false;
    if (!first) sb.append(", ");
    sb.append("axis_link:");
    if (this.axis_link == null) {
      sb.append("null");
    } else {
      sb.append(this.axis_link);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("base:");
    if (this.base == null) {
      sb.append("null");
    } else {
      sb.append(this.base);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dh:");
    if (this.dh == null) {
      sb.append("null");
    } else {
      sb.append(this.dh);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("install:");
    sb.append(this.install);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'type' because it's a primitive and you chose the non-beans generator.
    if (axis_link == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'axis_link' was not present! Struct: " + toString());
    }
    if (base == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'base' was not present! Struct: " + toString());
    }
    if (dh == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dh' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'install' because it's a primitive and you chose the non-beans generator.
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

  private static class EAxisSchemeParamStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EAxisSchemeParamStandardScheme getScheme() {
      return new EAxisSchemeParamStandardScheme();
    }
  }

  private static class EAxisSchemeParamStandardScheme extends org.apache.thrift.scheme.StandardScheme<EAxisSchemeParam> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EAxisSchemeParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = iprot.readI32();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AXIS_LINK
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list272 = iprot.readListBegin();
                struct.axis_link = new java.util.ArrayList<java.lang.Integer>(_list272.size);
                int _elem273;
                for (int _i274 = 0; _i274 < _list272.size; ++_i274)
                {
                  _elem273 = iprot.readI32();
                  struct.axis_link.add(_elem273);
                }
                iprot.readListEnd();
              }
              struct.setAxis_linkIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BASE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list275 = iprot.readListBegin();
                struct.base = new java.util.ArrayList<java.lang.Double>(_list275.size);
                double _elem276;
                for (int _i277 = 0; _i277 < _list275.size; ++_i277)
                {
                  _elem276 = iprot.readDouble();
                  struct.base.add(_elem276);
                }
                iprot.readListEnd();
              }
              struct.setBaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DH
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list278 = iprot.readListBegin();
                struct.dh = new java.util.ArrayList<java.util.List<java.lang.Double>>(_list278.size);
                @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Double> _elem279;
                for (int _i280 = 0; _i280 < _list278.size; ++_i280)
                {
                  {
                    org.apache.thrift.protocol.TList _list281 = iprot.readListBegin();
                    _elem279 = new java.util.ArrayList<java.lang.Double>(_list281.size);
                    double _elem282;
                    for (int _i283 = 0; _i283 < _list281.size; ++_i283)
                    {
                      _elem282 = iprot.readDouble();
                      _elem279.add(_elem282);
                    }
                    iprot.readListEnd();
                  }
                  struct.dh.add(_elem279);
                }
                iprot.readListEnd();
              }
              struct.setDhIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // INSTALL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.install = iprot.readI32();
              struct.setInstallIsSet(true);
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
      if (!struct.isSetType()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetInstall()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'install' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, EAxisSchemeParam struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(struct.type);
      oprot.writeFieldEnd();
      if (struct.axis_link != null) {
        oprot.writeFieldBegin(AXIS_LINK_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.axis_link.size()));
          for (int _iter284 : struct.axis_link)
          {
            oprot.writeI32(_iter284);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.base != null) {
        oprot.writeFieldBegin(BASE_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.base.size()));
          for (double _iter285 : struct.base)
          {
            oprot.writeDouble(_iter285);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.dh != null) {
        oprot.writeFieldBegin(DH_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.dh.size()));
          for (java.util.List<java.lang.Double> _iter286 : struct.dh)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, _iter286.size()));
              for (double _iter287 : _iter286)
              {
                oprot.writeDouble(_iter287);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INSTALL_FIELD_DESC);
      oprot.writeI32(struct.install);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EAxisSchemeParamTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EAxisSchemeParamTupleScheme getScheme() {
      return new EAxisSchemeParamTupleScheme();
    }
  }

  private static class EAxisSchemeParamTupleScheme extends org.apache.thrift.scheme.TupleScheme<EAxisSchemeParam> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EAxisSchemeParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.type);
      {
        oprot.writeI32(struct.axis_link.size());
        for (int _iter288 : struct.axis_link)
        {
          oprot.writeI32(_iter288);
        }
      }
      {
        oprot.writeI32(struct.base.size());
        for (double _iter289 : struct.base)
        {
          oprot.writeDouble(_iter289);
        }
      }
      {
        oprot.writeI32(struct.dh.size());
        for (java.util.List<java.lang.Double> _iter290 : struct.dh)
        {
          {
            oprot.writeI32(_iter290.size());
            for (double _iter291 : _iter290)
            {
              oprot.writeDouble(_iter291);
            }
          }
        }
      }
      oprot.writeI32(struct.install);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EAxisSchemeParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.type = iprot.readI32();
      struct.setTypeIsSet(true);
      {
        org.apache.thrift.protocol.TList _list292 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.axis_link = new java.util.ArrayList<java.lang.Integer>(_list292.size);
        int _elem293;
        for (int _i294 = 0; _i294 < _list292.size; ++_i294)
        {
          _elem293 = iprot.readI32();
          struct.axis_link.add(_elem293);
        }
      }
      struct.setAxis_linkIsSet(true);
      {
        org.apache.thrift.protocol.TList _list295 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
        struct.base = new java.util.ArrayList<java.lang.Double>(_list295.size);
        double _elem296;
        for (int _i297 = 0; _i297 < _list295.size; ++_i297)
        {
          _elem296 = iprot.readDouble();
          struct.base.add(_elem296);
        }
      }
      struct.setBaseIsSet(true);
      {
        org.apache.thrift.protocol.TList _list298 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
        struct.dh = new java.util.ArrayList<java.util.List<java.lang.Double>>(_list298.size);
        @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Double> _elem299;
        for (int _i300 = 0; _i300 < _list298.size; ++_i300)
        {
          {
            org.apache.thrift.protocol.TList _list301 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
            _elem299 = new java.util.ArrayList<java.lang.Double>(_list301.size);
            double _elem302;
            for (int _i303 = 0; _i303 < _list301.size; ++_i303)
            {
              _elem302 = iprot.readDouble();
              _elem299.add(_elem302);
            }
          }
          struct.dh.add(_elem299);
        }
      }
      struct.setDhIsSet(true);
      struct.install = iprot.readI32();
      struct.setInstallIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

