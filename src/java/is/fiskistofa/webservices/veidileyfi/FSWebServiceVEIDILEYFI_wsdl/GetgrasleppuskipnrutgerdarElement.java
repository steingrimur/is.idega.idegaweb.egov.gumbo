/**
 * GetgrasleppuskipnrutgerdarElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl;

public class GetgrasleppuskipnrutgerdarElement  implements java.io.Serializable {
    private java.lang.String pKennitalaUtgerdar;

    public GetgrasleppuskipnrutgerdarElement() {
    }

    public GetgrasleppuskipnrutgerdarElement(
           java.lang.String pKennitalaUtgerdar) {
           this.pKennitalaUtgerdar = pKennitalaUtgerdar;
    }


    /**
     * Gets the pKennitalaUtgerdar value for this GetgrasleppuskipnrutgerdarElement.
     * 
     * @return pKennitalaUtgerdar
     */
    public java.lang.String getPKennitalaUtgerdar() {
        return pKennitalaUtgerdar;
    }


    /**
     * Sets the pKennitalaUtgerdar value for this GetgrasleppuskipnrutgerdarElement.
     * 
     * @param pKennitalaUtgerdar
     */
    public void setPKennitalaUtgerdar(java.lang.String pKennitalaUtgerdar) {
        this.pKennitalaUtgerdar = pKennitalaUtgerdar;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetgrasleppuskipnrutgerdarElement)) return false;
        GetgrasleppuskipnrutgerdarElement other = (GetgrasleppuskipnrutgerdarElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pKennitalaUtgerdar==null && other.getPKennitalaUtgerdar()==null) || 
             (this.pKennitalaUtgerdar!=null &&
              this.pKennitalaUtgerdar.equals(other.getPKennitalaUtgerdar())));
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
        if (getPKennitalaUtgerdar() != null) {
            _hashCode += getPKennitalaUtgerdar().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetgrasleppuskipnrutgerdarElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getgrasleppuskipnrutgerdarElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PKennitalaUtgerdar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "pKennitalaUtgerdar"));
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
