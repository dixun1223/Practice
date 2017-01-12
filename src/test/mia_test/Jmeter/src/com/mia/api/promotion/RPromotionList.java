/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.mia.api.promotion;

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

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked" })
/**
 * 返回结果：活动信息，活动ID->活动信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-23")
public class RPromotionList implements org.apache.thrift.TBase<RPromotionList, RPromotionList._Fields>,
		java.io.Serializable, Cloneable, Comparable<RPromotionList> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"RPromotionList");

	private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"code", org.apache.thrift.protocol.TType.I32, (short) 1);
	private static final org.apache.thrift.protocol.TField MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("msg",
			org.apache.thrift.protocol.TType.STRING, (short) 2);
	private static final org.apache.thrift.protocol.TField ALERT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"alert", org.apache.thrift.protocol.TType.STRING, (short) 3);
	private static final org.apache.thrift.protocol.TField UNIQUE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"uniqueId", org.apache.thrift.protocol.TType.STRING, (short) 4);
	private static final org.apache.thrift.protocol.TField PROMOTION_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"promotion", org.apache.thrift.protocol.TType.MAP, (short) 5);

	private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
	static {
		schemes.put(StandardScheme.class, new RPromotionListStandardSchemeFactory());
		schemes.put(TupleScheme.class, new RPromotionListTupleSchemeFactory());
	}

	public int code; // required
	public String msg; // required
	public String alert; // required
	public String uniqueId; // required
	public Map<Integer, PromotionInfo> promotion; // required

	/**
	 * The set of fields this struct contains, along with convenience methods
	 * for finding and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		CODE((short) 1, "code"), MSG((short) 2, "msg"), ALERT((short) 3, "alert"), UNIQUE_ID((short) 4,
				"uniqueId"), PROMOTION((short) 5, "promotion");

		private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

		static {
			for (_Fields field : EnumSet.allOf(_Fields.class)) {
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not
		 * found.
		 */
		public static _Fields findByThriftId(int fieldId) {
			switch (fieldId) {
			case 1: // CODE
				return CODE;
			case 2: // MSG
				return MSG;
			case 3: // ALERT
				return ALERT;
			case 4: // UNIQUE_ID
				return UNIQUE_ID;
			case 5: // PROMOTION
				return PROMOTION;
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
			if (fields == null)
				throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not
		 * found.
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
	private static final int __CODE_ISSET_ID = 0;
	private byte __isset_bitfield = 0;
	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.CODE,
				new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.MSG,
				new org.apache.thrift.meta_data.FieldMetaData("msg", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.ALERT,
				new org.apache.thrift.meta_data.FieldMetaData("alert", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.UNIQUE_ID,
				new org.apache.thrift.meta_data.FieldMetaData("uniqueId",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.PROMOTION,
				new org.apache.thrift.meta_data.FieldMetaData("promotion",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP,
								new org.apache.thrift.meta_data.FieldValueMetaData(
										org.apache.thrift.protocol.TType.I32),
								new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT,
										PromotionInfo.class))));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RPromotionList.class, metaDataMap);
	}

	public RPromotionList() {
		this.code = 200;

		this.msg = "success";

		this.alert = "success";

	}

	public RPromotionList(int code, String msg, String alert, String uniqueId, Map<Integer, PromotionInfo> promotion) {
		this();
		this.code = code;
		setCodeIsSet(true);
		this.msg = msg;
		this.alert = alert;
		this.uniqueId = uniqueId;
		this.promotion = promotion;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public RPromotionList(RPromotionList other) {
		__isset_bitfield = other.__isset_bitfield;
		this.code = other.code;
		if (other.isSetMsg()) {
			this.msg = other.msg;
		}
		if (other.isSetAlert()) {
			this.alert = other.alert;
		}
		if (other.isSetUniqueId()) {
			this.uniqueId = other.uniqueId;
		}
		if (other.isSetPromotion()) {
			Map<Integer, PromotionInfo> __this__promotion = new HashMap<Integer, PromotionInfo>(other.promotion.size());
			for (Map.Entry<Integer, PromotionInfo> other_element : other.promotion.entrySet()) {

				Integer other_element_key = other_element.getKey();
				PromotionInfo other_element_value = other_element.getValue();

				Integer __this__promotion_copy_key = other_element_key;

				PromotionInfo __this__promotion_copy_value = new PromotionInfo(other_element_value);

				__this__promotion.put(__this__promotion_copy_key, __this__promotion_copy_value);
			}
			this.promotion = __this__promotion;
		}
	}

	public RPromotionList deepCopy() {
		return new RPromotionList(this);
	}

	@Override
	public void clear() {
		this.code = 200;

		this.msg = "success";

		this.alert = "success";

		this.uniqueId = null;
		this.promotion = null;
	}

	public int getCode() {
		return this.code;
	}

	public RPromotionList setCode(int code) {
		this.code = code;
		setCodeIsSet(true);
		return this;
	}

	public void unsetCode() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CODE_ISSET_ID);
	}

	/**
	 * Returns true if field code is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetCode() {
		return EncodingUtils.testBit(__isset_bitfield, __CODE_ISSET_ID);
	}

	public void setCodeIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CODE_ISSET_ID, value);
	}

	public String getMsg() {
		return this.msg;
	}

	public RPromotionList setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public void unsetMsg() {
		this.msg = null;
	}

	/**
	 * Returns true if field msg is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetMsg() {
		return this.msg != null;
	}

	public void setMsgIsSet(boolean value) {
		if (!value) {
			this.msg = null;
		}
	}

	public String getAlert() {
		return this.alert;
	}

	public RPromotionList setAlert(String alert) {
		this.alert = alert;
		return this;
	}

	public void unsetAlert() {
		this.alert = null;
	}

	/**
	 * Returns true if field alert is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetAlert() {
		return this.alert != null;
	}

	public void setAlertIsSet(boolean value) {
		if (!value) {
			this.alert = null;
		}
	}

	public String getUniqueId() {
		return this.uniqueId;
	}

	public RPromotionList setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
		return this;
	}

	public void unsetUniqueId() {
		this.uniqueId = null;
	}

	/**
	 * Returns true if field uniqueId is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetUniqueId() {
		return this.uniqueId != null;
	}

	public void setUniqueIdIsSet(boolean value) {
		if (!value) {
			this.uniqueId = null;
		}
	}

	public int getPromotionSize() {
		return (this.promotion == null) ? 0 : this.promotion.size();
	}

	public void putToPromotion(int key, PromotionInfo val) {
		if (this.promotion == null) {
			this.promotion = new HashMap<Integer, PromotionInfo>();
		}
		this.promotion.put(key, val);
	}

	public Map<Integer, PromotionInfo> getPromotion() {
		return this.promotion;
	}

	public RPromotionList setPromotion(Map<Integer, PromotionInfo> promotion) {
		this.promotion = promotion;
		return this;
	}

	public void unsetPromotion() {
		this.promotion = null;
	}

	/**
	 * Returns true if field promotion is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetPromotion() {
		return this.promotion != null;
	}

	public void setPromotionIsSet(boolean value) {
		if (!value) {
			this.promotion = null;
		}
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case CODE:
			if (value == null) {
				unsetCode();
			} else {
				setCode((Integer) value);
			}
			break;

		case MSG:
			if (value == null) {
				unsetMsg();
			} else {
				setMsg((String) value);
			}
			break;

		case ALERT:
			if (value == null) {
				unsetAlert();
			} else {
				setAlert((String) value);
			}
			break;

		case UNIQUE_ID:
			if (value == null) {
				unsetUniqueId();
			} else {
				setUniqueId((String) value);
			}
			break;

		case PROMOTION:
			if (value == null) {
				unsetPromotion();
			} else {
				setPromotion((Map<Integer, PromotionInfo>) value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case CODE:
			return getCode();

		case MSG:
			return getMsg();

		case ALERT:
			return getAlert();

		case UNIQUE_ID:
			return getUniqueId();

		case PROMOTION:
			return getPromotion();

		}
		throw new IllegalStateException();
	}

	/**
	 * Returns true if field corresponding to fieldID is set (has been assigned
	 * a value) and false otherwise
	 */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
		case CODE:
			return isSetCode();
		case MSG:
			return isSetMsg();
		case ALERT:
			return isSetAlert();
		case UNIQUE_ID:
			return isSetUniqueId();
		case PROMOTION:
			return isSetPromotion();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof RPromotionList)
			return this.equals((RPromotionList) that);
		return false;
	}

	public boolean equals(RPromotionList that) {
		if (that == null)
			return false;

		boolean this_present_code = true;
		boolean that_present_code = true;
		if (this_present_code || that_present_code) {
			if (!(this_present_code && that_present_code))
				return false;
			if (this.code != that.code)
				return false;
		}

		boolean this_present_msg = true && this.isSetMsg();
		boolean that_present_msg = true && that.isSetMsg();
		if (this_present_msg || that_present_msg) {
			if (!(this_present_msg && that_present_msg))
				return false;
			if (!this.msg.equals(that.msg))
				return false;
		}

		boolean this_present_alert = true && this.isSetAlert();
		boolean that_present_alert = true && that.isSetAlert();
		if (this_present_alert || that_present_alert) {
			if (!(this_present_alert && that_present_alert))
				return false;
			if (!this.alert.equals(that.alert))
				return false;
		}

		boolean this_present_uniqueId = true && this.isSetUniqueId();
		boolean that_present_uniqueId = true && that.isSetUniqueId();
		if (this_present_uniqueId || that_present_uniqueId) {
			if (!(this_present_uniqueId && that_present_uniqueId))
				return false;
			if (!this.uniqueId.equals(that.uniqueId))
				return false;
		}

		boolean this_present_promotion = true && this.isSetPromotion();
		boolean that_present_promotion = true && that.isSetPromotion();
		if (this_present_promotion || that_present_promotion) {
			if (!(this_present_promotion && that_present_promotion))
				return false;
			if (!this.promotion.equals(that.promotion))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_code = true;
		list.add(present_code);
		if (present_code)
			list.add(code);

		boolean present_msg = true && (isSetMsg());
		list.add(present_msg);
		if (present_msg)
			list.add(msg);

		boolean present_alert = true && (isSetAlert());
		list.add(present_alert);
		if (present_alert)
			list.add(alert);

		boolean present_uniqueId = true && (isSetUniqueId());
		list.add(present_uniqueId);
		if (present_uniqueId)
			list.add(uniqueId);

		boolean present_promotion = true && (isSetPromotion());
		list.add(present_promotion);
		if (present_promotion)
			list.add(promotion);

		return list.hashCode();
	}

	@Override
	public int compareTo(RPromotionList other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetCode()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetMsg()).compareTo(other.isSetMsg());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetMsg()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msg, other.msg);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetAlert()).compareTo(other.isSetAlert());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetAlert()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.alert, other.alert);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetUniqueId()).compareTo(other.isSetUniqueId());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetUniqueId()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uniqueId, other.uniqueId);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetPromotion()).compareTo(other.isSetPromotion());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetPromotion()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.promotion, other.promotion);
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
		StringBuilder sb = new StringBuilder("RPromotionList(");
		boolean first = true;

		sb.append("code:");
		sb.append(this.code);
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("msg:");
		if (this.msg == null) {
			sb.append("null");
		} else {
			sb.append(this.msg);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("alert:");
		if (this.alert == null) {
			sb.append("null");
		} else {
			sb.append(this.alert);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("uniqueId:");
		if (this.uniqueId == null) {
			sb.append("null");
		} else {
			sb.append(this.uniqueId);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("promotion:");
		if (this.promotion == null) {
			sb.append("null");
		} else {
			sb.append(this.promotion);
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
			write(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(out)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
		try {
			// it doesn't seem like you should have to do this, but java
			// serialization is wacky, and doesn't call the default constructor.
			__isset_bitfield = 0;
			read(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class RPromotionListStandardSchemeFactory implements SchemeFactory {
		public RPromotionListStandardScheme getScheme() {
			return new RPromotionListStandardScheme();
		}
	}

	private static class RPromotionListStandardScheme extends StandardScheme<RPromotionList> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, RPromotionList struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // CODE
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.code = iprot.readI32();
						struct.setCodeIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // MSG
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.msg = iprot.readString();
						struct.setMsgIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // ALERT
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.alert = iprot.readString();
						struct.setAlertIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // UNIQUE_ID
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.uniqueId = iprot.readString();
						struct.setUniqueIdIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 5: // PROMOTION
					if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
						{
							org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
							struct.promotion = new HashMap<Integer, PromotionInfo>(2 * _map0.size);
							int _key1;
							PromotionInfo _val2;
							for (int _i3 = 0; _i3 < _map0.size; ++_i3) {
								_key1 = iprot.readI32();
								_val2 = new PromotionInfo();
								_val2.read(iprot);
								struct.promotion.put(_key1, _val2);
							}
							iprot.readMapEnd();
						}
						struct.setPromotionIsSet(true);
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

			// check for required fields of primitive type, which can't be
			// checked in the validate method
			struct.validate();
		}

		public void write(org.apache.thrift.protocol.TProtocol oprot, RPromotionList struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			oprot.writeFieldBegin(CODE_FIELD_DESC);
			oprot.writeI32(struct.code);
			oprot.writeFieldEnd();
			if (struct.msg != null) {
				oprot.writeFieldBegin(MSG_FIELD_DESC);
				oprot.writeString(struct.msg);
				oprot.writeFieldEnd();
			}
			if (struct.alert != null) {
				oprot.writeFieldBegin(ALERT_FIELD_DESC);
				oprot.writeString(struct.alert);
				oprot.writeFieldEnd();
			}
			if (struct.uniqueId != null) {
				oprot.writeFieldBegin(UNIQUE_ID_FIELD_DESC);
				oprot.writeString(struct.uniqueId);
				oprot.writeFieldEnd();
			}
			if (struct.promotion != null) {
				oprot.writeFieldBegin(PROMOTION_FIELD_DESC);
				{
					oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32,
							org.apache.thrift.protocol.TType.STRUCT, struct.promotion.size()));
					for (Map.Entry<Integer, PromotionInfo> _iter4 : struct.promotion.entrySet()) {
						oprot.writeI32(_iter4.getKey());
						_iter4.getValue().write(oprot);
					}
					oprot.writeMapEnd();
				}
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class RPromotionListTupleSchemeFactory implements SchemeFactory {
		public RPromotionListTupleScheme getScheme() {
			return new RPromotionListTupleScheme();
		}
	}

	private static class RPromotionListTupleScheme extends TupleScheme<RPromotionList> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, RPromotionList struct)
				throws org.apache.thrift.TException {
			TTupleProtocol oprot = (TTupleProtocol) prot;
			BitSet optionals = new BitSet();
			if (struct.isSetCode()) {
				optionals.set(0);
			}
			if (struct.isSetMsg()) {
				optionals.set(1);
			}
			if (struct.isSetAlert()) {
				optionals.set(2);
			}
			if (struct.isSetUniqueId()) {
				optionals.set(3);
			}
			if (struct.isSetPromotion()) {
				optionals.set(4);
			}
			oprot.writeBitSet(optionals, 5);
			if (struct.isSetCode()) {
				oprot.writeI32(struct.code);
			}
			if (struct.isSetMsg()) {
				oprot.writeString(struct.msg);
			}
			if (struct.isSetAlert()) {
				oprot.writeString(struct.alert);
			}
			if (struct.isSetUniqueId()) {
				oprot.writeString(struct.uniqueId);
			}
			if (struct.isSetPromotion()) {
				{
					oprot.writeI32(struct.promotion.size());
					for (Map.Entry<Integer, PromotionInfo> _iter5 : struct.promotion.entrySet()) {
						oprot.writeI32(_iter5.getKey());
						_iter5.getValue().write(oprot);
					}
				}
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, RPromotionList struct)
				throws org.apache.thrift.TException {
			TTupleProtocol iprot = (TTupleProtocol) prot;
			BitSet incoming = iprot.readBitSet(5);
			if (incoming.get(0)) {
				struct.code = iprot.readI32();
				struct.setCodeIsSet(true);
			}
			if (incoming.get(1)) {
				struct.msg = iprot.readString();
				struct.setMsgIsSet(true);
			}
			if (incoming.get(2)) {
				struct.alert = iprot.readString();
				struct.setAlertIsSet(true);
			}
			if (incoming.get(3)) {
				struct.uniqueId = iprot.readString();
				struct.setUniqueIdIsSet(true);
			}
			if (incoming.get(4)) {
				{
					org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(
							org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT,
							iprot.readI32());
					struct.promotion = new HashMap<Integer, PromotionInfo>(2 * _map6.size);
					int _key7;
					PromotionInfo _val8;
					for (int _i9 = 0; _i9 < _map6.size; ++_i9) {
						_key7 = iprot.readI32();
						_val8 = new PromotionInfo();
						_val8.read(iprot);
						struct.promotion.put(_key7, _val8);
					}
				}
				struct.setPromotionIsSet(true);
			}
		}
	}

}
