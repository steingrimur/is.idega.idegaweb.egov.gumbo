/**
 * FSWebServiceVeidileyfiUpdateSoap12HttpStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl;

public class FSWebServiceVeidileyfiUpdateSoap12HttpStub extends org.apache.axis.client.Stub implements is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.FSWebServiceVeidileyfiUpdate_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createveidileyfi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "createveidileyfiElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">createveidileyfiElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">createveidileyfiResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "createveidileyfiResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createveidileyfiWithPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "createveidileyfiWithPasswordElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">createveidileyfiWithPasswordElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiWithPasswordElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">createveidileyfiWithPasswordResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiWithPasswordResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "createveidileyfiWithPasswordResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("virkjaveidileyfi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "virkjaveidileyfiElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">virkjaveidileyfiElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">virkjaveidileyfiResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "virkjaveidileyfiResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("virkjaveidileyfiWithPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "virkjaveidileyfiWithPasswordElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">virkjaveidileyfiWithPasswordElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiWithPasswordElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">virkjaveidileyfiWithPasswordResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiWithPasswordResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "virkjaveidileyfiWithPasswordResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public FSWebServiceVeidileyfiUpdateSoap12HttpStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public FSWebServiceVeidileyfiUpdateSoap12HttpStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public FSWebServiceVeidileyfiUpdateSoap12HttpStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">createveidileyfiElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">createveidileyfiResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">createveidileyfiWithPasswordElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiWithPasswordElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">createveidileyfiWithPasswordResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiWithPasswordResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">virkjaveidileyfiElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">virkjaveidileyfiResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">virkjaveidileyfiWithPasswordElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiWithPasswordElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", ">virkjaveidileyfiWithPasswordResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiWithPasswordResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "CodeTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CodeTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/types/", "CodeTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CodeTypeUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiResponseElement createveidileyfi(is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/createveidileyfi");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createveidileyfi"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiWithPasswordResponseElement createveidileyfiWithPassword(is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiWithPasswordElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/createveidileyfiWithPassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createveidileyfiWithPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiWithPasswordResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiWithPasswordResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiWithPasswordResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiResponseElement virkjaveidileyfi(is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/virkjaveidileyfi");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "virkjaveidileyfi"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiWithPasswordResponseElement virkjaveidileyfiWithPassword(is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiWithPasswordElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVeidileyfiUpdate.wsdl/virkjaveidileyfiWithPassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "virkjaveidileyfiWithPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiWithPasswordResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiWithPasswordResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiWithPasswordResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
