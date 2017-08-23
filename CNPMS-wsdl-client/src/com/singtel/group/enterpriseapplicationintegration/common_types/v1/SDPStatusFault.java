/**
 * SDPStatusFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.enterpriseapplicationintegration.common_types.v1;


/**
 * A common data structure defining faults for SDP
 */
public class SDPStatusFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private org.apache.axis.types.NormalizedString statusCode;

    private org.apache.axis.types.NormalizedString consumerReferenceID;

    private org.apache.axis.types.NormalizedString transactionID;

    private java.util.Calendar statusTime;

    private com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusLine[] sdpStatusLine;

    public SDPStatusFault() {
    }

    public SDPStatusFault(
           org.apache.axis.types.NormalizedString statusCode,
           org.apache.axis.types.NormalizedString consumerReferenceID,
           org.apache.axis.types.NormalizedString transactionID,
           java.util.Calendar statusTime,
           com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusLine[] sdpStatusLine) {
        this.statusCode = statusCode;
        this.consumerReferenceID = consumerReferenceID;
        this.transactionID = transactionID;
        this.statusTime = statusTime;
        this.sdpStatusLine = sdpStatusLine;
    }


    /**
     * Gets the statusCode value for this SDPStatusFault.
     * 
     * @return statusCode
     */
    public org.apache.axis.types.NormalizedString getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this SDPStatusFault.
     * 
     * @param statusCode
     */
    public void setStatusCode(org.apache.axis.types.NormalizedString statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the consumerReferenceID value for this SDPStatusFault.
     * 
     * @return consumerReferenceID
     */
    public org.apache.axis.types.NormalizedString getConsumerReferenceID() {
        return consumerReferenceID;
    }


    /**
     * Sets the consumerReferenceID value for this SDPStatusFault.
     * 
     * @param consumerReferenceID
     */
    public void setConsumerReferenceID(org.apache.axis.types.NormalizedString consumerReferenceID) {
        this.consumerReferenceID = consumerReferenceID;
    }


    /**
     * Gets the transactionID value for this SDPStatusFault.
     * 
     * @return transactionID
     */
    public org.apache.axis.types.NormalizedString getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this SDPStatusFault.
     * 
     * @param transactionID
     */
    public void setTransactionID(org.apache.axis.types.NormalizedString transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the statusTime value for this SDPStatusFault.
     * 
     * @return statusTime
     */
    public java.util.Calendar getStatusTime() {
        return statusTime;
    }


    /**
     * Sets the statusTime value for this SDPStatusFault.
     * 
     * @param statusTime
     */
    public void setStatusTime(java.util.Calendar statusTime) {
        this.statusTime = statusTime;
    }


    /**
     * Gets the sdpStatusLine value for this SDPStatusFault.
     * 
     * @return sdpStatusLine
     */
    public com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusLine[] getSdpStatusLine() {
        return sdpStatusLine;
    }


    /**
     * Sets the sdpStatusLine value for this SDPStatusFault.
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
        if (!(obj instanceof SDPStatusFault)) return false;
        SDPStatusFault other = (SDPStatusFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.consumerReferenceID==null && other.getConsumerReferenceID()==null) || 
             (this.consumerReferenceID!=null &&
              this.consumerReferenceID.equals(other.getConsumerReferenceID()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.statusTime==null && other.getStatusTime()==null) || 
             (this.statusTime!=null &&
              this.statusTime.equals(other.getStatusTime()))) &&
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
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getConsumerReferenceID() != null) {
            _hashCode += getConsumerReferenceID().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getStatusTime() != null) {
            _hashCode += getStatusTime().hashCode();
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
        new org.apache.axis.description.TypeDesc(SDPStatusFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerReferenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "consumerReferenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "transactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "statusTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sdpStatusLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpStatusLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusLine"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
