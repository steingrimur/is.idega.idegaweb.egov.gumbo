/**
 * GetmillifaerslabytilvisunElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl;

public class GetmillifaerslabytilvisunElement  implements java.io.Serializable {
    private java.math.BigDecimal pTilvisun;

    public GetmillifaerslabytilvisunElement() {
    }

    public GetmillifaerslabytilvisunElement(
           java.math.BigDecimal pTilvisun) {
           this.pTilvisun = pTilvisun;
    }


    /**
     * Gets the pTilvisun value for this GetmillifaerslabytilvisunElement.
     * 
     * @return pTilvisun
     */
    public java.math.BigDecimal getPTilvisun() {
        return pTilvisun;
    }


    /**
     * Sets the pTilvisun value for this GetmillifaerslabytilvisunElement.
     * 
     * @param pTilvisun
     */
    public void setPTilvisun(java.math.BigDecimal pTilvisun) {
        this.pTilvisun = pTilvisun;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetmillifaerslabytilvisunElement)) return false;
        GetmillifaerslabytilvisunElement other = (GetmillifaerslabytilvisunElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pTilvisun==null && other.getPTilvisun()==null) || 
             (this.pTilvisun!=null &&
              this.pTilvisun.equals(other.getPTilvisun())));
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
        if (getPTilvisun() != null) {
            _hashCode += getPTilvisun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetmillifaerslabytilvisunElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslabytilvisunElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTilvisun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "pTilvisun"));
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
