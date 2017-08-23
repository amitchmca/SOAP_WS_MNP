/**
 * XvnemnpservicePortSOAP11BindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package xsd.xvneMNPProtocol;

public class XvnemnpservicePortSOAP11BindingSkeleton implements xsd.xvneMNPProtocol.MnpservicePortPortType, org.apache.axis.wsdl.Skeleton {
    private xsd.xvneMNPProtocol.MnpservicePortPortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("xvneMNPProtocol.xsd", "xvneMNPFrame"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("xvneMNPProtocol.xsd", ">xvneMNPFrame"), xsd.xvneMNPProtocol.XvneMNPFrame.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("xvnesend", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("", "xvnesend"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("xvnesend") == null) {
            _myOperations.put("xvnesend", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("xvnesend")).add(_oper);
    }

    public XvnemnpservicePortSOAP11BindingSkeleton() {
        this.impl = new xsd.xvneMNPProtocol.XvnemnpservicePortSOAP11BindingImpl();
    }

    public XvnemnpservicePortSOAP11BindingSkeleton(xsd.xvneMNPProtocol.MnpservicePortPortType impl) {
        this.impl = impl;
    }
    public void xvnesend(xsd.xvneMNPProtocol.XvneMNPFrame xvneMNPFrame) throws java.rmi.RemoteException
    {
        impl.xvnesend(xvneMNPFrame);
    }

}
