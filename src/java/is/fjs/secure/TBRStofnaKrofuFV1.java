/**
 * TBRStofnaKrofuFV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fjs.secure;

public class TBRStofnaKrofuFV1  implements java.io.Serializable {
    private is.fjs.secure.Haus haus;

    private is.fjs.secure.TBRSundurlidunFV1[] sundurlidun;

    private java.lang.String embaetti;

    private java.lang.String ktalaGjaldanda;

    private java.lang.String skyrsluform;

    private java.lang.String gjaldgrunnur;

    private java.lang.String timabil;

    private java.lang.String ktalaStarfsmanns;

    public TBRStofnaKrofuFV1() {
    }

    public TBRStofnaKrofuFV1(
           is.fjs.secure.Haus haus,
           is.fjs.secure.TBRSundurlidunFV1[] sundurlidun,
           java.lang.String embaetti,
           java.lang.String ktalaGjaldanda,
           java.lang.String skyrsluform,
           java.lang.String gjaldgrunnur,
           java.lang.String timabil,
           java.lang.String ktalaStarfsmanns) {
           this.haus = haus;
           this.sundurlidun = sundurlidun;
           this.embaetti = embaetti;
           this.ktalaGjaldanda = ktalaGjaldanda;
           this.skyrsluform = skyrsluform;
           this.gjaldgrunnur = gjaldgrunnur;
           this.timabil = timabil;
           this.ktalaStarfsmanns = ktalaStarfsmanns;
    }


    /**
     * Gets the haus value for this TBRStofnaKrofuFV1.
     * 
     * @return haus
     */
    public is.fjs.secure.Haus getHaus() {
        return haus;
    }


    /**
     * Sets the haus value for this TBRStofnaKrofuFV1.
     * 
     * @param haus
     */
    public void setHaus(is.fjs.secure.Haus haus) {
        this.haus = haus;
    }


    /**
     * Gets the sundurlidun value for this TBRStofnaKrofuFV1.
     * 
     * @return sundurlidun
     */
    public is.fjs.secure.TBRSundurlidunFV1[] getSundurlidun() {
        return sundurlidun;
    }


    /**
     * Sets the sundurlidun value for this TBRStofnaKrofuFV1.
     * 
     * @param sundurlidun
     */
    public void setSundurlidun(is.fjs.secure.TBRSundurlidunFV1[] sundurlidun) {
        this.sundurlidun = sundurlidun;
    }


    /**
     * Gets the embaetti value for this TBRStofnaKrofuFV1.
     * 
     * @return embaetti
     */
    public java.lang.String getEmbaetti() {
        return embaetti;
    }


    /**
     * Sets the embaetti value for this TBRStofnaKrofuFV1.
     * 
     * @param embaetti
     */
    public void setEmbaetti(java.lang.String embaetti) {
        this.embaetti = embaetti;
    }


    /**
     * Gets the ktalaGjaldanda value for this TBRStofnaKrofuFV1.
     * 
     * @return ktalaGjaldanda
     */
    public java.lang.String getKtalaGjaldanda() {
        return ktalaGjaldanda;
    }


    /**
     * Sets the ktalaGjaldanda value for this TBRStofnaKrofuFV1.
     * 
     * @param ktalaGjaldanda
     */
    public void setKtalaGjaldanda(java.lang.String ktalaGjaldanda) {
        this.ktalaGjaldanda = ktalaGjaldanda;
    }


    /**
     * Gets the skyrsluform value for this TBRStofnaKrofuFV1.
     * 
     * @return skyrsluform
     */
    public java.lang.String getSkyrsluform() {
        return skyrsluform;
    }


    /**
     * Sets the skyrsluform value for this TBRStofnaKrofuFV1.
     * 
     * @param skyrsluform
     */
    public void setSkyrsluform(java.lang.String skyrsluform) {
        this.skyrsluform = skyrsluform;
    }


    /**
     * Gets the gjaldgrunnur value for this TBRStofnaKrofuFV1.
     * 
     * @return gjaldgrunnur
     */
    public java.lang.String getGjaldgrunnur() {
        return gjaldgrunnur;
    }


    /**
     * Sets the gjaldgrunnur value for this TBRStofnaKrofuFV1.
     * 
     * @param gjaldgrunnur
     */
    public void setGjaldgrunnur(java.lang.String gjaldgrunnur) {
        this.gjaldgrunnur = gjaldgrunnur;
    }


    /**
     * Gets the timabil value for this TBRStofnaKrofuFV1.
     * 
     * @return timabil
     */
    public java.lang.String getTimabil() {
        return timabil;
    }


    /**
     * Sets the timabil value for this TBRStofnaKrofuFV1.
     * 
     * @param timabil
     */
    public void setTimabil(java.lang.String timabil) {
        this.timabil = timabil;
    }


    /**
     * Gets the ktalaStarfsmanns value for this TBRStofnaKrofuFV1.
     * 
     * @return ktalaStarfsmanns
     */
    public java.lang.String getKtalaStarfsmanns() {
        return ktalaStarfsmanns;
    }


    /**
     * Sets the ktalaStarfsmanns value for this TBRStofnaKrofuFV1.
     * 
     * @param ktalaStarfsmanns
     */
    public void setKtalaStarfsmanns(java.lang.String ktalaStarfsmanns) {
        this.ktalaStarfsmanns = ktalaStarfsmanns;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TBRStofnaKrofuFV1)) return false;
        TBRStofnaKrofuFV1 other = (TBRStofnaKrofuFV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.haus==null && other.getHaus()==null) || 
             (this.haus!=null &&
              this.haus.equals(other.getHaus()))) &&
            ((this.sundurlidun==null && other.getSundurlidun()==null) || 
             (this.sundurlidun!=null &&
              java.util.Arrays.equals(this.sundurlidun, other.getSundurlidun()))) &&
            ((this.embaetti==null && other.getEmbaetti()==null) || 
             (this.embaetti!=null &&
              this.embaetti.equals(other.getEmbaetti()))) &&
            ((this.ktalaGjaldanda==null && other.getKtalaGjaldanda()==null) || 
             (this.ktalaGjaldanda!=null &&
              this.ktalaGjaldanda.equals(other.getKtalaGjaldanda()))) &&
            ((this.skyrsluform==null && other.getSkyrsluform()==null) || 
             (this.skyrsluform!=null &&
              this.skyrsluform.equals(other.getSkyrsluform()))) &&
            ((this.gjaldgrunnur==null && other.getGjaldgrunnur()==null) || 
             (this.gjaldgrunnur!=null &&
              this.gjaldgrunnur.equals(other.getGjaldgrunnur()))) &&
            ((this.timabil==null && other.getTimabil()==null) || 
             (this.timabil!=null &&
              this.timabil.equals(other.getTimabil()))) &&
            ((this.ktalaStarfsmanns==null && other.getKtalaStarfsmanns()==null) || 
             (this.ktalaStarfsmanns!=null &&
              this.ktalaStarfsmanns.equals(other.getKtalaStarfsmanns())));
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
        if (getHaus() != null) {
            _hashCode += getHaus().hashCode();
        }
        if (getSundurlidun() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSundurlidun());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSundurlidun(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmbaetti() != null) {
            _hashCode += getEmbaetti().hashCode();
        }
        if (getKtalaGjaldanda() != null) {
            _hashCode += getKtalaGjaldanda().hashCode();
        }
        if (getSkyrsluform() != null) {
            _hashCode += getSkyrsluform().hashCode();
        }
        if (getGjaldgrunnur() != null) {
            _hashCode += getGjaldgrunnur().hashCode();
        }
        if (getTimabil() != null) {
            _hashCode += getTimabil().hashCode();
        }
        if (getKtalaStarfsmanns() != null) {
            _hashCode += getKtalaStarfsmanns().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TBRStofnaKrofuFV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStofnaKrofuFV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("haus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "haus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "Haus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sundurlidun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "sundurlidun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRSundurlidunFV1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRSundurlidunFV1"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("embaetti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "embaetti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ktalaGjaldanda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "ktalaGjaldanda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skyrsluform");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "skyrsluform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gjaldgrunnur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "gjaldgrunnur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timabil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "timabil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ktalaStarfsmanns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "ktalaStarfsmanns"));
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
