/**
 * VigtunarleyfiTypeUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types;

public class VigtunarleyfiTypeUser  extends is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VigtunarleyfiTypeBase  implements java.io.Serializable {
    private java.lang.String stadur;

    private java.math.BigDecimal hofnNr;

    private java.math.BigDecimal nrLeyfis;

    private java.lang.String heimili;

    private java.lang.String hafnarheiti;

    private java.lang.String kt;

    private java.lang.String gerdLeyfis;

    private java.lang.String heitiLeyfis;

    public VigtunarleyfiTypeUser() {
    }

    public VigtunarleyfiTypeUser(
           java.lang.String stadur,
           java.math.BigDecimal hofnNr,
           java.math.BigDecimal nrLeyfis,
           java.lang.String heimili,
           java.lang.String hafnarheiti,
           java.lang.String kt,
           java.lang.String gerdLeyfis,
           java.lang.String heitiLeyfis) {
        this.stadur = stadur;
        this.hofnNr = hofnNr;
        this.nrLeyfis = nrLeyfis;
        this.heimili = heimili;
        this.hafnarheiti = hafnarheiti;
        this.kt = kt;
        this.gerdLeyfis = gerdLeyfis;
        this.heitiLeyfis = heitiLeyfis;
    }


    /**
     * Gets the stadur value for this VigtunarleyfiTypeUser.
     * 
     * @return stadur
     */
    public java.lang.String getStadur() {
        return stadur;
    }


    /**
     * Sets the stadur value for this VigtunarleyfiTypeUser.
     * 
     * @param stadur
     */
    public void setStadur(java.lang.String stadur) {
        this.stadur = stadur;
    }


    /**
     * Gets the hofnNr value for this VigtunarleyfiTypeUser.
     * 
     * @return hofnNr
     */
    public java.math.BigDecimal getHofnNr() {
        return hofnNr;
    }


    /**
     * Sets the hofnNr value for this VigtunarleyfiTypeUser.
     * 
     * @param hofnNr
     */
    public void setHofnNr(java.math.BigDecimal hofnNr) {
        this.hofnNr = hofnNr;
    }


    /**
     * Gets the nrLeyfis value for this VigtunarleyfiTypeUser.
     * 
     * @return nrLeyfis
     */
    public java.math.BigDecimal getNrLeyfis() {
        return nrLeyfis;
    }


    /**
     * Sets the nrLeyfis value for this VigtunarleyfiTypeUser.
     * 
     * @param nrLeyfis
     */
    public void setNrLeyfis(java.math.BigDecimal nrLeyfis) {
        this.nrLeyfis = nrLeyfis;
    }


    /**
     * Gets the heimili value for this VigtunarleyfiTypeUser.
     * 
     * @return heimili
     */
    public java.lang.String getHeimili() {
        return heimili;
    }


    /**
     * Sets the heimili value for this VigtunarleyfiTypeUser.
     * 
     * @param heimili
     */
    public void setHeimili(java.lang.String heimili) {
        this.heimili = heimili;
    }


    /**
     * Gets the hafnarheiti value for this VigtunarleyfiTypeUser.
     * 
     * @return hafnarheiti
     */
    public java.lang.String getHafnarheiti() {
        return hafnarheiti;
    }


    /**
     * Sets the hafnarheiti value for this VigtunarleyfiTypeUser.
     * 
     * @param hafnarheiti
     */
    public void setHafnarheiti(java.lang.String hafnarheiti) {
        this.hafnarheiti = hafnarheiti;
    }


    /**
     * Gets the kt value for this VigtunarleyfiTypeUser.
     * 
     * @return kt
     */
    public java.lang.String getKt() {
        return kt;
    }


    /**
     * Sets the kt value for this VigtunarleyfiTypeUser.
     * 
     * @param kt
     */
    public void setKt(java.lang.String kt) {
        this.kt = kt;
    }


    /**
     * Gets the gerdLeyfis value for this VigtunarleyfiTypeUser.
     * 
     * @return gerdLeyfis
     */
    public java.lang.String getGerdLeyfis() {
        return gerdLeyfis;
    }


    /**
     * Sets the gerdLeyfis value for this VigtunarleyfiTypeUser.
     * 
     * @param gerdLeyfis
     */
    public void setGerdLeyfis(java.lang.String gerdLeyfis) {
        this.gerdLeyfis = gerdLeyfis;
    }


    /**
     * Gets the heitiLeyfis value for this VigtunarleyfiTypeUser.
     * 
     * @return heitiLeyfis
     */
    public java.lang.String getHeitiLeyfis() {
        return heitiLeyfis;
    }


    /**
     * Sets the heitiLeyfis value for this VigtunarleyfiTypeUser.
     * 
     * @param heitiLeyfis
     */
    public void setHeitiLeyfis(java.lang.String heitiLeyfis) {
        this.heitiLeyfis = heitiLeyfis;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VigtunarleyfiTypeUser)) return false;
        VigtunarleyfiTypeUser other = (VigtunarleyfiTypeUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.stadur==null && other.getStadur()==null) || 
             (this.stadur!=null &&
              this.stadur.equals(other.getStadur()))) &&
            ((this.hofnNr==null && other.getHofnNr()==null) || 
             (this.hofnNr!=null &&
              this.hofnNr.equals(other.getHofnNr()))) &&
            ((this.nrLeyfis==null && other.getNrLeyfis()==null) || 
             (this.nrLeyfis!=null &&
              this.nrLeyfis.equals(other.getNrLeyfis()))) &&
            ((this.heimili==null && other.getHeimili()==null) || 
             (this.heimili!=null &&
              this.heimili.equals(other.getHeimili()))) &&
            ((this.hafnarheiti==null && other.getHafnarheiti()==null) || 
             (this.hafnarheiti!=null &&
              this.hafnarheiti.equals(other.getHafnarheiti()))) &&
            ((this.kt==null && other.getKt()==null) || 
             (this.kt!=null &&
              this.kt.equals(other.getKt()))) &&
            ((this.gerdLeyfis==null && other.getGerdLeyfis()==null) || 
             (this.gerdLeyfis!=null &&
              this.gerdLeyfis.equals(other.getGerdLeyfis()))) &&
            ((this.heitiLeyfis==null && other.getHeitiLeyfis()==null) || 
             (this.heitiLeyfis!=null &&
              this.heitiLeyfis.equals(other.getHeitiLeyfis())));
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
        if (getStadur() != null) {
            _hashCode += getStadur().hashCode();
        }
        if (getHofnNr() != null) {
            _hashCode += getHofnNr().hashCode();
        }
        if (getNrLeyfis() != null) {
            _hashCode += getNrLeyfis().hashCode();
        }
        if (getHeimili() != null) {
            _hashCode += getHeimili().hashCode();
        }
        if (getHafnarheiti() != null) {
            _hashCode += getHafnarheiti().hashCode();
        }
        if (getKt() != null) {
            _hashCode += getKt().hashCode();
        }
        if (getGerdLeyfis() != null) {
            _hashCode += getGerdLeyfis().hashCode();
        }
        if (getHeitiLeyfis() != null) {
            _hashCode += getHeitiLeyfis().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VigtunarleyfiTypeUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "VigtunarleyfiTypeUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stadur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "stadur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hofnNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "hofnNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nrLeyfis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "nrLeyfis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heimili");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "heimili"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hafnarheiti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "hafnarheiti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "kt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gerdLeyfis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "gerdLeyfis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heitiLeyfis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "heitiLeyfis"));
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
