/**
 * QuotaResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting_types.v1;

public class QuotaResult  implements java.io.Serializable {
    private java.util.Calendar quotaDate;

    private com.singtel.group.manageporting_types.v1.PortingDonor donor;

    private java.math.BigInteger quotaAmount1;

    private java.math.BigInteger quotaAmount2;

    private java.math.BigInteger quotaAmount3;

    private java.math.BigInteger activationQuota;

    private java.math.BigInteger maxSNPerPortInReq;

    public QuotaResult() {
    }

    public QuotaResult(
           java.util.Calendar quotaDate,
           com.singtel.group.manageporting_types.v1.PortingDonor donor,
           java.math.BigInteger quotaAmount1,
           java.math.BigInteger quotaAmount2,
           java.math.BigInteger quotaAmount3,
           java.math.BigInteger activationQuota,
           java.math.BigInteger maxSNPerPortInReq) {
           this.quotaDate = quotaDate;
           this.donor = donor;
           this.quotaAmount1 = quotaAmount1;
           this.quotaAmount2 = quotaAmount2;
           this.quotaAmount3 = quotaAmount3;
           this.activationQuota = activationQuota;
           this.maxSNPerPortInReq = maxSNPerPortInReq;
    }


    /**
     * Gets the quotaDate value for this QuotaResult.
     * 
     * @return quotaDate
     */
    public java.util.Calendar getQuotaDate() {
        return quotaDate;
    }


    /**
     * Sets the quotaDate value for this QuotaResult.
     * 
     * @param quotaDate
     */
    public void setQuotaDate(java.util.Calendar quotaDate) {
        this.quotaDate = quotaDate;
    }


    /**
     * Gets the donor value for this QuotaResult.
     * 
     * @return donor
     */
    public com.singtel.group.manageporting_types.v1.PortingDonor getDonor() {
        return donor;
    }


    /**
     * Sets the donor value for this QuotaResult.
     * 
     * @param donor
     */
    public void setDonor(com.singtel.group.manageporting_types.v1.PortingDonor donor) {
        this.donor = donor;
    }


    /**
     * Gets the quotaAmount1 value for this QuotaResult.
     * 
     * @return quotaAmount1
     */
    public java.math.BigInteger getQuotaAmount1() {
        return quotaAmount1;
    }


    /**
     * Sets the quotaAmount1 value for this QuotaResult.
     * 
     * @param quotaAmount1
     */
    public void setQuotaAmount1(java.math.BigInteger quotaAmount1) {
        this.quotaAmount1 = quotaAmount1;
    }


    /**
     * Gets the quotaAmount2 value for this QuotaResult.
     * 
     * @return quotaAmount2
     */
    public java.math.BigInteger getQuotaAmount2() {
        return quotaAmount2;
    }


    /**
     * Sets the quotaAmount2 value for this QuotaResult.
     * 
     * @param quotaAmount2
     */
    public void setQuotaAmount2(java.math.BigInteger quotaAmount2) {
        this.quotaAmount2 = quotaAmount2;
    }


    /**
     * Gets the quotaAmount3 value for this QuotaResult.
     * 
     * @return quotaAmount3
     */
    public java.math.BigInteger getQuotaAmount3() {
        return quotaAmount3;
    }


    /**
     * Sets the quotaAmount3 value for this QuotaResult.
     * 
     * @param quotaAmount3
     */
    public void setQuotaAmount3(java.math.BigInteger quotaAmount3) {
        this.quotaAmount3 = quotaAmount3;
    }


    /**
     * Gets the activationQuota value for this QuotaResult.
     * 
     * @return activationQuota
     */
    public java.math.BigInteger getActivationQuota() {
        return activationQuota;
    }


    /**
     * Sets the activationQuota value for this QuotaResult.
     * 
     * @param activationQuota
     */
    public void setActivationQuota(java.math.BigInteger activationQuota) {
        this.activationQuota = activationQuota;
    }


    /**
     * Gets the maxSNPerPortInReq value for this QuotaResult.
     * 
     * @return maxSNPerPortInReq
     */
    public java.math.BigInteger getMaxSNPerPortInReq() {
        return maxSNPerPortInReq;
    }


    /**
     * Sets the maxSNPerPortInReq value for this QuotaResult.
     * 
     * @param maxSNPerPortInReq
     */
    public void setMaxSNPerPortInReq(java.math.BigInteger maxSNPerPortInReq) {
        this.maxSNPerPortInReq = maxSNPerPortInReq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuotaResult)) return false;
        QuotaResult other = (QuotaResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quotaDate==null && other.getQuotaDate()==null) || 
             (this.quotaDate!=null &&
              this.quotaDate.equals(other.getQuotaDate()))) &&
            ((this.donor==null && other.getDonor()==null) || 
             (this.donor!=null &&
              this.donor.equals(other.getDonor()))) &&
            ((this.quotaAmount1==null && other.getQuotaAmount1()==null) || 
             (this.quotaAmount1!=null &&
              this.quotaAmount1.equals(other.getQuotaAmount1()))) &&
            ((this.quotaAmount2==null && other.getQuotaAmount2()==null) || 
             (this.quotaAmount2!=null &&
              this.quotaAmount2.equals(other.getQuotaAmount2()))) &&
            ((this.quotaAmount3==null && other.getQuotaAmount3()==null) || 
             (this.quotaAmount3!=null &&
              this.quotaAmount3.equals(other.getQuotaAmount3()))) &&
            ((this.activationQuota==null && other.getActivationQuota()==null) || 
             (this.activationQuota!=null &&
              this.activationQuota.equals(other.getActivationQuota()))) &&
            ((this.maxSNPerPortInReq==null && other.getMaxSNPerPortInReq()==null) || 
             (this.maxSNPerPortInReq!=null &&
              this.maxSNPerPortInReq.equals(other.getMaxSNPerPortInReq())));
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
        if (getQuotaDate() != null) {
            _hashCode += getQuotaDate().hashCode();
        }
        if (getDonor() != null) {
            _hashCode += getDonor().hashCode();
        }
        if (getQuotaAmount1() != null) {
            _hashCode += getQuotaAmount1().hashCode();
        }
        if (getQuotaAmount2() != null) {
            _hashCode += getQuotaAmount2().hashCode();
        }
        if (getQuotaAmount3() != null) {
            _hashCode += getQuotaAmount3().hashCode();
        }
        if (getActivationQuota() != null) {
            _hashCode += getActivationQuota().hashCode();
        }
        if (getMaxSNPerPortInReq() != null) {
            _hashCode += getMaxSNPerPortInReq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuotaResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "QuotaResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "quotaDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "donor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDonor"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaAmount1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "quotaAmount1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaAmount2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "quotaAmount2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaAmount3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "quotaAmount3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationQuota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "activationQuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSNPerPortInReq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "maxSNPerPortInReq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
