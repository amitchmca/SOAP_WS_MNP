/**
 * ValidatePortOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class ValidatePortOut  implements java.io.Serializable {
    private com.singtel.group.manageporting_types.v1.PortingRefernceID referenceId;

    private com.singtel.group.manageporting_types.v1.PortOutDetailsSN portOutDetails;

    public ValidatePortOut() {
    }

    public ValidatePortOut(
           com.singtel.group.manageporting_types.v1.PortingRefernceID referenceId,
           com.singtel.group.manageporting_types.v1.PortOutDetailsSN portOutDetails) {
           this.referenceId = referenceId;
           this.portOutDetails = portOutDetails;
    }


    /**
     * Gets the referenceId value for this ValidatePortOut.
     * 
     * @return referenceId
     */
    public com.singtel.group.manageporting_types.v1.PortingRefernceID getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this ValidatePortOut.
     * 
     * @param referenceId
     */
    public void setReferenceId(com.singtel.group.manageporting_types.v1.PortingRefernceID referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the portOutDetails value for this ValidatePortOut.
     * 
     * @return portOutDetails
     */
    public com.singtel.group.manageporting_types.v1.PortOutDetailsSN getPortOutDetails() {
        return portOutDetails;
    }


    /**
     * Sets the portOutDetails value for this ValidatePortOut.
     * 
     * @param portOutDetails
     */
    public void setPortOutDetails(com.singtel.group.manageporting_types.v1.PortOutDetailsSN portOutDetails) {
        this.portOutDetails = portOutDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidatePortOut)) return false;
        ValidatePortOut other = (ValidatePortOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.portOutDetails==null && other.getPortOutDetails()==null) || 
             (this.portOutDetails!=null &&
              this.portOutDetails.equals(other.getPortOutDetails())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getPortOutDetails() != null) {
            _hashCode += getPortOutDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidatePortOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "ValidatePortOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRefernceID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portOutDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portOutDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortOutDetailsSN"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
