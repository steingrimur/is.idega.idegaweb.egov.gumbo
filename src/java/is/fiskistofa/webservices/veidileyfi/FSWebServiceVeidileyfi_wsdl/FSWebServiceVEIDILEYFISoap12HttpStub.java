/**
 * FSWebServiceVEIDILEYFISoap12HttpStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl;

public class FSWebServiceVEIDILEYFISoap12HttpStub extends org.apache.axis.client.Stub implements is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.FSWebServiceVEIDILEYFI_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getdragnotvlcodeforskip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "getdragnotvlcodeforskipElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getdragnotvlcodeforskipElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforskipElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getdragnotvlcodeforskipResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforskipResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "getdragnotvlcodeforskipResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getdragnotvlcodeforutgerd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "getdragnotvlcodeforutgerdElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getdragnotvlcodeforutgerdElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforutgerdElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getdragnotvlcodeforutgerdResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforutgerdResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "getdragnotvlcodeforutgerdResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getersvipting");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "getersviptingElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getersviptingElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetersviptingElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getersviptingResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetersviptingResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "getersviptingResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefuraflamarksveidil");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefuraflamarksveidilElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefuraflamarksveidilElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefuraflamarksveidilElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefuraflamarksveidilResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefuraflamarksveidilResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefuraflamarksveidilResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefurkrokaaflamarksveidil");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefurkrokaaflamarksveidilElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurkrokaaflamarksveidilElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurkrokaaflamarksveidilElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurkrokaaflamarksveidilResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurkrokaaflamarksveidilResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefurkrokaaflamarksveidilResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefurstrandveidileyfi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefurstrandveidileyfiElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurstrandveidileyfiElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurstrandveidileyfiElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurstrandveidileyfiResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurstrandveidileyfiResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefurstrandveidileyfiResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefurutgerdgrasleppuvlbykt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefurutgerdgrasleppuvlbyktElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurutgerdgrasleppuvlbyktElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdgrasleppuvlbyktElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurutgerdgrasleppuvlbyktResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdgrasleppuvlbyktResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefurutgerdgrasleppuvlbyktResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefurutgerdstrandvlbykt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefurutgerdstrandvlbyktElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurutgerdstrandvlbyktElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyktElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurutgerdstrandvlbyktResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyktResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefurutgerdstrandvlbyktResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefurutgerdstrandvlbyskip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefurutgerdstrandvlbyskipElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurutgerdstrandvlbyskipElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyskipElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurutgerdstrandvlbyskipResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyskipResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefurutgerdstrandvlbyskipResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefurveidileyfi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefurveidileyfiElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurveidileyfiElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurveidileyfiElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurveidileyfiResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurveidileyfiResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "gethefurveidileyfiResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getstrandvlcodeforskip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "getstrandvlcodeforskipElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getstrandvlcodeforskipElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforskipElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getstrandvlcodeforskipResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforskipResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "getstrandvlcodeforskipResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getstrandvlcodeforutgerd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "getstrandvlcodeforutgerdElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getstrandvlcodeforutgerdElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforutgerdElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getstrandvlcodeforutgerdResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforutgerdResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "getstrandvlcodeforutgerdResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

    }

    public FSWebServiceVEIDILEYFISoap12HttpStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public FSWebServiceVEIDILEYFISoap12HttpStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public FSWebServiceVEIDILEYFISoap12HttpStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getdragnotvlcodeforskipElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforskipElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getdragnotvlcodeforskipResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforskipResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getdragnotvlcodeforutgerdElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforutgerdElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getdragnotvlcodeforutgerdResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforutgerdResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getersviptingElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetersviptingElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getersviptingResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetersviptingResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefuraflamarksveidilElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefuraflamarksveidilElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefuraflamarksveidilResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefuraflamarksveidilResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurkrokaaflamarksveidilElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurkrokaaflamarksveidilElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurkrokaaflamarksveidilResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurkrokaaflamarksveidilResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurstrandveidileyfiElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurstrandveidileyfiElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurstrandveidileyfiResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurstrandveidileyfiResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurutgerdgrasleppuvlbyktElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdgrasleppuvlbyktElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurutgerdgrasleppuvlbyktResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdgrasleppuvlbyktResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurutgerdstrandvlbyktElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyktElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurutgerdstrandvlbyktResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyktResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurutgerdstrandvlbyskipElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyskipElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurutgerdstrandvlbyskipResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyskipResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurveidileyfiElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurveidileyfiElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">gethefurveidileyfiResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurveidileyfiResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getstrandvlcodeforskipElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforskipElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getstrandvlcodeforskipResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforskipResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getstrandvlcodeforutgerdElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforutgerdElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", ">getstrandvlcodeforutgerdResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforutgerdResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "CheckReplyTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.CheckReplyTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "CheckReplyTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.CheckReplyTypeUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "CodeTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.CodeTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/types/", "CodeTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.CodeTypeUser.class;
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

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforskipResponseElement getdragnotvlcodeforskip(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforskipElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/getdragnotvlcodeforskip");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getdragnotvlcodeforskip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforskipResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforskipResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforskipResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforutgerdResponseElement getdragnotvlcodeforutgerd(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforutgerdElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/getdragnotvlcodeforutgerd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getdragnotvlcodeforutgerd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforutgerdResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforutgerdResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetdragnotvlcodeforutgerdResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetersviptingResponseElement getersvipting(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetersviptingElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/getersvipting");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getersvipting"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetersviptingResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetersviptingResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetersviptingResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefuraflamarksveidilResponseElement gethefuraflamarksveidil(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefuraflamarksveidilElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/gethefuraflamarksveidil");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "gethefuraflamarksveidil"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefuraflamarksveidilResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefuraflamarksveidilResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefuraflamarksveidilResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurkrokaaflamarksveidilResponseElement gethefurkrokaaflamarksveidil(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurkrokaaflamarksveidilElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/gethefurkrokaaflamarksveidil");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "gethefurkrokaaflamarksveidil"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurkrokaaflamarksveidilResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurkrokaaflamarksveidilResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurkrokaaflamarksveidilResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurstrandveidileyfiResponseElement gethefurstrandveidileyfi(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurstrandveidileyfiElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/gethefurstrandveidileyfi");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "gethefurstrandveidileyfi"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurstrandveidileyfiResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurstrandveidileyfiResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurstrandveidileyfiResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdgrasleppuvlbyktResponseElement gethefurutgerdgrasleppuvlbykt(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdgrasleppuvlbyktElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/gethefurutgerdgrasleppuvlbykt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "gethefurutgerdgrasleppuvlbykt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdgrasleppuvlbyktResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdgrasleppuvlbyktResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdgrasleppuvlbyktResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyktResponseElement gethefurutgerdstrandvlbykt(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyktElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/gethefurutgerdstrandvlbykt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "gethefurutgerdstrandvlbykt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyktResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyktResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyktResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyskipResponseElement gethefurutgerdstrandvlbyskip(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyskipElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/gethefurutgerdstrandvlbyskip");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "gethefurutgerdstrandvlbyskip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyskipResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyskipResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurutgerdstrandvlbyskipResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurveidileyfiResponseElement gethefurveidileyfi(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurveidileyfiElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/gethefurveidileyfi");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "gethefurveidileyfi"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurveidileyfiResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurveidileyfiResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurveidileyfiResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforskipResponseElement getstrandvlcodeforskip(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforskipElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/getstrandvlcodeforskip");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getstrandvlcodeforskip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforskipResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforskipResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforskipResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforutgerdResponseElement getstrandvlcodeforutgerd(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforutgerdElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/getstrandvlcodeforutgerd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getstrandvlcodeforutgerd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforutgerdResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforutgerdResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GetstrandvlcodeforutgerdResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
