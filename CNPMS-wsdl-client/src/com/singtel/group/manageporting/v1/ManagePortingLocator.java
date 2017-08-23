/**
 * ManagePortingLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting.v1;

public class ManagePortingLocator extends org.apache.axis.client.Service implements com.singtel.group.manageporting.v1.ManagePorting {

    public ManagePortingLocator() {
    }


    public ManagePortingLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagePortingLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagePortingService
    private java.lang.String ManagePortingService_address = "http://localhost:9090/networknumberinventorymanagement/ManageNumberPorting";

    public java.lang.String getManagePortingServiceAddress() {
        return ManagePortingService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagePortingServiceWSDDServiceName = "ManagePortingService";

    public java.lang.String getManagePortingServiceWSDDServiceName() {
        return ManagePortingServiceWSDDServiceName;
    }

    public void setManagePortingServiceWSDDServiceName(java.lang.String name) {
        ManagePortingServiceWSDDServiceName = name;
    }

    public com.singtel.group.manageporting.v1.ManageportingPort getManagePortingService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagePortingService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagePortingService(endpoint);
    }

    public com.singtel.group.manageporting.v1.ManageportingPort getManagePortingService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.singtel.group.manageporting.v1.ManageportingPort_SOAPBindingStub _stub = new com.singtel.group.manageporting.v1.ManageportingPort_SOAPBindingStub(portAddress, this);
            _stub.setPortName(getManagePortingServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagePortingServiceEndpointAddress(java.lang.String address) {
        ManagePortingService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.singtel.group.manageporting.v1.ManageportingPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.singtel.group.manageporting.v1.ManageportingPort_SOAPBindingStub _stub = new com.singtel.group.manageporting.v1.ManageportingPort_SOAPBindingStub(new java.net.URL(ManagePortingService_address), this);
                _stub.setPortName(getManagePortingServiceWSDDServiceName());
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
        if ("ManagePortingService".equals(inputPortName)) {
            return getManagePortingService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://group.singtel.com/manageporting/v1", "ManagePorting");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://group.singtel.com/manageporting/v1", "ManagePortingService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagePortingService".equals(portName)) {
            setManagePortingServiceEndpointAddress(address);
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
