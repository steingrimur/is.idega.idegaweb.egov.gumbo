/**
 * GetdragnotvlcodeforskipElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types;

public class GetdragnotvlcodeforskipElement  implements java.io.Serializable {
    private java.math.BigDecimal pSkipNr;

    public GetdragnotvlcodeforskipElement() {
    }

    public GetdragnotvlcodeforskipElement(
           java.math.BigDecimal pSkipNr) {
           this.pSkipNr = pSkipNr;
    }


    /**
     * Gets the pSkipNr value for this GetdragnotvlcodeforskipElement.
     * 
     * @return pSkipNr
     */
    public java.math.BigDecimal getPSkipNr() {
        return pSkipNr;
    }


    /**
     * Sets the pSkipNr value for this GetdragnotvlcodeforskipElement.
     * 
     * @param pSkipNr
     */
    public void setPSkipNr(java.math.BigDecimal pSkipNr) {
        this.pSkipNr = pSkipNr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetdragnotvlcodeforskipElement)) return false;
        GetdragnotvlcodeforskipElement other = (GetdragnotvlcodeforskipElement) obj;
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
              this.pSkipNr.equals(other.getPSkipNr())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetdragnotvlcodeforskipElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getdragnotvlcodeforskipElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSkipNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "pSkipNr"));
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
