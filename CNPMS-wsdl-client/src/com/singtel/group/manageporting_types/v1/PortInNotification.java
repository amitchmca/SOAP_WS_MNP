/**
 * PortInNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class PortInNotification  implements java.io.Serializable {
    private com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID;

    private com.singtel.group.manageporting_types.v1.PortingRequestID requestID;

    private com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID;

    private com.singtel.group.manageporting_types.v1.PortingResult portingResult;

    private com.singtel.group.manageporting_types.v1.PortingDonor donor;

    private java.util.Calendar orderedApprovalTime;

    private java.util.Calendar recommendTransferTime;

    public PortInNotification() {
    }

    public PortInNotification(
           com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID,
           com.singtel.group.manageporting_types.v1.PortingRequestID requestID,
           com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID,
           com.singtel.group.manageporting_types.v1.PortingResult portingResult,
           com.singtel.group.manageporting_types.v1.PortingDonor donor,
           java.util.Calendar orderedApprovalTime,
           java.util.Calendar recommendTransferTime) {
           this.referenceID = referenceID;
           this.requestID = requestID;
           this.serviceID = serviceID;
           this.portingResult = portingResult;
           this.donor = donor;
           this.orderedApprovalTime = orderedApprovalTime;
           this.recommendTransferTime = recommendTransferTime;
    }


    /**
     * Gets the referenceID value for this PortInNotification.
     * 
     * @return referenceID
     */
    public com.singtel.group.manageporting_types.v1.PortingRefernceID getReferenceID() {
        return referenceID;
    }


    /**
     * Sets the referenceID value for this PortInNotification.
     * 
     * @param referenceID
     */
    public void setReferenceID(com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID) {
        this.referenceID = referenceID;
    }


    /**
     * Gets the requestID value for this PortInNotification.
     * 
     * @return requestID
     */
    public com.singtel.group.manageporting_types.v1.PortingRequestID getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this PortInNotification.
     * 
     * @param requestID
     */
    public void setRequestID(com.singtel.group.manageporting_types.v1.PortingRequestID requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the serviceID value for this PortInNotification.
     * 
     * @return serviceID
     */
    public com.singtel.group.customerproduct_common.types.v1.ProductServiceID getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this PortInNotification.
     * 
     * @param serviceID
     */
    public void setServiceID(com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the portingResult value for this PortInNotification.
     * 
     * @return portingResult
     */
    public com.singtel.group.manageporting_types.v1.PortingResult getPortingResult() {
        return portingResult;
    }


    /**
     * Sets the portingResult value for this PortInNotification.
     * 
     * @param portingResult
     */
    public void setPortingResult(com.singtel.group.manageporting_types.v1.PortingResult portingResult) {
        this.portingResult = portingResult;
    }


    /**
     * Gets the donor value for this PortInNotification.
     * 
     * @return donor
     */
    public com.singtel.group.manageporting_types.v1.PortingDonor getDonor() {
        return donor;
    }


    /**
     * Sets the donor value for this PortInNotification.
     * 
     * @param donor
     */
    public void setDonor(com.singtel.group.manageporting_types.v1.PortingDonor donor) {
        this.donor = donor;
    }


    /**
     * Gets the orderedApprovalTime value for this PortInNotification.
     * 
     * @return orderedApprovalTime
     */
    public java.util.Calendar getOrderedApprovalTime() {
        return orderedApprovalTime;
    }


    /**
     * Sets the orderedApprovalTime value for this PortInNotification.
     * 
     * @param orderedApprovalTime
     */
    public void setOrderedApprovalTime(java.util.Calendar orderedApprovalTime) {
        this.orderedApprovalTime = orderedApprovalTime;
    }


    /**
     * Gets the recommendTransferTime value for this PortInNotification.
     * 
     * @return recommendTransferTime
     */
    public java.util.Calendar getRecommendTransferTime() {
        return recommendTransferTime;
    }


    /**
     * Sets the recommendTransferTime value for this PortInNotification.
     * 
     * @param recommendTransferTime
     */
    public void setRecommendTransferTime(java.util.Calendar recommendTransferTime) {
        this.recommendTransferTime = recommendTransferTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortInNotification)) return false;
        PortInNotification other = (PortInNotification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenceID==null && other.getReferenceID()==null) || 
             (this.referenceID!=null &&
              this.referenceID.equals(other.getReferenceID()))) &&
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.portingResult==null && other.getPortingResult()==null) || 
             (this.portingResult!=null &&
              this.portingResult.equals(other.getPortingResult()))) &&
            ((this.donor==null && other.getDonor()==null) || 
             (this.donor!=null &&
              this.donor.equals(other.getDonor()))) &&
            ((this.orderedApprovalTime==null && other.getOrderedApprovalTime()==null) || 
             (this.orderedApprovalTime!=null &&
              this.orderedApprovalTime.equals(other.getOrderedApprovalTime()))) &&
            ((this.recommendTransferTime==null && other.getRecommendTransferTime()==null) || 
             (this.recommendTransferTime!=null &&
              this.recommendTransferTime.equals(other.getRecommendTransferTime())));
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
        if (getReferenceID() != null) {
            _hashCode += getReferenceID().hashCode();
        }
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getPortingResult() != null) {
            _hashCode += getPortingResult().hashCode();
        }
        if (getDonor() != null) {
            _hashCode += getDonor().hashCode();
        }
        if (getOrderedApprovalTime() != null) {
            _hashCode += getOrderedApprovalTime().hashCode();
        }
        if (getRecommendTransferTime() != null) {
            _hashCode += getRecommendTransferTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortInNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortInNotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRefernceID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "serviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/customerproduct-common/types/v1", "ProductServiceID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portingResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portingResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingResult"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "donor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDonor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedApprovalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "orderedApprovalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendTransferTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "recommendTransferTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
