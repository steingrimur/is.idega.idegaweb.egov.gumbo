/**
 * FSWebServiceSKIP_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl;

public interface FSWebServiceSKIP_PortType extends java.rmi.Remote {
    public is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoResponseElement getskipinfo(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoElement parameters) throws java.rmi.RemoteException;
    public is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser[] getskipinfobyutgerd(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfobyutgerdElement parameters) throws java.rmi.RemoteException;
    public java.math.BigDecimal[] getskipnrbyutgerd(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipnrbyutgerdElement parameters) throws java.rmi.RemoteException;
}
