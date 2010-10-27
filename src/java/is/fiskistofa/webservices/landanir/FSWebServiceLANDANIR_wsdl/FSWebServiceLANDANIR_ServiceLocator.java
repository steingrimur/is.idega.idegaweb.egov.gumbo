/**
 * FSWebServiceLANDANIR_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl;

public class FSWebServiceLANDANIR_ServiceLocator extends org.apache.axis.client.Service implements is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIR_Service {

    public FSWebServiceLANDANIR_ServiceLocator() {
    }


    public FSWebServiceLANDANIR_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FSWebServiceLANDANIR_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FSWebServiceLANDANIRSoap12HttpPort
    private java.lang.String FSWebServiceLANDANIRSoap12HttpPort_address = "http://hafrok.hafro.is/FSWebServices/FSWebServiceLANDANIRSoap12HttpPort";

    public java.lang.String getFSWebServiceLANDANIRSoap12HttpPortAddress() {
        return FSWebServiceLANDANIRSoap12HttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FSWebServiceLANDANIRSoap12HttpPortWSDDServiceName = "FSWebServiceLANDANIRSoap12HttpPort";

    public java.lang.String getFSWebServiceLANDANIRSoap12HttpPortWSDDServiceName() {
        return FSWebServiceLANDANIRSoap12HttpPortWSDDServiceName;
    }

    public void setFSWebServiceLANDANIRSoap12HttpPortWSDDServiceName(java.lang.String name) {
        FSWebServiceLANDANIRSoap12HttpPortWSDDServiceName = name;
    }

    public is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIR_PortType getFSWebServiceLANDANIRSoap12HttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FSWebServiceLANDANIRSoap12HttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFSWebServiceLANDANIRSoap12HttpPort(endpoint);
    }

    public is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIR_PortType getFSWebServiceLANDANIRSoap12HttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIRSoap12HttpStub _stub = new is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIRSoap12HttpStub(portAddress, this);
            _stub.setPortName(getFSWebServiceLANDANIRSoap12HttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFSWebServiceLANDANIRSoap12HttpPortEndpointAddress(java.lang.String address) {
        FSWebServiceLANDANIRSoap12HttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIR_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIRSoap12HttpStub _stub = new is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIRSoap12HttpStub(new java.net.URL(FSWebServiceLANDANIRSoap12HttpPort_address), this);
                _stub.setPortName(getFSWebServiceLANDANIRSoap12HttpPortWSDDServiceName());
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
        if ("FSWebServiceLANDANIRSoap12HttpPort".equals(inputPortName)) {
            return getFSWebServiceLANDANIRSoap12HttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "FSWebServiceLANDANIR");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/landanir/FSWebServiceLANDANIR.wsdl", "FSWebServiceLANDANIRSoap12HttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FSWebServiceLANDANIRSoap12HttpPort".equals(portName)) {
            setFSWebServiceLANDANIRSoap12HttpPortEndpointAddress(address);
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
