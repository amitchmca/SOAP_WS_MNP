/**
 * CorporateCustomerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package xsd.xvneMNPProtocol;

public class CorporateCustomerType  implements java.io.Serializable {
    private java.lang.String companyName;

    private java.lang.String registrationCode;

    private java.lang.String accountNumber;

    private java.util.Date signatureDate;

    public CorporateCustomerType() {
    }

    public CorporateCustomerType(
           java.lang.String companyName,
           java.lang.String registrationCode,
           java.lang.String accountNumber,
           java.util.Date signatureDate) {
           this.companyName = companyName;
           this.registrationCode = registrationCode;
           this.accountNumber = accountNumber;
           this.signatureDate = signatureDate;
    }


    /**
     * Gets the companyName value for this CorporateCustomerType.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this CorporateCustomerType.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the registrationCode value for this CorporateCustomerType.
     * 
     * @return registrationCode
     */
    public java.lang.String getRegistrationCode() {
        return registrationCode;
    }


    /**
     * Sets the registrationCode value for this CorporateCustomerType.
     * 
     * @param registrationCode
     */
    public void setRegistrationCode(java.lang.String registrationCode) {
        this.registrationCode = registrationCode;
    }


    /**
     * Gets the accountNumber value for this CorporateCustomerType.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this CorporateCustomerType.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the signatureDate value for this CorporateCustomerType.
     * 
     * @return signatureDate
     */
    public java.util.Date getSignatureDate() {
        return signatureDate;
    }


    /**
     * Sets the signatureDate value for this CorporateCustomerType.
     * 
     * @param signatureDate
     */
    public void setSignatureDate(java.util.Date signatureDate) {
        this.signatureDate = signatureDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorporateCustomerType)) return false;
        CorporateCustomerType other = (CorporateCustomerType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.registrationCode==null && other.getRegistrationCode()==null) || 
             (this.registrationCode!=null &&
              this.registrationCode.equals(other.getRegistrationCode()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.signatureDate==null && other.getSignatureDate()==null) || 
             (this.signatureDate!=null &&
              this.signatureDate.equals(other.getSignatureDate())));
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
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getRegistrationCode() != null) {
            _hashCode += getRegistrationCode().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getSignatureDate() != null) {
            _hashCode += getSignatureDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorporateCustomerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "CorporateCustomerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">CompanyName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "RegistrationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">RegistrationCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">AccountNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "SignatureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
