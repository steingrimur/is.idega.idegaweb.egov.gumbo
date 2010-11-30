/**
 * GetstrandvlcodeforutgerdElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl;

public class GetstrandvlcodeforutgerdElement  implements java.io.Serializable {
    private java.lang.String pUtgerdKt;

    private java.lang.String pTimabil;

    public GetstrandvlcodeforutgerdElement() {
    }

    public GetstrandvlcodeforutgerdElement(
           java.lang.String pUtgerdKt,
           java.lang.String pTimabil) {
           this.pUtgerdKt = pUtgerdKt;
           this.pTimabil = pTimabil;
    }


    /**
     * Gets the pUtgerdKt value for this GetstrandvlcodeforutgerdElement.
     * 
     * @return pUtgerdKt
     */
    public java.lang.String getPUtgerdKt() {
        return pUtgerdKt;
    }


    /**
     * Sets the pUtgerdKt value for this GetstrandvlcodeforutgerdElement.
     * 
     * @param pUtgerdKt
     */
    public void setPUtgerdKt(java.lang.String pUtgerdKt) {
        this.pUtgerdKt = pUtgerdKt;
    }


    /**
     * Gets the pTimabil value for this GetstrandvlcodeforutgerdElement.
     * 
     * @return pTimabil
     */
    public java.lang.String getPTimabil() {
        return pTimabil;
    }


    /**
     * Sets the pTimabil value for this GetstrandvlcodeforutgerdElement.
     * 
     * @param pTimabil
     */
    public void setPTimabil(java.lang.String pTimabil) {
        this.pTimabil = pTimabil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetstrandvlcodeforutgerdElement)) return false;
        GetstrandvlcodeforutgerdElement other = (GetstrandvlcodeforutgerdElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pUtgerdKt==null && other.getPUtgerdKt()==null) || 
             (this.pUtgerdKt!=null &&
              this.pUtgerdKt.equals(other.getPUtgerdKt()))) &&
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
        if (getPUtgerdKt() != null) {
            _hashCode += getPUtgerdKt().hashCode();
        }
        if (getPTimabil() != null) {
            _hashCode += getPTimabil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetstrandvlcodeforutgerdElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getstrandvlcodeforutgerdElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PUtgerdKt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "pUtgerdKt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
