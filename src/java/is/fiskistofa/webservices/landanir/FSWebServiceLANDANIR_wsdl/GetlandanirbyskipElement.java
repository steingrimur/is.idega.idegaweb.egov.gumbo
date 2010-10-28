/**
 * GetlandanirbyskipElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl;

public class GetlandanirbyskipElement  implements java.io.Serializable {
    private java.math.BigDecimal pSkipNr;

    private java.util.Calendar pFromDate;

    private java.util.Calendar pToDate;

    public GetlandanirbyskipElement() {
    }

    public GetlandanirbyskipElement(
           java.math.BigDecimal pSkipNr,
           java.util.Calendar pFromDate,
           java.util.Calendar pToDate) {
           this.pSkipNr = pSkipNr;
           this.pFromDate = pFromDate;
           this.pToDate = pToDate;
    }


    /**
     * Gets the pSkipNr value for this GetlandanirbyskipElement.
     * 
     * @return pSkipNr
     */
    public java.math.BigDecimal getPSkipNr() {
        return pSkipNr;
    }


    /**
     * Sets the pSkipNr value for this GetlandanirbyskipElement.
     * 
     * @param pSkipNr
     */
    public void setPSkipNr(java.math.BigDecimal pSkipNr) {
        this.pSkipNr = pSkipNr;
    }


    /**
     * Gets the pFromDate value for this GetlandanirbyskipElement.
     * 
     * @return pFromDate
     */
    public java.util.Calendar getPFromDate() {
        return pFromDate;
    }


    /**
     * Sets the pFromDate value for this GetlandanirbyskipElement.
     * 
     * @param pFromDate
     */
    public void setPFromDate(java.util.Calendar pFromDate) {
        this.pFromDate = pFromDate;
    }


    /**
     * Gets the pToDate value for this GetlandanirbyskipElement.
     * 
     * @return pToDate
     */
    public java.util.Calendar getPToDate() {
        return pToDate;
    }


    /**
     * Sets the pToDate value for this GetlandanirbyskipElement.
     * 
     * @param pToDate
     */
    public void setPToDate(java.util.Calendar pToDate) {
        this.pToDate = pToDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetlandanirbyskipElement)) return false;
        GetlandanirbyskipElement other = (GetlandanirbyskipElement) obj;
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
            ((this.pFromDate==null && other.getPFromDate()==null) || 
             (this.pFromDate!=null &&
              this.pFromDate.equals(other.getPFromDate()))) &&
            ((this.pToDate==null && other.getPToDate()==null) || 
             (this.pToDate!=null &&
              this.pToDate.equals(other.getPToDate())));
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
        if (getPFromDate() != null) {
            _hashCode += getPFromDate().hashCode();
        }
        if (getPToDate() != null) {
            _hashCode += getPToDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetlandanirbyskipElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", ">getlandanirbyskipElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSkipNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "pSkipNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PFromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "pFromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PToDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "pToDate"));
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
