/**
 * XvneMnpPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.xvneMnpService;

public interface XvneMnpPortType extends java.rmi.Remote {
    public void getXvneCustDetails(org.example.www.xvneMnpService.holders.SubscriberNumberTypeHolder subscriberNumber, javax.xml.rpc.holders.StringHolder mvno, java.lang.String requestId, javax.xml.rpc.holders.StringHolder reqId, org.example.www.xvneMnpService.holders.ErrorTypeHolder error) throws java.rmi.RemoteException;
}
