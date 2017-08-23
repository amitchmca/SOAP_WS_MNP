/**
 * PortOutDetailsSN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class PortOutDetailsSN  implements java.io.Serializable {
    private com.singtel.group.manageporting_types.v1.PortingRequestID requestId;

    private com.singtel.group.customerproduct_common.types.v1.ProductServiceID[] serviceID;

    private com.singtel.group.manageporting_types.v1.PortingDonor donor;

    private java.lang.String recipient;

    private java.lang.String prevPortingRefernceID;

    private java.util.Calendar portingTransferDateTime;

    private java.util.Calendar portingApprovalDateTime;

    private java.lang.String paymentCategory;

    private com.singtel.group.manageporting_types.v1.IndividualPorting individual;

    private com.singtel.group.manageporting_types.v1.OrganizationPorting organization;

    public PortOutDetailsSN() {
    }

    public PortOutDetailsSN(
           com.singtel.group.manageporting_types.v1.PortingRequestID requestId,
           com.singtel.group.customerproduct_common.types.v1.ProductServiceID[] serviceID,
           com.singtel.group.manageporting_types.v1.PortingDonor donor,
           java.lang.String recipient,
           java.lang.String prevPortingRefernceID,
           java.util.Calendar portingTransferDateTime,
           java.util.Calendar portingApprovalDateTime,
           java.lang.String paymentCategory,
           com.singtel.group.manageporting_types.v1.IndividualPorting individual,
           com.singtel.group.manageporting_types.v1.OrganizationPorting organization) {
           this.requestId = requestId;
           this.serviceID = serviceID;
           this.donor = donor;
           this.recipient = recipient;
           this.prevPortingRefernceID = prevPortingRefernceID;
           this.portingTransferDateTime = portingTransferDateTime;
           this.portingApprovalDateTime = portingApprovalDateTime;
           this.paymentCategory = paymentCategory;
           this.individual = individual;
           this.organization = organization;
    }


    /**
     * Gets the requestId value for this PortOutDetailsSN.
     * 
     * @return requestId
     */
    public com.singtel.group.manageporting_types.v1.PortingRequestID getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this PortOutDetailsSN.
     * 
     * @param requestId
     */
    public void setRequestId(com.singtel.group.manageporting_types.v1.PortingRequestID requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the serviceID value for this PortOutDetailsSN.
     * 
     * @return serviceID
     */
    public com.singtel.group.customerproduct_common.types.v1.ProductServiceID[] getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this PortOutDetailsSN.
     * 
     * @param serviceID
     */
    public void setServiceID(com.singtel.group.customerproduct_common.types.v1.ProductServiceID[] serviceID) {
        this.serviceID = serviceID;
    }

    public com.singtel.group.customerproduct_common.types.v1.ProductServiceID getServiceID(int i) {
        return this.serviceID[i];
    }

    public void setServiceID(int i, com.singtel.group.customerproduct_common.types.v1.ProductServiceID _value) {
        this.serviceID[i] = _value;
    }


    /**
     * Gets the donor value for this PortOutDetailsSN.
     * 
     * @return donor
     */
    public com.singtel.group.manageporting_types.v1.PortingDonor getDonor() {
        return donor;
    }


    /**
     * Sets the donor value for this PortOutDetailsSN.
     * 
     * @param donor
     */
    public void setDonor(com.singtel.group.manageporting_types.v1.PortingDonor donor) {
        this.donor = donor;
    }


    /**
     * Gets the recipient value for this PortOutDetailsSN.
     * 
     * @return recipient
     */
    public java.lang.String getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this PortOutDetailsSN.
     * 
     * @param recipient
     */
    public void setRecipient(java.lang.String recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the prevPortingRefernceID value for this PortOutDetailsSN.
     * 
     * @return prevPortingRefernceID
     */
    public java.lang.String getPrevPortingRefernceID() {
        return prevPortingRefernceID;
    }


    /**
     * Sets the prevPortingRefernceID value for this PortOutDetailsSN.
     * 
     * @param prevPortingRefernceID
     */
    public void setPrevPortingRefernceID(java.lang.String prevPortingRefernceID) {
        this.prevPortingRefernceID = prevPortingRefernceID;
    }


    /**
     * Gets the portingTransferDateTime value for this PortOutDetailsSN.
     * 
     * @return portingTransferDateTime
     */
    public java.util.Calendar getPortingTransferDateTime() {
        return portingTransferDateTime;
    }


    /**
     * Sets the portingTransferDateTime value for this PortOutDetailsSN.
     * 
     * @param portingTransferDateTime
     */
    public void setPortingTransferDateTime(java.util.Calendar portingTransferDateTime) {
        this.portingTransferDateTime = portingTransferDateTime;
    }


    /**
     * Gets the portingApprovalDateTime value for this PortOutDetailsSN.
     * 
     * @return portingApprovalDateTime
     */
    public java.util.Calendar getPortingApprovalDateTime() {
        return portingApprovalDateTime;
    }


    /**
     * Sets the portingApprovalDateTime value for this PortOutDetailsSN.
     * 
     * @param portingApprovalDateTime
     */
    public void setPortingApprovalDateTime(java.util.Calendar portingApprovalDateTime) {
        this.portingApprovalDateTime = portingApprovalDateTime;
    }


    /**
     * Gets the paymentCategory value for this PortOutDetailsSN.
     * 
     * @return paymentCategory
     */
    public java.lang.String getPaymentCategory() {
        return paymentCategory;
    }


    /**
     * Sets the paymentCategory value for this PortOutDetailsSN.
     * 
     * @param paymentCategory
     */
    public void setPaymentCategory(java.lang.String paymentCategory) {
        this.paymentCategory = paymentCategory;
    }


    /**
     * Gets the individual value for this PortOutDetailsSN.
     * 
     * @return individual
     */
    public com.singtel.group.manageporting_types.v1.IndividualPorting getIndividual() {
        return individual;
    }


    /**
     * Sets the individual value for this PortOutDetailsSN.
     * 
     * @param individual
     */
    public void setIndividual(com.singtel.group.manageporting_types.v1.IndividualPorting individual) {
        this.individual = individual;
    }


    /**
     * Gets the organization value for this PortOutDetailsSN.
     * 
     * @return organization
     */
    public com.singtel.group.manageporting_types.v1.OrganizationPorting getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this PortOutDetailsSN.
     * 
     * @param organization
     */
    public void setOrganization(com.singtel.group.manageporting_types.v1.OrganizationPorting organization) {
        this.organization = organization;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortOutDetailsSN)) return false;
        PortOutDetailsSN other = (PortOutDetailsSN) obj;
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
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              java.util.Arrays.equals(this.serviceID, other.getServiceID()))) &&
            ((this.donor==null && other.getDonor()==null) || 
             (this.donor!=null &&
              this.donor.equals(other.getDonor()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.prevPortingRefernceID==null && other.getPrevPortingRefernceID()==null) || 
             (this.prevPortingRefernceID!=null &&
              this.prevPortingRefernceID.equals(other.getPrevPortingRefernceID()))) &&
            ((this.portingTransferDateTime==null && other.getPortingTransferDateTime()==null) || 
             (this.portingTransferDateTime!=null &&
              this.portingTransferDateTime.equals(other.getPortingTransferDateTime()))) &&
            ((this.portingApprovalDateTime==null && other.getPortingApprovalDateTime()==null) || 
             (this.portingApprovalDateTime!=null &&
              this.portingApprovalDateTime.equals(other.getPortingApprovalDateTime()))) &&
            ((this.paymentCategory==null && other.getPaymentCategory()==null) || 
             (this.paymentCategory!=null &&
              this.paymentCategory.equals(other.getPaymentCategory()))) &&
            ((this.individual==null && other.getIndividual()==null) || 
             (this.individual!=null &&
              this.individual.equals(other.getIndividual()))) &&
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization())));
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
        if (getServiceID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getPortingTransferDateTime() != null) {
            _hashCode += getPortingTransferDateTime().hashCode();
        }
        if (getPortingApprovalDateTime() != null) {
            _hashCode += getPortingApprovalDateTime().hashCode();
        }
        if (getPaymentCategory() != null) {
            _hashCode += getPaymentCategory().hashCode();
        }
        if (getIndividual() != null) {
            _hashCode += getIndividual().hashCode();
        }
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortOutDetailsSN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortOutDetailsSN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "serviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/customerproduct-common/types/v1", "ProductServiceID"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("portingTransferDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portingTransferDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
        elemField.setMinOccurs(0);
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
