/**
 * ConnectService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class ConnectService  implements java.io.Serializable {
    private com.singtel.group.manageporting_types.v1.PortingRequestID requestId;

    private com.singtel.group.manageporting_types.v1.ServiceInfo[] serviceDetailElements;

    public ConnectService() {
    }

    public ConnectService(
           com.singtel.group.manageporting_types.v1.PortingRequestID requestId,
           com.singtel.group.manageporting_types.v1.ServiceInfo[] serviceDetailElements) {
           this.requestId = requestId;
           this.serviceDetailElements = serviceDetailElements;
    }


    /**
     * Gets the requestId value for this ConnectService.
     * 
     * @return requestId
     */
    public com.singtel.group.manageporting_types.v1.PortingRequestID getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this ConnectService.
     * 
     * @param requestId
     */
    public void setRequestId(com.singtel.group.manageporting_types.v1.PortingRequestID requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the serviceDetailElements value for this ConnectService.
     * 
     * @return serviceDetailElements
     */
    public com.singtel.group.manageporting_types.v1.ServiceInfo[] getServiceDetailElements() {
        return serviceDetailElements;
    }


    /**
     * Sets the serviceDetailElements value for this ConnectService.
     * 
     * @param serviceDetailElements
     */
    public void setServiceDetailElements(com.singtel.group.manageporting_types.v1.ServiceInfo[] serviceDetailElements) {
        this.serviceDetailElements = serviceDetailElements;
    }

    public com.singtel.group.manageporting_types.v1.ServiceInfo getServiceDetailElements(int i) {
        return this.serviceDetailElements[i];
    }

    public void setServiceDetailElements(int i, com.singtel.group.manageporting_types.v1.ServiceInfo _value) {
        this.serviceDetailElements[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectService)) return false;
        ConnectService other = (ConnectService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.serviceDetailElements==null && other.getServiceDetailElements()==null) || 
             (this.serviceDetailElements!=null &&
              java.util.Arrays.equals(this.serviceDetailElements, other.getServiceDetailElements())));
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
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getServiceDetailElements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceDetailElements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceDetailElements(), i);
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
        new org.apache.axis.description.TypeDesc(ConnectService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "ConnectService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDetailElements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "serviceDetailElements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "ServiceInfo"));
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
