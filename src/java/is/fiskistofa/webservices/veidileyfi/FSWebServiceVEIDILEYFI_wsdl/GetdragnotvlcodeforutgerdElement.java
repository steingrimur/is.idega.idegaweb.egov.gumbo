/**
 * GetdragnotvlcodeforutgerdElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl;

public class GetdragnotvlcodeforutgerdElement  implements java.io.Serializable {
    private java.lang.String pUtgerdKt;

    public GetdragnotvlcodeforutgerdElement() {
    }

    public GetdragnotvlcodeforutgerdElement(
           java.lang.String pUtgerdKt) {
           this.pUtgerdKt = pUtgerdKt;
    }


    /**
     * Gets the pUtgerdKt value for this GetdragnotvlcodeforutgerdElement.
     * 
     * @return pUtgerdKt
     */
    public java.lang.String getPUtgerdKt() {
        return pUtgerdKt;
    }


    /**
     * Sets the pUtgerdKt value for this GetdragnotvlcodeforutgerdElement.
     * 
     * @param pUtgerdKt
     */
    public void setPUtgerdKt(java.lang.String pUtgerdKt) {
        this.pUtgerdKt = pUtgerdKt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetdragnotvlcodeforutgerdElement)) return false;
        GetdragnotvlcodeforutgerdElement other = (GetdragnotvlcodeforutgerdElement) obj;
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
              this.pUtgerdKt.equals(other.getPUtgerdKt())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetdragnotvlcodeforutgerdElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getdragnotvlcodeforutgerdElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PUtgerdKt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "pUtgerdKt"));
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
