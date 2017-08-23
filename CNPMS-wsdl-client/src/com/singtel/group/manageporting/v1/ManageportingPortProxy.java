package com.singtel.group.manageporting.v1;

public class ManageportingPortProxy implements com.singtel.group.manageporting.v1.ManageportingPort {
  private String _endpoint = null;
  private com.singtel.group.manageporting.v1.ManageportingPort manageportingPort = null;
  
  public ManageportingPortProxy() {
    _initManageportingPortProxy();
  }
  
  public ManageportingPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initManageportingPortProxy();
  }
  
  private void _initManageportingPortProxy() {
    try {
      manageportingPort = (new com.singtel.group.manageporting.v1.ManagePortingLocator()).getManagePortingService();
      if (manageportingPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)manageportingPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)manageportingPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (manageportingPort != null)
      ((javax.xml.rpc.Stub)manageportingPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.singtel.group.manageporting.v1.ManageportingPort getManageportingPort() {
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort;
  }
  
  public com.singtel.group.manageporting_types.v1.SubmitPortResponse submitPortRequest(java.math.BigInteger attemptCounter, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID, com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID, com.singtel.group.manageporting_types.v1.PortingDetails portingDetails) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.submitPortRequest(attemptCounter, referenceID, serviceID, portingDetails);
  }
  
  public com.singtel.group.manageporting_types.v1.PortInNotificationResponse portInNotification(com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID, com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID, com.singtel.group.manageporting_types.v1.PortingResult portingResult, com.singtel.group.manageporting_types.v1.PortingDonor donor, java.util.Calendar orderedApprovalTime, java.util.Calendar recommendTransferTime) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.portInNotification(referenceID, requestID, serviceID, portingResult, donor, orderedApprovalTime, recommendTransferTime);
  }
  
  public com.singtel.group.manageporting_types.v1.NotifyServiceDisconnectionCompleteResponse notifyServiceDisconnectionComplete(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID, java.math.BigInteger status) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.notifyServiceDisconnectionComplete(requestID, serviceID, status);
  }
  
  public com.singtel.group.manageporting_types.v1.CancelPortInResponse cancelPortInRequest(com.singtel.group.manageporting_types.v1.CancelPortInRequest cancelPortInRequest) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.cancelPortInRequest(cancelPortInRequest);
  }
  
  public com.singtel.group.manageporting_types.v1.OrderTicketQueryResponse orderTicketQuery(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, java.util.Calendar dateRangeStart, java.util.Calendar dateRangeEnd, com.singtel.group.manageporting_types.v1.PortingDonor donor) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.orderTicketQuery(requestID, dateRangeStart, dateRangeEnd, donor);
  }
  
  public com.singtel.group.manageporting_types.v1.OrderTicketQueryResultResponse orderTicketQueryResult(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.TQResultCode resultCode, com.singtel.group.manageporting_types.v1.QuotaResult[] quotaResult) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.orderTicketQueryResult(requestID, resultCode, quotaResult);
  }
  
  public com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResponse notifyPortOutValidation(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID, com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResult result) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.notifyPortOutValidation(requestID, referenceID, result);
  }
  
  public com.singtel.group.manageporting_types.v1.ValidatePortOutResponse validatePortOut(com.singtel.group.manageporting_types.v1.PortingRefernceID referenceId, com.singtel.group.manageporting_types.v1.PortOutDetailsSN portOutDetails) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.validatePortOut(referenceId, portOutDetails);
  }
  
  public com.singtel.group.manageporting_types.v1.ConfirmPortOutOrderResponse confirmPortOutOrder(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.confirmPortOutOrder(requestID, referenceID);
  }
  
  public com.singtel.group.manageporting_types.v1.DisconnectServiceResponse disconnectService(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.ServiceInfo[] serviceDetailElements) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.disconnectService(requestID, serviceDetailElements);
  }
  
  public com.singtel.group.manageporting_types.v1.CancelPortOutResponse cancelPortOut(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID, com.singtel.group.manageporting_types.v1.CancellationReason cancellationReason) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.cancelPortOut(requestID, referenceID, cancellationReason);
  }
  
  public com.singtel.group.manageporting_types.v1.PortOutNotificationResponse portOutNotification(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.PortingRequestID referenceRequestId, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceId, com.singtel.group.manageporting_types.v1.PortOutError portOutError) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.portOutNotification(requestID, referenceRequestId, referenceId, portOutError);
  }
  
  public com.singtel.group.manageporting_types.v1.QueryCarrierInfoResponse queryCarrierInfo(com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.queryCarrierInfo(serviceID);
  }
  
  public com.singtel.group.manageporting_types.v1.ConnectServiceResponse connectService(com.singtel.group.manageporting_types.v1.PortingRequestID requestId, com.singtel.group.manageporting_types.v1.ServiceInfo[] serviceDetailElements) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault{
    if (manageportingPort == null)
      _initManageportingPortProxy();
    return manageportingPort.connectService(requestId, serviceDetailElements);
  }
  
  
}