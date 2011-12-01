package is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types;

import java.io.Serializable;
import java.math.BigDecimal;

public class GetLandsvaediElement implements Serializable {

	private static final long serialVersionUID = 8530811174596843092L;

	private BigDecimal pStadurNr;
	
	public GetLandsvaediElement(BigDecimal pStadurNr) {
		this.pStadurNr = pStadurNr;
	}
	
	public BigDecimal getPStadurNr() {
		return pStadurNr;
	}

	public void setPStadurNr(BigDecimal pStadurNr) {
		this.pStadurNr = pStadurNr;
	}

	private java.lang.Object __equalsCalc = null;
    @Override
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLandsvaediElement)) return false;
        GetLandsvaediElement other = (GetLandsvaediElement) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pStadurNr==null && other.getPStadurNr()==null) || 
             (this.pStadurNr!=null &&
              this.pStadurNr.equals(other.getPStadurNr())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    @Override
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPStadurNr() != null) {
            _hashCode += getPStadurNr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLandsvaediElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getLandsvaediElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PStadurNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "pStadurNr"));
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