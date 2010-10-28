/**
 * GetadilibynrElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.types;

public class GetadilibynrElement  implements java.io.Serializable {
    private java.lang.String pAdilaNr;

    public GetadilibynrElement() {
    }

    public GetadilibynrElement(
           java.lang.String pAdilaNr) {
           this.pAdilaNr = pAdilaNr;
    }


    /**
     * Gets the pAdilaNr value for this GetadilibynrElement.
     * 
     * @return pAdilaNr
     */
    public java.lang.String getPAdilaNr() {
        return pAdilaNr;
    }


    /**
     * Sets the pAdilaNr value for this GetadilibynrElement.
     * 
     * @param pAdilaNr
     */
    public void setPAdilaNr(java.lang.String pAdilaNr) {
        this.pAdilaNr = pAdilaNr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetadilibynrElement)) return false;
        GetadilibynrElement other = (GetadilibynrElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pAdilaNr==null && other.getPAdilaNr()==null) || 
             (this.pAdilaNr!=null &&
              this.pAdilaNr.equals(other.getPAdilaNr())));
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
        if (getPAdilaNr() != null) {
            _hashCode += getPAdilaNr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetadilibynrElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl/types/", ">getadilibynrElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAdilaNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl/types/", "pAdilaNr"));
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
