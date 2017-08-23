/**
 * NotifyServiceDisconnectionComplete.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class NotifyServiceDisconnectionComplete  implements java.io.Serializable {
    private com.singtel.group.manageporting_types.v1.PortingRequestID requestID;

    private com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID;

    private java.math.BigInteger status;

    public NotifyServiceDisconnectionComplete() {
    }

    public NotifyServiceDisconnectionComplete(
           com.singtel.group.manageporting_types.v1.PortingRequestID requestID,
           com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID,
           java.math.BigInteger status) {
           this.requestID = requestID;
           this.serviceID = serviceID;
           this.status = status;
    }


    /**
     * Gets the requestID value for this NotifyServiceDisconnectionComplete.
     * 
     * @return requestID
     */
    public com.singtel.group.manageporting_types.v1.PortingRequestID getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this NotifyServiceDisconnectionComplete.
     * 
     * @param requestID
     */
    public void setRequestID(com.singtel.group.manageporting_types.v1.PortingRequestID requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the serviceID value for this NotifyServiceDisconnectionComplete.
     * 
     * @return serviceID
     */
    public com.singtel.group.customerproduct_common.types.v1.ProductServiceID getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this NotifyServiceDisconnectionComplete.
     * 
     * @param serviceID
     */
    public void setServiceID(com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the status value for this NotifyServiceDisconnectionComplete.
     * 
     * @return status
     */
    public java.math.BigInteger getStatus() {
        return status;
    }


    /**
     * Sets the status value for this NotifyServiceDisconnectionComplete.
     * 
     * @param status
     */
    public void setStatus(java.math.BigInteger status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotifyServiceDisconnectionComplete)) return false;
        NotifyServiceDisconnectionComplete other = (NotifyServiceDisconnectionComplete) obj;
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
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotifyServiceDisconnectionComplete.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "NotifyServiceDisconnectionComplete"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "serviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/customerproduct-common/types/v1", "ProductServiceID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "status"));
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
