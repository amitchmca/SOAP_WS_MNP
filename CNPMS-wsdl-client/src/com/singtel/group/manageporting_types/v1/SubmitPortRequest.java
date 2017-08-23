/**
 * SubmitPortRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class SubmitPortRequest  implements java.io.Serializable {
    private java.math.BigInteger attemptCounter;

    private com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID;

    private com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID;

    private com.singtel.group.manageporting_types.v1.PortingDetails portingDetails;

    public SubmitPortRequest() {
    }

    public SubmitPortRequest(
           java.math.BigInteger attemptCounter,
           com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID,
           com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID,
           com.singtel.group.manageporting_types.v1.PortingDetails portingDetails) {
           this.attemptCounter = attemptCounter;
           this.referenceID = referenceID;
           this.serviceID = serviceID;
           this.portingDetails = portingDetails;
    }


    /**
     * Gets the attemptCounter value for this SubmitPortRequest.
     * 
     * @return attemptCounter
     */
    public java.math.BigInteger getAttemptCounter() {
        return attemptCounter;
    }


    /**
     * Sets the attemptCounter value for this SubmitPortRequest.
     * 
     * @param attemptCounter
     */
    public void setAttemptCounter(java.math.BigInteger attemptCounter) {
        this.attemptCounter = attemptCounter;
    }


    /**
     * Gets the referenceID value for this SubmitPortRequest.
     * 
     * @return referenceID
     */
    public com.singtel.group.manageporting_types.v1.PortingRefernceID getReferenceID() {
        return referenceID;
    }


    /**
     * Sets the referenceID value for this SubmitPortRequest.
     * 
     * @param referenceID
     */
    public void setReferenceID(com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID) {
        this.referenceID = referenceID;
    }


    /**
     * Gets the serviceID value for this SubmitPortRequest.
     * 
     * @return serviceID
     */
    public com.singtel.group.customerproduct_common.types.v1.ProductServiceID getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this SubmitPortRequest.
     * 
     * @param serviceID
     */
    public void setServiceID(com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the portingDetails value for this SubmitPortRequest.
     * 
     * @return portingDetails
     */
    public com.singtel.group.manageporting_types.v1.PortingDetails getPortingDetails() {
        return portingDetails;
    }


    /**
     * Sets the portingDetails value for this SubmitPortRequest.
     * 
     * @param portingDetails
     */
    public void setPortingDetails(com.singtel.group.manageporting_types.v1.PortingDetails portingDetails) {
        this.portingDetails = portingDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitPortRequest)) return false;
        SubmitPortRequest other = (SubmitPortRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attemptCounter==null && other.getAttemptCounter()==null) || 
             (this.attemptCounter!=null &&
              this.attemptCounter.equals(other.getAttemptCounter()))) &&
            ((this.referenceID==null && other.getReferenceID()==null) || 
             (this.referenceID!=null &&
              this.referenceID.equals(other.getReferenceID()))) &&
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.portingDetails==null && other.getPortingDetails()==null) || 
             (this.portingDetails!=null &&
              this.portingDetails.equals(other.getPortingDetails())));
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
        if (getAttemptCounter() != null) {
            _hashCode += getAttemptCounter().hashCode();
        }
        if (getReferenceID() != null) {
            _hashCode += getReferenceID().hashCode();
        }
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getPortingDetails() != null) {
            _hashCode += getPortingDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitPortRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "SubmitPortRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attemptCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "attemptCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRefernceID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "serviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/customerproduct-common/types/v1", "ProductServiceID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDetails"));
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
