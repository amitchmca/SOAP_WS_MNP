/**
 * NPOType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package xsd.xvneMNPProtocol;

public class NPOType  implements java.io.Serializable {
    private java.lang.String messageSenderTelco;

    private java.lang.String messageReceiverTelco;

    private java.lang.String requestId;

    private java.util.Calendar timestamp;

    private java.lang.String referenceId;

    private java.lang.String recipientTelco;

    private java.lang.String donorTelco;

    private java.lang.String oldReferenceId;

    private java.lang.String byLOA;

    private java.lang.String undertakingAck;

    private java.lang.String[] subscriberSequence;

    private java.util.Calendar orderedTransferTime;

    private java.util.Calendar orderedApprovalTime;

    private java.lang.String routeNumber;

    private java.lang.String serviceType;

    private xsd.xvneMNPProtocol.PersonCustomerType personCustomer;

    private xsd.xvneMNPProtocol.CorporateCustomerType corporateCustomer;

    private xsd.xvneMNPProtocol.AuthorType author;

    private java.lang.String remark;

    private java.lang.String version;  // attribute

    public NPOType() {
    }

    public NPOType(
           java.lang.String messageSenderTelco,
           java.lang.String messageReceiverTelco,
           java.lang.String requestId,
           java.util.Calendar timestamp,
           java.lang.String referenceId,
           java.lang.String recipientTelco,
           java.lang.String donorTelco,
           java.lang.String oldReferenceId,
           java.lang.String byLOA,
           java.lang.String undertakingAck,
           java.lang.String[] subscriberSequence,
           java.util.Calendar orderedTransferTime,
           java.util.Calendar orderedApprovalTime,
           java.lang.String routeNumber,
           java.lang.String serviceType,
           xsd.xvneMNPProtocol.PersonCustomerType personCustomer,
           xsd.xvneMNPProtocol.CorporateCustomerType corporateCustomer,
           xsd.xvneMNPProtocol.AuthorType author,
           java.lang.String remark,
           java.lang.String version) {
           this.messageSenderTelco = messageSenderTelco;
           this.messageReceiverTelco = messageReceiverTelco;
           this.requestId = requestId;
           this.timestamp = timestamp;
           this.referenceId = referenceId;
           this.recipientTelco = recipientTelco;
           this.donorTelco = donorTelco;
           this.oldReferenceId = oldReferenceId;
           this.byLOA = byLOA;
           this.undertakingAck = undertakingAck;
           this.subscriberSequence = subscriberSequence;
           this.orderedTransferTime = orderedTransferTime;
           this.orderedApprovalTime = orderedApprovalTime;
           this.routeNumber = routeNumber;
           this.serviceType = serviceType;
           this.personCustomer = personCustomer;
           this.corporateCustomer = corporateCustomer;
           this.author = author;
           this.remark = remark;
           this.version = version;
    }


    /**
     * Gets the messageSenderTelco value for this NPOType.
     * 
     * @return messageSenderTelco
     */
    public java.lang.String getMessageSenderTelco() {
        return messageSenderTelco;
    }


    /**
     * Sets the messageSenderTelco value for this NPOType.
     * 
     * @param messageSenderTelco
     */
    public void setMessageSenderTelco(java.lang.String messageSenderTelco) {
        this.messageSenderTelco = messageSenderTelco;
    }


    /**
     * Gets the messageReceiverTelco value for this NPOType.
     * 
     * @return messageReceiverTelco
     */
    public java.lang.String getMessageReceiverTelco() {
        return messageReceiverTelco;
    }


    /**
     * Sets the messageReceiverTelco value for this NPOType.
     * 
     * @param messageReceiverTelco
     */
    public void setMessageReceiverTelco(java.lang.String messageReceiverTelco) {
        this.messageReceiverTelco = messageReceiverTelco;
    }


    /**
     * Gets the requestId value for this NPOType.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this NPOType.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the timestamp value for this NPOType.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this NPOType.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the referenceId value for this NPOType.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this NPOType.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the recipientTelco value for this NPOType.
     * 
     * @return recipientTelco
     */
    public java.lang.String getRecipientTelco() {
        return recipientTelco;
    }


    /**
     * Sets the recipientTelco value for this NPOType.
     * 
     * @param recipientTelco
     */
    public void setRecipientTelco(java.lang.String recipientTelco) {
        this.recipientTelco = recipientTelco;
    }


    /**
     * Gets the donorTelco value for this NPOType.
     * 
     * @return donorTelco
     */
    public java.lang.String getDonorTelco() {
        return donorTelco;
    }


    /**
     * Sets the donorTelco value for this NPOType.
     * 
     * @param donorTelco
     */
    public void setDonorTelco(java.lang.String donorTelco) {
        this.donorTelco = donorTelco;
    }


    /**
     * Gets the oldReferenceId value for this NPOType.
     * 
     * @return oldReferenceId
     */
    public java.lang.String getOldReferenceId() {
        return oldReferenceId;
    }


    /**
     * Sets the oldReferenceId value for this NPOType.
     * 
     * @param oldReferenceId
     */
    public void setOldReferenceId(java.lang.String oldReferenceId) {
        this.oldReferenceId = oldReferenceId;
    }


    /**
     * Gets the byLOA value for this NPOType.
     * 
     * @return byLOA
     */
    public java.lang.String getByLOA() {
        return byLOA;
    }


    /**
     * Sets the byLOA value for this NPOType.
     * 
     * @param byLOA
     */
    public void setByLOA(java.lang.String byLOA) {
        this.byLOA = byLOA;
    }


    /**
     * Gets the undertakingAck value for this NPOType.
     * 
     * @return undertakingAck
     */
    public java.lang.String getUndertakingAck() {
        return undertakingAck;
    }


    /**
     * Sets the undertakingAck value for this NPOType.
     * 
     * @param undertakingAck
     */
    public void setUndertakingAck(java.lang.String undertakingAck) {
        this.undertakingAck = undertakingAck;
    }


    /**
     * Gets the subscriberSequence value for this NPOType.
     * 
     * @return subscriberSequence
     */
    public java.lang.String[] getSubscriberSequence() {
        return subscriberSequence;
    }


    /**
     * Sets the subscriberSequence value for this NPOType.
     * 
     * @param subscriberSequence
     */
    public void setSubscriberSequence(java.lang.String[] subscriberSequence) {
        this.subscriberSequence = subscriberSequence;
    }


    /**
     * Gets the orderedTransferTime value for this NPOType.
     * 
     * @return orderedTransferTime
     */
    public java.util.Calendar getOrderedTransferTime() {
        return orderedTransferTime;
    }


    /**
     * Sets the orderedTransferTime value for this NPOType.
     * 
     * @param orderedTransferTime
     */
    public void setOrderedTransferTime(java.util.Calendar orderedTransferTime) {
        this.orderedTransferTime = orderedTransferTime;
    }


    /**
     * Gets the orderedApprovalTime value for this NPOType.
     * 
     * @return orderedApprovalTime
     */
    public java.util.Calendar getOrderedApprovalTime() {
        return orderedApprovalTime;
    }


    /**
     * Sets the orderedApprovalTime value for this NPOType.
     * 
     * @param orderedApprovalTime
     */
    public void setOrderedApprovalTime(java.util.Calendar orderedApprovalTime) {
        this.orderedApprovalTime = orderedApprovalTime;
    }


    /**
     * Gets the routeNumber value for this NPOType.
     * 
     * @return routeNumber
     */
    public java.lang.String getRouteNumber() {
        return routeNumber;
    }


    /**
     * Sets the routeNumber value for this NPOType.
     * 
     * @param routeNumber
     */
    public void setRouteNumber(java.lang.String routeNumber) {
        this.routeNumber = routeNumber;
    }


    /**
     * Gets the serviceType value for this NPOType.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this NPOType.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the personCustomer value for this NPOType.
     * 
     * @return personCustomer
     */
    public xsd.xvneMNPProtocol.PersonCustomerType getPersonCustomer() {
        return personCustomer;
    }


    /**
     * Sets the personCustomer value for this NPOType.
     * 
     * @param personCustomer
     */
    public void setPersonCustomer(xsd.xvneMNPProtocol.PersonCustomerType personCustomer) {
        this.personCustomer = personCustomer;
    }


    /**
     * Gets the corporateCustomer value for this NPOType.
     * 
     * @return corporateCustomer
     */
    public xsd.xvneMNPProtocol.CorporateCustomerType getCorporateCustomer() {
        return corporateCustomer;
    }


    /**
     * Sets the corporateCustomer value for this NPOType.
     * 
     * @param corporateCustomer
     */
    public void setCorporateCustomer(xsd.xvneMNPProtocol.CorporateCustomerType corporateCustomer) {
        this.corporateCustomer = corporateCustomer;
    }


    /**
     * Gets the author value for this NPOType.
     * 
     * @return author
     */
    public xsd.xvneMNPProtocol.AuthorType getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this NPOType.
     * 
     * @param author
     */
    public void setAuthor(xsd.xvneMNPProtocol.AuthorType author) {
        this.author = author;
    }


    /**
     * Gets the remark value for this NPOType.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this NPOType.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the version value for this NPOType.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this NPOType.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NPOType)) return false;
        NPOType other = (NPOType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageSenderTelco==null && other.getMessageSenderTelco()==null) || 
             (this.messageSenderTelco!=null &&
              this.messageSenderTelco.equals(other.getMessageSenderTelco()))) &&
            ((this.messageReceiverTelco==null && other.getMessageReceiverTelco()==null) || 
             (this.messageReceiverTelco!=null &&
              this.messageReceiverTelco.equals(other.getMessageReceiverTelco()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.recipientTelco==null && other.getRecipientTelco()==null) || 
             (this.recipientTelco!=null &&
              this.recipientTelco.equals(other.getRecipientTelco()))) &&
            ((this.donorTelco==null && other.getDonorTelco()==null) || 
             (this.donorTelco!=null &&
              this.donorTelco.equals(other.getDonorTelco()))) &&
            ((this.oldReferenceId==null && other.getOldReferenceId()==null) || 
             (this.oldReferenceId!=null &&
              this.oldReferenceId.equals(other.getOldReferenceId()))) &&
            ((this.byLOA==null && other.getByLOA()==null) || 
             (this.byLOA!=null &&
              this.byLOA.equals(other.getByLOA()))) &&
            ((this.undertakingAck==null && other.getUndertakingAck()==null) || 
             (this.undertakingAck!=null &&
              this.undertakingAck.equals(other.getUndertakingAck()))) &&
            ((this.subscriberSequence==null && other.getSubscriberSequence()==null) || 
             (this.subscriberSequence!=null &&
              java.util.Arrays.equals(this.subscriberSequence, other.getSubscriberSequence()))) &&
            ((this.orderedTransferTime==null && other.getOrderedTransferTime()==null) || 
             (this.orderedTransferTime!=null &&
              this.orderedTransferTime.equals(other.getOrderedTransferTime()))) &&
            ((this.orderedApprovalTime==null && other.getOrderedApprovalTime()==null) || 
             (this.orderedApprovalTime!=null &&
              this.orderedApprovalTime.equals(other.getOrderedApprovalTime()))) &&
            ((this.routeNumber==null && other.getRouteNumber()==null) || 
             (this.routeNumber!=null &&
              this.routeNumber.equals(other.getRouteNumber()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.personCustomer==null && other.getPersonCustomer()==null) || 
             (this.personCustomer!=null &&
              this.personCustomer.equals(other.getPersonCustomer()))) &&
            ((this.corporateCustomer==null && other.getCorporateCustomer()==null) || 
             (this.corporateCustomer!=null &&
              this.corporateCustomer.equals(other.getCorporateCustomer()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getMessageSenderTelco() != null) {
            _hashCode += getMessageSenderTelco().hashCode();
        }
        if (getMessageReceiverTelco() != null) {
            _hashCode += getMessageReceiverTelco().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getRecipientTelco() != null) {
            _hashCode += getRecipientTelco().hashCode();
        }
        if (getDonorTelco() != null) {
            _hashCode += getDonorTelco().hashCode();
        }
        if (getOldReferenceId() != null) {
            _hashCode += getOldReferenceId().hashCode();
        }
        if (getByLOA() != null) {
            _hashCode += getByLOA().hashCode();
        }
        if (getUndertakingAck() != null) {
            _hashCode += getUndertakingAck().hashCode();
        }
        if (getSubscriberSequence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberSequence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriberSequence(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderedTransferTime() != null) {
            _hashCode += getOrderedTransferTime().hashCode();
        }
        if (getOrderedApprovalTime() != null) {
            _hashCode += getOrderedApprovalTime().hashCode();
        }
        if (getRouteNumber() != null) {
            _hashCode += getRouteNumber().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getPersonCustomer() != null) {
            _hashCode += getPersonCustomer().hashCode();
        }
        if (getCorporateCustomer() != null) {
            _hashCode += getCorporateCustomer().hashCode();
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NPOType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "NPOType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageSenderTelco");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "MessageSenderTelco"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">MessageSenderTelco"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageReceiverTelco");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "MessageReceiverTelco"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">MessageReceiverTelco"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "RequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">RequestId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "ReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">ReferenceId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientTelco");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "RecipientTelco"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">RecipientTelco"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donorTelco");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "DonorTelco"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">DonorTelco"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "OldReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">OldReferenceId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byLOA");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "ByLOA"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">ByLOA"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undertakingAck");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "UndertakingAck"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">UndertakingAck"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "SubscriberSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "SubscriberNumber"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedTransferTime");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "OrderedTransferTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedApprovalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "OrderedApprovalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "RouteNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">RouteNumber"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "PersonCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "PersonCustomerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "CorporateCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "CorporateCustomerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "Author"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "AuthorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "Remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">Remark"));
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
