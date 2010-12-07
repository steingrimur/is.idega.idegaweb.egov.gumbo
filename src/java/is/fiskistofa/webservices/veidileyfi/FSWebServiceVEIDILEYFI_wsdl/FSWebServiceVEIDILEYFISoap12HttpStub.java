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
        _operations = new org.apache.axis.description.OperationDesc[15];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getaflamflutningstekkforskip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getaflamflutningstekkforskipElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getaflamflutningstekkforskipElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetaflamflutningstekkforskipElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getaflamflutningstekkforskipResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetaflamflutningstekkforskipResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getaflamflutningstekkforskipResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getdragnotvlcodeforskip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getdragnotvlcodeforskipElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getdragnotvlcodeforskipElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforskipElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getdragnotvlcodeforskipResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforskipResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getdragnotvlcodeforskipResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getdragnotvlcodeforutgerd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getdragnotvlcodeforutgerdElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getdragnotvlcodeforutgerdElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforutgerdElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getdragnotvlcodeforutgerdResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforutgerdResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getdragnotvlcodeforutgerdResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getersvipting");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getersviptingElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getersviptingElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetersviptingElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getersviptingResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetersviptingResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getersviptingResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getgrasleppuskipnrutgerdar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getgrasleppuskipnrutgerdarElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getgrasleppuskipnrutgerdarElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetgrasleppuskipnrutgerdarElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getgrasleppuskipnrutgerdarResponseElement"));
        oper.setReturnClass(java.math.BigDecimal[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getgrasleppuskipnrutgerdarResponseElement"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefuraflamarksveidil");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefuraflamarksveidilElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefuraflamarksveidilElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefuraflamarksveidilElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefuraflamarksveidilResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefuraflamarksveidilResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefuraflamarksveidilResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefurkrokaaflamarksveidil");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefurkrokaaflamarksveidilElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurkrokaaflamarksveidilElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurkrokaaflamarksveidilElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurkrokaaflamarksveidilResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurkrokaaflamarksveidilResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefurkrokaaflamarksveidilResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefurstrandveidileyfi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefurstrandveidileyfiElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurstrandveidileyfiElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurstrandveidileyfiElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurstrandveidileyfiResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurstrandveidileyfiResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefurstrandveidileyfiResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefurutgerdgrasleppuvlbykt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefurutgerdgrasleppuvlbyktElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurutgerdgrasleppuvlbyktElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdgrasleppuvlbyktElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurutgerdgrasleppuvlbyktResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdgrasleppuvlbyktResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefurutgerdgrasleppuvlbyktResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefurutgerdstrandvlbykt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefurutgerdstrandvlbyktElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurutgerdstrandvlbyktElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyktElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurutgerdstrandvlbyktResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyktResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefurutgerdstrandvlbyktResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefurutgerdstrandvlbyskip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefurutgerdstrandvlbyskipElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurutgerdstrandvlbyskipElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyskipElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurutgerdstrandvlbyskipResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyskipResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefurutgerdstrandvlbyskipResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gethefurveidileyfi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefurveidileyfiElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurveidileyfiElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurveidileyfiElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurveidileyfiResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurveidileyfiResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "gethefurveidileyfiResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getstrandvlcodeforskip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getstrandvlcodeforskipElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getstrandvlcodeforskipElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforskipElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getstrandvlcodeforskipResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforskipResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getstrandvlcodeforskipResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getstrandvlcodeforutgerd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getstrandvlcodeforutgerdElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getstrandvlcodeforutgerdElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforutgerdElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getstrandvlcodeforutgerdResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforutgerdResponseElement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getstrandvlcodeforutgerdResponseElement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getveidileyfibyskip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getveidileyfibyskipElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getveidileyfibyskipElement"), is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetveidileyfibyskipElement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getveidileyfibyskipResponseElement"));
        oper.setReturnClass(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfiTypeUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "getveidileyfibyskipResponseElement"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

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
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getaflamflutningstekkforskipElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetaflamflutningstekkforskipElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getaflamflutningstekkforskipResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetaflamflutningstekkforskipResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getdragnotvlcodeforskipElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforskipElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getdragnotvlcodeforskipResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforskipResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getdragnotvlcodeforutgerdElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforutgerdElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getdragnotvlcodeforutgerdResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforutgerdResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getersviptingElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetersviptingElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getersviptingResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetersviptingResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getgrasleppuskipnrutgerdarElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetgrasleppuskipnrutgerdarElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getgrasleppuskipnrutgerdarResponseElement");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal");
            qName2 = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefuraflamarksveidilElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefuraflamarksveidilElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefuraflamarksveidilResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefuraflamarksveidilResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurkrokaaflamarksveidilElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurkrokaaflamarksveidilElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurkrokaaflamarksveidilResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurkrokaaflamarksveidilResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurstrandveidileyfiElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurstrandveidileyfiElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurstrandveidileyfiResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurstrandveidileyfiResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurutgerdgrasleppuvlbyktElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdgrasleppuvlbyktElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurutgerdgrasleppuvlbyktResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdgrasleppuvlbyktResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurutgerdstrandvlbyktElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyktElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurutgerdstrandvlbyktResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyktResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurutgerdstrandvlbyskipElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyskipElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurutgerdstrandvlbyskipResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyskipResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurveidileyfiElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurveidileyfiElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">gethefurveidileyfiResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurveidileyfiResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getstrandvlcodeforskipElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforskipElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getstrandvlcodeforskipResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforskipResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getstrandvlcodeforutgerdElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforutgerdElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getstrandvlcodeforutgerdResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforutgerdResponseElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getveidileyfibyskipElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetveidileyfibyskipElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", ">getveidileyfibyskipResponseElement");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfiTypeUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "VeidileyfiTypeUser");
            qName2 = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "CheckReplyTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.CheckReplyTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "CheckReplyTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.CheckReplyTypeUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "CodeTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.CodeTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "CodeTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.CodeTypeUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "VeidileyfiTypeBase");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfiTypeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl", "VeidileyfiTypeUser");
            cachedSerQNames.add(qName);
            cls = is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfiTypeUser.class;
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

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetaflamflutningstekkforskipResponseElement getaflamflutningstekkforskip(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetaflamflutningstekkforskipElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/getaflamflutningstekkforskip");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getaflamflutningstekkforskip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetaflamflutningstekkforskipResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetaflamflutningstekkforskipResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetaflamflutningstekkforskipResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforskipResponseElement getdragnotvlcodeforskip(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforskipElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
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
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforskipResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforskipResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforskipResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforutgerdResponseElement getdragnotvlcodeforutgerd(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforutgerdElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
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
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforutgerdResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforutgerdResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforutgerdResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetersviptingResponseElement getersvipting(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetersviptingElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
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
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetersviptingResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetersviptingResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetersviptingResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.math.BigDecimal[] getgrasleppuskipnrutgerdar(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetgrasleppuskipnrutgerdarElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/getgrasleppuskipnrutgerdar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getgrasleppuskipnrutgerdar"));

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

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefuraflamarksveidilResponseElement gethefuraflamarksveidil(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefuraflamarksveidilElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
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
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefuraflamarksveidilResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefuraflamarksveidilResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefuraflamarksveidilResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurkrokaaflamarksveidilResponseElement gethefurkrokaaflamarksveidil(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurkrokaaflamarksveidilElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
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
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurkrokaaflamarksveidilResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurkrokaaflamarksveidilResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurkrokaaflamarksveidilResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurstrandveidileyfiResponseElement gethefurstrandveidileyfi(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurstrandveidileyfiElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
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
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurstrandveidileyfiResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurstrandveidileyfiResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurstrandveidileyfiResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdgrasleppuvlbyktResponseElement gethefurutgerdgrasleppuvlbykt(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdgrasleppuvlbyktElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
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
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdgrasleppuvlbyktResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdgrasleppuvlbyktResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdgrasleppuvlbyktResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyktResponseElement gethefurutgerdstrandvlbykt(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyktElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
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
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyktResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyktResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyktResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyskipResponseElement gethefurutgerdstrandvlbyskip(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyskipElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
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
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyskipResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyskipResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurutgerdstrandvlbyskipResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurveidileyfiResponseElement gethefurveidileyfi(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurveidileyfiElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
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
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurveidileyfiResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurveidileyfiResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurveidileyfiResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforskipResponseElement getstrandvlcodeforskip(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforskipElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
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
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforskipResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforskipResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforskipResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforutgerdResponseElement getstrandvlcodeforutgerd(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforutgerdElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
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
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforutgerdResponseElement) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforutgerdResponseElement) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforutgerdResponseElement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfiTypeUser[] getveidileyfibyskip(is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetveidileyfibyskipElement parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://is/fiskistofa/webservices/veidileyfi/FSWebServiceVEIDILEYFI.wsdl/getveidileyfibyskip");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getveidileyfibyskip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfiTypeUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfiTypeUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfiTypeUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
