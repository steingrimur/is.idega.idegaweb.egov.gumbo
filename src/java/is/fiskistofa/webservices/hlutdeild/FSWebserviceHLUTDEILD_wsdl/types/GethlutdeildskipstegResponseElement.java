/**
 * GethlutdeildskipstegResponseElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types;

public class GethlutdeildskipstegResponseElement  implements java.io.Serializable {
    private is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeUser result;

    public GethlutdeildskipstegResponseElement() {
    }

    public GethlutdeildskipstegResponseElement(
           is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeUser result) {
           this.result = result;
    }


    /**
     * Gets the result value for this GethlutdeildskipstegResponseElement.
     * 
     * @return result
     */
    public is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeUser getResult() {
        return result;
    }


    /**
     * Sets the result value for this GethlutdeildskipstegResponseElement.
     * 
     * @param result
     */
    public void setResult(is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeUser result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GethlutdeildskipstegResponseElement)) return false;
        GethlutdeildskipstegResponseElement other = (GethlutdeildskipstegResponseElement) obj;
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
        new org.apache.axis.description.TypeDesc(GethlutdeildskipstegResponseElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", ">gethlutdeildskipstegResponseElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/hlutdeild/FSWebserviceHLUTDEILD.wsdl/types/", "HlutdeildTypeUser"));
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