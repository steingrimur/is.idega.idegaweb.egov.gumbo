/**
 * GetskipekkiflokkurdragnotElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl;

public class GetskipekkiflokkurdragnotElement  implements java.io.Serializable {
    private java.math.BigDecimal pSkipNr;

    private java.lang.String pGildistaka;

    public GetskipekkiflokkurdragnotElement() {
    }

    public GetskipekkiflokkurdragnotElement(
           java.math.BigDecimal pSkipNr,
           java.lang.String pGildistaka) {
           this.pSkipNr = pSkipNr;
           this.pGildistaka = pGildistaka;
    }


    /**
     * Gets the pSkipNr value for this GetskipekkiflokkurdragnotElement.
     * 
     * @return pSkipNr
     */
    public java.math.BigDecimal getPSkipNr() {
        return pSkipNr;
    }


    /**
     * Sets the pSkipNr value for this GetskipekkiflokkurdragnotElement.
     * 
     * @param pSkipNr
     */
    public void setPSkipNr(java.math.BigDecimal pSkipNr) {
        this.pSkipNr = pSkipNr;
    }


    /**
     * Gets the pGildistaka value for this GetskipekkiflokkurdragnotElement.
     * 
     * @return pGildistaka
     */
    public java.lang.String getPGildistaka() {
        return pGildistaka;
    }


    /**
     * Sets the pGildistaka value for this GetskipekkiflokkurdragnotElement.
     * 
     * @param pGildistaka
     */
    public void setPGildistaka(java.lang.String pGildistaka) {
        this.pGildistaka = pGildistaka;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetskipekkiflokkurdragnotElement)) return false;
        GetskipekkiflokkurdragnotElement other = (GetskipekkiflokkurdragnotElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pSkipNr==null && other.getPSkipNr()==null) || 
             (this.pSkipNr!=null &&
              this.pSkipNr.equals(other.getPSkipNr()))) &&
            ((this.pGildistaka==null && other.getPGildistaka()==null) || 
             (this.pGildistaka!=null &&
              this.pGildistaka.equals(other.getPGildistaka())));
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
        if (getPSkipNr() != null) {
            _hashCode += getPSkipNr().hashCode();
        }
        if (getPGildistaka() != null) {
            _hashCode += getPGildistaka().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetskipekkiflokkurdragnotElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getskipekkiflokkurdragnotElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSkipNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "pSkipNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGildistaka");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "pGildistaka"));
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
