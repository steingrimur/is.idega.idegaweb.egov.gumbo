/**
 * SvarHaus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fjs.secure;

public class SvarHaus  implements java.io.Serializable {
    private long kodi;

    private java.lang.String skyring;

    private java.lang.String nanariSkyring;

    public SvarHaus() {
    }

    public SvarHaus(
           long kodi,
           java.lang.String skyring,
           java.lang.String nanariSkyring) {
           this.kodi = kodi;
           this.skyring = skyring;
           this.nanariSkyring = nanariSkyring;
    }


    /**
     * Gets the kodi value for this SvarHaus.
     * 
     * @return kodi
     */
    public long getKodi() {
        return kodi;
    }


    /**
     * Sets the kodi value for this SvarHaus.
     * 
     * @param kodi
     */
    public void setKodi(long kodi) {
        this.kodi = kodi;
    }


    /**
     * Gets the skyring value for this SvarHaus.
     * 
     * @return skyring
     */
    public java.lang.String getSkyring() {
        return skyring;
    }


    /**
     * Sets the skyring value for this SvarHaus.
     * 
     * @param skyring
     */
    public void setSkyring(java.lang.String skyring) {
        this.skyring = skyring;
    }


    /**
     * Gets the nanariSkyring value for this SvarHaus.
     * 
     * @return nanariSkyring
     */
    public java.lang.String getNanariSkyring() {
        return nanariSkyring;
    }


    /**
     * Sets the nanariSkyring value for this SvarHaus.
     * 
     * @param nanariSkyring
     */
    public void setNanariSkyring(java.lang.String nanariSkyring) {
        this.nanariSkyring = nanariSkyring;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SvarHaus)) return false;
        SvarHaus other = (SvarHaus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.kodi == other.getKodi() &&
            ((this.skyring==null && other.getSkyring()==null) || 
             (this.skyring!=null &&
              this.skyring.equals(other.getSkyring()))) &&
            ((this.nanariSkyring==null && other.getNanariSkyring()==null) || 
             (this.nanariSkyring!=null &&
              this.nanariSkyring.equals(other.getNanariSkyring())));
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
        _hashCode += new Long(getKodi()).hashCode();
        if (getSkyring() != null) {
            _hashCode += getSkyring().hashCode();
        }
        if (getNanariSkyring() != null) {
            _hashCode += getNanariSkyring().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SvarHaus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "SvarHaus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kodi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Kodi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skyring");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Skyring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nanariSkyring");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "NanariSkyring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
