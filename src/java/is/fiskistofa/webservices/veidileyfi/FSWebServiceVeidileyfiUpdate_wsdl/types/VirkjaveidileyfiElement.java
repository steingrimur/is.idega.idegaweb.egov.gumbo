/**
 * VirkjaveidileyfiElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types;

public class VirkjaveidileyfiElement  implements java.io.Serializable {
    private java.math.BigDecimal pVeidileyfiId;

    public VirkjaveidileyfiElement() {
    }

    public VirkjaveidileyfiElement(
           java.math.BigDecimal pVeidileyfiId) {
           this.pVeidileyfiId = pVeidileyfiId;
    }


    /**
     * Gets the pVeidileyfiId value for this VirkjaveidileyfiElement.
     * 
     * @return pVeidileyfiId
     */
    public java.math.BigDecimal getPVeidileyfiId() {
        return pVeidileyfiId;
    }


    /**
     * Sets the pVeidileyfiId value for this VirkjaveidileyfiElement.
     * 
     * @param pVeidileyfiId
     */
    public void setPVeidileyfiId(java.math.BigDecimal pVeidileyfiId) {
        this.pVeidileyfiId = pVeidileyfiId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirkjaveidileyfiElement)) return false;
        VirkjaveidileyfiElement other = (VirkjaveidileyfiElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pVeidileyfiId==null && other.getPVeidileyfiId()==null) || 
             (this.pVeidileyfiId!=null &&
              this.pVeidileyfiId.equals(other.getPVeidileyfiId())));
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
        if (getPVeidileyfiId() != null) {
            _hashCode += getPVeidileyfiId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirkjaveidileyfiElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">virkjaveidileyfiElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PVeidileyfiId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pVeidileyfiId"));
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