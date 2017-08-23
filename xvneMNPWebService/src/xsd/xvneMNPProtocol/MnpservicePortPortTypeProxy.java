package xsd.xvneMNPProtocol;

public class MnpservicePortPortTypeProxy implements xsd.xvneMNPProtocol.MnpservicePortPortType {
  private String _endpoint = null;
  private xsd.xvneMNPProtocol.MnpservicePortPortType mnpservicePortPortType = null;
  
  public MnpservicePortPortTypeProxy() {
    _initMnpservicePortPortTypeProxy();
  }
  
  public MnpservicePortPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMnpservicePortPortTypeProxy();
  }
  
  private void _initMnpservicePortPortTypeProxy() {
    try {
      mnpservicePortPortType = (new xsd.xvneMNPProtocol.XvnemnpservicePortLocator()).getxvnemnpservicePortSOAP11port_http();
      if (mnpservicePortPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mnpservicePortPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mnpservicePortPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mnpservicePortPortType != null)
      ((javax.xml.rpc.Stub)mnpservicePortPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public xsd.xvneMNPProtocol.MnpservicePortPortType getMnpservicePortPortType() {
    if (mnpservicePortPortType == null)
      _initMnpservicePortPortTypeProxy();
    return mnpservicePortPortType;
  }
  
  public void xvnesend(xsd.xvneMNPProtocol.XvneMNPFrame xvneMNPFrame) throws java.rmi.RemoteException{
    if (mnpservicePortPortType == null)
      _initMnpservicePortPortTypeProxy();
    mnpservicePortPortType.xvnesend(xvneMNPFrame);
  }
  
  
}