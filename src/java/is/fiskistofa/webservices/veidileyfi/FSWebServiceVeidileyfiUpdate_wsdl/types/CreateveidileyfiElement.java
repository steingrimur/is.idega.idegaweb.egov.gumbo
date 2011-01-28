/**
 * CreateveidileyfiElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types;

public class CreateveidileyfiElement  implements java.io.Serializable {
    private java.math.BigDecimal pSkipNr;

    private java.lang.String pTegundLeyfis;

    private java.lang.String pSvaedi;

    private java.util.Calendar pIGildi;

    private java.util.Calendar pUrGildi;

    private java.lang.String pSkyring;

    public CreateveidileyfiElement() {
    }

    public CreateveidileyfiElement(
           java.math.BigDecimal pSkipNr,
           java.lang.String pTegundLeyfis,
           java.lang.String pSvaedi,
           java.util.Calendar pIGildi,
           java.util.Calendar pUrGildi,
           java.lang.String pSkyring) {
           this.pSkipNr = pSkipNr;
           this.pTegundLeyfis = pTegundLeyfis;
           this.pSvaedi = pSvaedi;
           this.pIGildi = pIGildi;
           this.pUrGildi = pUrGildi;
           this.pSkyring = pSkyring;
    }


    /**
     * Gets the pSkipNr value for this CreateveidileyfiElement.
     * 
     * @return pSkipNr
     */
    public java.math.BigDecimal getPSkipNr() {
        return pSkipNr;
    }


    /**
     * Sets the pSkipNr value for this CreateveidileyfiElement.
     * 
     * @param pSkipNr
     */
    public void setPSkipNr(java.math.BigDecimal pSkipNr) {
        this.pSkipNr = pSkipNr;
    }


    /**
     * Gets the pTegundLeyfis value for this CreateveidileyfiElement.
     * 
     * @return pTegundLeyfis
     */
    public java.lang.String getPTegundLeyfis() {
        return pTegundLeyfis;
    }


    /**
     * Sets the pTegundLeyfis value for this CreateveidileyfiElement.
     * 
     * @param pTegundLeyfis
     */
    public void setPTegundLeyfis(java.lang.String pTegundLeyfis) {
        this.pTegundLeyfis = pTegundLeyfis;
    }


    /**
     * Gets the pSvaedi value for this CreateveidileyfiElement.
     * 
     * @return pSvaedi
     */
    public java.lang.String getPSvaedi() {
        return pSvaedi;
    }


    /**
     * Sets the pSvaedi value for this CreateveidileyfiElement.
     * 
     * @param pSvaedi
     */
    public void setPSvaedi(java.lang.String pSvaedi) {
        this.pSvaedi = pSvaedi;
    }


    /**
     * Gets the pIGildi value for this CreateveidileyfiElement.
     * 
     * @return pIGildi
     */
    public java.util.Calendar getPIGildi() {
        return pIGildi;
    }


    /**
     * Sets the pIGildi value for this CreateveidileyfiElement.
     * 
     * @param pIGildi
     */
    public void setPIGildi(java.util.Calendar pIGildi) {
        this.pIGildi = pIGildi;
    }


    /**
     * Gets the pUrGildi value for this CreateveidileyfiElement.
     * 
     * @return pUrGildi
     */
    public java.util.Calendar getPUrGildi() {
        return pUrGildi;
    }


    /**
     * Sets the pUrGildi value for this CreateveidileyfiElement.
     * 
     * @param pUrGildi
     */
    public void setPUrGildi(java.util.Calendar pUrGildi) {
        this.pUrGildi = pUrGildi;
    }


    /**
     * Gets the pSkyring value for this CreateveidileyfiElement.
     * 
     * @return pSkyring
     */
    public java.lang.String getPSkyring() {
        return pSkyring;
    }


    /**
     * Sets the pSkyring value for this CreateveidileyfiElement.
     * 
     * @param pSkyring
     */
    public void setPSkyring(java.lang.String pSkyring) {
        this.pSkyring = pSkyring;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateveidileyfiElement)) return false;
        CreateveidileyfiElement other = (CreateveidileyfiElement) obj;
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
            ((this.pTegundLeyfis==null && other.getPTegundLeyfis()==null) || 
             (this.pTegundLeyfis!=null &&
              this.pTegundLeyfis.equals(other.getPTegundLeyfis()))) &&
            ((this.pSvaedi==null && other.getPSvaedi()==null) || 
             (this.pSvaedi!=null &&
              this.pSvaedi.equals(other.getPSvaedi()))) &&
            ((this.pIGildi==null && other.getPIGildi()==null) || 
             (this.pIGildi!=null &&
              this.pIGildi.equals(other.getPIGildi()))) &&
            ((this.pUrGildi==null && other.getPUrGildi()==null) || 
             (this.pUrGildi!=null &&
              this.pUrGildi.equals(other.getPUrGildi()))) &&
            ((this.pSkyring==null && other.getPSkyring()==null) || 
             (this.pSkyring!=null &&
              this.pSkyring.equals(other.getPSkyring())));
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
        if (getPTegundLeyfis() != null) {
            _hashCode += getPTegundLeyfis().hashCode();
        }
        if (getPSvaedi() != null) {
            _hashCode += getPSvaedi().hashCode();
        }
        if (getPIGildi() != null) {
            _hashCode += getPIGildi().hashCode();
        }
        if (getPUrGildi() != null) {
            _hashCode += getPUrGildi().hashCode();
        }
        if (getPSkyring() != null) {
            _hashCode += getPSkyring().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateveidileyfiElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">createveidileyfiElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSkipNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pSkipNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTegundLeyfis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pTegundLeyfis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSvaedi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pSvaedi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PIGildi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pIGildi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PUrGildi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pUrGildi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSkyring");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pSkyring"));
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
