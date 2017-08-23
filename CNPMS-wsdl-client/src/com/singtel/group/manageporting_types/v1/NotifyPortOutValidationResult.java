/**
 * NotifyPortOutValidationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class NotifyPortOutValidationResult  implements java.io.Serializable {
    private com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID;

    private java.math.BigInteger resultCode;

    private java.lang.String resultText;

    public NotifyPortOutValidationResult() {
    }

    public NotifyPortOutValidationResult(
           com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID,
           java.math.BigInteger resultCode,
           java.lang.String resultText) {
           this.serviceID = serviceID;
           this.resultCode = resultCode;
           this.resultText = resultText;
    }


    /**
     * Gets the serviceID value for this NotifyPortOutValidationResult.
     * 
     * @return serviceID
     */
    public com.singtel.group.customerproduct_common.types.v1.ProductServiceID getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this NotifyPortOutValidationResult.
     * 
     * @param serviceID
     */
    public void setServiceID(com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the resultCode value for this NotifyPortOutValidationResult.
     * 
     * @return resultCode
     */
    public java.math.BigInteger getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this NotifyPortOutValidationResult.
     * 
     * @param resultCode
     */
    public void setResultCode(java.math.BigInteger resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultText value for this NotifyPortOutValidationResult.
     * 
     * @return resultText
     */
    public java.lang.String getResultText() {
        return resultText;
    }


    /**
     * Sets the resultText value for this NotifyPortOutValidationResult.
     * 
     * @param resultText
     */
    public void setResultText(java.lang.String resultText) {
        this.resultText = resultText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotifyPortOutValidationResult)) return false;
        NotifyPortOutValidationResult other = (NotifyPortOutValidationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.resultText==null && other.getResultText()==null) || 
             (this.resultText!=null &&
              this.resultText.equals(other.getResultText())));
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
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getResultText() != null) {
            _hashCode += getResultText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotifyPortOutValidationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "NotifyPortOutValidationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "serviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/customerproduct-common/types/v1", "ProductServiceID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "resultText"));
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
