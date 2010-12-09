/**
 * TBRStadaSkips.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fjs.secure;

public class TBRStadaSkips  implements java.io.Serializable {
    private is.fjs.secure.Haus haus;

    private java.lang.String skip;

    public TBRStadaSkips() {
    }

    public TBRStadaSkips(
           is.fjs.secure.Haus haus,
           java.lang.String skip) {
           this.haus = haus;
           this.skip = skip;
    }


    /**
     * Gets the haus value for this TBRStadaSkips.
     * 
     * @return haus
     */
    public is.fjs.secure.Haus getHaus() {
        return haus;
    }


    /**
     * Sets the haus value for this TBRStadaSkips.
     * 
     * @param haus
     */
    public void setHaus(is.fjs.secure.Haus haus) {
        this.haus = haus;
    }


    /**
     * Gets the skip value for this TBRStadaSkips.
     * 
     * @return skip
     */
    public java.lang.String getSkip() {
        return skip;
    }


    /**
     * Sets the skip value for this TBRStadaSkips.
     * 
     * @param skip
     */
    public void setSkip(java.lang.String skip) {
        this.skip = skip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TBRStadaSkips)) return false;
        TBRStadaSkips other = (TBRStadaSkips) obj;
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
            ((this.skip==null && other.getSkip()==null) || 
             (this.skip!=null &&
              this.skip.equals(other.getSkip())));
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
        if (getSkip() != null) {
            _hashCode += getSkip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TBRStadaSkips.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStadaSkips"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("haus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "haus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "Haus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Skip"));
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
