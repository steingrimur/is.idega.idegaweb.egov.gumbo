/**
 * TBRStofnaKrofuSvar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fjs.secure;

public class TBRStofnaKrofuSvar  implements java.io.Serializable {
    private is.fjs.secure.SvarHaus svarHaus;

    private java.lang.String lykill;

    public TBRStofnaKrofuSvar() {
    }

    public TBRStofnaKrofuSvar(
           is.fjs.secure.SvarHaus svarHaus,
           java.lang.String lykill) {
           this.svarHaus = svarHaus;
           this.lykill = lykill;
    }


    /**
     * Gets the svarHaus value for this TBRStofnaKrofuSvar.
     * 
     * @return svarHaus
     */
    public is.fjs.secure.SvarHaus getSvarHaus() {
        return svarHaus;
    }


    /**
     * Sets the svarHaus value for this TBRStofnaKrofuSvar.
     * 
     * @param svarHaus
     */
    public void setSvarHaus(is.fjs.secure.SvarHaus svarHaus) {
        this.svarHaus = svarHaus;
    }


    /**
     * Gets the lykill value for this TBRStofnaKrofuSvar.
     * 
     * @return lykill
     */
    public java.lang.String getLykill() {
        return lykill;
    }


    /**
     * Sets the lykill value for this TBRStofnaKrofuSvar.
     * 
     * @param lykill
     */
    public void setLykill(java.lang.String lykill) {
        this.lykill = lykill;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TBRStofnaKrofuSvar)) return false;
        TBRStofnaKrofuSvar other = (TBRStofnaKrofuSvar) obj;
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
            ((this.lykill==null && other.getLykill()==null) || 
             (this.lykill!=null &&
              this.lykill.equals(other.getLykill())));
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
        if (getLykill() != null) {
            _hashCode += getLykill().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TBRStofnaKrofuSvar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStofnaKrofuSvar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svarHaus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "svarHaus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "SvarHaus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lykill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "lykill"));
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
