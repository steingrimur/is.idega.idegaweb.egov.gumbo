/**
 * GetveidileyfagerdbyidElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl;

public class GetveidileyfagerdbyidElement  implements java.io.Serializable {
    private java.math.BigDecimal pVlyfId;

    public GetveidileyfagerdbyidElement() {
    }

    public GetveidileyfagerdbyidElement(
           java.math.BigDecimal pVlyfId) {
           this.pVlyfId = pVlyfId;
    }


    /**
     * Gets the pVlyfId value for this GetveidileyfagerdbyidElement.
     * 
     * @return pVlyfId
     */
    public java.math.BigDecimal getPVlyfId() {
        return pVlyfId;
    }


    /**
     * Sets the pVlyfId value for this GetveidileyfagerdbyidElement.
     * 
     * @param pVlyfId
     */
    public void setPVlyfId(java.math.BigDecimal pVlyfId) {
        this.pVlyfId = pVlyfId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetveidileyfagerdbyidElement)) return false;
        GetveidileyfagerdbyidElement other = (GetveidileyfagerdbyidElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pVlyfId==null && other.getPVlyfId()==null) || 
             (this.pVlyfId!=null &&
              this.pVlyfId.equals(other.getPVlyfId())));
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
        if (getPVlyfId() != null) {
            _hashCode += getPVlyfId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetveidileyfagerdbyidElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getveidileyfagerdbyidElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PVlyfId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "pVlyfId"));
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
