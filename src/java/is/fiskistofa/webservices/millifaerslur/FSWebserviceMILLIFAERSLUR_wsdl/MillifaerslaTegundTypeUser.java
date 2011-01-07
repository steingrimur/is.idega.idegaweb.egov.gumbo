/**
 * MillifaerslaTegundTypeUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl;

public class MillifaerslaTegundTypeUser  extends is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeBase  implements java.io.Serializable {
    private java.lang.String kvotategundHeiti;

    private java.math.BigDecimal kvotategund;

    private java.math.BigDecimal magn;

    public MillifaerslaTegundTypeUser() {
    }

    public MillifaerslaTegundTypeUser(
           java.lang.String kvotategundHeiti,
           java.math.BigDecimal kvotategund,
           java.math.BigDecimal magn) {
        this.kvotategundHeiti = kvotategundHeiti;
        this.kvotategund = kvotategund;
        this.magn = magn;
    }


    /**
     * Gets the kvotategundHeiti value for this MillifaerslaTegundTypeUser.
     * 
     * @return kvotategundHeiti
     */
    public java.lang.String getKvotategundHeiti() {
        return kvotategundHeiti;
    }


    /**
     * Sets the kvotategundHeiti value for this MillifaerslaTegundTypeUser.
     * 
     * @param kvotategundHeiti
     */
    public void setKvotategundHeiti(java.lang.String kvotategundHeiti) {
        this.kvotategundHeiti = kvotategundHeiti;
    }


    /**
     * Gets the kvotategund value for this MillifaerslaTegundTypeUser.
     * 
     * @return kvotategund
     */
    public java.math.BigDecimal getKvotategund() {
        return kvotategund;
    }


    /**
     * Sets the kvotategund value for this MillifaerslaTegundTypeUser.
     * 
     * @param kvotategund
     */
    public void setKvotategund(java.math.BigDecimal kvotategund) {
        this.kvotategund = kvotategund;
    }


    /**
     * Gets the magn value for this MillifaerslaTegundTypeUser.
     * 
     * @return magn
     */
    public java.math.BigDecimal getMagn() {
        return magn;
    }


    /**
     * Sets the magn value for this MillifaerslaTegundTypeUser.
     * 
     * @param magn
     */
    public void setMagn(java.math.BigDecimal magn) {
        this.magn = magn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MillifaerslaTegundTypeUser)) return false;
        MillifaerslaTegundTypeUser other = (MillifaerslaTegundTypeUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.kvotategundHeiti==null && other.getKvotategundHeiti()==null) || 
             (this.kvotategundHeiti!=null &&
              this.kvotategundHeiti.equals(other.getKvotategundHeiti()))) &&
            ((this.kvotategund==null && other.getKvotategund()==null) || 
             (this.kvotategund!=null &&
              this.kvotategund.equals(other.getKvotategund()))) &&
            ((this.magn==null && other.getMagn()==null) || 
             (this.magn!=null &&
              this.magn.equals(other.getMagn())));
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
        if (getKvotategundHeiti() != null) {
            _hashCode += getKvotategundHeiti().hashCode();
        }
        if (getKvotategund() != null) {
            _hashCode += getKvotategund().hashCode();
        }
        if (getMagn() != null) {
            _hashCode += getMagn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MillifaerslaTegundTypeUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "MillifaerslaTegundTypeUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kvotategundHeiti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "kvotategundHeiti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kvotategund");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "kvotategund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("magn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "magn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
