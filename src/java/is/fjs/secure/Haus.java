/**
 * Haus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fjs.secure;

public class Haus  implements java.io.Serializable {
    private java.lang.String notandi;

    private java.lang.String adgangsord;

    private java.lang.String kerfi;

    private java.lang.String radnrSkeytis;

    public Haus() {
    }

    public Haus(
           java.lang.String notandi,
           java.lang.String adgangsord,
           java.lang.String kerfi,
           java.lang.String radnrSkeytis) {
           this.notandi = notandi;
           this.adgangsord = adgangsord;
           this.kerfi = kerfi;
           this.radnrSkeytis = radnrSkeytis;
    }


    /**
     * Gets the notandi value for this Haus.
     * 
     * @return notandi
     */
    public java.lang.String getNotandi() {
        return notandi;
    }


    /**
     * Sets the notandi value for this Haus.
     * 
     * @param notandi
     */
    public void setNotandi(java.lang.String notandi) {
        this.notandi = notandi;
    }


    /**
     * Gets the adgangsord value for this Haus.
     * 
     * @return adgangsord
     */
    public java.lang.String getAdgangsord() {
        return adgangsord;
    }


    /**
     * Sets the adgangsord value for this Haus.
     * 
     * @param adgangsord
     */
    public void setAdgangsord(java.lang.String adgangsord) {
        this.adgangsord = adgangsord;
    }


    /**
     * Gets the kerfi value for this Haus.
     * 
     * @return kerfi
     */
    public java.lang.String getKerfi() {
        return kerfi;
    }


    /**
     * Sets the kerfi value for this Haus.
     * 
     * @param kerfi
     */
    public void setKerfi(java.lang.String kerfi) {
        this.kerfi = kerfi;
    }


    /**
     * Gets the radnrSkeytis value for this Haus.
     * 
     * @return radnrSkeytis
     */
    public java.lang.String getRadnrSkeytis() {
        return radnrSkeytis;
    }


    /**
     * Sets the radnrSkeytis value for this Haus.
     * 
     * @param radnrSkeytis
     */
    public void setRadnrSkeytis(java.lang.String radnrSkeytis) {
        this.radnrSkeytis = radnrSkeytis;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Haus)) return false;
        Haus other = (Haus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notandi==null && other.getNotandi()==null) || 
             (this.notandi!=null &&
              this.notandi.equals(other.getNotandi()))) &&
            ((this.adgangsord==null && other.getAdgangsord()==null) || 
             (this.adgangsord!=null &&
              this.adgangsord.equals(other.getAdgangsord()))) &&
            ((this.kerfi==null && other.getKerfi()==null) || 
             (this.kerfi!=null &&
              this.kerfi.equals(other.getKerfi()))) &&
            ((this.radnrSkeytis==null && other.getRadnrSkeytis()==null) || 
             (this.radnrSkeytis!=null &&
              this.radnrSkeytis.equals(other.getRadnrSkeytis())));
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
        if (getNotandi() != null) {
            _hashCode += getNotandi().hashCode();
        }
        if (getAdgangsord() != null) {
            _hashCode += getAdgangsord().hashCode();
        }
        if (getKerfi() != null) {
            _hashCode += getKerfi().hashCode();
        }
        if (getRadnrSkeytis() != null) {
            _hashCode += getRadnrSkeytis().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Haus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "Haus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notandi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "notandi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adgangsord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "adgangsord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kerfi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "kerfi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radnrSkeytis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "radnrSkeytis"));
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
