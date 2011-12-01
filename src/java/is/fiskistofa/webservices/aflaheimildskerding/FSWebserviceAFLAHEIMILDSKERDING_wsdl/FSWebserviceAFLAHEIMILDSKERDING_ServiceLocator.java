/**
 * FSWebserviceAFLAHEIMILDSKERDING_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl;

import is.idega.idegaweb.egov.gumbo.GumboConstants;

public class FSWebserviceAFLAHEIMILDSKERDING_ServiceLocator extends org.apache.axis.client.Service implements is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.FSWebserviceAFLAHEIMILDSKERDING_Service {

    public FSWebserviceAFLAHEIMILDSKERDING_ServiceLocator() {
    }


    public FSWebserviceAFLAHEIMILDSKERDING_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FSWebserviceAFLAHEIMILDSKERDING_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort
    private java.lang.String FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort_address = GumboConstants.WEB_SERVICE_URL_DEV + "FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort";

    public java.lang.String getFSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPortAddress() {
        return FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPortWSDDServiceName = "FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort";

    public java.lang.String getFSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPortWSDDServiceName() {
        return FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPortWSDDServiceName;
    }

    public void setFSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPortWSDDServiceName(java.lang.String name) {
        FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPortWSDDServiceName = name;
    }

    public is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.FSWebserviceAFLAHEIMILDSKERDING_PortType getFSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort(endpoint);
    }

    public is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.FSWebserviceAFLAHEIMILDSKERDING_PortType getFSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpStub _stub = new is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpStub(portAddress, this);
            _stub.setPortName(getFSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPortEndpointAddress(java.lang.String address) {
        FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @Override
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.FSWebserviceAFLAHEIMILDSKERDING_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpStub _stub = new is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpStub(new java.net.URL(FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort_address), this);
                _stub.setPortName(getFSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @Override
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort".equals(inputPortName)) {
            return getFSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    @Override
	public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://is/fiskistofa/webservices/aflaheimildskerding/FSWebserviceAFLAHEIMILDSKERDING.wsdl", "FSWebserviceAFLAHEIMILDSKERDING");
    }

    private java.util.HashSet ports = null;

    @Override
	public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/aflaheimildskerding/FSWebserviceAFLAHEIMILDSKERDING.wsdl", "FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPort".equals(portName)) {
            setFSWebserviceAFLAHEIMILDSKERDINGSoap12HttpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
