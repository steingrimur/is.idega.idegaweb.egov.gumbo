/**
 * FSWebserviceMILLIFAERSLURSoap12HttpStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl;

public class FSWebserviceMILLIFAERSLURSoap12HttpStub extends org.apache.axis.client.Stub implements is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.FSWebserviceMILLIFAERSLUR_PortType {
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
        oper.setName("getmillifaerslabytilvisun");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "getmillifaerslabytilvisunElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslabytilvisunElement"), is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslabytilvisunElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslabytilvisunResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslabytilvisunResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "getmillifaerslabytilvisunResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getmillifaerslategundir");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "getmillifaerslategundirElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslategundirElement"), is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslategundirElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslategundirResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "getmillifaerslategundirResponseElement"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getmillifaerslurbyskip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "getmillifaerslurbyskipElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslurbyskipElement"), is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslurbyskipElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslurbyskipResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "getmillifaerslurbyskipResponseElement"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getmillifaerslurbyutgerd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "getmillifaerslurbyutgerdElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslurbyutgerdElement"), is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslurbyutgerdElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslurbyutgerdResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "getmillifaerslurbyutgerdResponseElement"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public FSWebserviceMILLIFAERSLURSoap12HttpStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public FSWebserviceMILLIFAERSLURSoap12HttpStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public FSWebserviceMILLIFAERSLURSoap12HttpStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslabytilvisunElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslabytilvisunElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslabytilvisunResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslabytilvisunResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslategundirElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslategundirElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslategundirResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "MillifaerslaTegundTypeUser");
            qName2 = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslurbyskipElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslurbyskipElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslurbyskipResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "MillifaerslaTypeUser");
            qName2 = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslurbyutgerdElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslurbyutgerdElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", ">getmillifaerslurbyutgerdResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "MillifaerslaTypeUser");
            qName2 = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "MillifaerslaTegundTableType");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "MillifaerslaTegundTypeUser");
            qName2 = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "array");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "MillifaerslaTegundTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "MillifaerslaTegundTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "MillifaerslaTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl", "MillifaerslaTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser.class;
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

    public is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslabytilvisunResponseElement getmillifaerslabytilvisun(is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslabytilvisunElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl/getmillifaerslabytilvisun");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getmillifaerslabytilvisun"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslabytilvisunResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslabytilvisunResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslabytilvisunResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeUser[] getmillifaerslategundir(is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslategundirElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl/getmillifaerslategundir");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getmillifaerslategundir"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTegundTypeUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser[] getmillifaerslurbyskip(is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslurbyskipElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl/getmillifaerslurbyskip");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getmillifaerslurbyskip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser[] getmillifaerslurbyutgerd(is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslurbyutgerdElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/millifaerslur/FSWebserviceMILLIFAERSLUR.wsdl/getmillifaerslurbyutgerd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getmillifaerslurbyutgerd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
