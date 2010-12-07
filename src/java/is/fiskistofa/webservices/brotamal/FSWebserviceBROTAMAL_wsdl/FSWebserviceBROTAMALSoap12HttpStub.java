/**
 * FSWebserviceBROTAMALSoap12HttpStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl;

public class FSWebserviceBROTAMALSoap12HttpStub extends org.apache.axis.client.Stub implements is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.FSWebserviceBROTAMAL_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getHafnalisti");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "getHafnalistiElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getHafnalistiElement"), is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetHafnalistiElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getHafnalistiResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.CodeTypeUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "getHafnalistiResponseElement"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSkipWithInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "getSkipWithInfoElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getSkipWithInfoElement"), is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetSkipWithInfoElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getSkipWithInfoResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetSkipWithInfoResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "getSkipWithInfoResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVigtunarleyfiByKt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "getVigtunarleyfiByKtElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getVigtunarleyfiByKtElement"), is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetVigtunarleyfiByKtElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getVigtunarleyfiByKtResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VigtunarleyfiTypeUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "getVigtunarleyfiByKtResponseElement"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public FSWebserviceBROTAMALSoap12HttpStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public FSWebserviceBROTAMALSoap12HttpStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public FSWebserviceBROTAMALSoap12HttpStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getHafnalistiElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetHafnalistiElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getHafnalistiResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.CodeTypeUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "CodeTypeUser");
            qName2 = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getSkipWithInfoElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetSkipWithInfoElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getSkipWithInfoResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetSkipWithInfoResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getVigtunarleyfiByKtElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetVigtunarleyfiByKtElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", ">getVigtunarleyfiByKtResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VigtunarleyfiTypeUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "VigtunarleyfiTypeUser");
            qName2 = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "CheckReplyTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.CheckReplyTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "CheckReplyTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.CheckReplyTypeUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "CodeTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.CodeTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "CodeTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.CodeTypeUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "SkipExtrainfoTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.SkipExtrainfoTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "SkipExtrainfoTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.SkipExtrainfoTypeUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "VeidileyfiTableType");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VeidileyfiTypeUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "VeidileyfiTypeUser");
            qName2 = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "array");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "VeidileyfiTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VeidileyfiTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "VeidileyfiTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VeidileyfiTypeUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "VigtunarleyfiTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VigtunarleyfiTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/types/", "VigtunarleyfiTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VigtunarleyfiTypeUser.class;
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

    public is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.CodeTypeUser[] getHafnalisti(is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetHafnalistiElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/getHafnalisti");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getHafnalisti"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.CodeTypeUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.CodeTypeUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.CodeTypeUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetSkipWithInfoResponseElement getSkipWithInfo(is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetSkipWithInfoElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/getSkipWithInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSkipWithInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetSkipWithInfoResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetSkipWithInfoResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetSkipWithInfoResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VigtunarleyfiTypeUser[] getVigtunarleyfiByKt(is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetVigtunarleyfiByKtElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/brotamal/FSWebserviceBROTAMAL.wsdl/getVigtunarleyfiByKt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getVigtunarleyfiByKt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VigtunarleyfiTypeUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VigtunarleyfiTypeUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VigtunarleyfiTypeUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
