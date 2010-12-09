/**
 * ServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fjs.secure;

public class ServiceSoapStub extends org.apache.axis.client.Stub implements is.fjs.secure.ServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaekjaGjaldskra");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://secure.fjs.is/", "iGjaldskra"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRGjaldskra"), is.fjs.secure.TBRGjaldskra.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRGjaldskraSvar"));
        oper.setReturnClass(is.fjs.secure.TBRGjaldskraSvar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://secure.fjs.is/", "SaekjaGjaldskraResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StofnaVeidiGjald");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://secure.fjs.is/", "iStofnaKrofu"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStofnaKrofuVR"), is.fjs.secure.TBRStofnaKrofuVR.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStofnaKrofuSvar"));
        oper.setReturnClass(is.fjs.secure.TBRStofnaKrofuSvar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://secure.fjs.is/", "StofnaVeidiGjaldResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StofnaVeidileyfi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://secure.fjs.is/", "iStofnaKrofu"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStofnaKrofu"), is.fjs.secure.TBRStofnaKrofu.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStofnaKrofuSvar"));
        oper.setReturnClass(is.fjs.secure.TBRStofnaKrofuSvar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://secure.fjs.is/", "StofnaVeidileyfiResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StofnaFlutningAflaHeimilda");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://secure.fjs.is/", "iStofnaKrofu"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStofnaKrofuFV1"), is.fjs.secure.TBRStofnaKrofuFV1.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStofnaKrofuSvar"));
        oper.setReturnClass(is.fjs.secure.TBRStofnaKrofuSvar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://secure.fjs.is/", "StofnaFlutningAflaHeimildaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FellaNidurKrofu");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://secure.fjs.is/", "iFellaNidur"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRFellaNidurKrofu"), is.fjs.secure.TBRFellaNidurKrofu.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRFellaNidurKrofuSvar"));
        oper.setReturnClass(is.fjs.secure.TBRFellaNidurKrofuSvar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://secure.fjs.is/", "FellaNidurKrofuResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaekjaStoduSkips");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://secure.fjs.is/", "iStadaSkips"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStadaSkips"), is.fjs.secure.TBRStadaSkips.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStadaSkipsSvar"));
        oper.setReturnClass(is.fjs.secure.TBRStadaSkipsSvar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://secure.fjs.is/", "SaekjaStoduSkipsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

    }

    public ServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "ArrayOfGjald");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.Gjald[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "Gjald");
            qName2 = new javax.xml.namespace.QName("http://secure.fjs.is/", "Gjald");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "ArrayOfTBRSundurlidun");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRSundurlidun[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRSundurlidun");
            qName2 = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRSundurlidun");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "ArrayOfTBRSundurlidunFV1");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRSundurlidunFV1[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRSundurlidunFV1");
            qName2 = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRSundurlidunFV1");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "ArrayOfTBRSundurlidunVR");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRSundurlidunVR[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRSundurlidunVR");
            qName2 = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRSundurlidunVR");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "Gjald");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.Gjald.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "Haus");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.Haus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "SvarHaus");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.SvarHaus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRFellaNidurKrofu");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRFellaNidurKrofu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRFellaNidurKrofuSvar");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRFellaNidurKrofuSvar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRGjaldskra");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRGjaldskra.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRGjaldskraSvar");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRGjaldskraSvar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStadaSkips");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRStadaSkips.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStadaSkipsSvar");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRStadaSkipsSvar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStofnaKrofu");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRStofnaKrofu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStofnaKrofuFV1");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRStofnaKrofuFV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStofnaKrofuSvar");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRStofnaKrofuSvar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRStofnaKrofuVR");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRStofnaKrofuVR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRSundurlidun");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRSundurlidun.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRSundurlidunFV1");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRSundurlidunFV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://secure.fjs.is/", "TBRSundurlidunVR");
            cachedSerQNames.add(qName);
            cls = is.fjs.secure.TBRSundurlidunVR.class;
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

    public is.fjs.secure.TBRGjaldskraSvar saekjaGjaldskra(is.fjs.secure.TBRGjaldskra iGjaldskra) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://secure.fjs.is/SaekjaGjaldskra");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://secure.fjs.is/", "SaekjaGjaldskra"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {iGjaldskra});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fjs.secure.TBRGjaldskraSvar) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fjs.secure.TBRGjaldskraSvar) org.apache.axis.utils.JavaUtils.convert(_resp, is.fjs.secure.TBRGjaldskraSvar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fjs.secure.TBRStofnaKrofuSvar stofnaVeidiGjald(is.fjs.secure.TBRStofnaKrofuVR iStofnaKrofu) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://secure.fjs.is/StofnaVeidiGjald");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://secure.fjs.is/", "StofnaVeidiGjald"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {iStofnaKrofu});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fjs.secure.TBRStofnaKrofuSvar) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fjs.secure.TBRStofnaKrofuSvar) org.apache.axis.utils.JavaUtils.convert(_resp, is.fjs.secure.TBRStofnaKrofuSvar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fjs.secure.TBRStofnaKrofuSvar stofnaVeidileyfi(is.fjs.secure.TBRStofnaKrofu iStofnaKrofu) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://secure.fjs.is/StofnaVeidileyfi");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://secure.fjs.is/", "StofnaVeidileyfi"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {iStofnaKrofu});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fjs.secure.TBRStofnaKrofuSvar) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fjs.secure.TBRStofnaKrofuSvar) org.apache.axis.utils.JavaUtils.convert(_resp, is.fjs.secure.TBRStofnaKrofuSvar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fjs.secure.TBRStofnaKrofuSvar stofnaFlutningAflaHeimilda(is.fjs.secure.TBRStofnaKrofuFV1 iStofnaKrofu) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://secure.fjs.is/StofnaFlutningAflaHeimilda");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://secure.fjs.is/", "StofnaFlutningAflaHeimilda"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {iStofnaKrofu});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fjs.secure.TBRStofnaKrofuSvar) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fjs.secure.TBRStofnaKrofuSvar) org.apache.axis.utils.JavaUtils.convert(_resp, is.fjs.secure.TBRStofnaKrofuSvar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fjs.secure.TBRFellaNidurKrofuSvar fellaNidurKrofu(is.fjs.secure.TBRFellaNidurKrofu iFellaNidur) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://secure.fjs.is/FellaNidurKrofu");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://secure.fjs.is/", "FellaNidurKrofu"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {iFellaNidur});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fjs.secure.TBRFellaNidurKrofuSvar) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fjs.secure.TBRFellaNidurKrofuSvar) org.apache.axis.utils.JavaUtils.convert(_resp, is.fjs.secure.TBRFellaNidurKrofuSvar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fjs.secure.TBRStadaSkipsSvar saekjaStoduSkips(is.fjs.secure.TBRStadaSkips iStadaSkips) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://secure.fjs.is/SaekjaStoduSkips");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://secure.fjs.is/", "SaekjaStoduSkips"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {iStadaSkips});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fjs.secure.TBRStadaSkipsSvar) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fjs.secure.TBRStadaSkipsSvar) org.apache.axis.utils.JavaUtils.convert(_resp, is.fjs.secure.TBRStadaSkipsSvar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
