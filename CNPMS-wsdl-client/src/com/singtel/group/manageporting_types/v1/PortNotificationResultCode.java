/**
 * PortNotificationResultCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class PortNotificationResultCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PortNotificationResultCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PNVAL = "PNVAL";
    public static final java.lang.String _PNINV = "PNINV";
    public static final java.lang.String _PNCON = "PNCON";
    public static final java.lang.String _PNREJ = "PNREJ";
    public static final java.lang.String _PNSCN = "PNSCN";
    public static final java.lang.String _PNFAI = "PNFAI";
    public static final java.lang.String _PNCAN = "PNCAN";
    public static final java.lang.String _PNCNT = "PNCNT";
    public static final java.lang.String _PWNCON = "PWNCON";
    public static final java.lang.String _PWNREJ = "PWNREJ";
    public static final PortNotificationResultCode PNVAL = new PortNotificationResultCode(_PNVAL);
    public static final PortNotificationResultCode PNINV = new PortNotificationResultCode(_PNINV);
    public static final PortNotificationResultCode PNCON = new PortNotificationResultCode(_PNCON);
    public static final PortNotificationResultCode PNREJ = new PortNotificationResultCode(_PNREJ);
    public static final PortNotificationResultCode PNSCN = new PortNotificationResultCode(_PNSCN);
    public static final PortNotificationResultCode PNFAI = new PortNotificationResultCode(_PNFAI);
    public static final PortNotificationResultCode PNCAN = new PortNotificationResultCode(_PNCAN);
    public static final PortNotificationResultCode PNCNT = new PortNotificationResultCode(_PNCNT);
    public static final PortNotificationResultCode PWNCON = new PortNotificationResultCode(_PWNCON);
    public static final PortNotificationResultCode PWNREJ = new PortNotificationResultCode(_PWNREJ);
    public java.lang.String getValue() { return _value_;}
    public static PortNotificationResultCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PortNotificationResultCode enumeration = (PortNotificationResultCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PortNotificationResultCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PortNotificationResultCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortNotificationResultCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
