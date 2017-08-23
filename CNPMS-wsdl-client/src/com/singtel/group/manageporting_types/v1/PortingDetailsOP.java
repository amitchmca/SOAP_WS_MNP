/**
 * PortingDetailsOP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class PortingDetailsOP  extends com.singtel.group.manageporting_types.v1.PortingDetails  implements java.io.Serializable {
    private java.lang.String donorAccountID;

    private java.lang.String prevPortOutRefernceID;

    private com.singtel.group.core.types.v1.SubscriptionType serviceType;

    private java.lang.String recipient;

    private com.singtel.group.core.types.v1.CustomerTypeLevel1All customerType;

    private java.lang.String paymentCategory;

    private java.util.Calendar birthDate;

    private java.util.Calendar agreementSignatureDate;

    private java.util.Calendar portingTransferDateTime;

    private java.lang.String portType;

    public PortingDetailsOP() {
    }

    public PortingDetailsOP(
           java.lang.String donorAccountID,
           java.lang.String prevPortOutRefernceID,
           com.singtel.group.core.types.v1.SubscriptionType serviceType,
           java.lang.String recipient,
           com.singtel.group.core.types.v1.CustomerTypeLevel1All customerType,
           java.lang.String paymentCategory,
           java.util.Calendar birthDate,
           java.util.Calendar agreementSignatureDate,
           java.util.Calendar portingTransferDateTime,
           java.lang.String portType) {
        this.donorAccountID = donorAccountID;
        this.prevPortOutRefernceID = prevPortOutRefernceID;
        this.serviceType = serviceType;
        this.recipient = recipient;
        this.customerType = customerType;
        this.paymentCategory = paymentCategory;
        this.birthDate = birthDate;
        this.agreementSignatureDate = agreementSignatureDate;
        this.portingTransferDateTime = portingTransferDateTime;
        this.portType = portType;
    }


    /**
     * Gets the donorAccountID value for this PortingDetailsOP.
     * 
     * @return donorAccountID
     */
    public java.lang.String getDonorAccountID() {
        return donorAccountID;
    }


    /**
     * Sets the donorAccountID value for this PortingDetailsOP.
     * 
     * @param donorAccountID
     */
    public void setDonorAccountID(java.lang.String donorAccountID) {
        this.donorAccountID = donorAccountID;
    }


    /**
     * Gets the prevPortOutRefernceID value for this PortingDetailsOP.
     * 
     * @return prevPortOutRefernceID
     */
    public java.lang.String getPrevPortOutRefernceID() {
        return prevPortOutRefernceID;
    }


    /**
     * Sets the prevPortOutRefernceID value for this PortingDetailsOP.
     * 
     * @param prevPortOutRefernceID
     */
    public void setPrevPortOutRefernceID(java.lang.String prevPortOutRefernceID) {
        this.prevPortOutRefernceID = prevPortOutRefernceID;
    }


    /**
     * Gets the serviceType value for this PortingDetailsOP.
     * 
     * @return serviceType
     */
    public com.singtel.group.core.types.v1.SubscriptionType getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this PortingDetailsOP.
     * 
     * @param serviceType
     */
    public void setServiceType(com.singtel.group.core.types.v1.SubscriptionType serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the recipient value for this PortingDetailsOP.
     * 
     * @return recipient
     */
    public java.lang.String getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this PortingDetailsOP.
     * 
     * @param recipient
     */
    public void setRecipient(java.lang.String recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the customerType value for this PortingDetailsOP.
     * 
     * @return customerType
     */
    public com.singtel.group.core.types.v1.CustomerTypeLevel1All getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this PortingDetailsOP.
     * 
     * @param customerType
     */
    public void setCustomerType(com.singtel.group.core.types.v1.CustomerTypeLevel1All customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the paymentCategory value for this PortingDetailsOP.
     * 
     * @return paymentCategory
     */
    public java.lang.String getPaymentCategory() {
        return paymentCategory;
    }


    /**
     * Sets the paymentCategory value for this PortingDetailsOP.
     * 
     * @param paymentCategory
     */
    public void setPaymentCategory(java.lang.String paymentCategory) {
        this.paymentCategory = paymentCategory;
    }


    /**
     * Gets the birthDate value for this PortingDetailsOP.
     * 
     * @return birthDate
     */
    public java.util.Calendar getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this PortingDetailsOP.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Calendar birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the agreementSignatureDate value for this PortingDetailsOP.
     * 
     * @return agreementSignatureDate
     */
    public java.util.Calendar getAgreementSignatureDate() {
        return agreementSignatureDate;
    }


    /**
     * Sets the agreementSignatureDate value for this PortingDetailsOP.
     * 
     * @param agreementSignatureDate
     */
    public void setAgreementSignatureDate(java.util.Calendar agreementSignatureDate) {
        this.agreementSignatureDate = agreementSignatureDate;
    }


    /**
     * Gets the portingTransferDateTime value for this PortingDetailsOP.
     * 
     * @return portingTransferDateTime
     */
    public java.util.Calendar getPortingTransferDateTime() {
        return portingTransferDateTime;
    }


    /**
     * Sets the portingTransferDateTime value for this PortingDetailsOP.
     * 
     * @param portingTransferDateTime
     */
    public void setPortingTransferDateTime(java.util.Calendar portingTransferDateTime) {
        this.portingTransferDateTime = portingTransferDateTime;
    }


    /**
     * Gets the portType value for this PortingDetailsOP.
     * 
     * @return portType
     */
    public java.lang.String getPortType() {
        return portType;
    }


    /**
     * Sets the portType value for this PortingDetailsOP.
     * 
     * @param portType
     */
    public void setPortType(java.lang.String portType) {
        this.portType = portType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortingDetailsOP)) return false;
        PortingDetailsOP other = (PortingDetailsOP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.donorAccountID==null && other.getDonorAccountID()==null) || 
             (this.donorAccountID!=null &&
              this.donorAccountID.equals(other.getDonorAccountID()))) &&
            ((this.prevPortOutRefernceID==null && other.getPrevPortOutRefernceID()==null) || 
             (this.prevPortOutRefernceID!=null &&
              this.prevPortOutRefernceID.equals(other.getPrevPortOutRefernceID()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.customerType==null && other.getCustomerType()==null) || 
             (this.customerType!=null &&
              this.customerType.equals(other.getCustomerType()))) &&
            ((this.paymentCategory==null && other.getPaymentCategory()==null) || 
             (this.paymentCategory!=null &&
              this.paymentCategory.equals(other.getPaymentCategory()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.agreementSignatureDate==null && other.getAgreementSignatureDate()==null) || 
             (this.agreementSignatureDate!=null &&
              this.agreementSignatureDate.equals(other.getAgreementSignatureDate()))) &&
            ((this.portingTransferDateTime==null && other.getPortingTransferDateTime()==null) || 
             (this.portingTransferDateTime!=null &&
              this.portingTransferDateTime.equals(other.getPortingTransferDateTime()))) &&
            ((this.portType==null && other.getPortType()==null) || 
             (this.portType!=null &&
              this.portType.equals(other.getPortType())));
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
        if (getDonorAccountID() != null) {
            _hashCode += getDonorAccountID().hashCode();
        }
        if (getPrevPortOutRefernceID() != null) {
            _hashCode += getPrevPortOutRefernceID().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getCustomerType() != null) {
            _hashCode += getCustomerType().hashCode();
        }
        if (getPaymentCategory() != null) {
            _hashCode += getPaymentCategory().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getAgreementSignatureDate() != null) {
            _hashCode += getAgreementSignatureDate().hashCode();
        }
        if (getPortingTransferDateTime() != null) {
            _hashCode += getPortingTransferDateTime().hashCode();
        }
        if (getPortType() != null) {
            _hashCode += getPortType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortingDetailsOP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDetailsOP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donorAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "donorAccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevPortOutRefernceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "prevPortOutRefernceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "serviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/core/types/v1", "SubscriptionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "customerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/core/types/v1", "CustomerTypeLevel1All"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "paymentCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementSignatureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "agreementSignatureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portingTransferDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portingTransferDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
