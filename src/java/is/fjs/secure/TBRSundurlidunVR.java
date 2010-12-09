/**
 * TBRSundurlidunVR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fjs.secure;

public class TBRSundurlidunVR  implements java.io.Serializable {
    private java.lang.String gjaldKodi;

    private java.math.BigDecimal einingaverd;

    private java.math.BigDecimal upphaed;

    private java.lang.String tilvisun;

    private java.math.BigDecimal kilo;

    private java.math.BigDecimal thorskIGildi;

    public TBRSundurlidunVR() {
    }

    public TBRSundurlidunVR(
           java.lang.String gjaldKodi,
           java.math.BigDecimal einingaverd,
           java.math.BigDecimal upphaed,
           java.lang.String tilvisun,
           java.math.BigDecimal kilo,
           java.math.BigDecimal thorskIGildi) {
           this.gjaldKodi = gjaldKodi;
           this.einingaverd = einingaverd;
           this.upphaed = upphaed;
           this.tilvisun = tilvisun;
           this.kilo = kilo;
           this.thorskIGildi = thorskIGildi;
    }


    /**
     * Gets the gjaldKodi value for this TBRSundurlidunVR.
     * 
     * @return gjaldKodi
     */
    public java.lang.String getGjaldKodi() {
        return gjaldKodi;
    }


    /**
     * Sets the gjaldKodi value for this TBRSundurlidunVR.
     * 
     * @param gjaldKodi
     */
    public void setGjaldKodi(java.lang.String gjaldKodi) {
        this.gjaldKodi = gjaldKodi;
    }


    /**
     * Gets the einingaverd value for this TBRSundurlidunVR.
     * 
     * @return einingaverd
     */
    public java.math.BigDecimal getEiningaverd() {
        return einingaverd;
    }


    /**
     * Sets the einingaverd value for this TBRSundurlidunVR.
     * 
     * @param einingaverd
     */
    public void setEiningaverd(java.math.BigDecimal einingaverd) {
        this.einingaverd = einingaverd;
    }


    /**
     * Gets the upphaed value for this TBRSundurlidunVR.
     * 
     * @return upphaed
     */
    public java.math.BigDecimal getUpphaed() {
        return upphaed;
    }


    /**
     * Sets the upphaed value for this TBRSundurlidunVR.
     * 
     * @param upphaed
     */
    public void setUpphaed(java.math.BigDecimal upphaed) {
        this.upphaed = upphaed;
    }


    /**
     * Gets the tilvisun value for this TBRSundurlidunVR.
     * 
     * @return tilvisun
     */
    public java.lang.String getTilvisun() {
        return tilvisun;
    }


    /**
     * Sets the tilvisun value for this TBRSundurlidunVR.
     * 
     * @param tilvisun
     */
    public void setTilvisun(java.lang.String tilvisun) {
        this.tilvisun = tilvisun;
    }


    /**
     * Gets the kilo value for this TBRSundurlidunVR.
     * 
     * @return kilo
     */
    public java.math.BigDecimal getKilo() {
        return kilo;
    }


    /**
     * Sets the kilo value for this TBRSundurlidunVR.
     * 
     * @param kilo
     */
    public void setKilo(java.math.BigDecimal kilo) {
        this.kilo = kilo;
    }


    /**
     * Gets the thorskIGildi value for this TBRSundurlidunVR.
     * 
     * @return thorskIGildi
     */
    public java.math.BigDecimal getThorskIGildi() {
        return thorskIGildi;
    }


    /**
     * Sets the thorskIGildi value for this TBRSundurlidunVR.
     * 
     * @param thorskIGildi
     */
    public void setThorskIGildi(java.math.BigDecimal thorskIGildi) {
        this.thorskIGildi = thorskIGildi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TBRSundurlidunVR)) return false;
        TBRSundurlidunVR other = (TBRSundurlidunVR) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gjaldKodi==null && other.getGjaldKodi()==null) || 
             (this.gjaldKodi!=null &&
              this.gjaldKodi.equals(other.getGjaldKodi()))) &&
            ((this.einingaverd==null && other.getEiningaverd()==null) || 
             (this.einingaverd!=null &&
              this.einingaverd.equals(other.getEiningaverd()))) &&
            ((this.upphaed==null && other.getUpphaed()==null) || 
             (this.upphaed!=null &&
              this.upphaed.equals(other.getUpphaed()))) &&
            ((this.tilvisun==null && other.getTilvisun()==null) || 
             (this.tilvisun!=null &&
              this.tilvisun.equals(other.getTilvisun()))) &&
            ((this.kilo==null && other.getKilo()==null) || 
             (this.kilo!=null &&
              this.kilo.equals(other.getKilo()))) &&
            ((this.thorskIGildi==null && other.getThorskIGildi()==null) || 
             (this.thorskIGildi!=null &&
              this.thorskIGildi.equals(other.getThorskIGildi())));
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
        if (getGjaldKodi() != null) {
            _hashCode += getGjaldKodi().hashCode();
        }
        if (getEiningaverd() != null) {
            _hashCode += getEiningaverd().hashCode();
        }
        if (getUpphaed() != null) {
            _hashCode += getUpphaed().hashCode();
        }
        if (getTilvisun() != null) {
            _hashCode += getTilvisun().hashCode();
        }
        if (getKilo() != null) {
            _hashCode += getKilo().hashCode();
        }
        if (getThorskIGildi() != null) {
            _hashCode += getThorskIGildi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TBRSundurlidunVR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRSundurlidunVR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gjaldKodi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "gjaldKodi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("einingaverd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "einingaverd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upphaed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "upphaed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tilvisun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "tilvisun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kilo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "kilo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thorskIGildi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "thorskIGildi"));
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
