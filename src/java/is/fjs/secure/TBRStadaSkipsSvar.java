/**
 * TBRStadaSkipsSvar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fjs.secure;

public class TBRStadaSkipsSvar  implements java.io.Serializable {
    private is.fjs.secure.SvarHaus svarHaus;

    private java.math.BigDecimal skuldVeidileyfis;

    private java.math.BigDecimal skuldVeidigjalds;

    private java.math.BigDecimal skuldMillifaerslnaKvota;

    public TBRStadaSkipsSvar() {
    }

    public TBRStadaSkipsSvar(
           is.fjs.secure.SvarHaus svarHaus,
           java.math.BigDecimal skuldVeidileyfis,
           java.math.BigDecimal skuldVeidigjalds,
           java.math.BigDecimal skuldMillifaerslnaKvota) {
           this.svarHaus = svarHaus;
           this.skuldVeidileyfis = skuldVeidileyfis;
           this.skuldVeidigjalds = skuldVeidigjalds;
           this.skuldMillifaerslnaKvota = skuldMillifaerslnaKvota;
    }


    /**
     * Gets the svarHaus value for this TBRStadaSkipsSvar.
     * 
     * @return svarHaus
     */
    public is.fjs.secure.SvarHaus getSvarHaus() {
        return svarHaus;
    }


    /**
     * Sets the svarHaus value for this TBRStadaSkipsSvar.
     * 
     * @param svarHaus
     */
    public void setSvarHaus(is.fjs.secure.SvarHaus svarHaus) {
        this.svarHaus = svarHaus;
    }


    /**
     * Gets the skuldVeidileyfis value for this TBRStadaSkipsSvar.
     * 
     * @return skuldVeidileyfis
     */
    public java.math.BigDecimal getSkuldVeidileyfis() {
        return skuldVeidileyfis;
    }


    /**
     * Sets the skuldVeidileyfis value for this TBRStadaSkipsSvar.
     * 
     * @param skuldVeidileyfis
     */
    public void setSkuldVeidileyfis(java.math.BigDecimal skuldVeidileyfis) {
        this.skuldVeidileyfis = skuldVeidileyfis;
    }


    /**
     * Gets the skuldVeidigjalds value for this TBRStadaSkipsSvar.
     * 
     * @return skuldVeidigjalds
     */
    public java.math.BigDecimal getSkuldVeidigjalds() {
        return skuldVeidigjalds;
    }


    /**
     * Sets the skuldVeidigjalds value for this TBRStadaSkipsSvar.
     * 
     * @param skuldVeidigjalds
     */
    public void setSkuldVeidigjalds(java.math.BigDecimal skuldVeidigjalds) {
        this.skuldVeidigjalds = skuldVeidigjalds;
    }


    /**
     * Gets the skuldMillifaerslnaKvota value for this TBRStadaSkipsSvar.
     * 
     * @return skuldMillifaerslnaKvota
     */
    public java.math.BigDecimal getSkuldMillifaerslnaKvota() {
        return skuldMillifaerslnaKvota;
    }


    /**
     * Sets the skuldMillifaerslnaKvota value for this TBRStadaSkipsSvar.
     * 
     * @param skuldMillifaerslnaKvota
     */
    public void setSkuldMillifaerslnaKvota(java.math.BigDecimal skuldMillifaerslnaKvota) {
        this.skuldMillifaerslnaKvota = skuldMillifaerslnaKvota;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TBRStadaSkipsSvar)) return false;
        TBRStadaSkipsSvar other = (TBRStadaSkipsSvar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.svarHaus==null && other.getSvarHaus()==null) || 
             (this.svarHaus!=null &&
              this.svarHaus.equals(other.getSvarHaus()))) &&
            ((this.skuldVeidileyfis==null && other.getSkuldVeidileyfis()==null) || 
             (this.skuldVeidileyfis!=null &&
              this.skuldVeidileyfis.equals(other.getSkuldVeidileyfis()))) &&
            ((this.skuldVeidigjalds==null && other.getSkuldVeidigjalds()==null) || 
             (this.skuldVeidigjalds!=null &&
              this.skuldVeidigjalds.equals(other.getSkuldVeidigjalds()))) &&
            ((this.skuldMillifaerslnaKvota==null && other.getSkuldMillifaerslnaKvota()==null) || 
             (this.skuldMillifaerslnaKvota!=null &&
              this.skuldMillifaerslnaKvota.equals(other.getSkuldMillifaerslnaKvota())));
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
        if (getSvarHaus() != null) {
            _hashCode += getSvarHaus().hashCode();
        }
        if (getSkuldVeidileyfis() != null) {
            _hashCode += getSkuldVeidileyfis().hashCode();
        }
        if (getSkuldVeidigjalds() != null) {
            _hashCode += getSkuldVeidigjalds().hashCode();
        }
        if (getSkuldMillifaerslnaKvota() != null) {
            _hashCode += getSkuldMillifaerslnaKvota().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TBRStadaSkipsSvar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStadaSkipsSvar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svarHaus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "svarHaus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "SvarHaus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skuldVeidileyfis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "SkuldVeidileyfis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skuldVeidigjalds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "SkuldVeidigjalds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skuldMillifaerslnaKvota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "SkuldMillifaerslnaKvota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
