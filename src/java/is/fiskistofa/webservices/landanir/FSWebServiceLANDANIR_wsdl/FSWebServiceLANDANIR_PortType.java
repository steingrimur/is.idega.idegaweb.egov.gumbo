/**
 * FSWebServiceLANDANIR_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl;

public interface FSWebServiceLANDANIR_PortType extends java.rmi.Remote {
    public is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser[] getlandanirbyskip(is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlandanirbyskipElement parameters) throws java.rmi.RemoteException;
    public is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser[] getlastlandanirbyskip(is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlastlandanirbyskipElement parameters) throws java.rmi.RemoteException;
    public is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser[] getlastlandanirbyutgerd(is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlastlandanirbyutgerdElement parameters) throws java.rmi.RemoteException;
    public is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlonduninfoResponseElement getlonduninfo(is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlonduninfoElement parameters) throws java.rmi.RemoteException;
}
