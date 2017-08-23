/**
 * NotifyPortOutValidation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class NotifyPortOutValidation  implements java.io.Serializable {
    private com.singtel.group.manageporting_types.v1.PortingRequestID requestID;

    private com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID;

    private com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResult result;

    public NotifyPortOutValidation() {
    }

    public NotifyPortOutValidation(
           com.singtel.group.manageporting_types.v1.PortingRequestID requestID,
           com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID,
           com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResult result) {
           this.requestID = requestID;
           this.referenceID = referenceID;
           this.result = result;
    }


    /**
     * Gets the requestID value for this NotifyPortOutValidation.
     * 
     * @return requestID
     */
    public com.singtel.group.manageporting_types.v1.PortingRequestID getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this NotifyPortOutValidation.
     * 
     * @param requestID
     */
    public void setRequestID(com.singtel.group.manageporting_types.v1.PortingRequestID requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the referenceID value for this NotifyPortOutValidation.
     * 
     * @return referenceID
     */
    public com.singtel.group.manageporting_types.v1.PortingRefernceID getReferenceID() {
        return referenceID;
    }


    /**
     * Sets the referenceID value for this NotifyPortOutValidation.
     * 
     * @param referenceID
     */
    public void setReferenceID(com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID) {
        this.referenceID = referenceID;
    }


    /**
     * Gets the result value for this NotifyPortOutValidation.
     * 
     * @return result
     */
    public com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResult getResult() {
        return result;
    }


    /**
     * Sets the result value for this NotifyPortOutValidation.
     * 
     * @param result
     */
    public void setResult(com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResult result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotifyPortOutValidation)) return false;
        NotifyPortOutValidation other = (NotifyPortOutValidation) obj;
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
            ((this.referenceID==null && other.getReferenceID()==null) || 
             (this.referenceID!=null &&
              this.referenceID.equals(other.getReferenceID()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult())));
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
        if (getReferenceID() != null) {
            _hashCode += getReferenceID().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotifyPortOutValidation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "NotifyPortOutValidation"));
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
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "NotifyPortOutValidationResult"));
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
