/**
 * GethefurutgerdgrasleppuvlbyktElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl;

public class GethefurutgerdgrasleppuvlbyktElement  implements java.io.Serializable {
    private java.lang.String pUtgerdKt;

    private java.util.Calendar pDags;

    public GethefurutgerdgrasleppuvlbyktElement() {
    }

    public GethefurutgerdgrasleppuvlbyktElement(
           java.lang.String pUtgerdKt,
           java.util.Calendar pDags) {
           this.pUtgerdKt = pUtgerdKt;
           this.pDags = pDags;
    }


    /**
     * Gets the pUtgerdKt value for this GethefurutgerdgrasleppuvlbyktElement.
     * 
     * @return pUtgerdKt
     */
    public java.lang.String getPUtgerdKt() {
        return pUtgerdKt;
    }


    /**
     * Sets the pUtgerdKt value for this GethefurutgerdgrasleppuvlbyktElement.
     * 
     * @param pUtgerdKt
     */
    public void setPUtgerdKt(java.lang.String pUtgerdKt) {
        this.pUtgerdKt = pUtgerdKt;
    }


    /**
     * Gets the pDags value for this GethefurutgerdgrasleppuvlbyktElement.
     * 
     * @return pDags
     */
    public java.util.Calendar getPDags() {
        return pDags;
    }


    /**
     * Sets the pDags value for this GethefurutgerdgrasleppuvlbyktElement.
     * 
     * @param pDags
     */
    public void setPDags(java.util.Calendar pDags) {
        this.pDags = pDags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GethefurutgerdgrasleppuvlbyktElement)) return false;
        GethefurutgerdgrasleppuvlbyktElement other = (GethefurutgerdgrasleppuvlbyktElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pUtgerdKt==null && other.getPUtgerdKt()==null) || 
             (this.pUtgerdKt!=null &&
              this.pUtgerdKt.equals(other.getPUtgerdKt()))) &&
            ((this.pDags==null && other.getPDags()==null) || 
             (this.pDags!=null &&
              this.pDags.equals(other.getPDags())));
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
        if (getPUtgerdKt() != null) {
            _hashCode += getPUtgerdKt().hashCode();
        }
        if (getPDags() != null) {
            _hashCode += getPDags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GethefurutgerdgrasleppuvlbyktElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurutgerdgrasleppuvlbyktElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PUtgerdKt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "pUtgerdKt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDags");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "pDags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
