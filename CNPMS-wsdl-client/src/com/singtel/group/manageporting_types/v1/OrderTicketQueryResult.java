/**
 * OrderTicketQueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class OrderTicketQueryResult  implements java.io.Serializable {
    private com.singtel.group.manageporting_types.v1.PortingRequestID requestID;

    private com.singtel.group.manageporting_types.v1.TQResultCode resultCode;

    private com.singtel.group.manageporting_types.v1.QuotaResult[] quotaResult;

    public OrderTicketQueryResult() {
    }

    public OrderTicketQueryResult(
           com.singtel.group.manageporting_types.v1.PortingRequestID requestID,
           com.singtel.group.manageporting_types.v1.TQResultCode resultCode,
           com.singtel.group.manageporting_types.v1.QuotaResult[] quotaResult) {
           this.requestID = requestID;
           this.resultCode = resultCode;
           this.quotaResult = quotaResult;
    }


    /**
     * Gets the requestID value for this OrderTicketQueryResult.
     * 
     * @return requestID
     */
    public com.singtel.group.manageporting_types.v1.PortingRequestID getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this OrderTicketQueryResult.
     * 
     * @param requestID
     */
    public void setRequestID(com.singtel.group.manageporting_types.v1.PortingRequestID requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the resultCode value for this OrderTicketQueryResult.
     * 
     * @return resultCode
     */
    public com.singtel.group.manageporting_types.v1.TQResultCode getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this OrderTicketQueryResult.
     * 
     * @param resultCode
     */
    public void setResultCode(com.singtel.group.manageporting_types.v1.TQResultCode resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the quotaResult value for this OrderTicketQueryResult.
     * 
     * @return quotaResult
     */
    public com.singtel.group.manageporting_types.v1.QuotaResult[] getQuotaResult() {
        return quotaResult;
    }


    /**
     * Sets the quotaResult value for this OrderTicketQueryResult.
     * 
     * @param quotaResult
     */
    public void setQuotaResult(com.singtel.group.manageporting_types.v1.QuotaResult[] quotaResult) {
        this.quotaResult = quotaResult;
    }

    public com.singtel.group.manageporting_types.v1.QuotaResult getQuotaResult(int i) {
        return this.quotaResult[i];
    }

    public void setQuotaResult(int i, com.singtel.group.manageporting_types.v1.QuotaResult _value) {
        this.quotaResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderTicketQueryResult)) return false;
        OrderTicketQueryResult other = (OrderTicketQueryResult) obj;
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
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.quotaResult==null && other.getQuotaResult()==null) || 
             (this.quotaResult!=null &&
              java.util.Arrays.equals(this.quotaResult, other.getQuotaResult())));
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
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getQuotaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuotaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuotaResult(), i);
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
        new org.apache.axis.description.TypeDesc(OrderTicketQueryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "OrderTicketQueryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "TQResultCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "quotaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "QuotaResult"));
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
