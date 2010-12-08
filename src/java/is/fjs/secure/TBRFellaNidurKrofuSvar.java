/**
 * TBRFellaNidurKrofuSvar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fjs.secure;

public class TBRFellaNidurKrofuSvar  implements java.io.Serializable {
    private is.fjs.secure.SvarHaus svarHaus;

    public TBRFellaNidurKrofuSvar() {
    }

    public TBRFellaNidurKrofuSvar(
           is.fjs.secure.SvarHaus svarHaus) {
           this.svarHaus = svarHaus;
    }


    /**
     * Gets the svarHaus value for this TBRFellaNidurKrofuSvar.
     * 
     * @return svarHaus
     */
    public is.fjs.secure.SvarHaus getSvarHaus() {
        return svarHaus;
    }


    /**
     * Sets the svarHaus value for this TBRFellaNidurKrofuSvar.
     * 
     * @param svarHaus
     */
    public void setSvarHaus(is.fjs.secure.SvarHaus svarHaus) {
        this.svarHaus = svarHaus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TBRFellaNidurKrofuSvar)) return false;
        TBRFellaNidurKrofuSvar other = (TBRFellaNidurKrofuSvar) obj;
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
              this.svarHaus.equals(other.getSvarHaus())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TBRFellaNidurKrofuSvar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRFellaNidurKrofuSvar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svarHaus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "svarHaus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "SvarHaus"));
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
