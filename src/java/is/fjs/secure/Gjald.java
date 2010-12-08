/**
 * Gjald.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fjs.secure;

public class Gjald  implements java.io.Serializable {
    private java.lang.String skyrsluform;

    private java.lang.String gjaldkodi;

    private java.math.BigDecimal upphaed;

    private java.lang.String texti;

    public Gjald() {
    }

    public Gjald(
           java.lang.String skyrsluform,
           java.lang.String gjaldkodi,
           java.math.BigDecimal upphaed,
           java.lang.String texti) {
           this.skyrsluform = skyrsluform;
           this.gjaldkodi = gjaldkodi;
           this.upphaed = upphaed;
           this.texti = texti;
    }


    /**
     * Gets the skyrsluform value for this Gjald.
     * 
     * @return skyrsluform
     */
    public java.lang.String getSkyrsluform() {
        return skyrsluform;
    }


    /**
     * Sets the skyrsluform value for this Gjald.
     * 
     * @param skyrsluform
     */
    public void setSkyrsluform(java.lang.String skyrsluform) {
        this.skyrsluform = skyrsluform;
    }


    /**
     * Gets the gjaldkodi value for this Gjald.
     * 
     * @return gjaldkodi
     */
    public java.lang.String getGjaldkodi() {
        return gjaldkodi;
    }


    /**
     * Sets the gjaldkodi value for this Gjald.
     * 
     * @param gjaldkodi
     */
    public void setGjaldkodi(java.lang.String gjaldkodi) {
        this.gjaldkodi = gjaldkodi;
    }


    /**
     * Gets the upphaed value for this Gjald.
     * 
     * @return upphaed
     */
    public java.math.BigDecimal getUpphaed() {
        return upphaed;
    }


    /**
     * Sets the upphaed value for this Gjald.
     * 
     * @param upphaed
     */
    public void setUpphaed(java.math.BigDecimal upphaed) {
        this.upphaed = upphaed;
    }


    /**
     * Gets the texti value for this Gjald.
     * 
     * @return texti
     */
    public java.lang.String getTexti() {
        return texti;
    }


    /**
     * Sets the texti value for this Gjald.
     * 
     * @param texti
     */
    public void setTexti(java.lang.String texti) {
        this.texti = texti;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gjald)) return false;
        Gjald other = (Gjald) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.skyrsluform==null && other.getSkyrsluform()==null) || 
             (this.skyrsluform!=null &&
              this.skyrsluform.equals(other.getSkyrsluform()))) &&
            ((this.gjaldkodi==null && other.getGjaldkodi()==null) || 
             (this.gjaldkodi!=null &&
              this.gjaldkodi.equals(other.getGjaldkodi()))) &&
            ((this.upphaed==null && other.getUpphaed()==null) || 
             (this.upphaed!=null &&
              this.upphaed.equals(other.getUpphaed()))) &&
            ((this.texti==null && other.getTexti()==null) || 
             (this.texti!=null &&
              this.texti.equals(other.getTexti())));
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
        if (getSkyrsluform() != null) {
            _hashCode += getSkyrsluform().hashCode();
        }
        if (getGjaldkodi() != null) {
            _hashCode += getGjaldkodi().hashCode();
        }
        if (getUpphaed() != null) {
            _hashCode += getUpphaed().hashCode();
        }
        if (getTexti() != null) {
            _hashCode += getTexti().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gjald.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "Gjald"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skyrsluform");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Skyrsluform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gjaldkodi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Gjaldkodi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upphaed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Upphaed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("texti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Texti"));
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
