/**
 * TBRGjaldskraSvar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fjs.secure;

public class TBRGjaldskraSvar  implements java.io.Serializable {
    private is.fjs.secure.SvarHaus svarHaus;

    private is.fjs.secure.Gjald[] gjold;

    public TBRGjaldskraSvar() {
    }

    public TBRGjaldskraSvar(
           is.fjs.secure.SvarHaus svarHaus,
           is.fjs.secure.Gjald[] gjold) {
           this.svarHaus = svarHaus;
           this.gjold = gjold;
    }


    /**
     * Gets the svarHaus value for this TBRGjaldskraSvar.
     * 
     * @return svarHaus
     */
    public is.fjs.secure.SvarHaus getSvarHaus() {
        return svarHaus;
    }


    /**
     * Sets the svarHaus value for this TBRGjaldskraSvar.
     * 
     * @param svarHaus
     */
    public void setSvarHaus(is.fjs.secure.SvarHaus svarHaus) {
        this.svarHaus = svarHaus;
    }


    /**
     * Gets the gjold value for this TBRGjaldskraSvar.
     * 
     * @return gjold
     */
    public is.fjs.secure.Gjald[] getGjold() {
        return gjold;
    }


    /**
     * Sets the gjold value for this TBRGjaldskraSvar.
     * 
     * @param gjold
     */
    public void setGjold(is.fjs.secure.Gjald[] gjold) {
        this.gjold = gjold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TBRGjaldskraSvar)) return false;
        TBRGjaldskraSvar other = (TBRGjaldskraSvar) obj;
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
            ((this.gjold==null && other.getGjold()==null) || 
             (this.gjold!=null &&
              java.util.Arrays.equals(this.gjold, other.getGjold())));
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
        if (getGjold() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGjold());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGjold(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TBRGjaldskraSvar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRGjaldskraSvar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svarHaus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "svarHaus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "SvarHaus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gjold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://secure.fjs.is/", "gjold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://secure.fjs.is/", "Gjald"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://secure.fjs.is/", "Gjald"));
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
