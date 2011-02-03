/**
 * FSWebserviceHLUTDEILD_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl;

public interface FSWebserviceHLUTDEILD_PortType extends java.rmi.Remote {
    public is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeUser[] gethlutdeildskips(is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.GethlutdeildskipsElement parameters) throws java.rmi.RemoteException;
    public is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.GethlutdeildskipstegResponseElement gethlutdeildskipsteg(is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.GethlutdeildskipstegElement parameters) throws java.rmi.RemoteException;
    public is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.GethlutdeildutgerdtegResponseElement gethlutdeildutgerdteg(is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.GethlutdeildutgerdtegElement parameters) throws java.rmi.RemoteException;
    public is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeUser[] getsumhlutdeildutgerdar(is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.GetsumhlutdeildutgerdarElement parameters) throws java.rmi.RemoteException;
    public is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.UthlutanirTypeUser[] getuthlutanirskip(is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.GetuthlutanirskipElement parameters) throws java.rmi.RemoteException;
    public is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.UthlutanirTypeUser[] getuthlutanirutgerd(is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.GetuthlutanirutgerdElement parameters) throws java.rmi.RemoteException;
}
