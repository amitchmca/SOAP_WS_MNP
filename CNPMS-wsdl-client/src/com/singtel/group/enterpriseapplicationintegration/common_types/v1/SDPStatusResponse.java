/**
 * SDPStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.enterpriseapplicationintegration.common_types.v1;


/**
 * SDP status report for the service operation. Will be part of response
 * message
 */
public class SDPStatusResponse  implements java.io.Serializable {
    private com.singtel.group.enterpriseapplicationintegration.common_types.v1.ResponseStatusCodeENUM transactionStatusCode;

    private java.lang.String serviceVersion;

    private com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusLine[] sdpStatusLine;

    public SDPStatusResponse() {
    }

    public SDPStatusResponse(
           com.singtel.group.enterpriseapplicationintegration.common_types.v1.ResponseStatusCodeENUM transactionStatusCode,
           java.lang.String serviceVersion,
           com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusLine[] sdpStatusLine) {
           this.transactionStatusCode = transactionStatusCode;
           this.serviceVersion = serviceVersion;
           this.sdpStatusLine = sdpStatusLine;
    }


    /**
     * Gets the transactionStatusCode value for this SDPStatusResponse.
     * 
     * @return transactionStatusCode
     */
    public com.singtel.group.enterpriseapplicationintegration.common_types.v1.ResponseStatusCodeENUM getTransactionStatusCode() {
        return transactionStatusCode;
    }


    /**
     * Sets the transactionStatusCode value for this SDPStatusResponse.
     * 
     * @param transactionStatusCode
     */
    public void setTransactionStatusCode(com.singtel.group.enterpriseapplicationintegration.common_types.v1.ResponseStatusCodeENUM transactionStatusCode) {
        this.transactionStatusCode = transactionStatusCode;
    }


    /**
     * Gets the serviceVersion value for this SDPStatusResponse.
     * 
     * @return serviceVersion
     */
    public java.lang.String getServiceVersion() {
        return serviceVersion;
    }


    /**
     * Sets the serviceVersion value for this SDPStatusResponse.
     * 
     * @param serviceVersion
     */
    public void setServiceVersion(java.lang.String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }


    /**
     * Gets the sdpStatusLine value for this SDPStatusResponse.
     * 
     * @return sdpStatusLine
     */
    public com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusLine[] getSdpStatusLine() {
        return sdpStatusLine;
    }


    /**
     * Sets the sdpStatusLine value for this SDPStatusResponse.
     * 
     * @param sdpStatusLine
     */
    public void setSdpStatusLine(com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusLine[] sdpStatusLine) {
        this.sdpStatusLine = sdpStatusLine;
    }

    public com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusLine getSdpStatusLine(int i) {
        return this.sdpStatusLine[i];
    }

    public void setSdpStatusLine(int i, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusLine _value) {
        this.sdpStatusLine[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDPStatusResponse)) return false;
        SDPStatusResponse other = (SDPStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionStatusCode==null && other.getTransactionStatusCode()==null) || 
             (this.transactionStatusCode!=null &&
              this.transactionStatusCode.equals(other.getTransactionStatusCode()))) &&
            ((this.serviceVersion==null && other.getServiceVersion()==null) || 
             (this.serviceVersion!=null &&
              this.serviceVersion.equals(other.getServiceVersion()))) &&
            ((this.sdpStatusLine==null && other.getSdpStatusLine()==null) || 
             (this.sdpStatusLine!=null &&
              java.util.Arrays.equals(this.sdpStatusLine, other.getSdpStatusLine())));
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
        if (getTransactionStatusCode() != null) {
            _hashCode += getTransactionStatusCode().hashCode();
        }
        if (getServiceVersion() != null) {
            _hashCode += getServiceVersion().hashCode();
        }
        if (getSdpStatusLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSdpStatusLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSdpStatusLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SDPStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "transactionStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "ResponseStatusCodeENUM"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "serviceVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sdpStatusLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpStatusLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusLine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
