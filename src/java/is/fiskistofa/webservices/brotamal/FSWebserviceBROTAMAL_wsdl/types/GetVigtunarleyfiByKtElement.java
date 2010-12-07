/**
 * GetVigtunarleyfiByKtElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types;

public class GetVigtunarleyfiByKtElement  implements java.io.Serializable {
    private java.lang.String pKt;

    public GetVigtunarleyfiByKtElement() {
    }

    public GetVigtunarleyfiByKtElement(
           java.lang.String pKt) {
           this.pKt = pKt;
    }


    /**
     * Gets the pKt value for this GetVigtunarleyfiByKtElement.
     * 
     * @return pKt
     */
    public java.lang.String getPKt() {
        return pKt;
    }


    /**
     * Sets the pKt value for this GetVigtunarleyfiByKtElement.
     * 
     * @param pKt
     */
    public void setPKt(java.lang.String pKt) {
        this.pKt = pKt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetVigtunarleyfiByKtElement)) return false;
        GetVigtunarleyfiByKtElement other = (GetVigtunarleyfiByKtElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pKt==null && other.getPKt()==null) || 
             (this.pKt!=null &&
              this.pKt.equals(other.getPKt())));
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
        if (getPKt() != null) {
            _hashCode += getPKt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetVigtunarleyfiByKtElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getVigtunarleyfiByKtElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PKt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "pKt"));
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
