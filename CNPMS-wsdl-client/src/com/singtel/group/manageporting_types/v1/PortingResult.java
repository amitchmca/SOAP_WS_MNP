/**
 * PortingResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class PortingResult  implements java.io.Serializable {
    private com.singtel.group.manageporting_types.v1.PortNotificationResultCode responseCode;

    private java.lang.String rejectionCode;

    private java.lang.String reasonText;

    public PortingResult() {
    }

    public PortingResult(
           com.singtel.group.manageporting_types.v1.PortNotificationResultCode responseCode,
           java.lang.String rejectionCode,
           java.lang.String reasonText) {
           this.responseCode = responseCode;
           this.rejectionCode = rejectionCode;
           this.reasonText = reasonText;
    }


    /**
     * Gets the responseCode value for this PortingResult.
     * 
     * @return responseCode
     */
    public com.singtel.group.manageporting_types.v1.PortNotificationResultCode getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this PortingResult.
     * 
     * @param responseCode
     */
    public void setResponseCode(com.singtel.group.manageporting_types.v1.PortNotificationResultCode responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the rejectionCode value for this PortingResult.
     * 
     * @return rejectionCode
     */
    public java.lang.String getRejectionCode() {
        return rejectionCode;
    }


    /**
     * Sets the rejectionCode value for this PortingResult.
     * 
     * @param rejectionCode
     */
    public void setRejectionCode(java.lang.String rejectionCode) {
        this.rejectionCode = rejectionCode;
    }


    /**
     * Gets the reasonText value for this PortingResult.
     * 
     * @return reasonText
     */
    public java.lang.String getReasonText() {
        return reasonText;
    }


    /**
     * Sets the reasonText value for this PortingResult.
     * 
     * @param reasonText
     */
    public void setReasonText(java.lang.String reasonText) {
        this.reasonText = reasonText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortingResult)) return false;
        PortingResult other = (PortingResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.rejectionCode==null && other.getRejectionCode()==null) || 
             (this.rejectionCode!=null &&
              this.rejectionCode.equals(other.getRejectionCode()))) &&
            ((this.reasonText==null && other.getReasonText()==null) || 
             (this.reasonText!=null &&
              this.reasonText.equals(other.getReasonText())));
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
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getRejectionCode() != null) {
            _hashCode += getRejectionCode().hashCode();
        }
        if (getReasonText() != null) {
            _hashCode += getReasonText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortingResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortNotificationResultCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "rejectionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "reasonText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
