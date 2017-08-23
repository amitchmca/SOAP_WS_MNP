/**
 * SDPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.enterpriseapplicationintegration.common_types.v1;


/**
 * SDP status report for the service operation. Will be part of response
 * message
 */
public class SDPResponse  implements java.io.Serializable {
    private com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusResponse SDPStatusResponse;

    public SDPResponse() {
    }

    public SDPResponse(
           com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusResponse SDPStatusResponse) {
           this.SDPStatusResponse = SDPStatusResponse;
    }


    /**
     * Gets the SDPStatusResponse value for this SDPResponse.
     * 
     * @return SDPStatusResponse
     */
    public com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusResponse getSDPStatusResponse() {
        return SDPStatusResponse;
    }


    /**
     * Sets the SDPStatusResponse value for this SDPResponse.
     * 
     * @param SDPStatusResponse
     */
    public void setSDPStatusResponse(com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusResponse SDPStatusResponse) {
        this.SDPStatusResponse = SDPStatusResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDPResponse)) return false;
        SDPResponse other = (SDPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SDPStatusResponse==null && other.getSDPStatusResponse()==null) || 
             (this.SDPStatusResponse!=null &&
              this.SDPStatusResponse.equals(other.getSDPStatusResponse())));
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
        if (getSDPStatusResponse() != null) {
            _hashCode += getSDPStatusResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SDPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDPStatusResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusResponse"));
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
