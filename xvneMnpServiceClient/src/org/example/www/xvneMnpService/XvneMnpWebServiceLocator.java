/**
 * XvneMnpWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.xvneMnpService;

public class XvneMnpWebServiceLocator extends org.apache.axis.client.Service implements org.example.www.xvneMnpService.XvneMnpWebService {

    public XvneMnpWebServiceLocator() {
    }


    public XvneMnpWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public XvneMnpWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for xvneMnpPort
    private java.lang.String xvneMnpPort_address = "http://localhost:9000/xvneMNPWebService/services/xvneMnpPort";

    public java.lang.String getxvneMnpPortAddress() {
        return xvneMnpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String xvneMnpPortWSDDServiceName = "xvneMnpPort";

    public java.lang.String getxvneMnpPortWSDDServiceName() {
        return xvneMnpPortWSDDServiceName;
    }

    public void setxvneMnpPortWSDDServiceName(java.lang.String name) {
        xvneMnpPortWSDDServiceName = name;
    }

    public org.example.www.xvneMnpService.XvneMnpPortType getxvneMnpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(xvneMnpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getxvneMnpPort(endpoint);
    }

    public org.example.www.xvneMnpService.XvneMnpPortType getxvneMnpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.xvneMnpService.XvneMnpPortSoapBindingStub _stub = new org.example.www.xvneMnpService.XvneMnpPortSoapBindingStub(portAddress, this);
            _stub.setPortName(getxvneMnpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setxvneMnpPortEndpointAddress(java.lang.String address) {
        xvneMnpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.xvneMnpService.XvneMnpPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.xvneMnpService.XvneMnpPortSoapBindingStub _stub = new org.example.www.xvneMnpService.XvneMnpPortSoapBindingStub(new java.net.URL(xvneMnpPort_address), this);
                _stub.setPortName(getxvneMnpPortWSDDServiceName());
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
        if ("xvneMnpPort".equals(inputPortName)) {
            return getxvneMnpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/xvneMnpService/", "xvneMnpWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/xvneMnpService/", "xvneMnpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("xvneMnpPort".equals(portName)) {
            setxvneMnpPortEndpointAddress(address);
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
