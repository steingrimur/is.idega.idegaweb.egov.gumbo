/**
 * LondunTypeUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl;

public class LondunTypeUser  extends is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeBase  implements java.io.Serializable {
    private java.math.BigDecimal veidarfaeri;

    private java.lang.String LDagsChar;

    private java.lang.String timabil;

    private is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunAfliTypeUser[] londunAfliTable;

    private java.lang.String hafnarHeiti;

    private java.math.BigDecimal skipNr;

    private java.math.BigDecimal komunr;

    private java.math.BigDecimal hofn;

    private java.lang.String veidarfaeriHeiti;

    private java.util.Calendar LDags;

    public LondunTypeUser() {
    }

    public LondunTypeUser(
           java.math.BigDecimal veidarfaeri,
           java.lang.String LDagsChar,
           java.lang.String timabil,
           is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunAfliTypeUser[] londunAfliTable,
           java.lang.String hafnarHeiti,
           java.math.BigDecimal skipNr,
           java.math.BigDecimal komunr,
           java.math.BigDecimal hofn,
           java.lang.String veidarfaeriHeiti,
           java.util.Calendar LDags) {
        this.veidarfaeri = veidarfaeri;
        this.LDagsChar = LDagsChar;
        this.timabil = timabil;
        this.londunAfliTable = londunAfliTable;
        this.hafnarHeiti = hafnarHeiti;
        this.skipNr = skipNr;
        this.komunr = komunr;
        this.hofn = hofn;
        this.veidarfaeriHeiti = veidarfaeriHeiti;
        this.LDags = LDags;
    }


    /**
     * Gets the veidarfaeri value for this LondunTypeUser.
     * 
     * @return veidarfaeri
     */
    public java.math.BigDecimal getVeidarfaeri() {
        return veidarfaeri;
    }


    /**
     * Sets the veidarfaeri value for this LondunTypeUser.
     * 
     * @param veidarfaeri
     */
    public void setVeidarfaeri(java.math.BigDecimal veidarfaeri) {
        this.veidarfaeri = veidarfaeri;
    }


    /**
     * Gets the LDagsChar value for this LondunTypeUser.
     * 
     * @return LDagsChar
     */
    public java.lang.String getLDagsChar() {
        return LDagsChar;
    }


    /**
     * Sets the LDagsChar value for this LondunTypeUser.
     * 
     * @param LDagsChar
     */
    public void setLDagsChar(java.lang.String LDagsChar) {
        this.LDagsChar = LDagsChar;
    }


    /**
     * Gets the timabil value for this LondunTypeUser.
     * 
     * @return timabil
     */
    public java.lang.String getTimabil() {
        return timabil;
    }


    /**
     * Sets the timabil value for this LondunTypeUser.
     * 
     * @param timabil
     */
    public void setTimabil(java.lang.String timabil) {
        this.timabil = timabil;
    }


    /**
     * Gets the londunAfliTable value for this LondunTypeUser.
     * 
     * @return londunAfliTable
     */
    public is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunAfliTypeUser[] getLondunAfliTable() {
        return londunAfliTable;
    }


    /**
     * Sets the londunAfliTable value for this LondunTypeUser.
     * 
     * @param londunAfliTable
     */
    public void setLondunAfliTable(is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunAfliTypeUser[] londunAfliTable) {
        this.londunAfliTable = londunAfliTable;
    }


    /**
     * Gets the hafnarHeiti value for this LondunTypeUser.
     * 
     * @return hafnarHeiti
     */
    public java.lang.String getHafnarHeiti() {
        return hafnarHeiti;
    }


    /**
     * Sets the hafnarHeiti value for this LondunTypeUser.
     * 
     * @param hafnarHeiti
     */
    public void setHafnarHeiti(java.lang.String hafnarHeiti) {
        this.hafnarHeiti = hafnarHeiti;
    }


    /**
     * Gets the skipNr value for this LondunTypeUser.
     * 
     * @return skipNr
     */
    public java.math.BigDecimal getSkipNr() {
        return skipNr;
    }


    /**
     * Sets the skipNr value for this LondunTypeUser.
     * 
     * @param skipNr
     */
    public void setSkipNr(java.math.BigDecimal skipNr) {
        this.skipNr = skipNr;
    }


    /**
     * Gets the komunr value for this LondunTypeUser.
     * 
     * @return komunr
     */
    public java.math.BigDecimal getKomunr() {
        return komunr;
    }


    /**
     * Sets the komunr value for this LondunTypeUser.
     * 
     * @param komunr
     */
    public void setKomunr(java.math.BigDecimal komunr) {
        this.komunr = komunr;
    }


    /**
     * Gets the hofn value for this LondunTypeUser.
     * 
     * @return hofn
     */
    public java.math.BigDecimal getHofn() {
        return hofn;
    }


    /**
     * Sets the hofn value for this LondunTypeUser.
     * 
     * @param hofn
     */
    public void setHofn(java.math.BigDecimal hofn) {
        this.hofn = hofn;
    }


    /**
     * Gets the veidarfaeriHeiti value for this LondunTypeUser.
     * 
     * @return veidarfaeriHeiti
     */
    public java.lang.String getVeidarfaeriHeiti() {
        return veidarfaeriHeiti;
    }


    /**
     * Sets the veidarfaeriHeiti value for this LondunTypeUser.
     * 
     * @param veidarfaeriHeiti
     */
    public void setVeidarfaeriHeiti(java.lang.String veidarfaeriHeiti) {
        this.veidarfaeriHeiti = veidarfaeriHeiti;
    }


    /**
     * Gets the LDags value for this LondunTypeUser.
     * 
     * @return LDags
     */
    public java.util.Calendar getLDags() {
        return LDags;
    }


    /**
     * Sets the LDags value for this LondunTypeUser.
     * 
     * @param LDags
     */
    public void setLDags(java.util.Calendar LDags) {
        this.LDags = LDags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LondunTypeUser)) return false;
        LondunTypeUser other = (LondunTypeUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.veidarfaeri==null && other.getVeidarfaeri()==null) || 
             (this.veidarfaeri!=null &&
              this.veidarfaeri.equals(other.getVeidarfaeri()))) &&
            ((this.LDagsChar==null && other.getLDagsChar()==null) || 
             (this.LDagsChar!=null &&
              this.LDagsChar.equals(other.getLDagsChar()))) &&
            ((this.timabil==null && other.getTimabil()==null) || 
             (this.timabil!=null &&
              this.timabil.equals(other.getTimabil()))) &&
            ((this.londunAfliTable==null && other.getLondunAfliTable()==null) || 
             (this.londunAfliTable!=null &&
              java.util.Arrays.equals(this.londunAfliTable, other.getLondunAfliTable()))) &&
            ((this.hafnarHeiti==null && other.getHafnarHeiti()==null) || 
             (this.hafnarHeiti!=null &&
              this.hafnarHeiti.equals(other.getHafnarHeiti()))) &&
            ((this.skipNr==null && other.getSkipNr()==null) || 
             (this.skipNr!=null &&
              this.skipNr.equals(other.getSkipNr()))) &&
            ((this.komunr==null && other.getKomunr()==null) || 
             (this.komunr!=null &&
              this.komunr.equals(other.getKomunr()))) &&
            ((this.hofn==null && other.getHofn()==null) || 
             (this.hofn!=null &&
              this.hofn.equals(other.getHofn()))) &&
            ((this.veidarfaeriHeiti==null && other.getVeidarfaeriHeiti()==null) || 
             (this.veidarfaeriHeiti!=null &&
              this.veidarfaeriHeiti.equals(other.getVeidarfaeriHeiti()))) &&
            ((this.LDags==null && other.getLDags()==null) || 
             (this.LDags!=null &&
              this.LDags.equals(other.getLDags())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getVeidarfaeri() != null) {
            _hashCode += getVeidarfaeri().hashCode();
        }
        if (getLDagsChar() != null) {
            _hashCode += getLDagsChar().hashCode();
        }
        if (getTimabil() != null) {
            _hashCode += getTimabil().hashCode();
        }
        if (getLondunAfliTable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLondunAfliTable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLondunAfliTable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHafnarHeiti() != null) {
            _hashCode += getHafnarHeiti().hashCode();
        }
        if (getSkipNr() != null) {
            _hashCode += getSkipNr().hashCode();
        }
        if (getKomunr() != null) {
            _hashCode += getKomunr().hashCode();
        }
        if (getHofn() != null) {
            _hashCode += getHofn().hashCode();
        }
        if (getVeidarfaeriHeiti() != null) {
            _hashCode += getVeidarfaeriHeiti().hashCode();
        }
        if (getLDags() != null) {
            _hashCode += getLDags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LondunTypeUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "LondunTypeUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("veidarfaeri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "veidarfaeri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LDagsChar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "LDagsChar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timabil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "timabil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("londunAfliTable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "londunAfliTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "LondunAfliTypeUser"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "array"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hafnarHeiti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "hafnarHeiti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "skipNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("komunr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "komunr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hofn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "hofn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("veidarfaeriHeiti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "veidarfaeriHeiti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LDags");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "LDags"));
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
