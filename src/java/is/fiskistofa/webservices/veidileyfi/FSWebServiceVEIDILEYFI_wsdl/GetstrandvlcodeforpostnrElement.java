/**
 * GetstrandvlcodeforpostnrElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl;

public class GetstrandvlcodeforpostnrElement  implements java.io.Serializable {
    private java.math.BigDecimal pPostnr;

    private java.lang.String pTimabil;

    public GetstrandvlcodeforpostnrElement() {
    }

    public GetstrandvlcodeforpostnrElement(
           java.math.BigDecimal pPostnr,
           java.lang.String pTimabil) {
           this.pPostnr = pPostnr;
           this.pTimabil = pTimabil;
    }


    /**
     * Gets the pPostnr value for this GetstrandvlcodeforpostnrElement.
     * 
     * @return pPostnr
     */
    public java.math.BigDecimal getPPostnr() {
        return pPostnr;
    }


    /**
     * Sets the pPostnr value for this GetstrandvlcodeforpostnrElement.
     * 
     * @param pPostnr
     */
    public void setPPostnr(java.math.BigDecimal pPostnr) {
        this.pPostnr = pPostnr;
    }


    /**
     * Gets the pTimabil value for this GetstrandvlcodeforpostnrElement.
     * 
     * @return pTimabil
     */
    public java.lang.String getPTimabil() {
        return pTimabil;
    }


    /**
     * Sets the pTimabil value for this GetstrandvlcodeforpostnrElement.
     * 
     * @param pTimabil
     */
    public void setPTimabil(java.lang.String pTimabil) {
        this.pTimabil = pTimabil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetstrandvlcodeforpostnrElement)) return false;
        GetstrandvlcodeforpostnrElement other = (GetstrandvlcodeforpostnrElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pPostnr==null && other.getPPostnr()==null) || 
             (this.pPostnr!=null &&
              this.pPostnr.equals(other.getPPostnr()))) &&
            ((this.pTimabil==null && other.getPTimabil()==null) || 
             (this.pTimabil!=null &&
              this.pTimabil.equals(other.getPTimabil())));
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
        if (getPPostnr() != null) {
            _hashCode += getPPostnr().hashCode();
        }
        if (getPTimabil() != null) {
            _hashCode += getPTimabil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetstrandvlcodeforpostnrElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getstrandvlcodeforpostnrElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPostnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "pPostnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTimabil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "pTimabil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
