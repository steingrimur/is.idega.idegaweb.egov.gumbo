/**
 * AdiliTypeUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.types;

public class AdiliTypeUser  extends is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.types.AdiliTypeBase  implements java.io.Serializable {
    private java.lang.String heimili1;

    private java.lang.String stadur;

    private java.lang.String simi2;

    private java.lang.String nafn;

    private java.lang.String simi1;

    private java.lang.String adilaNr;

    private java.lang.String fax;

    private java.math.BigDecimal postNr;

    private java.lang.String heimili2;

    public AdiliTypeUser() {
    }

    public AdiliTypeUser(
           java.lang.String heimili1,
           java.lang.String stadur,
           java.lang.String simi2,
           java.lang.String nafn,
           java.lang.String simi1,
           java.lang.String adilaNr,
           java.lang.String fax,
           java.math.BigDecimal postNr,
           java.lang.String heimili2) {
        this.heimili1 = heimili1;
        this.stadur = stadur;
        this.simi2 = simi2;
        this.nafn = nafn;
        this.simi1 = simi1;
        this.adilaNr = adilaNr;
        this.fax = fax;
        this.postNr = postNr;
        this.heimili2 = heimili2;
    }


    /**
     * Gets the heimili1 value for this AdiliTypeUser.
     * 
     * @return heimili1
     */
    public java.lang.String getHeimili1() {
        return heimili1;
    }


    /**
     * Sets the heimili1 value for this AdiliTypeUser.
     * 
     * @param heimili1
     */
    public void setHeimili1(java.lang.String heimili1) {
        this.heimili1 = heimili1;
    }


    /**
     * Gets the stadur value for this AdiliTypeUser.
     * 
     * @return stadur
     */
    public java.lang.String getStadur() {
        return stadur;
    }


    /**
     * Sets the stadur value for this AdiliTypeUser.
     * 
     * @param stadur
     */
    public void setStadur(java.lang.String stadur) {
        this.stadur = stadur;
    }


    /**
     * Gets the simi2 value for this AdiliTypeUser.
     * 
     * @return simi2
     */
    public java.lang.String getSimi2() {
        return simi2;
    }


    /**
     * Sets the simi2 value for this AdiliTypeUser.
     * 
     * @param simi2
     */
    public void setSimi2(java.lang.String simi2) {
        this.simi2 = simi2;
    }


    /**
     * Gets the nafn value for this AdiliTypeUser.
     * 
     * @return nafn
     */
    public java.lang.String getNafn() {
        return nafn;
    }


    /**
     * Sets the nafn value for this AdiliTypeUser.
     * 
     * @param nafn
     */
    public void setNafn(java.lang.String nafn) {
        this.nafn = nafn;
    }


    /**
     * Gets the simi1 value for this AdiliTypeUser.
     * 
     * @return simi1
     */
    public java.lang.String getSimi1() {
        return simi1;
    }


    /**
     * Sets the simi1 value for this AdiliTypeUser.
     * 
     * @param simi1
     */
    public void setSimi1(java.lang.String simi1) {
        this.simi1 = simi1;
    }


    /**
     * Gets the adilaNr value for this AdiliTypeUser.
     * 
     * @return adilaNr
     */
    public java.lang.String getAdilaNr() {
        return adilaNr;
    }


    /**
     * Sets the adilaNr value for this AdiliTypeUser.
     * 
     * @param adilaNr
     */
    public void setAdilaNr(java.lang.String adilaNr) {
        this.adilaNr = adilaNr;
    }


    /**
     * Gets the fax value for this AdiliTypeUser.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this AdiliTypeUser.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the postNr value for this AdiliTypeUser.
     * 
     * @return postNr
     */
    public java.math.BigDecimal getPostNr() {
        return postNr;
    }


    /**
     * Sets the postNr value for this AdiliTypeUser.
     * 
     * @param postNr
     */
    public void setPostNr(java.math.BigDecimal postNr) {
        this.postNr = postNr;
    }


    /**
     * Gets the heimili2 value for this AdiliTypeUser.
     * 
     * @return heimili2
     */
    public java.lang.String getHeimili2() {
        return heimili2;
    }


    /**
     * Sets the heimili2 value for this AdiliTypeUser.
     * 
     * @param heimili2
     */
    public void setHeimili2(java.lang.String heimili2) {
        this.heimili2 = heimili2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdiliTypeUser)) return false;
        AdiliTypeUser other = (AdiliTypeUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.heimili1==null && other.getHeimili1()==null) || 
             (this.heimili1!=null &&
              this.heimili1.equals(other.getHeimili1()))) &&
            ((this.stadur==null && other.getStadur()==null) || 
             (this.stadur!=null &&
              this.stadur.equals(other.getStadur()))) &&
            ((this.simi2==null && other.getSimi2()==null) || 
             (this.simi2!=null &&
              this.simi2.equals(other.getSimi2()))) &&
            ((this.nafn==null && other.getNafn()==null) || 
             (this.nafn!=null &&
              this.nafn.equals(other.getNafn()))) &&
            ((this.simi1==null && other.getSimi1()==null) || 
             (this.simi1!=null &&
              this.simi1.equals(other.getSimi1()))) &&
            ((this.adilaNr==null && other.getAdilaNr()==null) || 
             (this.adilaNr!=null &&
              this.adilaNr.equals(other.getAdilaNr()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.postNr==null && other.getPostNr()==null) || 
             (this.postNr!=null &&
              this.postNr.equals(other.getPostNr()))) &&
            ((this.heimili2==null && other.getHeimili2()==null) || 
             (this.heimili2!=null &&
              this.heimili2.equals(other.getHeimili2())));
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
        if (getHeimili1() != null) {
            _hashCode += getHeimili1().hashCode();
        }
        if (getStadur() != null) {
            _hashCode += getStadur().hashCode();
        }
        if (getSimi2() != null) {
            _hashCode += getSimi2().hashCode();
        }
        if (getNafn() != null) {
            _hashCode += getNafn().hashCode();
        }
        if (getSimi1() != null) {
            _hashCode += getSimi1().hashCode();
        }
        if (getAdilaNr() != null) {
            _hashCode += getAdilaNr().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getPostNr() != null) {
            _hashCode += getPostNr().hashCode();
        }
        if (getHeimili2() != null) {
            _hashCode += getHeimili2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdiliTypeUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl/types/", "AdiliTypeUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heimili1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl/types/", "heimili1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stadur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl/types/", "stadur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simi2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl/types/", "simi2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nafn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl/types/", "nafn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simi1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl/types/", "simi1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adilaNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl/types/", "adilaNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl/types/", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl/types/", "postNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heimili2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl/types/", "heimili2"));
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
