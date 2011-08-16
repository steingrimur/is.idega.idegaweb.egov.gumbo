/**
 * FSWebServiceSKIPSoap12HttpStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl;

public class FSWebServiceSKIPSoap12HttpStub extends org.apache.axis.client.Stub implements is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIP_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getskiperfiskiskip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskiperfiskiskipElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskiperfiskiskipElement"), is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiperfiskiskipElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskiperfiskiskipResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiperfiskiskipResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskiperfiskiskipResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getskiphefurgilthaffaeri");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskiphefurgilthaffaeriElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskiphefurgilthaffaeriElement"), is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiphefurgilthaffaeriElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskiphefurgilthaffaeriResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiphefurgilthaffaeriResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskiphefurgilthaffaeriResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getskipinfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskipinfoElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipinfoElement"), is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipinfoResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskipinfoResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getskipinfobyeigandi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskipinfobyeigandiElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipinfobyeigandiElement"), is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfobyeigandiElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipinfobyeigandiResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskipinfobyeigandiResponseElement"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getskipinfobyutgerd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskipinfobyutgerdElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipinfobyutgerdElement"), is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfobyutgerdElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipinfobyutgerdResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskipinfobyutgerdResponseElement"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getskipnrbyeigandi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskipnrbyeigandiElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipnrbyeigandiElement"), is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipnrbyeigandiElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipnrbyeigandiResponseElement"));
        oper.setReturnClass(java.math.BigDecimal[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskipnrbyeigandiResponseElement"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getskipnrbyutgerd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskipnrbyutgerdElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipnrbyutgerdElement"), is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipnrbyutgerdElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipnrbyutgerdResponseElement"));
        oper.setReturnClass(java.math.BigDecimal[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "getskipnrbyutgerdResponseElement"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

    }

    public FSWebServiceSKIPSoap12HttpStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public FSWebServiceSKIPSoap12HttpStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public FSWebServiceSKIPSoap12HttpStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskiperfiskiskipElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiperfiskiskipElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskiperfiskiskipResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiperfiskiskipResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskiphefurgilthaffaeriElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiphefurgilthaffaeriElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskiphefurgilthaffaeriResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiphefurgilthaffaeriResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipinfobyeigandiElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfobyeigandiElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipinfobyeigandiResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "SkipInfoTypeUser");
            qName2 = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipinfobyutgerdElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfobyutgerdElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipinfobyutgerdResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "SkipInfoTypeUser");
            qName2 = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipinfoElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipinfoResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipnrbyeigandiElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipnrbyeigandiElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipnrbyeigandiResponseElement");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal");
            qName2 = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipnrbyutgerdElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipnrbyutgerdElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", ">getskipnrbyutgerdResponseElement");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal");
            qName2 = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "CheckReplyTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.CheckReplyTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "CheckReplyTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.CheckReplyTypeUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "SkipInfoTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl", "SkipInfoTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser.class;
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

    public is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiperfiskiskipResponseElement getskiperfiskiskip(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiperfiskiskipElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl/getskiperfiskiskip");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getskiperfiskiskip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiperfiskiskipResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiperfiskiskipResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiperfiskiskipResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiphefurgilthaffaeriResponseElement getskiphefurgilthaffaeri(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiphefurgilthaffaeriElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl/getskiphefurgilthaffaeri");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getskiphefurgilthaffaeri"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiphefurgilthaffaeriResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiphefurgilthaffaeriResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiphefurgilthaffaeriResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoResponseElement getskipinfo(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl/getskipinfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getskipinfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser[] getskipinfobyeigandi(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfobyeigandiElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl/getskipinfobyeigandi");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getskipinfobyeigandi"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser[] getskipinfobyutgerd(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfobyutgerdElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl/getskipinfobyutgerd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getskipinfobyutgerd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.math.BigDecimal[] getskipnrbyeigandi(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipnrbyeigandiElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl/getskipnrbyeigandi");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getskipnrbyeigandi"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.math.BigDecimal[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.math.BigDecimal[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.math.BigDecimal[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.math.BigDecimal[] getskipnrbyutgerd(is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipnrbyutgerdElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/skip/FSWebServiceSKIP.wsdl/getskipnrbyutgerd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getskipnrbyutgerd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.math.BigDecimal[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.math.BigDecimal[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.math.BigDecimal[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
