/**
 * CustomerTypeLevel1All.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.core.types.v1;

public class CustomerTypeLevel1All implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerTypeLevel1All(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BUSINESS_ANON = "BUSINESS_ANON";
    public static final java.lang.String _CORPORATE = "CORPORATE";
    public static final java.lang.String _GOVERNMENT = "GOVERNMENT";
    public static final java.lang.String _RESIDENTIAL = "RESIDENTIAL";
    public static final java.lang.String _RESIDENTIAL_ANON = "RESIDENTIAL_ANON";
    public static final java.lang.String _SMALL_BUSINESS = "SMALL_BUSINESS";
    public static final CustomerTypeLevel1All BUSINESS_ANON = new CustomerTypeLevel1All(_BUSINESS_ANON);
    public static final CustomerTypeLevel1All CORPORATE = new CustomerTypeLevel1All(_CORPORATE);
    public static final CustomerTypeLevel1All GOVERNMENT = new CustomerTypeLevel1All(_GOVERNMENT);
    public static final CustomerTypeLevel1All RESIDENTIAL = new CustomerTypeLevel1All(_RESIDENTIAL);
    public static final CustomerTypeLevel1All RESIDENTIAL_ANON = new CustomerTypeLevel1All(_RESIDENTIAL_ANON);
    public static final CustomerTypeLevel1All SMALL_BUSINESS = new CustomerTypeLevel1All(_SMALL_BUSINESS);
    public java.lang.String getValue() { return _value_;}
    public static CustomerTypeLevel1All fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerTypeLevel1All enumeration = (CustomerTypeLevel1All)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerTypeLevel1All fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomerTypeLevel1All.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/core/types/v1", "CustomerTypeLevel1All"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
