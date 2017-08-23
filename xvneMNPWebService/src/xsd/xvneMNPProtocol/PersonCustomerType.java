/**
 * PersonCustomerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package xsd.xvneMNPProtocol;

public class PersonCustomerType  implements java.io.Serializable {
    private java.lang.String ownerName;

    private java.lang.String ownerId;

    private java.math.BigInteger typeOfId;

    private java.util.Date signatureDate;

    public PersonCustomerType() {
    }

    public PersonCustomerType(
           java.lang.String ownerName,
           java.lang.String ownerId,
           java.math.BigInteger typeOfId,
           java.util.Date signatureDate) {
           this.ownerName = ownerName;
           this.ownerId = ownerId;
           this.typeOfId = typeOfId;
           this.signatureDate = signatureDate;
    }


    /**
     * Gets the ownerName value for this PersonCustomerType.
     * 
     * @return ownerName
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this PersonCustomerType.
     * 
     * @param ownerName
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the ownerId value for this PersonCustomerType.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this PersonCustomerType.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the typeOfId value for this PersonCustomerType.
     * 
     * @return typeOfId
     */
    public java.math.BigInteger getTypeOfId() {
        return typeOfId;
    }


    /**
     * Sets the typeOfId value for this PersonCustomerType.
     * 
     * @param typeOfId
     */
    public void setTypeOfId(java.math.BigInteger typeOfId) {
        this.typeOfId = typeOfId;
    }


    /**
     * Gets the signatureDate value for this PersonCustomerType.
     * 
     * @return signatureDate
     */
    public java.util.Date getSignatureDate() {
        return signatureDate;
    }


    /**
     * Sets the signatureDate value for this PersonCustomerType.
     * 
     * @param signatureDate
     */
    public void setSignatureDate(java.util.Date signatureDate) {
        this.signatureDate = signatureDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonCustomerType)) return false;
        PersonCustomerType other = (PersonCustomerType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ownerName==null && other.getOwnerName()==null) || 
             (this.ownerName!=null &&
              this.ownerName.equals(other.getOwnerName()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.typeOfId==null && other.getTypeOfId()==null) || 
             (this.typeOfId!=null &&
              this.typeOfId.equals(other.getTypeOfId()))) &&
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
        if (getOwnerName() != null) {
            _hashCode += getOwnerName().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getTypeOfId() != null) {
            _hashCode += getTypeOfId().hashCode();
        }
        if (getSignatureDate() != null) {
            _hashCode += getSignatureDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonCustomerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "PersonCustomerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerName");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "OwnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">OwnerName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "OwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">OwnerId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfId");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "TypeOfId"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">TypeOfId"));
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
