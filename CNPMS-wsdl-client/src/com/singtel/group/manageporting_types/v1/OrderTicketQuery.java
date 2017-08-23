/**
 * OrderTicketQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class OrderTicketQuery  implements java.io.Serializable {
    private com.singtel.group.manageporting_types.v1.PortingRequestID requestID;

    private java.util.Calendar dateRangeStart;

    private java.util.Calendar dateRangeEnd;

    private com.singtel.group.manageporting_types.v1.PortingDonor donor;

    public OrderTicketQuery() {
    }

    public OrderTicketQuery(
           com.singtel.group.manageporting_types.v1.PortingRequestID requestID,
           java.util.Calendar dateRangeStart,
           java.util.Calendar dateRangeEnd,
           com.singtel.group.manageporting_types.v1.PortingDonor donor) {
           this.requestID = requestID;
           this.dateRangeStart = dateRangeStart;
           this.dateRangeEnd = dateRangeEnd;
           this.donor = donor;
    }


    /**
     * Gets the requestID value for this OrderTicketQuery.
     * 
     * @return requestID
     */
    public com.singtel.group.manageporting_types.v1.PortingRequestID getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this OrderTicketQuery.
     * 
     * @param requestID
     */
    public void setRequestID(com.singtel.group.manageporting_types.v1.PortingRequestID requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the dateRangeStart value for this OrderTicketQuery.
     * 
     * @return dateRangeStart
     */
    public java.util.Calendar getDateRangeStart() {
        return dateRangeStart;
    }


    /**
     * Sets the dateRangeStart value for this OrderTicketQuery.
     * 
     * @param dateRangeStart
     */
    public void setDateRangeStart(java.util.Calendar dateRangeStart) {
        this.dateRangeStart = dateRangeStart;
    }


    /**
     * Gets the dateRangeEnd value for this OrderTicketQuery.
     * 
     * @return dateRangeEnd
     */
    public java.util.Calendar getDateRangeEnd() {
        return dateRangeEnd;
    }


    /**
     * Sets the dateRangeEnd value for this OrderTicketQuery.
     * 
     * @param dateRangeEnd
     */
    public void setDateRangeEnd(java.util.Calendar dateRangeEnd) {
        this.dateRangeEnd = dateRangeEnd;
    }


    /**
     * Gets the donor value for this OrderTicketQuery.
     * 
     * @return donor
     */
    public com.singtel.group.manageporting_types.v1.PortingDonor getDonor() {
        return donor;
    }


    /**
     * Sets the donor value for this OrderTicketQuery.
     * 
     * @param donor
     */
    public void setDonor(com.singtel.group.manageporting_types.v1.PortingDonor donor) {
        this.donor = donor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderTicketQuery)) return false;
        OrderTicketQuery other = (OrderTicketQuery) obj;
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
            ((this.dateRangeStart==null && other.getDateRangeStart()==null) || 
             (this.dateRangeStart!=null &&
              this.dateRangeStart.equals(other.getDateRangeStart()))) &&
            ((this.dateRangeEnd==null && other.getDateRangeEnd()==null) || 
             (this.dateRangeEnd!=null &&
              this.dateRangeEnd.equals(other.getDateRangeEnd()))) &&
            ((this.donor==null && other.getDonor()==null) || 
             (this.donor!=null &&
              this.donor.equals(other.getDonor())));
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
        if (getDateRangeStart() != null) {
            _hashCode += getDateRangeStart().hashCode();
        }
        if (getDateRangeEnd() != null) {
            _hashCode += getDateRangeEnd().hashCode();
        }
        if (getDonor() != null) {
            _hashCode += getDonor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderTicketQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "OrderTicketQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRangeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "dateRangeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRangeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "dateRangeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "donor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDonor"));
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
