/**
 * ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fjs.secure;

public interface ServiceSoap extends java.rmi.Remote {
    public is.fjs.secure.TBRGjaldskraSvar saekjaGjaldskra(is.fjs.secure.TBRGjaldskra iGjaldskra) throws java.rmi.RemoteException;
    public is.fjs.secure.TBRStofnaKrofuSvar stofnaKrofuVeidiGjald(is.fjs.secure.TBRStofnaKrofuVR iStofnaKrofu) throws java.rmi.RemoteException;
    public is.fjs.secure.TBRStofnaKrofuSvar stofnaKrofuVeidileyfi(is.fjs.secure.TBRStofnaKrofu iStofnaKrofu) throws java.rmi.RemoteException;
    public is.fjs.secure.TBRStofnaKrofuSvar stofnaKrofuFlutningAflaHeimilda(is.fjs.secure.TBRStofnaKrofuFV1 iStofnaKrofu) throws java.rmi.RemoteException;
    public is.fjs.secure.TBRFellaNidurKrofuSvar fellaNidurKrofu(is.fjs.secure.TBRFellaNidurKrofu iFellaNidur) throws java.rmi.RemoteException;
    public is.fjs.secure.TBRStadaSkipsSvar saekjaStoduSkips(is.fjs.secure.TBRStadaSkips iStadaSkips) throws java.rmi.RemoteException;
    public is.fjs.secure.TBRStadaKrofuSvar saekjaStoduKrofu(is.fjs.secure.TBRStadaKrofu iStadaKrofu) throws java.rmi.RemoteException;
}
