/**
 * ManageportingPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting.v1;

public interface ManageportingPort extends java.rmi.Remote {
    public com.singtel.group.manageporting_types.v1.SubmitPortResponse submitPortRequest(java.math.BigInteger attemptCounter, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID, com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID, com.singtel.group.manageporting_types.v1.PortingDetails portingDetails) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
    public com.singtel.group.manageporting_types.v1.PortInNotificationResponse portInNotification(com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID, com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID, com.singtel.group.manageporting_types.v1.PortingResult portingResult, com.singtel.group.manageporting_types.v1.PortingDonor donor, java.util.Calendar orderedApprovalTime, java.util.Calendar recommendTransferTime) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
    public com.singtel.group.manageporting_types.v1.NotifyServiceDisconnectionCompleteResponse notifyServiceDisconnectionComplete(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID, java.math.BigInteger status) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
    public com.singtel.group.manageporting_types.v1.CancelPortInResponse cancelPortInRequest(com.singtel.group.manageporting_types.v1.CancelPortInRequest cancelPortInRequest) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
    public com.singtel.group.manageporting_types.v1.OrderTicketQueryResponse orderTicketQuery(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, java.util.Calendar dateRangeStart, java.util.Calendar dateRangeEnd, com.singtel.group.manageporting_types.v1.PortingDonor donor) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
    public com.singtel.group.manageporting_types.v1.OrderTicketQueryResultResponse orderTicketQueryResult(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.TQResultCode resultCode, com.singtel.group.manageporting_types.v1.QuotaResult[] quotaResult) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
    public com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResponse notifyPortOutValidation(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID, com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResult result) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
    public com.singtel.group.manageporting_types.v1.ValidatePortOutResponse validatePortOut(com.singtel.group.manageporting_types.v1.PortingRefernceID referenceId, com.singtel.group.manageporting_types.v1.PortOutDetailsSN portOutDetails) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
    public com.singtel.group.manageporting_types.v1.ConfirmPortOutOrderResponse confirmPortOutOrder(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
    public com.singtel.group.manageporting_types.v1.DisconnectServiceResponse disconnectService(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.ServiceInfo[] serviceDetailElements) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
    public com.singtel.group.manageporting_types.v1.CancelPortOutResponse cancelPortOut(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID, com.singtel.group.manageporting_types.v1.CancellationReason cancellationReason) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
    public com.singtel.group.manageporting_types.v1.PortOutNotificationResponse portOutNotification(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.PortingRequestID referenceRequestId, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceId, com.singtel.group.manageporting_types.v1.PortOutError portOutError) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
    public com.singtel.group.manageporting_types.v1.QueryCarrierInfoResponse queryCarrierInfo(com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
    public com.singtel.group.manageporting_types.v1.ConnectServiceResponse connectService(com.singtel.group.manageporting_types.v1.PortingRequestID requestId, com.singtel.group.manageporting_types.v1.ServiceInfo[] serviceDetailElements) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault;
}
