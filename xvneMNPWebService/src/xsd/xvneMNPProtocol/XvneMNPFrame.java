/**
 * XvneMNPFrame.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package xsd.xvneMNPProtocol;

public class XvneMNPFrame  implements java.io.Serializable {
    private xsd.xvneMNPProtocol.NPOType[] NPO;

    private xsd.xvneMNPProtocol.SDType[] SD;

    private xsd.xvneMNPProtocol.CANType[] CAN;

    private xsd.xvneMNPProtocol.NPOTType[] NPOT;

    private java.lang.String version;  // attribute

    public XvneMNPFrame() {
    }

    public XvneMNPFrame(
           xsd.xvneMNPProtocol.NPOType[] NPO,
           xsd.xvneMNPProtocol.SDType[] SD,
           xsd.xvneMNPProtocol.CANType[] CAN,
           xsd.xvneMNPProtocol.NPOTType[] NPOT,
           java.lang.String version) {
           this.NPO = NPO;
           this.SD = SD;
           this.CAN = CAN;
           this.NPOT = NPOT;
           this.version = version;
    }


    /**
     * Gets the NPO value for this XvneMNPFrame.
     * 
     * @return NPO
     */
    public xsd.xvneMNPProtocol.NPOType[] getNPO() {
        return NPO;
    }


    /**
     * Sets the NPO value for this XvneMNPFrame.
     * 
     * @param NPO
     */
    public void setNPO(xsd.xvneMNPProtocol.NPOType[] NPO) {
        this.NPO = NPO;
    }

    public xsd.xvneMNPProtocol.NPOType getNPO(int i) {
        return this.NPO[i];
    }

    public void setNPO(int i, xsd.xvneMNPProtocol.NPOType _value) {
        this.NPO[i] = _value;
    }


    /**
     * Gets the SD value for this XvneMNPFrame.
     * 
     * @return SD
     */
    public xsd.xvneMNPProtocol.SDType[] getSD() {
        return SD;
    }


    /**
     * Sets the SD value for this XvneMNPFrame.
     * 
     * @param SD
     */
    public void setSD(xsd.xvneMNPProtocol.SDType[] SD) {
        this.SD = SD;
    }

    public xsd.xvneMNPProtocol.SDType getSD(int i) {
        return this.SD[i];
    }

    public void setSD(int i, xsd.xvneMNPProtocol.SDType _value) {
        this.SD[i] = _value;
    }


    /**
     * Gets the CAN value for this XvneMNPFrame.
     * 
     * @return CAN
     */
    public xsd.xvneMNPProtocol.CANType[] getCAN() {
        return CAN;
    }


    /**
     * Sets the CAN value for this XvneMNPFrame.
     * 
     * @param CAN
     */
    public void setCAN(xsd.xvneMNPProtocol.CANType[] CAN) {
        this.CAN = CAN;
    }

    public xsd.xvneMNPProtocol.CANType getCAN(int i) {
        return this.CAN[i];
    }

    public void setCAN(int i, xsd.xvneMNPProtocol.CANType _value) {
        this.CAN[i] = _value;
    }


    /**
     * Gets the NPOT value for this XvneMNPFrame.
     * 
     * @return NPOT
     */
    public xsd.xvneMNPProtocol.NPOTType[] getNPOT() {
        return NPOT;
    }


    /**
     * Sets the NPOT value for this XvneMNPFrame.
     * 
     * @param NPOT
     */
    public void setNPOT(xsd.xvneMNPProtocol.NPOTType[] NPOT) {
        this.NPOT = NPOT;
    }

    public xsd.xvneMNPProtocol.NPOTType getNPOT(int i) {
        return this.NPOT[i];
    }

    public void setNPOT(int i, xsd.xvneMNPProtocol.NPOTType _value) {
        this.NPOT[i] = _value;
    }


    /**
     * Gets the version value for this XvneMNPFrame.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this XvneMNPFrame.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XvneMNPFrame)) return false;
        XvneMNPFrame other = (XvneMNPFrame) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NPO==null && other.getNPO()==null) || 
             (this.NPO!=null &&
              java.util.Arrays.equals(this.NPO, other.getNPO()))) &&
            ((this.SD==null && other.getSD()==null) || 
             (this.SD!=null &&
              java.util.Arrays.equals(this.SD, other.getSD()))) &&
            ((this.CAN==null && other.getCAN()==null) || 
             (this.CAN!=null &&
              java.util.Arrays.equals(this.CAN, other.getCAN()))) &&
            ((this.NPOT==null && other.getNPOT()==null) || 
             (this.NPOT!=null &&
              java.util.Arrays.equals(this.NPOT, other.getNPOT()))) &&
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
        if (getNPO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNPO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNPO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSD() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSD());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSD(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCAN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCAN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCAN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNPOT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNPOT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNPOT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XvneMNPFrame.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">xvneMNPFrame"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NPO");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "NPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "NPOType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SD");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "SD"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "SDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAN");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "CAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "CANType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NPOT");
        elemField.setXmlName(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "NPOT"));
        elemField.setXmlType(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "NPOTType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
