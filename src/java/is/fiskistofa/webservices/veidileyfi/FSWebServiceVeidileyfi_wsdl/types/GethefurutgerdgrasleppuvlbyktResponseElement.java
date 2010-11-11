/**
 * GethefurutgerdgrasleppuvlbyktResponseElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfi_wsdl.types;

public class GethefurutgerdgrasleppuvlbyktResponseElement  implements java.io.Serializable {
    private is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfi_wsdl.types.CheckReplyTypeUser result;

    public GethefurutgerdgrasleppuvlbyktResponseElement() {
    }

    public GethefurutgerdgrasleppuvlbyktResponseElement(
           is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfi_wsdl.types.CheckReplyTypeUser result) {
           this.result = result;
    }


    /**
     * Gets the result value for this GethefurutgerdgrasleppuvlbyktResponseElement.
     * 
     * @return result
     */
    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfi_wsdl.types.CheckReplyTypeUser getResult() {
        return result;
    }


    /**
     * Sets the result value for this GethefurutgerdgrasleppuvlbyktResponseElement.
     * 
     * @param result
     */
    public void setResult(is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfi_wsdl.types.CheckReplyTypeUser result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GethefurutgerdgrasleppuvlbyktResponseElement)) return false;
        GethefurutgerdgrasleppuvlbyktResponseElement other = (GethefurutgerdgrasleppuvlbyktResponseElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GethefurutgerdgrasleppuvlbyktResponseElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurutgerdgrasleppuvlbyktResponseElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "CheckReplyTypeUser"));
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
