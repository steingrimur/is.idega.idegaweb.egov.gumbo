/**
 * FSWebServiceSKIP_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl;

public class FSWebServiceSKIP_ServiceLocator extends org.apache.axis.client.Service implements is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIP_Service {

    public FSWebServiceSKIP_ServiceLocator() {
    }


    public FSWebServiceSKIP_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FSWebServiceSKIP_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FSWebServiceSKIPSoap12HttpPort
    private java.lang.String FSWebServiceSKIPSoap12HttpPort_address = "http://hafrok.hafro.is/FSWebServices_testing/FSWebServiceSKIPSoap12HttpPort";

    public java.lang.String getFSWebServiceSKIPSoap12HttpPortAddress() {
        return FSWebServiceSKIPSoap12HttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FSWebServiceSKIPSoap12HttpPortWSDDServiceName = "FSWebServiceSKIPSoap12HttpPort";

    public java.lang.String getFSWebServiceSKIPSoap12HttpPortWSDDServiceName() {
        return FSWebServiceSKIPSoap12HttpPortWSDDServiceName;
    }

    public void setFSWebServiceSKIPSoap12HttpPortWSDDServiceName(java.lang.String name) {
        FSWebServiceSKIPSoap12HttpPortWSDDServiceName = name;
    }

    public is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIP_PortType getFSWebServiceSKIPSoap12HttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FSWebServiceSKIPSoap12HttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFSWebServiceSKIPSoap12HttpPort(endpoint);
    }

    public is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIP_PortType getFSWebServiceSKIPSoap12HttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIPSoap12HttpStub _stub = new is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIPSoap12HttpStub(portAddress, this);
            _stub.setPortName(getFSWebServiceSKIPSoap12HttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFSWebServiceSKIPSoap12HttpPortEndpointAddress(java.lang.String address) {
        FSWebServiceSKIPSoap12HttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIP_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIPSoap12HttpStub _stub = new is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIPSoap12HttpStub(new java.net.URL(FSWebServiceSKIPSoap12HttpPort_address), this);
                _stub.setPortName(getFSWebServiceSKIPSoap12HttpPortWSDDServiceName());
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
        if ("FSWebServiceSKIPSoap12HttpPort".equals(inputPortName)) {
            return getFSWebServiceSKIPSoap12HttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "FSWebServiceSKIP");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "FSWebServiceSKIPSoap12HttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FSWebServiceSKIPSoap12HttpPort".equals(portName)) {
            setFSWebServiceSKIPSoap12HttpPortEndpointAddress(address);
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
