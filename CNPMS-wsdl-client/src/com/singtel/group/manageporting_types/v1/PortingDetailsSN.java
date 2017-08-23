/**
 * PortingDetailsSN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class PortingDetailsSN  extends com.singtel.group.manageporting_types.v1.PortingDetails  implements java.io.Serializable {
    private com.singtel.group.manageporting_types.v1.PortingRequestID request;

    private com.singtel.group.manageporting_types.v1.PortingDonor donor;

    private java.lang.String recipient;

    private java.lang.String prevPortingRefernceID;

    private java.lang.String byLOA;

    private java.lang.String undertakingAck;

    private java.util.Calendar portingTransferDateTime;

    private java.util.Calendar portingApprovalDateTime;

    private java.lang.String paymentCategory;

    private java.lang.String routeNumber;

    private com.singtel.group.manageporting_types.v1.IndividualPorting individual;

    private com.singtel.group.manageporting_types.v1.OrganizationPorting organization;

    private java.util.Calendar agreementSignatureDate;

    public PortingDetailsSN() {
    }

    public PortingDetailsSN(
           com.singtel.group.manageporting_types.v1.PortingRequestID request,
           com.singtel.group.manageporting_types.v1.PortingDonor donor,
           java.lang.String recipient,
           java.lang.String prevPortingRefernceID,
           java.lang.String byLOA,
           java.lang.String undertakingAck,
           java.util.Calendar portingTransferDateTime,
           java.util.Calendar portingApprovalDateTime,
           java.lang.String paymentCategory,
           java.lang.String routeNumber,
           com.singtel.group.manageporting_types.v1.IndividualPorting individual,
           com.singtel.group.manageporting_types.v1.OrganizationPorting organization,
           java.util.Calendar agreementSignatureDate) {
        this.request = request;
        this.donor = donor;
        this.recipient = recipient;
        this.prevPortingRefernceID = prevPortingRefernceID;
        this.byLOA = byLOA;
        this.undertakingAck = undertakingAck;
        this.portingTransferDateTime = portingTransferDateTime;
        this.portingApprovalDateTime = portingApprovalDateTime;
        this.paymentCategory = paymentCategory;
        this.routeNumber = routeNumber;
        this.individual = individual;
        this.organization = organization;
        this.agreementSignatureDate = agreementSignatureDate;
    }


    /**
     * Gets the request value for this PortingDetailsSN.
     * 
     * @return request
     */
    public com.singtel.group.manageporting_types.v1.PortingRequestID getRequest() {
        return request;
    }


    /**
     * Sets the request value for this PortingDetailsSN.
     * 
     * @param request
     */
    public void setRequest(com.singtel.group.manageporting_types.v1.PortingRequestID request) {
        this.request = request;
    }


    /**
     * Gets the donor value for this PortingDetailsSN.
     * 
     * @return donor
     */
    public com.singtel.group.manageporting_types.v1.PortingDonor getDonor() {
        return donor;
    }


    /**
     * Sets the donor value for this PortingDetailsSN.
     * 
     * @param donor
     */
    public void setDonor(com.singtel.group.manageporting_types.v1.PortingDonor donor) {
        this.donor = donor;
    }


    /**
     * Gets the recipient value for this PortingDetailsSN.
     * 
     * @return recipient
     */
    public java.lang.String getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this PortingDetailsSN.
     * 
     * @param recipient
     */
    public void setRecipient(java.lang.String recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the prevPortingRefernceID value for this PortingDetailsSN.
     * 
     * @return prevPortingRefernceID
     */
    public java.lang.String getPrevPortingRefernceID() {
        return prevPortingRefernceID;
    }


    /**
     * Sets the prevPortingRefernceID value for this PortingDetailsSN.
     * 
     * @param prevPortingRefernceID
     */
    public void setPrevPortingRefernceID(java.lang.String prevPortingRefernceID) {
        this.prevPortingRefernceID = prevPortingRefernceID;
    }


    /**
     * Gets the byLOA value for this PortingDetailsSN.
     * 
     * @return byLOA
     */
    public java.lang.String getByLOA() {
        return byLOA;
    }


    /**
     * Sets the byLOA value for this PortingDetailsSN.
     * 
     * @param byLOA
     */
    public void setByLOA(java.lang.String byLOA) {
        this.byLOA = byLOA;
    }


    /**
     * Gets the undertakingAck value for this PortingDetailsSN.
     * 
     * @return undertakingAck
     */
    public java.lang.String getUndertakingAck() {
        return undertakingAck;
    }


    /**
     * Sets the undertakingAck value for this PortingDetailsSN.
     * 
     * @param undertakingAck
     */
    public void setUndertakingAck(java.lang.String undertakingAck) {
        this.undertakingAck = undertakingAck;
    }


    /**
     * Gets the portingTransferDateTime value for this PortingDetailsSN.
     * 
     * @return portingTransferDateTime
     */
    public java.util.Calendar getPortingTransferDateTime() {
        return portingTransferDateTime;
    }


    /**
     * Sets the portingTransferDateTime value for this PortingDetailsSN.
     * 
     * @param portingTransferDateTime
     */
    public void setPortingTransferDateTime(java.util.Calendar portingTransferDateTime) {
        this.portingTransferDateTime = portingTransferDateTime;
    }


    /**
     * Gets the portingApprovalDateTime value for this PortingDetailsSN.
     * 
     * @return portingApprovalDateTime
     */
    public java.util.Calendar getPortingApprovalDateTime() {
        return portingApprovalDateTime;
    }


    /**
     * Sets the portingApprovalDateTime value for this PortingDetailsSN.
     * 
     * @param portingApprovalDateTime
     */
    public void setPortingApprovalDateTime(java.util.Calendar portingApprovalDateTime) {
        this.portingApprovalDateTime = portingApprovalDateTime;
    }


    /**
     * Gets the paymentCategory value for this PortingDetailsSN.
     * 
     * @return paymentCategory
     */
    public java.lang.String getPaymentCategory() {
        return paymentCategory;
    }


    /**
     * Sets the paymentCategory value for this PortingDetailsSN.
     * 
     * @param paymentCategory
     */
    public void setPaymentCategory(java.lang.String paymentCategory) {
        this.paymentCategory = paymentCategory;
    }


    /**
     * Gets the routeNumber value for this PortingDetailsSN.
     * 
     * @return routeNumber
     */
    public java.lang.String getRouteNumber() {
        return routeNumber;
    }


    /**
     * Sets the routeNumber value for this PortingDetailsSN.
     * 
     * @param routeNumber
     */
    public void setRouteNumber(java.lang.String routeNumber) {
        this.routeNumber = routeNumber;
    }


    /**
     * Gets the individual value for this PortingDetailsSN.
     * 
     * @return individual
     */
    public com.singtel.group.manageporting_types.v1.IndividualPorting getIndividual() {
        return individual;
    }


    /**
     * Sets the individual value for this PortingDetailsSN.
     * 
     * @param individual
     */
    public void setIndividual(com.singtel.group.manageporting_types.v1.IndividualPorting individual) {
        this.individual = individual;
    }


    /**
     * Gets the organization value for this PortingDetailsSN.
     * 
     * @return organization
     */
    public com.singtel.group.manageporting_types.v1.OrganizationPorting getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this PortingDetailsSN.
     * 
     * @param organization
     */
    public void setOrganization(com.singtel.group.manageporting_types.v1.OrganizationPorting organization) {
        this.organization = organization;
    }


    /**
     * Gets the agreementSignatureDate value for this PortingDetailsSN.
     * 
     * @return agreementSignatureDate
     */
    public java.util.Calendar getAgreementSignatureDate() {
        return agreementSignatureDate;
    }


    /**
     * Sets the agreementSignatureDate value for this PortingDetailsSN.
     * 
     * @param agreementSignatureDate
     */
    public void setAgreementSignatureDate(java.util.Calendar agreementSignatureDate) {
        this.agreementSignatureDate = agreementSignatureDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortingDetailsSN)) return false;
        PortingDetailsSN other = (PortingDetailsSN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.donor==null && other.getDonor()==null) || 
             (this.donor!=null &&
              this.donor.equals(other.getDonor()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.prevPortingRefernceID==null && other.getPrevPortingRefernceID()==null) || 
             (this.prevPortingRefernceID!=null &&
              this.prevPortingRefernceID.equals(other.getPrevPortingRefernceID()))) &&
            ((this.byLOA==null && other.getByLOA()==null) || 
             (this.byLOA!=null &&
              this.byLOA.equals(other.getByLOA()))) &&
            ((this.undertakingAck==null && other.getUndertakingAck()==null) || 
             (this.undertakingAck!=null &&
              this.undertakingAck.equals(other.getUndertakingAck()))) &&
            ((this.portingTransferDateTime==null && other.getPortingTransferDateTime()==null) || 
             (this.portingTransferDateTime!=null &&
              this.portingTransferDateTime.equals(other.getPortingTransferDateTime()))) &&
            ((this.portingApprovalDateTime==null && other.getPortingApprovalDateTime()==null) || 
             (this.portingApprovalDateTime!=null &&
              this.portingApprovalDateTime.equals(other.getPortingApprovalDateTime()))) &&
            ((this.paymentCategory==null && other.getPaymentCategory()==null) || 
             (this.paymentCategory!=null &&
              this.paymentCategory.equals(other.getPaymentCategory()))) &&
            ((this.routeNumber==null && other.getRouteNumber()==null) || 
             (this.routeNumber!=null &&
              this.routeNumber.equals(other.getRouteNumber()))) &&
            ((this.individual==null && other.getIndividual()==null) || 
             (this.individual!=null &&
              this.individual.equals(other.getIndividual()))) &&
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization()))) &&
            ((this.agreementSignatureDate==null && other.getAgreementSignatureDate()==null) || 
             (this.agreementSignatureDate!=null &&
              this.agreementSignatureDate.equals(other.getAgreementSignatureDate())));
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
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        if (getDonor() != null) {
            _hashCode += getDonor().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getPrevPortingRefernceID() != null) {
            _hashCode += getPrevPortingRefernceID().hashCode();
        }
        if (getByLOA() != null) {
            _hashCode += getByLOA().hashCode();
        }
        if (getUndertakingAck() != null) {
            _hashCode += getUndertakingAck().hashCode();
        }
        if (getPortingTransferDateTime() != null) {
            _hashCode += getPortingTransferDateTime().hashCode();
        }
        if (getPortingApprovalDateTime() != null) {
            _hashCode += getPortingApprovalDateTime().hashCode();
        }
        if (getPaymentCategory() != null) {
            _hashCode += getPaymentCategory().hashCode();
        }
        if (getRouteNumber() != null) {
            _hashCode += getRouteNumber().hashCode();
        }
        if (getIndividual() != null) {
            _hashCode += getIndividual().hashCode();
        }
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        if (getAgreementSignatureDate() != null) {
            _hashCode += getAgreementSignatureDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortingDetailsSN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDetailsSN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "donor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDonor"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevPortingRefernceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "prevPortingRefernceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byLOA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "byLOA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undertakingAck");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "UndertakingAck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portingTransferDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portingTransferDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portingApprovalDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portingApprovalDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "paymentCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "routeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "individual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "IndividualPorting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "OrganizationPorting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementSignatureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "agreementSignatureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
