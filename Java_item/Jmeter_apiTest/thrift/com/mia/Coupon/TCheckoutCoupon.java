/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.mia.Coupon;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-08-18")
public class TCheckoutCoupon implements org.apache.thrift.TBase<TCheckoutCoupon, TCheckoutCoupon._Fields>, java.io.Serializable, Cloneable, Comparable<TCheckoutCoupon> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCheckoutCoupon");

  private static final org.apache.thrift.protocol.TField SHOP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("shopId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COUPON_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("couponCode", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TCheckoutCouponStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TCheckoutCouponTupleSchemeFactory());
  }

  public int shopId; // required
  public String couponCode; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SHOP_ID((short)1, "shopId"),
    COUPON_CODE((short)2, "couponCode");

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
        case 1: // SHOP_ID
          return SHOP_ID;
        case 2: // COUPON_CODE
          return COUPON_CODE;
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
  private static final int __SHOPID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SHOP_ID, new org.apache.thrift.meta_data.FieldMetaData("shopId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COUPON_CODE, new org.apache.thrift.meta_data.FieldMetaData("couponCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCheckoutCoupon.class, metaDataMap);
  }

  public TCheckoutCoupon() {
    this.shopId = 0;

  }

  public TCheckoutCoupon(
    int shopId,
    String couponCode)
  {
    this();
    this.shopId = shopId;
    setShopIdIsSet(true);
    this.couponCode = couponCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCheckoutCoupon(TCheckoutCoupon other) {
    __isset_bitfield = other.__isset_bitfield;
    this.shopId = other.shopId;
    if (other.isSetCouponCode()) {
      this.couponCode = other.couponCode;
    }
  }

  public TCheckoutCoupon deepCopy() {
    return new TCheckoutCoupon(this);
  }

  @Override
  public void clear() {
    this.shopId = 0;

    this.couponCode = null;
  }

  public int getShopId() {
    return this.shopId;
  }

  public TCheckoutCoupon setShopId(int shopId) {
    this.shopId = shopId;
    setShopIdIsSet(true);
    return this;
  }

  public void unsetShopId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SHOPID_ISSET_ID);
  }

  /** Returns true if field shopId is set (has been assigned a value) and false otherwise */
  public boolean isSetShopId() {
    return EncodingUtils.testBit(__isset_bitfield, __SHOPID_ISSET_ID);
  }

  public void setShopIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SHOPID_ISSET_ID, value);
  }

  public String getCouponCode() {
    return this.couponCode;
  }

  public TCheckoutCoupon setCouponCode(String couponCode) {
    this.couponCode = couponCode;
    return this;
  }

  public void unsetCouponCode() {
    this.couponCode = null;
  }

  /** Returns true if field couponCode is set (has been assigned a value) and false otherwise */
  public boolean isSetCouponCode() {
    return this.couponCode != null;
  }

  public void setCouponCodeIsSet(boolean value) {
    if (!value) {
      this.couponCode = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SHOP_ID:
      if (value == null) {
        unsetShopId();
      } else {
        setShopId((Integer)value);
      }
      break;

    case COUPON_CODE:
      if (value == null) {
        unsetCouponCode();
      } else {
        setCouponCode((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SHOP_ID:
      return getShopId();

    case COUPON_CODE:
      return getCouponCode();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SHOP_ID:
      return isSetShopId();
    case COUPON_CODE:
      return isSetCouponCode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TCheckoutCoupon)
      return this.equals((TCheckoutCoupon)that);
    return false;
  }

  public boolean equals(TCheckoutCoupon that) {
    if (that == null)
      return false;

    boolean this_present_shopId = true;
    boolean that_present_shopId = true;
    if (this_present_shopId || that_present_shopId) {
      if (!(this_present_shopId && that_present_shopId))
        return false;
      if (this.shopId != that.shopId)
        return false;
    }

    boolean this_present_couponCode = true && this.isSetCouponCode();
    boolean that_present_couponCode = true && that.isSetCouponCode();
    if (this_present_couponCode || that_present_couponCode) {
      if (!(this_present_couponCode && that_present_couponCode))
        return false;
      if (!this.couponCode.equals(that.couponCode))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_shopId = true;
    list.add(present_shopId);
    if (present_shopId)
      list.add(shopId);

    boolean present_couponCode = true && (isSetCouponCode());
    list.add(present_couponCode);
    if (present_couponCode)
      list.add(couponCode);

    return list.hashCode();
  }

  @Override
  public int compareTo(TCheckoutCoupon other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetShopId()).compareTo(other.isSetShopId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShopId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shopId, other.shopId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCouponCode()).compareTo(other.isSetCouponCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCouponCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.couponCode, other.couponCode);
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
    StringBuilder sb = new StringBuilder("TCheckoutCoupon(");
    boolean first = true;

    sb.append("shopId:");
    sb.append(this.shopId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("couponCode:");
    if (this.couponCode == null) {
      sb.append("null");
    } else {
      sb.append(this.couponCode);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TCheckoutCouponStandardSchemeFactory implements SchemeFactory {
    public TCheckoutCouponStandardScheme getScheme() {
      return new TCheckoutCouponStandardScheme();
    }
  }

  private static class TCheckoutCouponStandardScheme extends StandardScheme<TCheckoutCoupon> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCheckoutCoupon struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SHOP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.shopId = iprot.readI32();
              struct.setShopIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COUPON_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.couponCode = iprot.readString();
              struct.setCouponCodeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCheckoutCoupon struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SHOP_ID_FIELD_DESC);
      oprot.writeI32(struct.shopId);
      oprot.writeFieldEnd();
      if (struct.couponCode != null) {
        oprot.writeFieldBegin(COUPON_CODE_FIELD_DESC);
        oprot.writeString(struct.couponCode);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCheckoutCouponTupleSchemeFactory implements SchemeFactory {
    public TCheckoutCouponTupleScheme getScheme() {
      return new TCheckoutCouponTupleScheme();
    }
  }

  private static class TCheckoutCouponTupleScheme extends TupleScheme<TCheckoutCoupon> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCheckoutCoupon struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetShopId()) {
        optionals.set(0);
      }
      if (struct.isSetCouponCode()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetShopId()) {
        oprot.writeI32(struct.shopId);
      }
      if (struct.isSetCouponCode()) {
        oprot.writeString(struct.couponCode);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCheckoutCoupon struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.shopId = iprot.readI32();
        struct.setShopIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.couponCode = iprot.readString();
        struct.setCouponCodeIsSet(true);
      }
    }
  }

}
