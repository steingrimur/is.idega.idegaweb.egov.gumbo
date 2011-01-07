/**
 * MillifaerslaTypeUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl;

public class MillifaerslaTypeUser  extends is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeBase  implements java.io.Serializable {
    private java.math.BigDecimal tilvisun;

    private java.lang.String heimild;

    private java.lang.String annadSkipHeiti;

    private java.util.Calendar IGildi;

    private is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeUser[] tegundir;

    private java.math.BigDecimal fraSkip;

    private java.lang.String timabil;

    private java.math.BigDecimal annadSkipNr;

    private java.math.BigDecimal tilSkip;

    private java.math.BigDecimal skipNr;

    public MillifaerslaTypeUser() {
    }

    public MillifaerslaTypeUser(
           java.math.BigDecimal tilvisun,
           java.lang.String heimild,
           java.lang.String annadSkipHeiti,
           java.util.Calendar IGildi,
           is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeUser[] tegundir,
           java.math.BigDecimal fraSkip,
           java.lang.String timabil,
           java.math.BigDecimal annadSkipNr,
           java.math.BigDecimal tilSkip,
           java.math.BigDecimal skipNr) {
        this.tilvisun = tilvisun;
        this.heimild = heimild;
        this.annadSkipHeiti = annadSkipHeiti;
        this.IGildi = IGildi;
        this.tegundir = tegundir;
        this.fraSkip = fraSkip;
        this.timabil = timabil;
        this.annadSkipNr = annadSkipNr;
        this.tilSkip = tilSkip;
        this.skipNr = skipNr;
    }


    /**
     * Gets the tilvisun value for this MillifaerslaTypeUser.
     * 
     * @return tilvisun
     */
    public java.math.BigDecimal getTilvisun() {
        return tilvisun;
    }


    /**
     * Sets the tilvisun value for this MillifaerslaTypeUser.
     * 
     * @param tilvisun
     */
    public void setTilvisun(java.math.BigDecimal tilvisun) {
        this.tilvisun = tilvisun;
    }


    /**
     * Gets the heimild value for this MillifaerslaTypeUser.
     * 
     * @return heimild
     */
    public java.lang.String getHeimild() {
        return heimild;
    }


    /**
     * Sets the heimild value for this MillifaerslaTypeUser.
     * 
     * @param heimild
     */
    public void setHeimild(java.lang.String heimild) {
        this.heimild = heimild;
    }


    /**
     * Gets the annadSkipHeiti value for this MillifaerslaTypeUser.
     * 
     * @return annadSkipHeiti
     */
    public java.lang.String getAnnadSkipHeiti() {
        return annadSkipHeiti;
    }


    /**
     * Sets the annadSkipHeiti value for this MillifaerslaTypeUser.
     * 
     * @param annadSkipHeiti
     */
    public void setAnnadSkipHeiti(java.lang.String annadSkipHeiti) {
        this.annadSkipHeiti = annadSkipHeiti;
    }


    /**
     * Gets the IGildi value for this MillifaerslaTypeUser.
     * 
     * @return IGildi
     */
    public java.util.Calendar getIGildi() {
        return IGildi;
    }


    /**
     * Sets the IGildi value for this MillifaerslaTypeUser.
     * 
     * @param IGildi
     */
    public void setIGildi(java.util.Calendar IGildi) {
        this.IGildi = IGildi;
    }


    /**
     * Gets the tegundir value for this MillifaerslaTypeUser.
     * 
     * @return tegundir
     */
    public is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeUser[] getTegundir() {
        return tegundir;
    }


    /**
     * Sets the tegundir value for this MillifaerslaTypeUser.
     * 
     * @param tegundir
     */
    public void setTegundir(is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeUser[] tegundir) {
        this.tegundir = tegundir;
    }


    /**
     * Gets the fraSkip value for this MillifaerslaTypeUser.
     * 
     * @return fraSkip
     */
    public java.math.BigDecimal getFraSkip() {
        return fraSkip;
    }


    /**
     * Sets the fraSkip value for this MillifaerslaTypeUser.
     * 
     * @param fraSkip
     */
    public void setFraSkip(java.math.BigDecimal fraSkip) {
        this.fraSkip = fraSkip;
    }


    /**
     * Gets the timabil value for this MillifaerslaTypeUser.
     * 
     * @return timabil
     */
    public java.lang.String getTimabil() {
        return timabil;
    }


    /**
     * Sets the timabil value for this MillifaerslaTypeUser.
     * 
     * @param timabil
     */
    public void setTimabil(java.lang.String timabil) {
        this.timabil = timabil;
    }


    /**
     * Gets the annadSkipNr value for this MillifaerslaTypeUser.
     * 
     * @return annadSkipNr
     */
    public java.math.BigDecimal getAnnadSkipNr() {
        return annadSkipNr;
    }


    /**
     * Sets the annadSkipNr value for this MillifaerslaTypeUser.
     * 
     * @param annadSkipNr
     */
    public void setAnnadSkipNr(java.math.BigDecimal annadSkipNr) {
        this.annadSkipNr = annadSkipNr;
    }


    /**
     * Gets the tilSkip value for this MillifaerslaTypeUser.
     * 
     * @return tilSkip
     */
    public java.math.BigDecimal getTilSkip() {
        return tilSkip;
    }


    /**
     * Sets the tilSkip value for this MillifaerslaTypeUser.
     * 
     * @param tilSkip
     */
    public void setTilSkip(java.math.BigDecimal tilSkip) {
        this.tilSkip = tilSkip;
    }


    /**
     * Gets the skipNr value for this MillifaerslaTypeUser.
     * 
     * @return skipNr
     */
    public java.math.BigDecimal getSkipNr() {
        return skipNr;
    }


    /**
     * Sets the skipNr value for this MillifaerslaTypeUser.
     * 
     * @param skipNr
     */
    public void setSkipNr(java.math.BigDecimal skipNr) {
        this.skipNr = skipNr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MillifaerslaTypeUser)) return false;
        MillifaerslaTypeUser other = (MillifaerslaTypeUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tilvisun==null && other.getTilvisun()==null) || 
             (this.tilvisun!=null &&
              this.tilvisun.equals(other.getTilvisun()))) &&
            ((this.heimild==null && other.getHeimild()==null) || 
             (this.heimild!=null &&
              this.heimild.equals(other.getHeimild()))) &&
            ((this.annadSkipHeiti==null && other.getAnnadSkipHeiti()==null) || 
             (this.annadSkipHeiti!=null &&
              this.annadSkipHeiti.equals(other.getAnnadSkipHeiti()))) &&
            ((this.IGildi==null && other.getIGildi()==null) || 
             (this.IGildi!=null &&
              this.IGildi.equals(other.getIGildi()))) &&
            ((this.tegundir==null && other.getTegundir()==null) || 
             (this.tegundir!=null &&
              java.util.Arrays.equals(this.tegundir, other.getTegundir()))) &&
            ((this.fraSkip==null && other.getFraSkip()==null) || 
             (this.fraSkip!=null &&
              this.fraSkip.equals(other.getFraSkip()))) &&
            ((this.timabil==null && other.getTimabil()==null) || 
             (this.timabil!=null &&
              this.timabil.equals(other.getTimabil()))) &&
            ((this.annadSkipNr==null && other.getAnnadSkipNr()==null) || 
             (this.annadSkipNr!=null &&
              this.annadSkipNr.equals(other.getAnnadSkipNr()))) &&
            ((this.tilSkip==null && other.getTilSkip()==null) || 
             (this.tilSkip!=null &&
              this.tilSkip.equals(other.getTilSkip()))) &&
            ((this.skipNr==null && other.getSkipNr()==null) || 
             (this.skipNr!=null &&
              this.skipNr.equals(other.getSkipNr())));
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
        if (getTilvisun() != null) {
            _hashCode += getTilvisun().hashCode();
        }
        if (getHeimild() != null) {
            _hashCode += getHeimild().hashCode();
        }
        if (getAnnadSkipHeiti() != null) {
            _hashCode += getAnnadSkipHeiti().hashCode();
        }
        if (getIGildi() != null) {
            _hashCode += getIGildi().hashCode();
        }
        if (getTegundir() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegundir());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegundir(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFraSkip() != null) {
            _hashCode += getFraSkip().hashCode();
        }
        if (getTimabil() != null) {
            _hashCode += getTimabil().hashCode();
        }
        if (getAnnadSkipNr() != null) {
            _hashCode += getAnnadSkipNr().hashCode();
        }
        if (getTilSkip() != null) {
            _hashCode += getTilSkip().hashCode();
        }
        if (getSkipNr() != null) {
            _hashCode += getSkipNr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MillifaerslaTypeUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "MillifaerslaTypeUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tilvisun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "tilvisun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heimild");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "heimild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annadSkipHeiti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "annadSkipHeiti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGildi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "IGildi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegundir");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "tegundir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "MillifaerslaTegundTypeUser"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "array"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraSkip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "fraSkip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timabil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "timabil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annadSkipNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "annadSkipNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tilSkip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "tilSkip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "skipNr"));
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
