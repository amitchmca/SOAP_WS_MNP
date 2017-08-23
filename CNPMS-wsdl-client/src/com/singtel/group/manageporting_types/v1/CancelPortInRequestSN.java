/**
 * CancelPortInRequestSN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class CancelPortInRequestSN  extends com.singtel.group.manageporting_types.v1.CancelPortInRequest  implements java.io.Serializable {
    private com.singtel.group.manageporting_types.v1.PortingRequestID requestID;

    private com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID;

    private java.math.BigInteger cancelReasonCode;

    private java.lang.String cancelReasonText;

    public CancelPortInRequestSN() {
    }

    public CancelPortInRequestSN(
           com.singtel.group.manageporting_types.v1.PortingRequestID requestID,
           com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID,
           java.math.BigInteger cancelReasonCode,
           java.lang.String cancelReasonText) {
        this.requestID = requestID;
        this.referenceID = referenceID;
        this.cancelReasonCode = cancelReasonCode;
        this.cancelReasonText = cancelReasonText;
    }


    /**
     * Gets the requestID value for this CancelPortInRequestSN.
     * 
     * @return requestID
     */
    public com.singtel.group.manageporting_types.v1.PortingRequestID getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this CancelPortInRequestSN.
     * 
     * @param requestID
     */
    public void setRequestID(com.singtel.group.manageporting_types.v1.PortingRequestID requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the referenceID value for this CancelPortInRequestSN.
     * 
     * @return referenceID
     */
    public com.singtel.group.manageporting_types.v1.PortingRefernceID getReferenceID() {
        return referenceID;
    }


    /**
     * Sets the referenceID value for this CancelPortInRequestSN.
     * 
     * @param referenceID
     */
    public void setReferenceID(com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID) {
        this.referenceID = referenceID;
    }


    /**
     * Gets the cancelReasonCode value for this CancelPortInRequestSN.
     * 
     * @return cancelReasonCode
     */
    public java.math.BigInteger getCancelReasonCode() {
        return cancelReasonCode;
    }


    /**
     * Sets the cancelReasonCode value for this CancelPortInRequestSN.
     * 
     * @param cancelReasonCode
     */
    public void setCancelReasonCode(java.math.BigInteger cancelReasonCode) {
        this.cancelReasonCode = cancelReasonCode;
    }


    /**
     * Gets the cancelReasonText value for this CancelPortInRequestSN.
     * 
     * @return cancelReasonText
     */
    public java.lang.String getCancelReasonText() {
        return cancelReasonText;
    }


    /**
     * Sets the cancelReasonText value for this CancelPortInRequestSN.
     * 
     * @param cancelReasonText
     */
    public void setCancelReasonText(java.lang.String cancelReasonText) {
        this.cancelReasonText = cancelReasonText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelPortInRequestSN)) return false;
        CancelPortInRequestSN other = (CancelPortInRequestSN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.referenceID==null && other.getReferenceID()==null) || 
             (this.referenceID!=null &&
              this.referenceID.equals(other.getReferenceID()))) &&
            ((this.cancelReasonCode==null && other.getCancelReasonCode()==null) || 
             (this.cancelReasonCode!=null &&
              this.cancelReasonCode.equals(other.getCancelReasonCode()))) &&
            ((this.cancelReasonText==null && other.getCancelReasonText()==null) || 
             (this.cancelReasonText!=null &&
              this.cancelReasonText.equals(other.getCancelReasonText())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getReferenceID() != null) {
            _hashCode += getReferenceID().hashCode();
        }
        if (getCancelReasonCode() != null) {
            _hashCode += getCancelReasonCode().hashCode();
        }
        if (getCancelReasonText() != null) {
            _hashCode += getCancelReasonText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelPortInRequestSN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "CancelPortInRequestSN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRefernceID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "cancelReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelReasonText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "cancelReasonText"));
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
