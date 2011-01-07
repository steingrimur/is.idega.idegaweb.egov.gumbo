/**
 * HlutdeildTypeUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types;

public class HlutdeildTypeUser  extends is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeBase  implements java.io.Serializable {
    private java.lang.String kvotategundHeiti;

    private java.math.BigDecimal hlutdeildLok;

    private java.math.BigDecimal hlutdeildUpphaf;

    private java.lang.String timabil;

    private java.math.BigDecimal kvotategund;

    private java.math.BigDecimal skipNr;

    private java.math.BigDecimal hlutdeildBreyting;

    public HlutdeildTypeUser() {
    }

    public HlutdeildTypeUser(
           java.lang.String kvotategundHeiti,
           java.math.BigDecimal hlutdeildLok,
           java.math.BigDecimal hlutdeildUpphaf,
           java.lang.String timabil,
           java.math.BigDecimal kvotategund,
           java.math.BigDecimal skipNr,
           java.math.BigDecimal hlutdeildBreyting) {
        this.kvotategundHeiti = kvotategundHeiti;
        this.hlutdeildLok = hlutdeildLok;
        this.hlutdeildUpphaf = hlutdeildUpphaf;
        this.timabil = timabil;
        this.kvotategund = kvotategund;
        this.skipNr = skipNr;
        this.hlutdeildBreyting = hlutdeildBreyting;
    }


    /**
     * Gets the kvotategundHeiti value for this HlutdeildTypeUser.
     * 
     * @return kvotategundHeiti
     */
    public java.lang.String getKvotategundHeiti() {
        return kvotategundHeiti;
    }


    /**
     * Sets the kvotategundHeiti value for this HlutdeildTypeUser.
     * 
     * @param kvotategundHeiti
     */
    public void setKvotategundHeiti(java.lang.String kvotategundHeiti) {
        this.kvotategundHeiti = kvotategundHeiti;
    }


    /**
     * Gets the hlutdeildLok value for this HlutdeildTypeUser.
     * 
     * @return hlutdeildLok
     */
    public java.math.BigDecimal getHlutdeildLok() {
        return hlutdeildLok;
    }


    /**
     * Sets the hlutdeildLok value for this HlutdeildTypeUser.
     * 
     * @param hlutdeildLok
     */
    public void setHlutdeildLok(java.math.BigDecimal hlutdeildLok) {
        this.hlutdeildLok = hlutdeildLok;
    }


    /**
     * Gets the hlutdeildUpphaf value for this HlutdeildTypeUser.
     * 
     * @return hlutdeildUpphaf
     */
    public java.math.BigDecimal getHlutdeildUpphaf() {
        return hlutdeildUpphaf;
    }


    /**
     * Sets the hlutdeildUpphaf value for this HlutdeildTypeUser.
     * 
     * @param hlutdeildUpphaf
     */
    public void setHlutdeildUpphaf(java.math.BigDecimal hlutdeildUpphaf) {
        this.hlutdeildUpphaf = hlutdeildUpphaf;
    }


    /**
     * Gets the timabil value for this HlutdeildTypeUser.
     * 
     * @return timabil
     */
    public java.lang.String getTimabil() {
        return timabil;
    }


    /**
     * Sets the timabil value for this HlutdeildTypeUser.
     * 
     * @param timabil
     */
    public void setTimabil(java.lang.String timabil) {
        this.timabil = timabil;
    }


    /**
     * Gets the kvotategund value for this HlutdeildTypeUser.
     * 
     * @return kvotategund
     */
    public java.math.BigDecimal getKvotategund() {
        return kvotategund;
    }


    /**
     * Sets the kvotategund value for this HlutdeildTypeUser.
     * 
     * @param kvotategund
     */
    public void setKvotategund(java.math.BigDecimal kvotategund) {
        this.kvotategund = kvotategund;
    }


    /**
     * Gets the skipNr value for this HlutdeildTypeUser.
     * 
     * @return skipNr
     */
    public java.math.BigDecimal getSkipNr() {
        return skipNr;
    }


    /**
     * Sets the skipNr value for this HlutdeildTypeUser.
     * 
     * @param skipNr
     */
    public void setSkipNr(java.math.BigDecimal skipNr) {
        this.skipNr = skipNr;
    }


    /**
     * Gets the hlutdeildBreyting value for this HlutdeildTypeUser.
     * 
     * @return hlutdeildBreyting
     */
    public java.math.BigDecimal getHlutdeildBreyting() {
        return hlutdeildBreyting;
    }


    /**
     * Sets the hlutdeildBreyting value for this HlutdeildTypeUser.
     * 
     * @param hlutdeildBreyting
     */
    public void setHlutdeildBreyting(java.math.BigDecimal hlutdeildBreyting) {
        this.hlutdeildBreyting = hlutdeildBreyting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HlutdeildTypeUser)) return false;
        HlutdeildTypeUser other = (HlutdeildTypeUser) obj;
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
            ((this.hlutdeildLok==null && other.getHlutdeildLok()==null) || 
             (this.hlutdeildLok!=null &&
              this.hlutdeildLok.equals(other.getHlutdeildLok()))) &&
            ((this.hlutdeildUpphaf==null && other.getHlutdeildUpphaf()==null) || 
             (this.hlutdeildUpphaf!=null &&
              this.hlutdeildUpphaf.equals(other.getHlutdeildUpphaf()))) &&
            ((this.timabil==null && other.getTimabil()==null) || 
             (this.timabil!=null &&
              this.timabil.equals(other.getTimabil()))) &&
            ((this.kvotategund==null && other.getKvotategund()==null) || 
             (this.kvotategund!=null &&
              this.kvotategund.equals(other.getKvotategund()))) &&
            ((this.skipNr==null && other.getSkipNr()==null) || 
             (this.skipNr!=null &&
              this.skipNr.equals(other.getSkipNr()))) &&
            ((this.hlutdeildBreyting==null && other.getHlutdeildBreyting()==null) || 
             (this.hlutdeildBreyting!=null &&
              this.hlutdeildBreyting.equals(other.getHlutdeildBreyting())));
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
        if (getHlutdeildLok() != null) {
            _hashCode += getHlutdeildLok().hashCode();
        }
        if (getHlutdeildUpphaf() != null) {
            _hashCode += getHlutdeildUpphaf().hashCode();
        }
        if (getTimabil() != null) {
            _hashCode += getTimabil().hashCode();
        }
        if (getKvotategund() != null) {
            _hashCode += getKvotategund().hashCode();
        }
        if (getSkipNr() != null) {
            _hashCode += getSkipNr().hashCode();
        }
        if (getHlutdeildBreyting() != null) {
            _hashCode += getHlutdeildBreyting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HlutdeildTypeUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "HlutdeildTypeUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kvotategundHeiti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "kvotategundHeiti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hlutdeildLok");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "hlutdeildLok"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hlutdeildUpphaf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "hlutdeildUpphaf"));
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
        elemField.setFieldName("kvotategund");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "kvotategund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "skipNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hlutdeildBreyting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "hlutdeildBreyting"));
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
