/**
 * GetskipnrbyeigandiElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl;

public class GetskipnrbyeigandiElement  implements java.io.Serializable {
    private java.lang.String pKennitalaEiganda;

    public GetskipnrbyeigandiElement() {
    }

    public GetskipnrbyeigandiElement(
           java.lang.String pKennitalaEiganda) {
           this.pKennitalaEiganda = pKennitalaEiganda;
    }


    /**
     * Gets the pKennitalaEiganda value for this GetskipnrbyeigandiElement.
     * 
     * @return pKennitalaEiganda
     */
    public java.lang.String getPKennitalaEiganda() {
        return pKennitalaEiganda;
    }


    /**
     * Sets the pKennitalaEiganda value for this GetskipnrbyeigandiElement.
     * 
     * @param pKennitalaEiganda
     */
    public void setPKennitalaEiganda(java.lang.String pKennitalaEiganda) {
        this.pKennitalaEiganda = pKennitalaEiganda;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetskipnrbyeigandiElement)) return false;
        GetskipnrbyeigandiElement other = (GetskipnrbyeigandiElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pKennitalaEiganda==null && other.getPKennitalaEiganda()==null) || 
             (this.pKennitalaEiganda!=null &&
              this.pKennitalaEiganda.equals(other.getPKennitalaEiganda())));
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
        if (getPKennitalaEiganda() != null) {
            _hashCode += getPKennitalaEiganda().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetskipnrbyeigandiElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipnrbyeigandiElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PKennitalaEiganda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "pKennitalaEiganda"));
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
