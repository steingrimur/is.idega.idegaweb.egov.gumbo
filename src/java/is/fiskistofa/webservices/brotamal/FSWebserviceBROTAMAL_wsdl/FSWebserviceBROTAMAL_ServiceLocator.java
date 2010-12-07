/**
 * FSWebserviceBROTAMAL_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl;

public class FSWebserviceBROTAMAL_ServiceLocator extends org.apache.axis.client.Service implements is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.FSWebserviceBROTAMAL_Service {

    public FSWebserviceBROTAMAL_ServiceLocator() {
    }


    public FSWebserviceBROTAMAL_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FSWebserviceBROTAMAL_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FSWebserviceBROTAMALSoap12HttpPort
    private java.lang.String FSWebserviceBROTAMALSoap12HttpPort_address = "http://hafrok.hafro.is/FSWebServices/FSWebserviceBROTAMALSoap12HttpPort";

    public java.lang.String getFSWebserviceBROTAMALSoap12HttpPortAddress() {
        return FSWebserviceBROTAMALSoap12HttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FSWebserviceBROTAMALSoap12HttpPortWSDDServiceName = "FSWebserviceBROTAMALSoap12HttpPort";

    public java.lang.String getFSWebserviceBROTAMALSoap12HttpPortWSDDServiceName() {
        return FSWebserviceBROTAMALSoap12HttpPortWSDDServiceName;
    }

    public void setFSWebserviceBROTAMALSoap12HttpPortWSDDServiceName(java.lang.String name) {
        FSWebserviceBROTAMALSoap12HttpPortWSDDServiceName = name;
    }

    public is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.FSWebserviceBROTAMAL_PortType getFSWebserviceBROTAMALSoap12HttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FSWebserviceBROTAMALSoap12HttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFSWebserviceBROTAMALSoap12HttpPort(endpoint);
    }

    public is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.FSWebserviceBROTAMAL_PortType getFSWebserviceBROTAMALSoap12HttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.FSWebserviceBROTAMALSoap12HttpStub _stub = new is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.FSWebserviceBROTAMALSoap12HttpStub(portAddress, this);
            _stub.setPortName(getFSWebserviceBROTAMALSoap12HttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFSWebserviceBROTAMALSoap12HttpPortEndpointAddress(java.lang.String address) {
        FSWebserviceBROTAMALSoap12HttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.FSWebserviceBROTAMAL_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.FSWebserviceBROTAMALSoap12HttpStub _stub = new is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.FSWebserviceBROTAMALSoap12HttpStub(new java.net.URL(FSWebserviceBROTAMALSoap12HttpPort_address), this);
                _stub.setPortName(getFSWebserviceBROTAMALSoap12HttpPortWSDDServiceName());
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
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FSWebserviceBROTAMALSoap12HttpPort".equals(inputPortName)) {
            return getFSWebserviceBROTAMALSoap12HttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl", "FSWebserviceBROTAMAL");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl", "FSWebserviceBROTAMALSoap12HttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FSWebserviceBROTAMALSoap12HttpPort".equals(portName)) {
            setFSWebserviceBROTAMALSoap12HttpPortEndpointAddress(address);
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
