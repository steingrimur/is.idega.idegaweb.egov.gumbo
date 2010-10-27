/**
 * FSWebServiceADILI_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl;

public class FSWebServiceADILI_ServiceLocator extends org.apache.axis.client.Service implements is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.FSWebServiceADILI_Service {

    public FSWebServiceADILI_ServiceLocator() {
    }


    public FSWebServiceADILI_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FSWebServiceADILI_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FSWebServiceADILISoap12HttpPort
    private java.lang.String FSWebServiceADILISoap12HttpPort_address = "http://hafrok.hafro.is/FSWebServices/FSWebServiceADILISoap12HttpPort";

    public java.lang.String getFSWebServiceADILISoap12HttpPortAddress() {
        return FSWebServiceADILISoap12HttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FSWebServiceADILISoap12HttpPortWSDDServiceName = "FSWebServiceADILISoap12HttpPort";

    public java.lang.String getFSWebServiceADILISoap12HttpPortWSDDServiceName() {
        return FSWebServiceADILISoap12HttpPortWSDDServiceName;
    }

    public void setFSWebServiceADILISoap12HttpPortWSDDServiceName(java.lang.String name) {
        FSWebServiceADILISoap12HttpPortWSDDServiceName = name;
    }

    public is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.FSWebServiceADILI_PortType getFSWebServiceADILISoap12HttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FSWebServiceADILISoap12HttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFSWebServiceADILISoap12HttpPort(endpoint);
    }

    public is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.FSWebServiceADILI_PortType getFSWebServiceADILISoap12HttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.FSWebServiceADILISoap12HttpStub _stub = new is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.FSWebServiceADILISoap12HttpStub(portAddress, this);
            _stub.setPortName(getFSWebServiceADILISoap12HttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFSWebServiceADILISoap12HttpPortEndpointAddress(java.lang.String address) {
        FSWebServiceADILISoap12HttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.FSWebServiceADILI_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.FSWebServiceADILISoap12HttpStub _stub = new is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.FSWebServiceADILISoap12HttpStub(new java.net.URL(FSWebServiceADILISoap12HttpPort_address), this);
                _stub.setPortName(getFSWebServiceADILISoap12HttpPortWSDDServiceName());
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
        if ("FSWebServiceADILISoap12HttpPort".equals(inputPortName)) {
            return getFSWebServiceADILISoap12HttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl", "FSWebServiceADILI");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/adili/FSWebServiceADILI.wsdl", "FSWebServiceADILISoap12HttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FSWebServiceADILISoap12HttpPort".equals(portName)) {
            setFSWebServiceADILISoap12HttpPortEndpointAddress(address);
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
