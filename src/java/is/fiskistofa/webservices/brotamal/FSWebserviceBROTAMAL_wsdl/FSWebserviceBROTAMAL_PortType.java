/**
 * FSWebserviceBROTAMAL_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl;

import is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetLandsvaediElement;

import java.rmi.RemoteException;

public interface FSWebserviceBROTAMAL_PortType extends java.rmi.Remote {
    public is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.CodeTypeUser[] getHafnalisti(is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetHafnalistiElement parameters) throws java.rmi.RemoteException;
    public is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetSkipWithInfoResponseElement getSkipWithInfo(is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetSkipWithInfoElement parameters) throws java.rmi.RemoteException;
    public is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VigtunarleyfiTypeUser[] getVigtunarleyfiByKt(is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetVigtunarleyfiByKtElement parameters) throws java.rmi.RemoteException;
    public is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.CodeTypeUser getLandsvaedi(GetLandsvaediElement parameters) throws RemoteException;
}
