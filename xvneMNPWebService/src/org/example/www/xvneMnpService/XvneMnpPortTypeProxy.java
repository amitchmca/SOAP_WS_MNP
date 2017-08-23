package org.example.www.xvneMnpService;

public class XvneMnpPortTypeProxy implements org.example.www.xvneMnpService.XvneMnpPortType {
  private String _endpoint = null;
  private org.example.www.xvneMnpService.XvneMnpPortType xvneMnpPortType = null;
  
  public XvneMnpPortTypeProxy() {
    _initXvneMnpPortTypeProxy();
  }
  
  public XvneMnpPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initXvneMnpPortTypeProxy();
  }
  
  private void _initXvneMnpPortTypeProxy() {
    try {
      xvneMnpPortType = (new org.example.www.xvneMnpService.XvneMnpWebServiceLocator()).getxvneMnpPort();
      if (xvneMnpPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)xvneMnpPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)xvneMnpPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (xvneMnpPortType != null)
      ((javax.xml.rpc.Stub)xvneMnpPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.example.www.xvneMnpService.XvneMnpPortType getXvneMnpPortType() {
    if (xvneMnpPortType == null)
      _initXvneMnpPortTypeProxy();
    return xvneMnpPortType;
  }
  
  public void getXvneCustDetails(org.example.www.xvneMnpService.holders.SubscriberNumberTypeHolder subscriberNumber, javax.xml.rpc.holders.StringHolder mvno, java.lang.String requestId, javax.xml.rpc.holders.StringHolder reqId, org.example.www.xvneMnpService.holders.ErrorTypeHolder error) throws java.rmi.RemoteException{
    if (xvneMnpPortType == null)
      _initXvneMnpPortTypeProxy();
    xvneMnpPortType.getXvneCustDetails(subscriberNumber, mvno, requestId, reqId, error);
  }
  
  
}