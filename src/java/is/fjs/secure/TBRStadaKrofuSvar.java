/**
 * TBRStadaKrofuSvar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fjs.secure;

public class TBRStadaKrofuSvar  implements java.io.Serializable {
    private is.fjs.secure.SvarHaus svarHaus;

    private java.lang.String timabil;

    private java.math.BigDecimal alagning;

    private java.math.BigDecimal vextir;

    private java.math.BigDecimal kostnadur;

    private java.math.BigDecimal greidslur;

    private java.math.BigDecimal stada;

    public TBRStadaKrofuSvar() {
    }

    public TBRStadaKrofuSvar(
           is.fjs.secure.SvarHaus svarHaus,
           java.lang.String timabil,
           java.math.BigDecimal alagning,
           java.math.BigDecimal vextir,
           java.math.BigDecimal kostnadur,
           java.math.BigDecimal greidslur,
           java.math.BigDecimal stada) {
           this.svarHaus = svarHaus;
           this.timabil = timabil;
           this.alagning = alagning;
           this.vextir = vextir;
           this.kostnadur = kostnadur;
           this.greidslur = greidslur;
           this.stada = stada;
    }


    /**
     * Gets the svarHaus value for this TBRStadaKrofuSvar.
     * 
     * @return svarHaus
     */
    public is.fjs.secure.SvarHaus getSvarHaus() {
        return svarHaus;
    }


    /**
     * Sets the svarHaus value for this TBRStadaKrofuSvar.
     * 
     * @param svarHaus
     */
    public void setSvarHaus(is.fjs.secure.SvarHaus svarHaus) {
        this.svarHaus = svarHaus;
    }


    /**
     * Gets the timabil value for this TBRStadaKrofuSvar.
     * 
     * @return timabil
     */
    public java.lang.String getTimabil() {
        return timabil;
    }


    /**
     * Sets the timabil value for this TBRStadaKrofuSvar.
     * 
     * @param timabil
     */
    public void setTimabil(java.lang.String timabil) {
        this.timabil = timabil;
    }


    /**
     * Gets the alagning value for this TBRStadaKrofuSvar.
     * 
     * @return alagning
     */
    public java.math.BigDecimal getAlagning() {
        return alagning;
    }


    /**
     * Sets the alagning value for this TBRStadaKrofuSvar.
     * 
     * @param alagning
     */
    public void setAlagning(java.math.BigDecimal alagning) {
        this.alagning = alagning;
    }


    /**
     * Gets the vextir value for this TBRStadaKrofuSvar.
     * 
     * @return vextir
     */
    public java.math.BigDecimal getVextir() {
        return vextir;
    }


    /**
     * Sets the vextir value for this TBRStadaKrofuSvar.
     * 
     * @param vextir
     */
    public void setVextir(java.math.BigDecimal vextir) {
        this.vextir = vextir;
    }


    /**
     * Gets the kostnadur value for this TBRStadaKrofuSvar.
     * 
     * @return kostnadur
     */
    public java.math.BigDecimal getKostnadur() {
        return kostnadur;
    }


    /**
     * Sets the kostnadur value for this TBRStadaKrofuSvar.
     * 
     * @param kostnadur
     */
    public void setKostnadur(java.math.BigDecimal kostnadur) {
        this.kostnadur = kostnadur;
    }


    /**
     * Gets the greidslur value for this TBRStadaKrofuSvar.
     * 
     * @return greidslur
     */
    public java.math.BigDecimal getGreidslur() {
        return greidslur;
    }


    /**
     * Sets the greidslur value for this TBRStadaKrofuSvar.
     * 
     * @param greidslur
     */
    public void setGreidslur(java.math.BigDecimal greidslur) {
        this.greidslur = greidslur;
    }


    /**
     * Gets the stada value for this TBRStadaKrofuSvar.
     * 
     * @return stada
     */
    public java.math.BigDecimal getStada() {
        return stada;
    }


    /**
     * Sets the stada value for this TBRStadaKrofuSvar.
     * 
     * @param stada
     */
    public void setStada(java.math.BigDecimal stada) {
        this.stada = stada;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TBRStadaKrofuSvar)) return false;
        TBRStadaKrofuSvar other = (TBRStadaKrofuSvar) obj;
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
            ((this.timabil==null && other.getTimabil()==null) || 
             (this.timabil!=null &&
              this.timabil.equals(other.getTimabil()))) &&
            ((this.alagning==null && other.getAlagning()==null) || 
             (this.alagning!=null &&
              this.alagning.equals(other.getAlagning()))) &&
            ((this.vextir==null && other.getVextir()==null) || 
             (this.vextir!=null &&
              this.vextir.equals(other.getVextir()))) &&
            ((this.kostnadur==null && other.getKostnadur()==null) || 
             (this.kostnadur!=null &&
              this.kostnadur.equals(other.getKostnadur()))) &&
            ((this.greidslur==null && other.getGreidslur()==null) || 
             (this.greidslur!=null &&
              this.greidslur.equals(other.getGreidslur()))) &&
            ((this.stada==null && other.getStada()==null) || 
             (this.stada!=null &&
              this.stada.equals(other.getStada())));
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
        if (getTimabil() != null) {
            _hashCode += getTimabil().hashCode();
        }
        if (getAlagning() != null) {
            _hashCode += getAlagning().hashCode();
        }
        if (getVextir() != null) {
            _hashCode += getVextir().hashCode();
        }
        if (getKostnadur() != null) {
            _hashCode += getKostnadur().hashCode();
        }
        if (getGreidslur() != null) {
            _hashCode += getGreidslur().hashCode();
        }
        if (getStada() != null) {
            _hashCode += getStada().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TBRStadaKrofuSvar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStadaKrofuSvar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svarHaus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "svarHaus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "SvarHaus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timabil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Timabil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alagning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Alagning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vextir");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Vextir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kostnadur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Kostnadur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("greidslur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Greidslur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Stada"));
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
