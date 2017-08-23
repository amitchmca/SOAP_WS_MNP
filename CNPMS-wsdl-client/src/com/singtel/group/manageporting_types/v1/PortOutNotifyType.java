/**
 * PortOutNotifyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class PortOutNotifyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PortOutNotifyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NPOR = "NPOR";
    public static final java.lang.String _NPOC = "NPOC";
    public static final java.lang.String _WINTO = "WINTO";
    public static final java.lang.String _SD = "SD";
    public static final java.lang.String _SDRSP = "SDRSP";
   // public static final java.lang.String _NPOR = "NPOR";
  //  public static final PortOutNotifyType NPOR = new PortOutNotifyType(_NPOR);
    public static final PortOutNotifyType NPOC = new PortOutNotifyType(_NPOC);
    public static final PortOutNotifyType WINTO = new PortOutNotifyType(_WINTO);
    public static final PortOutNotifyType SD = new PortOutNotifyType(_SD);
    public static final PortOutNotifyType SDRSP = new PortOutNotifyType(_SDRSP);
    public static final PortOutNotifyType NPOR = new PortOutNotifyType(_NPOR);
    public java.lang.String getValue() { return _value_;}
    public static PortOutNotifyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PortOutNotifyType enumeration = (PortOutNotifyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PortOutNotifyType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PortOutNotifyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortOutNotifyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
