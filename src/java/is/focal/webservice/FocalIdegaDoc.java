/**
 * FocalIdegaDoc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.focal.webservice;

public interface FocalIdegaDoc extends java.rmi.Remote {
    public java.lang.String CREATEUPDATEADILI(java.lang.String STRXML, java.lang.String STRACCESSKEY) throws java.rmi.RemoteException;
    public java.lang.String ADDATTACHMENTTOIDEGACASE(java.lang.String STRCASEID, java.lang.String STRFILEPATH, java.lang.String STRACCESSKEY) throws java.rmi.RemoteException;
    public java.lang.String CLOSEIDEGACASE(java.lang.String STRCASEID, java.lang.String STRPATH, java.lang.String STRACCESSKEY) throws java.rmi.RemoteException;
    public java.lang.String CREATEIDEGACASE(java.lang.String STRCASEXML, java.lang.String STRACCESSKEY) throws java.rmi.RemoteException;
}
