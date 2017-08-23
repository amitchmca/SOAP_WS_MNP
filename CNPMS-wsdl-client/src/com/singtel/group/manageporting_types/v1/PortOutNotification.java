/**
 * PortOutNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class PortOutNotification  implements java.io.Serializable {
    private com.singtel.group.manageporting_types.v1.PortingRequestID requestID;

    private com.singtel.group.manageporting_types.v1.PortingRequestID referenceRequestId;

    private com.singtel.group.manageporting_types.v1.PortingRefernceID referenceId;

    private com.singtel.group.manageporting_types.v1.PortOutError portOutError;

    public PortOutNotification() {
    }

    public PortOutNotification(
           com.singtel.group.manageporting_types.v1.PortingRequestID requestID,
           com.singtel.group.manageporting_types.v1.PortingRequestID referenceRequestId,
           com.singtel.group.manageporting_types.v1.PortingRefernceID referenceId,
           com.singtel.group.manageporting_types.v1.PortOutError portOutError) {
           this.requestID = requestID;
           this.referenceRequestId = referenceRequestId;
           this.referenceId = referenceId;
           this.portOutError = portOutError;
    }


    /**
     * Gets the requestID value for this PortOutNotification.
     * 
     * @return requestID
     */
    public com.singtel.group.manageporting_types.v1.PortingRequestID getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this PortOutNotification.
     * 
     * @param requestID
     */
    public void setRequestID(com.singtel.group.manageporting_types.v1.PortingRequestID requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the referenceRequestId value for this PortOutNotification.
     * 
     * @return referenceRequestId
     */
    public com.singtel.group.manageporting_types.v1.PortingRequestID getReferenceRequestId() {
        return referenceRequestId;
    }


    /**
     * Sets the referenceRequestId value for this PortOutNotification.
     * 
     * @param referenceRequestId
     */
    public void setReferenceRequestId(com.singtel.group.manageporting_types.v1.PortingRequestID referenceRequestId) {
        this.referenceRequestId = referenceRequestId;
    }


    /**
     * Gets the referenceId value for this PortOutNotification.
     * 
     * @return referenceId
     */
    public com.singtel.group.manageporting_types.v1.PortingRefernceID getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this PortOutNotification.
     * 
     * @param referenceId
     */
    public void setReferenceId(com.singtel.group.manageporting_types.v1.PortingRefernceID referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the portOutError value for this PortOutNotification.
     * 
     * @return portOutError
     */
    public com.singtel.group.manageporting_types.v1.PortOutError getPortOutError() {
        return portOutError;
    }


    /**
     * Sets the portOutError value for this PortOutNotification.
     * 
     * @param portOutError
     */
    public void setPortOutError(com.singtel.group.manageporting_types.v1.PortOutError portOutError) {
        this.portOutError = portOutError;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortOutNotification)) return false;
        PortOutNotification other = (PortOutNotification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.referenceRequestId==null && other.getReferenceRequestId()==null) || 
             (this.referenceRequestId!=null &&
              this.referenceRequestId.equals(other.getReferenceRequestId()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.portOutError==null && other.getPortOutError()==null) || 
             (this.portOutError!=null &&
              this.portOutError.equals(other.getPortOutError())));
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
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getReferenceRequestId() != null) {
            _hashCode += getReferenceRequestId().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getPortOutError() != null) {
            _hashCode += getPortOutError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortOutNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortOutNotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceRequestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceRequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRefernceID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portOutError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portOutError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortOutError"));
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
