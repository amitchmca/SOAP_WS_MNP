/**
 * QueryCarrierInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class QueryCarrierInfoResponse  extends com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPResponse  implements java.io.Serializable {
    private java.lang.String donorCarrier;

    private java.lang.String currentCarrier;

    private java.math.BigInteger servicePortable;

    public QueryCarrierInfoResponse() {
    }

    public QueryCarrierInfoResponse(
           com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusResponse SDPStatusResponse,
           java.lang.String donorCarrier,
           java.lang.String currentCarrier,
           java.math.BigInteger servicePortable) {
        super(
            SDPStatusResponse);
        this.donorCarrier = donorCarrier;
        this.currentCarrier = currentCarrier;
        this.servicePortable = servicePortable;
    }


    /**
     * Gets the donorCarrier value for this QueryCarrierInfoResponse.
     * 
     * @return donorCarrier
     */
    public java.lang.String getDonorCarrier() {
        return donorCarrier;
    }


    /**
     * Sets the donorCarrier value for this QueryCarrierInfoResponse.
     * 
     * @param donorCarrier
     */
    public void setDonorCarrier(java.lang.String donorCarrier) {
        this.donorCarrier = donorCarrier;
    }


    /**
     * Gets the currentCarrier value for this QueryCarrierInfoResponse.
     * 
     * @return currentCarrier
     */
    public java.lang.String getCurrentCarrier() {
        return currentCarrier;
    }


    /**
     * Sets the currentCarrier value for this QueryCarrierInfoResponse.
     * 
     * @param currentCarrier
     */
    public void setCurrentCarrier(java.lang.String currentCarrier) {
        this.currentCarrier = currentCarrier;
    }


    /**
     * Gets the servicePortable value for this QueryCarrierInfoResponse.
     * 
     * @return servicePortable
     */
    public java.math.BigInteger getServicePortable() {
        return servicePortable;
    }


    /**
     * Sets the servicePortable value for this QueryCarrierInfoResponse.
     * 
     * @param servicePortable
     */
    public void setServicePortable(java.math.BigInteger servicePortable) {
        this.servicePortable = servicePortable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCarrierInfoResponse)) return false;
        QueryCarrierInfoResponse other = (QueryCarrierInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.donorCarrier==null && other.getDonorCarrier()==null) || 
             (this.donorCarrier!=null &&
              this.donorCarrier.equals(other.getDonorCarrier()))) &&
            ((this.currentCarrier==null && other.getCurrentCarrier()==null) || 
             (this.currentCarrier!=null &&
              this.currentCarrier.equals(other.getCurrentCarrier()))) &&
            ((this.servicePortable==null && other.getServicePortable()==null) || 
             (this.servicePortable!=null &&
              this.servicePortable.equals(other.getServicePortable())));
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
        if (getDonorCarrier() != null) {
            _hashCode += getDonorCarrier().hashCode();
        }
        if (getCurrentCarrier() != null) {
            _hashCode += getCurrentCarrier().hashCode();
        }
        if (getServicePortable() != null) {
            _hashCode += getServicePortable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCarrierInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "QueryCarrierInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donorCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "donorCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "currentCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePortable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "servicePortable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
