/**
 * GetlondunafliElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl;

public class GetlondunafliElement  implements java.io.Serializable {
    private java.math.BigDecimal pHofn;

    private java.math.BigDecimal pKomunr;

    public GetlondunafliElement() {
    }

    public GetlondunafliElement(
           java.math.BigDecimal pHofn,
           java.math.BigDecimal pKomunr) {
           this.pHofn = pHofn;
           this.pKomunr = pKomunr;
    }


    /**
     * Gets the pHofn value for this GetlondunafliElement.
     * 
     * @return pHofn
     */
    public java.math.BigDecimal getPHofn() {
        return pHofn;
    }


    /**
     * Sets the pHofn value for this GetlondunafliElement.
     * 
     * @param pHofn
     */
    public void setPHofn(java.math.BigDecimal pHofn) {
        this.pHofn = pHofn;
    }


    /**
     * Gets the pKomunr value for this GetlondunafliElement.
     * 
     * @return pKomunr
     */
    public java.math.BigDecimal getPKomunr() {
        return pKomunr;
    }


    /**
     * Sets the pKomunr value for this GetlondunafliElement.
     * 
     * @param pKomunr
     */
    public void setPKomunr(java.math.BigDecimal pKomunr) {
        this.pKomunr = pKomunr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetlondunafliElement)) return false;
        GetlondunafliElement other = (GetlondunafliElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pHofn==null && other.getPHofn()==null) || 
             (this.pHofn!=null &&
              this.pHofn.equals(other.getPHofn()))) &&
            ((this.pKomunr==null && other.getPKomunr()==null) || 
             (this.pKomunr!=null &&
              this.pKomunr.equals(other.getPKomunr())));
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
        if (getPHofn() != null) {
            _hashCode += getPHofn().hashCode();
        }
        if (getPKomunr() != null) {
            _hashCode += getPKomunr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetlondunafliElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", ">getlondunafliElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHofn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "pHofn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PKomunr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "pKomunr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
