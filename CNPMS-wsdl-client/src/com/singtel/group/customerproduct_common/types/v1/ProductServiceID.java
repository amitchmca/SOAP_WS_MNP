/**
 * ProductServiceID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.customerproduct_common.types.v1;


/**
 * A ProductSpecification procured by a Customer. A Product models
 * this instance of a ProductSpecification.
 * 
 * Note:  In Amdocs Ordering this serves as both an Assigned Product
 * and an Ordered Product. An Ordered Product has no
 * activation date and has a status indicating that it is ordered.
 * 
 * A Product may be part of a complex structure of Products. The structure
 * is typically based on relationships between
 * ProductSpecifications defined in ProductSpecContainment and ProductSpecRelationship.
 * The structure is instantiated
 * through ProductContainment and ProductRelationship.
 * 
 * A Product is uniquely identified by its Product.ID and Product.version.
 * When information regarding an existing Product
 * is changed a new instance is created with the same Product.ID and
 * different Product.version. If a Product has
 * associated contained Products defined in ProductContainment then when
 * it changes by definition all of the contained
 * Products must have new instances created for them. The history of
 * a product is described by multiple Products with the
 * same Product.ID value.
 * 
 * The permitted status transitions of a Product are defined by the provider
 * of any status update operations.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerproduct/types-unqualified/v1}Product
 * .
 * Derived from PIM entity Product in the domain product.
 */
public class ProductServiceID  implements java.io.Serializable {
    /* The users means to identify a Product. For example a mobile
     * telephone number, an e-mail address, an IP address. Not all
     * Products have users. */
    private java.lang.String serviceID;

    public ProductServiceID() {
    }

    public ProductServiceID(
           java.lang.String serviceID) {
           this.serviceID = serviceID;
    }


    /**
     * Gets the serviceID value for this ProductServiceID.
     * 
     * @return serviceID   * The users means to identify a Product. For example a mobile
     * telephone number, an e-mail address, an IP address. Not all
     * Products have users.
     */
    public java.lang.String getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this ProductServiceID.
     * 
     * @param serviceID   * The users means to identify a Product. For example a mobile
     * telephone number, an e-mail address, an IP address. Not all
     * Products have users.
     */
    public void setServiceID(java.lang.String serviceID) {
        this.serviceID = serviceID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductServiceID)) return false;
        ProductServiceID other = (ProductServiceID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID())));
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
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductServiceID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://group.singtel.com/customerproduct-common/types/v1", "ProductServiceID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://group.singtel.com/customerproduct-common/types/v1", "serviceID"));
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
