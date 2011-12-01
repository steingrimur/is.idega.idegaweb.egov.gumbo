/**
 * FSWebServiceVeidileyfiUpdate_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl;

import is.idega.idegaweb.egov.gumbo.GumboConstants;

public class FSWebServiceVeidileyfiUpdate_ServiceLocator extends org.apache.axis.client.Service implements is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.FSWebServiceVeidileyfiUpdate_Service {

    public FSWebServiceVeidileyfiUpdate_ServiceLocator() {
    }


    public FSWebServiceVeidileyfiUpdate_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FSWebServiceVeidileyfiUpdate_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FSWebServiceVeidileyfiUpdateSoap12HttpPort
    private java.lang.String FSWebServiceVeidileyfiUpdateSoap12HttpPort_address = GumboConstants.WEB_SERVICE_URL + "FSWebServiceVeidileyfiUpdateSoap12HttpPort";

    public java.lang.String getFSWebServiceVeidileyfiUpdateSoap12HttpPortAddress() {
        return FSWebServiceVeidileyfiUpdateSoap12HttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FSWebServiceVeidileyfiUpdateSoap12HttpPortWSDDServiceName = "FSWebServiceVeidileyfiUpdateSoap12HttpPort";

    public java.lang.String getFSWebServiceVeidileyfiUpdateSoap12HttpPortWSDDServiceName() {
        return FSWebServiceVeidileyfiUpdateSoap12HttpPortWSDDServiceName;
    }

    public void setFSWebServiceVeidileyfiUpdateSoap12HttpPortWSDDServiceName(java.lang.String name) {
        FSWebServiceVeidileyfiUpdateSoap12HttpPortWSDDServiceName = name;
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.FSWebServiceVeidileyfiUpdate_PortType getFSWebServiceVeidileyfiUpdateSoap12HttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FSWebServiceVeidileyfiUpdateSoap12HttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFSWebServiceVeidileyfiUpdateSoap12HttpPort(endpoint);
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.FSWebServiceVeidileyfiUpdate_PortType getFSWebServiceVeidileyfiUpdateSoap12HttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.FSWebServiceVeidileyfiUpdateSoap12HttpStub _stub = new is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.FSWebServiceVeidileyfiUpdateSoap12HttpStub(portAddress, this);
            _stub.setPortName(getFSWebServiceVeidileyfiUpdateSoap12HttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFSWebServiceVeidileyfiUpdateSoap12HttpPortEndpointAddress(java.lang.String address) {
        FSWebServiceVeidileyfiUpdateSoap12HttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @Override
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.FSWebServiceVeidileyfiUpdate_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.FSWebServiceVeidileyfiUpdateSoap12HttpStub _stub = new is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.FSWebServiceVeidileyfiUpdateSoap12HttpStub(new java.net.URL(FSWebServiceVeidileyfiUpdateSoap12HttpPort_address), this);
                _stub.setPortName(getFSWebServiceVeidileyfiUpdateSoap12HttpPortWSDDServiceName());
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
        if ("FSWebServiceVeidileyfiUpdateSoap12HttpPort".equals(inputPortName)) {
            return getFSWebServiceVeidileyfiUpdateSoap12HttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    @Override
	public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl", "FSWebServiceVeidileyfiUpdate");
    }

    private java.util.HashSet ports = null;

    @Override
	public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl", "FSWebServiceVeidileyfiUpdateSoap12HttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FSWebServiceVeidileyfiUpdateSoap12HttpPort".equals(portName)) {
            setFSWebServiceVeidileyfiUpdateSoap12HttpPortEndpointAddress(address);
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
