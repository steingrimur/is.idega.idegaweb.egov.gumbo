/**
 * CreateveidileyfiWithPasswordElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types;

public class CreateveidileyfiWithPasswordElement  implements java.io.Serializable {
    private java.math.BigDecimal pSkipNr;

    private java.lang.String pVlyfId;

    private java.util.Calendar pIGildi;

    private java.util.Calendar pUrGildi;

    private java.lang.String pSkyring;

    private java.lang.String pUsername;

    private java.lang.String pPassword;

    public CreateveidileyfiWithPasswordElement() {
    }

    public CreateveidileyfiWithPasswordElement(
           java.math.BigDecimal pSkipNr,
           java.lang.String pVlyfId,
           java.util.Calendar pIGildi,
           java.util.Calendar pUrGildi,
           java.lang.String pSkyring,
           java.lang.String pUsername,
           java.lang.String pPassword) {
           this.pSkipNr = pSkipNr;
           this.pVlyfId = pVlyfId;
           this.pIGildi = pIGildi;
           this.pUrGildi = pUrGildi;
           this.pSkyring = pSkyring;
           this.pUsername = pUsername;
           this.pPassword = pPassword;
    }


    /**
     * Gets the pSkipNr value for this CreateveidileyfiWithPasswordElement.
     * 
     * @return pSkipNr
     */
    public java.math.BigDecimal getPSkipNr() {
        return pSkipNr;
    }


    /**
     * Sets the pSkipNr value for this CreateveidileyfiWithPasswordElement.
     * 
     * @param pSkipNr
     */
    public void setPSkipNr(java.math.BigDecimal pSkipNr) {
        this.pSkipNr = pSkipNr;
    }


    /**
     * Gets the pVlyfId value for this CreateveidileyfiWithPasswordElement.
     * 
     * @return pVlyfId
     */
    public java.lang.String getPVlyfId() {
        return pVlyfId;
    }


    /**
     * Sets the pVlyfId value for this CreateveidileyfiWithPasswordElement.
     * 
     * @param pVlyfId
     */
    public void setPVlyfId(java.lang.String pVlyfId) {
        this.pVlyfId = pVlyfId;
    }


    /**
     * Gets the pIGildi value for this CreateveidileyfiWithPasswordElement.
     * 
     * @return pIGildi
     */
    public java.util.Calendar getPIGildi() {
        return pIGildi;
    }


    /**
     * Sets the pIGildi value for this CreateveidileyfiWithPasswordElement.
     * 
     * @param pIGildi
     */
    public void setPIGildi(java.util.Calendar pIGildi) {
        this.pIGildi = pIGildi;
    }


    /**
     * Gets the pUrGildi value for this CreateveidileyfiWithPasswordElement.
     * 
     * @return pUrGildi
     */
    public java.util.Calendar getPUrGildi() {
        return pUrGildi;
    }


    /**
     * Sets the pUrGildi value for this CreateveidileyfiWithPasswordElement.
     * 
     * @param pUrGildi
     */
    public void setPUrGildi(java.util.Calendar pUrGildi) {
        this.pUrGildi = pUrGildi;
    }


    /**
     * Gets the pSkyring value for this CreateveidileyfiWithPasswordElement.
     * 
     * @return pSkyring
     */
    public java.lang.String getPSkyring() {
        return pSkyring;
    }


    /**
     * Sets the pSkyring value for this CreateveidileyfiWithPasswordElement.
     * 
     * @param pSkyring
     */
    public void setPSkyring(java.lang.String pSkyring) {
        this.pSkyring = pSkyring;
    }


    /**
     * Gets the pUsername value for this CreateveidileyfiWithPasswordElement.
     * 
     * @return pUsername
     */
    public java.lang.String getPUsername() {
        return pUsername;
    }


    /**
     * Sets the pUsername value for this CreateveidileyfiWithPasswordElement.
     * 
     * @param pUsername
     */
    public void setPUsername(java.lang.String pUsername) {
        this.pUsername = pUsername;
    }


    /**
     * Gets the pPassword value for this CreateveidileyfiWithPasswordElement.
     * 
     * @return pPassword
     */
    public java.lang.String getPPassword() {
        return pPassword;
    }


    /**
     * Sets the pPassword value for this CreateveidileyfiWithPasswordElement.
     * 
     * @param pPassword
     */
    public void setPPassword(java.lang.String pPassword) {
        this.pPassword = pPassword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateveidileyfiWithPasswordElement)) return false;
        CreateveidileyfiWithPasswordElement other = (CreateveidileyfiWithPasswordElement) obj;
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
            ((this.pVlyfId==null && other.getPVlyfId()==null) || 
             (this.pVlyfId!=null &&
              this.pVlyfId.equals(other.getPVlyfId()))) &&
            ((this.pIGildi==null && other.getPIGildi()==null) || 
             (this.pIGildi!=null &&
              this.pIGildi.equals(other.getPIGildi()))) &&
            ((this.pUrGildi==null && other.getPUrGildi()==null) || 
             (this.pUrGildi!=null &&
              this.pUrGildi.equals(other.getPUrGildi()))) &&
            ((this.pSkyring==null && other.getPSkyring()==null) || 
             (this.pSkyring!=null &&
              this.pSkyring.equals(other.getPSkyring()))) &&
            ((this.pUsername==null && other.getPUsername()==null) || 
             (this.pUsername!=null &&
              this.pUsername.equals(other.getPUsername()))) &&
            ((this.pPassword==null && other.getPPassword()==null) || 
             (this.pPassword!=null &&
              this.pPassword.equals(other.getPPassword())));
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
        if (getPVlyfId() != null) {
            _hashCode += getPVlyfId().hashCode();
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
        if (getPUsername() != null) {
            _hashCode += getPUsername().hashCode();
        }
        if (getPPassword() != null) {
            _hashCode += getPPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateveidileyfiWithPasswordElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">createveidileyfiWithPasswordElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSkipNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pSkipNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PVlyfId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pVlyfId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "pPassword"));
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
