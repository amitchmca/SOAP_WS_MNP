/**
 * SDPStatusLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.enterpriseapplicationintegration.common_types.v1;

public class SDPStatusLine  implements java.io.Serializable {
    private java.util.Calendar stepStatusTime;

    private java.lang.String processStep;

    private com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPSeverity severity;

    private org.apache.axis.types.NormalizedString statusCode;

    private java.lang.String statusDescription;

    private java.lang.String providerFault;

    private java.lang.String traceData;

    public SDPStatusLine() {
    }

    public SDPStatusLine(
           java.util.Calendar stepStatusTime,
           java.lang.String processStep,
           com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPSeverity severity,
           org.apache.axis.types.NormalizedString statusCode,
           java.lang.String statusDescription,
           java.lang.String providerFault,
           java.lang.String traceData) {
           this.stepStatusTime = stepStatusTime;
           this.processStep = processStep;
           this.severity = severity;
           this.statusCode = statusCode;
           this.statusDescription = statusDescription;
           this.providerFault = providerFault;
           this.traceData = traceData;
    }


    /**
     * Gets the stepStatusTime value for this SDPStatusLine.
     * 
     * @return stepStatusTime
     */
    public java.util.Calendar getStepStatusTime() {
        return stepStatusTime;
    }


    /**
     * Sets the stepStatusTime value for this SDPStatusLine.
     * 
     * @param stepStatusTime
     */
    public void setStepStatusTime(java.util.Calendar stepStatusTime) {
        this.stepStatusTime = stepStatusTime;
    }


    /**
     * Gets the processStep value for this SDPStatusLine.
     * 
     * @return processStep
     */
    public java.lang.String getProcessStep() {
        return processStep;
    }


    /**
     * Sets the processStep value for this SDPStatusLine.
     * 
     * @param processStep
     */
    public void setProcessStep(java.lang.String processStep) {
        this.processStep = processStep;
    }


    /**
     * Gets the severity value for this SDPStatusLine.
     * 
     * @return severity
     */
    public com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPSeverity getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this SDPStatusLine.
     * 
     * @param severity
     */
    public void setSeverity(com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPSeverity severity) {
        this.severity = severity;
    }


    /**
     * Gets the statusCode value for this SDPStatusLine.
     * 
     * @return statusCode
     */
    public org.apache.axis.types.NormalizedString getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this SDPStatusLine.
     * 
     * @param statusCode
     */
    public void setStatusCode(org.apache.axis.types.NormalizedString statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusDescription value for this SDPStatusLine.
     * 
     * @return statusDescription
     */
    public java.lang.String getStatusDescription() {
        return statusDescription;
    }


    /**
     * Sets the statusDescription value for this SDPStatusLine.
     * 
     * @param statusDescription
     */
    public void setStatusDescription(java.lang.String statusDescription) {
        this.statusDescription = statusDescription;
    }


    /**
     * Gets the providerFault value for this SDPStatusLine.
     * 
     * @return providerFault
     */
    public java.lang.String getProviderFault() {
        return providerFault;
    }


    /**
     * Sets the providerFault value for this SDPStatusLine.
     * 
     * @param providerFault
     */
    public void setProviderFault(java.lang.String providerFault) {
        this.providerFault = providerFault;
    }


    /**
     * Gets the traceData value for this SDPStatusLine.
     * 
     * @return traceData
     */
    public java.lang.String getTraceData() {
        return traceData;
    }


    /**
     * Sets the traceData value for this SDPStatusLine.
     * 
     * @param traceData
     */
    public void setTraceData(java.lang.String traceData) {
        this.traceData = traceData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDPStatusLine)) return false;
        SDPStatusLine other = (SDPStatusLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stepStatusTime==null && other.getStepStatusTime()==null) || 
             (this.stepStatusTime!=null &&
              this.stepStatusTime.equals(other.getStepStatusTime()))) &&
            ((this.processStep==null && other.getProcessStep()==null) || 
             (this.processStep!=null &&
              this.processStep.equals(other.getProcessStep()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.statusDescription==null && other.getStatusDescription()==null) || 
             (this.statusDescription!=null &&
              this.statusDescription.equals(other.getStatusDescription()))) &&
            ((this.providerFault==null && other.getProviderFault()==null) || 
             (this.providerFault!=null &&
              this.providerFault.equals(other.getProviderFault()))) &&
            ((this.traceData==null && other.getTraceData()==null) || 
             (this.traceData!=null &&
              this.traceData.equals(other.getTraceData())));
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
        if (getStepStatusTime() != null) {
            _hashCode += getStepStatusTime().hashCode();
        }
        if (getProcessStep() != null) {
            _hashCode += getProcessStep().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getStatusDescription() != null) {
            _hashCode += getStatusDescription().hashCode();
        }
        if (getProviderFault() != null) {
            _hashCode += getProviderFault().hashCode();
        }
        if (getTraceData() != null) {
            _hashCode += getTraceData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SDPStatusLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stepStatusTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "stepStatusTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processStep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "processStep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPSeverity"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "statusDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerFault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "providerFault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "traceData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
