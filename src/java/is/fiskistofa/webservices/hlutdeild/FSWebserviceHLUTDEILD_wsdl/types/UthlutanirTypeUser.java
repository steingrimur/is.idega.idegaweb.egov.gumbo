/**
 * UthlutanirTypeUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types;

public class UthlutanirTypeUser  extends is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.UthlutanirTypeBase  implements java.io.Serializable {
    private java.math.BigDecimal thIgildi;

    private java.math.BigDecimal prosentaAflamarkFra;

    private java.lang.String kvotategundHeiti;

    private is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeUser hlutdeild;

    private java.math.BigDecimal uthlutun;

    private java.lang.String timabil;

    private java.math.BigDecimal skipNr;

    private java.math.BigDecimal prosentaAflamarkTil;

    private java.math.BigDecimal ftegund;

    public UthlutanirTypeUser() {
    }

    public UthlutanirTypeUser(
           java.math.BigDecimal thIgildi,
           java.math.BigDecimal prosentaAflamarkFra,
           java.lang.String kvotategundHeiti,
           is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeUser hlutdeild,
           java.math.BigDecimal uthlutun,
           java.lang.String timabil,
           java.math.BigDecimal skipNr,
           java.math.BigDecimal prosentaAflamarkTil,
           java.math.BigDecimal ftegund) {
        this.thIgildi = thIgildi;
        this.prosentaAflamarkFra = prosentaAflamarkFra;
        this.kvotategundHeiti = kvotategundHeiti;
        this.hlutdeild = hlutdeild;
        this.uthlutun = uthlutun;
        this.timabil = timabil;
        this.skipNr = skipNr;
        this.prosentaAflamarkTil = prosentaAflamarkTil;
        this.ftegund = ftegund;
    }


    /**
     * Gets the thIgildi value for this UthlutanirTypeUser.
     * 
     * @return thIgildi
     */
    public java.math.BigDecimal getThIgildi() {
        return thIgildi;
    }


    /**
     * Sets the thIgildi value for this UthlutanirTypeUser.
     * 
     * @param thIgildi
     */
    public void setThIgildi(java.math.BigDecimal thIgildi) {
        this.thIgildi = thIgildi;
    }


    /**
     * Gets the prosentaAflamarkFra value for this UthlutanirTypeUser.
     * 
     * @return prosentaAflamarkFra
     */
    public java.math.BigDecimal getProsentaAflamarkFra() {
        return prosentaAflamarkFra;
    }


    /**
     * Sets the prosentaAflamarkFra value for this UthlutanirTypeUser.
     * 
     * @param prosentaAflamarkFra
     */
    public void setProsentaAflamarkFra(java.math.BigDecimal prosentaAflamarkFra) {
        this.prosentaAflamarkFra = prosentaAflamarkFra;
    }


    /**
     * Gets the kvotategundHeiti value for this UthlutanirTypeUser.
     * 
     * @return kvotategundHeiti
     */
    public java.lang.String getKvotategundHeiti() {
        return kvotategundHeiti;
    }


    /**
     * Sets the kvotategundHeiti value for this UthlutanirTypeUser.
     * 
     * @param kvotategundHeiti
     */
    public void setKvotategundHeiti(java.lang.String kvotategundHeiti) {
        this.kvotategundHeiti = kvotategundHeiti;
    }


    /**
     * Gets the hlutdeild value for this UthlutanirTypeUser.
     * 
     * @return hlutdeild
     */
    public is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeUser getHlutdeild() {
        return hlutdeild;
    }


    /**
     * Sets the hlutdeild value for this UthlutanirTypeUser.
     * 
     * @param hlutdeild
     */
    public void setHlutdeild(is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeUser hlutdeild) {
        this.hlutdeild = hlutdeild;
    }


    /**
     * Gets the uthlutun value for this UthlutanirTypeUser.
     * 
     * @return uthlutun
     */
    public java.math.BigDecimal getUthlutun() {
        return uthlutun;
    }


    /**
     * Sets the uthlutun value for this UthlutanirTypeUser.
     * 
     * @param uthlutun
     */
    public void setUthlutun(java.math.BigDecimal uthlutun) {
        this.uthlutun = uthlutun;
    }


    /**
     * Gets the timabil value for this UthlutanirTypeUser.
     * 
     * @return timabil
     */
    public java.lang.String getTimabil() {
        return timabil;
    }


    /**
     * Sets the timabil value for this UthlutanirTypeUser.
     * 
     * @param timabil
     */
    public void setTimabil(java.lang.String timabil) {
        this.timabil = timabil;
    }


    /**
     * Gets the skipNr value for this UthlutanirTypeUser.
     * 
     * @return skipNr
     */
    public java.math.BigDecimal getSkipNr() {
        return skipNr;
    }


    /**
     * Sets the skipNr value for this UthlutanirTypeUser.
     * 
     * @param skipNr
     */
    public void setSkipNr(java.math.BigDecimal skipNr) {
        this.skipNr = skipNr;
    }


    /**
     * Gets the prosentaAflamarkTil value for this UthlutanirTypeUser.
     * 
     * @return prosentaAflamarkTil
     */
    public java.math.BigDecimal getProsentaAflamarkTil() {
        return prosentaAflamarkTil;
    }


    /**
     * Sets the prosentaAflamarkTil value for this UthlutanirTypeUser.
     * 
     * @param prosentaAflamarkTil
     */
    public void setProsentaAflamarkTil(java.math.BigDecimal prosentaAflamarkTil) {
        this.prosentaAflamarkTil = prosentaAflamarkTil;
    }


    /**
     * Gets the ftegund value for this UthlutanirTypeUser.
     * 
     * @return ftegund
     */
    public java.math.BigDecimal getFtegund() {
        return ftegund;
    }


    /**
     * Sets the ftegund value for this UthlutanirTypeUser.
     * 
     * @param ftegund
     */
    public void setFtegund(java.math.BigDecimal ftegund) {
        this.ftegund = ftegund;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UthlutanirTypeUser)) return false;
        UthlutanirTypeUser other = (UthlutanirTypeUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.thIgildi==null && other.getThIgildi()==null) || 
             (this.thIgildi!=null &&
              this.thIgildi.equals(other.getThIgildi()))) &&
            ((this.prosentaAflamarkFra==null && other.getProsentaAflamarkFra()==null) || 
             (this.prosentaAflamarkFra!=null &&
              this.prosentaAflamarkFra.equals(other.getProsentaAflamarkFra()))) &&
            ((this.kvotategundHeiti==null && other.getKvotategundHeiti()==null) || 
             (this.kvotategundHeiti!=null &&
              this.kvotategundHeiti.equals(other.getKvotategundHeiti()))) &&
            ((this.hlutdeild==null && other.getHlutdeild()==null) || 
             (this.hlutdeild!=null &&
              this.hlutdeild.equals(other.getHlutdeild()))) &&
            ((this.uthlutun==null && other.getUthlutun()==null) || 
             (this.uthlutun!=null &&
              this.uthlutun.equals(other.getUthlutun()))) &&
            ((this.timabil==null && other.getTimabil()==null) || 
             (this.timabil!=null &&
              this.timabil.equals(other.getTimabil()))) &&
            ((this.skipNr==null && other.getSkipNr()==null) || 
             (this.skipNr!=null &&
              this.skipNr.equals(other.getSkipNr()))) &&
            ((this.prosentaAflamarkTil==null && other.getProsentaAflamarkTil()==null) || 
             (this.prosentaAflamarkTil!=null &&
              this.prosentaAflamarkTil.equals(other.getProsentaAflamarkTil()))) &&
            ((this.ftegund==null && other.getFtegund()==null) || 
             (this.ftegund!=null &&
              this.ftegund.equals(other.getFtegund())));
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
        if (getThIgildi() != null) {
            _hashCode += getThIgildi().hashCode();
        }
        if (getProsentaAflamarkFra() != null) {
            _hashCode += getProsentaAflamarkFra().hashCode();
        }
        if (getKvotategundHeiti() != null) {
            _hashCode += getKvotategundHeiti().hashCode();
        }
        if (getHlutdeild() != null) {
            _hashCode += getHlutdeild().hashCode();
        }
        if (getUthlutun() != null) {
            _hashCode += getUthlutun().hashCode();
        }
        if (getTimabil() != null) {
            _hashCode += getTimabil().hashCode();
        }
        if (getSkipNr() != null) {
            _hashCode += getSkipNr().hashCode();
        }
        if (getProsentaAflamarkTil() != null) {
            _hashCode += getProsentaAflamarkTil().hashCode();
        }
        if (getFtegund() != null) {
            _hashCode += getFtegund().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UthlutanirTypeUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "UthlutanirTypeUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thIgildi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "thIgildi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prosentaAflamarkFra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "prosentaAflamarkFra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kvotategundHeiti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "kvotategundHeiti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hlutdeild");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "hlutdeild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "HlutdeildTypeUser"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uthlutun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "uthlutun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timabil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "timabil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "skipNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prosentaAflamarkTil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "prosentaAflamarkTil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftegund");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "ftegund"));
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
