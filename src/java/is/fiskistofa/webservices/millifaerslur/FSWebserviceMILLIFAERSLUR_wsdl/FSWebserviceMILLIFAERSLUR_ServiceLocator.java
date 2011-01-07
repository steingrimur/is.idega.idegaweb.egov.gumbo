/**
 * FSWebserviceMILLIFAERSLUR_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl;

public class FSWebserviceMILLIFAERSLUR_ServiceLocator extends org.apache.axis.client.Service implements is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.FSWebserviceMILLIFAERSLUR_Service {

    public FSWebserviceMILLIFAERSLUR_ServiceLocator() {
    }


    public FSWebserviceMILLIFAERSLUR_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FSWebserviceMILLIFAERSLUR_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FSWebserviceMILLIFAERSLURSoap12HttpPort
    private java.lang.String FSWebserviceMILLIFAERSLURSoap12HttpPort_address = "http://hafrok.hafro.is/FSWebServices/FSWebserviceMILLIFAERSLURSoap12HttpPort";

    public java.lang.String getFSWebserviceMILLIFAERSLURSoap12HttpPortAddress() {
        return FSWebserviceMILLIFAERSLURSoap12HttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FSWebserviceMILLIFAERSLURSoap12HttpPortWSDDServiceName = "FSWebserviceMILLIFAERSLURSoap12HttpPort";

    public java.lang.String getFSWebserviceMILLIFAERSLURSoap12HttpPortWSDDServiceName() {
        return FSWebserviceMILLIFAERSLURSoap12HttpPortWSDDServiceName;
    }

    public void setFSWebserviceMILLIFAERSLURSoap12HttpPortWSDDServiceName(java.lang.String name) {
        FSWebserviceMILLIFAERSLURSoap12HttpPortWSDDServiceName = name;
    }

    public is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.FSWebserviceMILLIFAERSLUR_PortType getFSWebserviceMILLIFAERSLURSoap12HttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FSWebserviceMILLIFAERSLURSoap12HttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFSWebserviceMILLIFAERSLURSoap12HttpPort(endpoint);
    }

    public is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.FSWebserviceMILLIFAERSLUR_PortType getFSWebserviceMILLIFAERSLURSoap12HttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.FSWebserviceMILLIFAERSLURSoap12HttpStub _stub = new is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.FSWebserviceMILLIFAERSLURSoap12HttpStub(portAddress, this);
            _stub.setPortName(getFSWebserviceMILLIFAERSLURSoap12HttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFSWebserviceMILLIFAERSLURSoap12HttpPortEndpointAddress(java.lang.String address) {
        FSWebserviceMILLIFAERSLURSoap12HttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.FSWebserviceMILLIFAERSLUR_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.FSWebserviceMILLIFAERSLURSoap12HttpStub _stub = new is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.FSWebserviceMILLIFAERSLURSoap12HttpStub(new java.net.URL(FSWebserviceMILLIFAERSLURSoap12HttpPort_address), this);
                _stub.setPortName(getFSWebserviceMILLIFAERSLURSoap12HttpPortWSDDServiceName());
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
        if ("FSWebserviceMILLIFAERSLURSoap12HttpPort".equals(inputPortName)) {
            return getFSWebserviceMILLIFAERSLURSoap12HttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "FSWebserviceMILLIFAERSLUR");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "FSWebserviceMILLIFAERSLURSoap12HttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FSWebserviceMILLIFAERSLURSoap12HttpPort".equals(portName)) {
            setFSWebserviceMILLIFAERSLURSoap12HttpPortEndpointAddress(address);
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
