/**
 * VeidileyfiTypeUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types;

public class VeidileyfiTypeUser  extends is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VeidileyfiTypeBase  implements java.io.Serializable {
    private java.lang.String tegundLeyfisHeiti;

    private java.lang.String tegundLeyfis;

    private java.util.Calendar IGildi;

    private java.lang.String svaedi;

    private java.lang.String skyring;

    private java.math.BigDecimal skipNr;

    private java.math.BigDecimal graslVlNr;

    private is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VeidileyfagerdTypeUser gerdLeyfis;

    private java.util.Calendar urGildi;

    public VeidileyfiTypeUser() {
    }

    public VeidileyfiTypeUser(
           java.lang.String tegundLeyfisHeiti,
           java.lang.String tegundLeyfis,
           java.util.Calendar IGildi,
           java.lang.String svaedi,
           java.lang.String skyring,
           java.math.BigDecimal skipNr,
           java.math.BigDecimal graslVlNr,
           is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VeidileyfagerdTypeUser gerdLeyfis,
           java.util.Calendar urGildi) {
        this.tegundLeyfisHeiti = tegundLeyfisHeiti;
        this.tegundLeyfis = tegundLeyfis;
        this.IGildi = IGildi;
        this.svaedi = svaedi;
        this.skyring = skyring;
        this.skipNr = skipNr;
        this.graslVlNr = graslVlNr;
        this.gerdLeyfis = gerdLeyfis;
        this.urGildi = urGildi;
    }


    /**
     * Gets the tegundLeyfisHeiti value for this VeidileyfiTypeUser.
     * 
     * @return tegundLeyfisHeiti
     */
    public java.lang.String getTegundLeyfisHeiti() {
        return tegundLeyfisHeiti;
    }


    /**
     * Sets the tegundLeyfisHeiti value for this VeidileyfiTypeUser.
     * 
     * @param tegundLeyfisHeiti
     */
    public void setTegundLeyfisHeiti(java.lang.String tegundLeyfisHeiti) {
        this.tegundLeyfisHeiti = tegundLeyfisHeiti;
    }


    /**
     * Gets the tegundLeyfis value for this VeidileyfiTypeUser.
     * 
     * @return tegundLeyfis
     */
    public java.lang.String getTegundLeyfis() {
        return tegundLeyfis;
    }


    /**
     * Sets the tegundLeyfis value for this VeidileyfiTypeUser.
     * 
     * @param tegundLeyfis
     */
    public void setTegundLeyfis(java.lang.String tegundLeyfis) {
        this.tegundLeyfis = tegundLeyfis;
    }


    /**
     * Gets the IGildi value for this VeidileyfiTypeUser.
     * 
     * @return IGildi
     */
    public java.util.Calendar getIGildi() {
        return IGildi;
    }


    /**
     * Sets the IGildi value for this VeidileyfiTypeUser.
     * 
     * @param IGildi
     */
    public void setIGildi(java.util.Calendar IGildi) {
        this.IGildi = IGildi;
    }


    /**
     * Gets the svaedi value for this VeidileyfiTypeUser.
     * 
     * @return svaedi
     */
    public java.lang.String getSvaedi() {
        return svaedi;
    }


    /**
     * Sets the svaedi value for this VeidileyfiTypeUser.
     * 
     * @param svaedi
     */
    public void setSvaedi(java.lang.String svaedi) {
        this.svaedi = svaedi;
    }


    /**
     * Gets the skyring value for this VeidileyfiTypeUser.
     * 
     * @return skyring
     */
    public java.lang.String getSkyring() {
        return skyring;
    }


    /**
     * Sets the skyring value for this VeidileyfiTypeUser.
     * 
     * @param skyring
     */
    public void setSkyring(java.lang.String skyring) {
        this.skyring = skyring;
    }


    /**
     * Gets the skipNr value for this VeidileyfiTypeUser.
     * 
     * @return skipNr
     */
    public java.math.BigDecimal getSkipNr() {
        return skipNr;
    }


    /**
     * Sets the skipNr value for this VeidileyfiTypeUser.
     * 
     * @param skipNr
     */
    public void setSkipNr(java.math.BigDecimal skipNr) {
        this.skipNr = skipNr;
    }


    /**
     * Gets the graslVlNr value for this VeidileyfiTypeUser.
     * 
     * @return graslVlNr
     */
    public java.math.BigDecimal getGraslVlNr() {
        return graslVlNr;
    }


    /**
     * Sets the graslVlNr value for this VeidileyfiTypeUser.
     * 
     * @param graslVlNr
     */
    public void setGraslVlNr(java.math.BigDecimal graslVlNr) {
        this.graslVlNr = graslVlNr;
    }


    /**
     * Gets the gerdLeyfis value for this VeidileyfiTypeUser.
     * 
     * @return gerdLeyfis
     */
    public is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VeidileyfagerdTypeUser getGerdLeyfis() {
        return gerdLeyfis;
    }


    /**
     * Sets the gerdLeyfis value for this VeidileyfiTypeUser.
     * 
     * @param gerdLeyfis
     */
    public void setGerdLeyfis(is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VeidileyfagerdTypeUser gerdLeyfis) {
        this.gerdLeyfis = gerdLeyfis;
    }


    /**
     * Gets the urGildi value for this VeidileyfiTypeUser.
     * 
     * @return urGildi
     */
    public java.util.Calendar getUrGildi() {
        return urGildi;
    }


    /**
     * Sets the urGildi value for this VeidileyfiTypeUser.
     * 
     * @param urGildi
     */
    public void setUrGildi(java.util.Calendar urGildi) {
        this.urGildi = urGildi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VeidileyfiTypeUser)) return false;
        VeidileyfiTypeUser other = (VeidileyfiTypeUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tegundLeyfisHeiti==null && other.getTegundLeyfisHeiti()==null) || 
             (this.tegundLeyfisHeiti!=null &&
              this.tegundLeyfisHeiti.equals(other.getTegundLeyfisHeiti()))) &&
            ((this.tegundLeyfis==null && other.getTegundLeyfis()==null) || 
             (this.tegundLeyfis!=null &&
              this.tegundLeyfis.equals(other.getTegundLeyfis()))) &&
            ((this.IGildi==null && other.getIGildi()==null) || 
             (this.IGildi!=null &&
              this.IGildi.equals(other.getIGildi()))) &&
            ((this.svaedi==null && other.getSvaedi()==null) || 
             (this.svaedi!=null &&
              this.svaedi.equals(other.getSvaedi()))) &&
            ((this.skyring==null && other.getSkyring()==null) || 
             (this.skyring!=null &&
              this.skyring.equals(other.getSkyring()))) &&
            ((this.skipNr==null && other.getSkipNr()==null) || 
             (this.skipNr!=null &&
              this.skipNr.equals(other.getSkipNr()))) &&
            ((this.graslVlNr==null && other.getGraslVlNr()==null) || 
             (this.graslVlNr!=null &&
              this.graslVlNr.equals(other.getGraslVlNr()))) &&
            ((this.gerdLeyfis==null && other.getGerdLeyfis()==null) || 
             (this.gerdLeyfis!=null &&
              this.gerdLeyfis.equals(other.getGerdLeyfis()))) &&
            ((this.urGildi==null && other.getUrGildi()==null) || 
             (this.urGildi!=null &&
              this.urGildi.equals(other.getUrGildi())));
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
        if (getTegundLeyfisHeiti() != null) {
            _hashCode += getTegundLeyfisHeiti().hashCode();
        }
        if (getTegundLeyfis() != null) {
            _hashCode += getTegundLeyfis().hashCode();
        }
        if (getIGildi() != null) {
            _hashCode += getIGildi().hashCode();
        }
        if (getSvaedi() != null) {
            _hashCode += getSvaedi().hashCode();
        }
        if (getSkyring() != null) {
            _hashCode += getSkyring().hashCode();
        }
        if (getSkipNr() != null) {
            _hashCode += getSkipNr().hashCode();
        }
        if (getGraslVlNr() != null) {
            _hashCode += getGraslVlNr().hashCode();
        }
        if (getGerdLeyfis() != null) {
            _hashCode += getGerdLeyfis().hashCode();
        }
        if (getUrGildi() != null) {
            _hashCode += getUrGildi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VeidileyfiTypeUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "VeidileyfiTypeUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegundLeyfisHeiti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "tegundLeyfisHeiti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegundLeyfis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "tegundLeyfis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGildi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "IGildi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svaedi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "svaedi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skyring");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "skyring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "skipNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graslVlNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "graslVlNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gerdLeyfis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "gerdLeyfis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "VeidileyfagerdTypeUser"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urGildi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "urGildi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
