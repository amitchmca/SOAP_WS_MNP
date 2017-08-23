/**
 * XvneMnpServiceBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.xvneMnpService;

public class XvneMnpServiceBindingSkeleton implements org.example.www.xvneMnpService.XvneMnpPortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.xvneMnpService.XvneMnpPortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SubscriberNumber"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.example.org/xvneMnpService/", "SubscriberNumberType"), org.example.www.xvneMnpService.SubscriberNumberType.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mvno"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reqId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.example.org/xvneMnpService/", "errorType"), org.example.www.xvneMnpService.ErrorType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getXvneCustDetails", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/xvneMnpService/", "getXvneCustDetails"));
        _oper.setSoapAction("http://www.example.org/xvneMnpService/getXvneCustDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getXvneCustDetails") == null) {
            _myOperations.put("getXvneCustDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getXvneCustDetails")).add(_oper);
    }

    public XvneMnpServiceBindingSkeleton() {
        this.impl = new org.example.www.xvneMnpService.XvneMnpServiceBindingImpl();
    }

    public XvneMnpServiceBindingSkeleton(org.example.www.xvneMnpService.XvneMnpPortType impl) {
        this.impl = impl;
    }
    public void getXvneCustDetails(org.example.www.xvneMnpService.holders.SubscriberNumberTypeHolder subscriberNumber, javax.xml.rpc.holders.StringHolder mvno, java.lang.String requestId, javax.xml.rpc.holders.StringHolder reqId, org.example.www.xvneMnpService.holders.ErrorTypeHolder error) throws java.rmi.RemoteException
    {
        impl.getXvneCustDetails(subscriberNumber, mvno, requestId, reqId, error);
    }

}
