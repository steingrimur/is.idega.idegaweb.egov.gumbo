/**
 * EydaOgilduVeidileyfiElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types;

public class EydaOgilduVeidileyfiElement  implements java.io.Serializable {
    private java.math.BigDecimal pVeidileyfiId;

    private java.lang.String pUsername;

    private java.lang.String pPassword;

    public EydaOgilduVeidileyfiElement() {
    }

    public EydaOgilduVeidileyfiElement(
           java.math.BigDecimal pVeidileyfiId,
           java.lang.String pUsername,
           java.lang.String pPassword) {
           this.pVeidileyfiId = pVeidileyfiId;
           this.pUsername = pUsername;
           this.pPassword = pPassword;
    }


    /**
     * Gets the pVeidileyfiId value for this EydaOgilduVeidileyfiElement.
     * 
     * @return pVeidileyfiId
     */
    public java.math.BigDecimal getPVeidileyfiId() {
        return pVeidileyfiId;
    }


    /**
     * Sets the pVeidileyfiId value for this EydaOgilduVeidileyfiElement.
     * 
     * @param pVeidileyfiId
     */
    public void setPVeidileyfiId(java.math.BigDecimal pVeidileyfiId) {
        this.pVeidileyfiId = pVeidileyfiId;
    }


    /**
     * Gets the pUsername value for this EydaOgilduVeidileyfiElement.
     * 
     * @return pUsername
     */
    public java.lang.String getPUsername() {
        return pUsername;
    }


    /**
     * Sets the pUsername value for this EydaOgilduVeidileyfiElement.
     * 
     * @param pUsername
     */
    public void setPUsername(java.lang.String pUsername) {
        this.pUsername = pUsername;
    }


    /**
     * Gets the pPassword value for this EydaOgilduVeidileyfiElement.
     * 
     * @return pPassword
     */
    public java.lang.String getPPassword() {
        return pPassword;
    }


    /**
     * Sets the pPassword value for this EydaOgilduVeidileyfiElement.
     * 
     * @param pPassword
     */
    public void setPPassword(java.lang.String pPassword) {
        this.pPassword = pPassword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EydaOgilduVeidileyfiElement)) return false;
        EydaOgilduVeidileyfiElement other = (EydaOgilduVeidileyfiElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pVeidileyfiId==null && other.getPVeidileyfiId()==null) || 
             (this.pVeidileyfiId!=null &&
              this.pVeidileyfiId.equals(other.getPVeidileyfiId()))) &&
            ((this.pUsername==null && other.getPUsername()==null) || 
             (this.pUsername!=null &&
              this.pUsername.equals(other.getPUsername()))) &&
            ((this.pPassword==null && other.getPPassword()==null) || 
             (this.pPassword!=null &&
              this.pPassword.equals(other.getPPassword())));
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
        if (getPVeidileyfiId() != null) {
            _hashCode += getPVeidileyfiId().hashCode();
        }
        if (getPUsername() != null) {
            _hashCode += getPUsername().hashCode();
        }
        if (getPPassword() != null) {
            _hashCode += getPPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EydaOgilduVeidileyfiElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">eydaOgilduVeidileyfiElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PVeidileyfiId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pVeidileyfiId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
