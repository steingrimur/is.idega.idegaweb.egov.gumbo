/**
 * FocalIdegaDocService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.focal.webservice;

public interface FocalIdegaDocService extends javax.xml.rpc.Service {
    public java.lang.String getDominoAddress();

    public is.focal.webservice.FocalIdegaDoc getDomino() throws javax.xml.rpc.ServiceException;

    public is.focal.webservice.FocalIdegaDoc getDomino(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
