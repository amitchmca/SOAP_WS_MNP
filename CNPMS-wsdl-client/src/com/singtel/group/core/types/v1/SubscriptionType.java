/**
 * SubscriptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.core.types.v1;

public class SubscriptionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SubscriptionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALL_CRM = "ALL_CRM";
    public static final java.lang.String _ATM = "ATM";
    public static final java.lang.String _CALLING_CARD = "CALLING_CARD";
    public static final java.lang.String _CENTREX = "CENTREX";
    public static final java.lang.String _FRAME_RELAY = "FRAME_RELAY";
    public static final java.lang.String _GSM = "GSM";
    public static final java.lang.String _IPVPN_MPLS = "IPVPN_MPLS";
    public static final java.lang.String _ISDN = "ISDN";
    public static final java.lang.String _LEASED_LINE = "LEASED_LINE";
    public static final java.lang.String _ONE_EIGHT_XX = "ONE_EIGHT_XX";
    public static final java.lang.String _ONE_SEVEN_XX = "ONE_SEVEN_XX";
    public static final java.lang.String _PBX = "PBX";
    public static final java.lang.String _PSTN = "PSTN";
    public static final java.lang.String _UMTS = "UMTS";
    public static final SubscriptionType ALL_CRM = new SubscriptionType(_ALL_CRM);
    public static final SubscriptionType ATM = new SubscriptionType(_ATM);
    public static final SubscriptionType CALLING_CARD = new SubscriptionType(_CALLING_CARD);
    public static final SubscriptionType CENTREX = new SubscriptionType(_CENTREX);
    public static final SubscriptionType FRAME_RELAY = new SubscriptionType(_FRAME_RELAY);
    public static final SubscriptionType GSM = new SubscriptionType(_GSM);
    public static final SubscriptionType IPVPN_MPLS = new SubscriptionType(_IPVPN_MPLS);
    public static final SubscriptionType ISDN = new SubscriptionType(_ISDN);
    public static final SubscriptionType LEASED_LINE = new SubscriptionType(_LEASED_LINE);
    public static final SubscriptionType ONE_EIGHT_XX = new SubscriptionType(_ONE_EIGHT_XX);
    public static final SubscriptionType ONE_SEVEN_XX = new SubscriptionType(_ONE_SEVEN_XX);
    public static final SubscriptionType PBX = new SubscriptionType(_PBX);
    public static final SubscriptionType PSTN = new SubscriptionType(_PSTN);
    public static final SubscriptionType UMTS = new SubscriptionType(_UMTS);
    public java.lang.String getValue() { return _value_;}
    public static SubscriptionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SubscriptionType enumeration = (SubscriptionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SubscriptionType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/core/types/v1", "SubscriptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
