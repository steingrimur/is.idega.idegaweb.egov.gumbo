/**
 * StadfestaElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl;

public class StadfestaElement  implements java.io.Serializable {
    private is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.AflaHeimildSkerdingAlltTypUser pallt;

    private java.lang.String pUsername;

    private java.lang.String pPassword;

    public StadfestaElement() {
    }

    public StadfestaElement(
           is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.AflaHeimildSkerdingAlltTypUser pallt,
           java.lang.String pUsername,
           java.lang.String pPassword) {
           this.pallt = pallt;
           this.pUsername = pUsername;
           this.pPassword = pPassword;
    }


    /**
     * Gets the pallt value for this StadfestaElement.
     * 
     * @return pallt
     */
    public is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.AflaHeimildSkerdingAlltTypUser getPallt() {
        return pallt;
    }


    /**
     * Sets the pallt value for this StadfestaElement.
     * 
     * @param pallt
     */
    public void setPallt(is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.AflaHeimildSkerdingAlltTypUser pallt) {
        this.pallt = pallt;
    }


    /**
     * Gets the pUsername value for this StadfestaElement.
     * 
     * @return pUsername
     */
    public java.lang.String getPUsername() {
        return pUsername;
    }


    /**
     * Sets the pUsername value for this StadfestaElement.
     * 
     * @param pUsername
     */
    public void setPUsername(java.lang.String pUsername) {
        this.pUsername = pUsername;
    }


    /**
     * Gets the pPassword value for this StadfestaElement.
     * 
     * @return pPassword
     */
    public java.lang.String getPPassword() {
        return pPassword;
    }


    /**
     * Sets the pPassword value for this StadfestaElement.
     * 
     * @param pPassword
     */
    public void setPPassword(java.lang.String pPassword) {
        this.pPassword = pPassword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StadfestaElement)) return false;
        StadfestaElement other = (StadfestaElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pallt==null && other.getPallt()==null) || 
             (this.pallt!=null &&
              this.pallt.equals(other.getPallt()))) &&
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
        if (getPallt() != null) {
            _hashCode += getPallt().hashCode();
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
        new org.apache.axis.description.TypeDesc(StadfestaElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/aflaheimildskerding/FSWebserviceAFLAHEIMILDSKERDING.wsdl", ">stadfestaElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pallt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/aflaheimildskerding/FSWebserviceAFLAHEIMILDSKERDING.wsdl", "pallt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/aflaheimildskerding/FSWebserviceAFLAHEIMILDSKERDING.wsdl", "AflaHeimildSkerdingAlltTypUser"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/aflaheimildskerding/FSWebserviceAFLAHEIMILDSKERDING.wsdl", "pUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/aflaheimildskerding/FSWebserviceAFLAHEIMILDSKERDING.wsdl", "pPassword"));
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
