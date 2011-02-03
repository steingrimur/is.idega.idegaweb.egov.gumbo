/**
 * GetveidileyfagerdElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl;

public class GetveidileyfagerdElement  implements java.io.Serializable {
    private java.lang.String pTegundVeidileyfis;

    private java.lang.String pTimabil;

    public GetveidileyfagerdElement() {
    }

    public GetveidileyfagerdElement(
           java.lang.String pTegundVeidileyfis,
           java.lang.String pTimabil) {
           this.pTegundVeidileyfis = pTegundVeidileyfis;
           this.pTimabil = pTimabil;
    }


    /**
     * Gets the pTegundVeidileyfis value for this GetveidileyfagerdElement.
     * 
     * @return pTegundVeidileyfis
     */
    public java.lang.String getPTegundVeidileyfis() {
        return pTegundVeidileyfis;
    }


    /**
     * Sets the pTegundVeidileyfis value for this GetveidileyfagerdElement.
     * 
     * @param pTegundVeidileyfis
     */
    public void setPTegundVeidileyfis(java.lang.String pTegundVeidileyfis) {
        this.pTegundVeidileyfis = pTegundVeidileyfis;
    }


    /**
     * Gets the pTimabil value for this GetveidileyfagerdElement.
     * 
     * @return pTimabil
     */
    public java.lang.String getPTimabil() {
        return pTimabil;
    }


    /**
     * Sets the pTimabil value for this GetveidileyfagerdElement.
     * 
     * @param pTimabil
     */
    public void setPTimabil(java.lang.String pTimabil) {
        this.pTimabil = pTimabil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetveidileyfagerdElement)) return false;
        GetveidileyfagerdElement other = (GetveidileyfagerdElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pTegundVeidileyfis==null && other.getPTegundVeidileyfis()==null) || 
             (this.pTegundVeidileyfis!=null &&
              this.pTegundVeidileyfis.equals(other.getPTegundVeidileyfis()))) &&
            ((this.pTimabil==null && other.getPTimabil()==null) || 
             (this.pTimabil!=null &&
              this.pTimabil.equals(other.getPTimabil())));
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
        if (getPTegundVeidileyfis() != null) {
            _hashCode += getPTegundVeidileyfis().hashCode();
        }
        if (getPTimabil() != null) {
            _hashCode += getPTimabil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetveidileyfagerdElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getveidileyfagerdElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTegundVeidileyfis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "pTegundVeidileyfis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTimabil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "pTimabil"));
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
