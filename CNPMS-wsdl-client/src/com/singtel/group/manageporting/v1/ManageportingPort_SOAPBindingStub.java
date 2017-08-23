/**
 * ManageportingPort_SOAPBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.singtel.group.manageporting.v1;

public class ManageportingPort_SOAPBindingStub extends org.apache.axis.client.Stub implements com.singtel.group.manageporting.v1.ManageportingPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[14];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submitPortRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "attemptCounter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRefernceID"), com.singtel.group.manageporting_types.v1.PortingRefernceID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "serviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/customerproduct-common/types/v1", "ProductServiceID"), com.singtel.group.customerproduct_common.types.v1.ProductServiceID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portingDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDetails"), com.singtel.group.manageporting_types.v1.PortingDetails.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "SubmitPortResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.SubmitPortResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "submitPortResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("portInNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRefernceID"), com.singtel.group.manageporting_types.v1.PortingRefernceID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"), com.singtel.group.manageporting_types.v1.PortingRequestID.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "serviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/customerproduct-common/types/v1", "ProductServiceID"), com.singtel.group.customerproduct_common.types.v1.ProductServiceID.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portingResult"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingResult"), com.singtel.group.manageporting_types.v1.PortingResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "donor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDonor"), com.singtel.group.manageporting_types.v1.PortingDonor.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "orderedApprovalTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "recommendTransferTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortInNotificationResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.PortInNotificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portInNotificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("notifyServiceDisconnectionComplete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"), com.singtel.group.manageporting_types.v1.PortingRequestID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "serviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/customerproduct-common/types/v1", "ProductServiceID"), com.singtel.group.customerproduct_common.types.v1.ProductServiceID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">NotifyServiceDisconnectionComplete>status"), java.math.BigInteger.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "NotifyServiceDisconnectionCompleteResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.NotifyServiceDisconnectionCompleteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "notifyServiceDisconnectionCompleteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelPortInRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "cancelPortInRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "CancelPortInRequest"), com.singtel.group.manageporting_types.v1.CancelPortInRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "CancelPortInResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.CancelPortInResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "cancelPortInResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("orderTicketQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"), com.singtel.group.manageporting_types.v1.PortingRequestID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "dateRangeStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "dateRangeEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "donor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDonor"), com.singtel.group.manageporting_types.v1.PortingDonor.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "OrderTicketQueryResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.OrderTicketQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "orderTicketQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("orderTicketQueryResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"), com.singtel.group.manageporting_types.v1.PortingRequestID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "resultCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "TQResultCode"), com.singtel.group.manageporting_types.v1.TQResultCode.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "quotaResult"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "QuotaResult"), com.singtel.group.manageporting_types.v1.QuotaResult[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "OrderTicketQueryResultResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.OrderTicketQueryResultResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "orderTicketQueryResultResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("notifyPortOutValidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"), com.singtel.group.manageporting_types.v1.PortingRequestID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRefernceID"), com.singtel.group.manageporting_types.v1.PortingRefernceID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "result"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "NotifyPortOutValidationResult"), com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResult.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "NotifyPortOutValidationResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "notifyPortOutValidationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validatePortOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRefernceID"), com.singtel.group.manageporting_types.v1.PortingRefernceID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portOutDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortOutDetailsSN"), com.singtel.group.manageporting_types.v1.PortOutDetailsSN.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "ValidatePortOutResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.ValidatePortOutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "validatePortOutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmPortOutOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"), com.singtel.group.manageporting_types.v1.PortingRequestID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRefernceID"), com.singtel.group.manageporting_types.v1.PortingRefernceID.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "ConfirmPortOutOrderResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.ConfirmPortOutOrderResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "confirmPortOutOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("disconnectService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"), com.singtel.group.manageporting_types.v1.PortingRequestID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "serviceDetailElements"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "ServiceInfo"), com.singtel.group.manageporting_types.v1.ServiceInfo[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "DisconnectServiceResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.DisconnectServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "disconnectServiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelPortOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"), com.singtel.group.manageporting_types.v1.PortingRequestID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRefernceID"), com.singtel.group.manageporting_types.v1.PortingRefernceID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "cancellationReason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "CancellationReason"), com.singtel.group.manageporting_types.v1.CancellationReason.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "CancelPortOutResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.CancelPortOutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "cancelPortOutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("portOutNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"), com.singtel.group.manageporting_types.v1.PortingRequestID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceRequestId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"), com.singtel.group.manageporting_types.v1.PortingRequestID.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "referenceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRefernceID"), com.singtel.group.manageporting_types.v1.PortingRefernceID.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portOutError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortOutError"), com.singtel.group.manageporting_types.v1.PortOutError.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortOutNotificationResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.PortOutNotificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "portOutNotificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryCarrierInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "serviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/customerproduct-common/types/v1", "ProductServiceID"), com.singtel.group.customerproduct_common.types.v1.ProductServiceID.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "QueryCarrierInfoResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.QueryCarrierInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "queryCarrierInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("connectService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "requestId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID"), com.singtel.group.manageporting_types.v1.PortingRequestID.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "serviceDetailElements"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "ServiceInfo"), com.singtel.group.manageporting_types.v1.ServiceInfo[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "ConnectServiceResponse"));
        oper.setReturnClass(com.singtel.group.manageporting_types.v1.ConnectServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "connectServiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "sdpDetails"),
                      "com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault",
                      new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault"), 
                      true
                     ));
        _operations[13] = oper;

    }

    public ManageportingPort_SOAPBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ManageportingPort_SOAPBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ManageportingPort_SOAPBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://group.singtel.com/core/types/v1", "CustomerTypeLevel1All");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.core.types.v1.CustomerTypeLevel1All.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/core/types/v1", "SubscriptionType");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.core.types.v1.SubscriptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/customerproduct-common/types/v1", ">ProductServiceID>serviceID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/customerproduct-common/types/v1", "ProductServiceID");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.customerproduct_common.types.v1.ProductServiceID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "ResponseStatusCodeENUM");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.enterpriseapplicationintegration.common_types.v1.ResponseStatusCodeENUM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPSeverity");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPSeverity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusFault");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusLine");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/enterpriseapplicationintegration/common-types/v1", "SDPStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">CancellationReason>reasonCode");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">CancellationReason>reasonText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">CancelPortInRequestSN>cancelReasonCode");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">IndividualPorting>id");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">IndividualPorting>name");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">NotifyPortOutValidationResult>resultCode");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">NotifyPortOutValidationResult>resultText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">NotifyServiceDisconnectionComplete>status");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">OrganizationPorting>AccountNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">OrganizationPorting>id");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">OrganizationPorting>name");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingDetailsOP>donorAccountID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingDetailsOP>paymentCategory");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingDetailsOP>portType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingDetailsOP>prevPortOutRefernceID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingDetailsOP>recipient");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingDetailsSN>byLOA");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingDetailsSN>paymentCategory");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingDetailsSN>prevPortingRefernceID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingDetailsSN>recipient");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingDetailsSN>routeNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingDetailsSN>UndertakingAck");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingDonor>id");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingRefernceID>id");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortingRequestID>id");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortOutDetailsSN>paymentCategory");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortOutDetailsSN>prevPortingRefernceID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortOutError>errorCode");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">PortOutError>errorText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">QueryCarrierInfoResponse>currentCarrier");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">QueryCarrierInfoResponse>donorCarrier");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", ">TQResultCode>code");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "CancellationReason");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.CancellationReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "CancelPortInRequest");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.CancelPortInRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "CancelPortInRequestOP");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.CancelPortInRequestOP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "CancelPortInRequestSN");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.CancelPortInRequestSN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "CancelPortInResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.CancelPortInResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "CancelPortOutResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.CancelPortOutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "ConfirmPortOutOrderResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.ConfirmPortOutOrderResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "ConnectServiceResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.ConnectServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "DisconnectServiceResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.DisconnectServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "IndividualPorting");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.IndividualPorting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "NotifyPortOutValidationResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "NotifyPortOutValidationResult");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "NotifyServiceDisconnectionCompleteResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.NotifyServiceDisconnectionCompleteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "OrderTicketQueryResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.OrderTicketQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "OrderTicketQueryResultResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.OrderTicketQueryResultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "OrganizationPorting");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.OrganizationPorting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDetails");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.PortingDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDetailsOP");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.PortingDetailsOP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDetailsSN");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.PortingDetailsSN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingDonor");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.PortingDonor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRefernceID");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.PortingRefernceID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingRequestID");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.PortingRequestID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortingResult");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.PortingResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortInNotificationResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.PortInNotificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortNotificationResultCode");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.PortNotificationResultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortOutDetailsSN");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.PortOutDetailsSN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortOutError");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.PortOutError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortOutNotificationResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.PortOutNotificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "PortOutNotifyType");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.PortOutNotifyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "QueryCarrierInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.QueryCarrierInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "QuotaResult");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.QuotaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "ServiceInfo");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.ServiceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "SubmitPortResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.SubmitPortResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "TQResultCode");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.TQResultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://group.singtel.com/manageporting-types/v1", "ValidatePortOutResponse");
            cachedSerQNames.add(qName);
            cls = com.singtel.group.manageporting_types.v1.ValidatePortOutResponse.class;
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

    public com.singtel.group.manageporting_types.v1.SubmitPortResponse submitPortRequest(java.math.BigInteger attemptCounter, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID, com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID, com.singtel.group.manageporting_types.v1.PortingDetails portingDetails) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("submitPortRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "submitPortRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {attemptCounter, referenceID, serviceID, portingDetails});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.SubmitPortResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.SubmitPortResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.SubmitPortResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.singtel.group.manageporting_types.v1.PortInNotificationResponse portInNotification(com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID, com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID, com.singtel.group.manageporting_types.v1.PortingResult portingResult, com.singtel.group.manageporting_types.v1.PortingDonor donor, java.util.Calendar orderedApprovalTime, java.util.Calendar recommendTransferTime) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("portInNotification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "portInNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {referenceID, requestID, serviceID, portingResult, donor, orderedApprovalTime, recommendTransferTime});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.PortInNotificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.PortInNotificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.PortInNotificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.singtel.group.manageporting_types.v1.NotifyServiceDisconnectionCompleteResponse notifyServiceDisconnectionComplete(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID, java.math.BigInteger status) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("notifyServiceDisconnectionComplete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "notifyServiceDisconnectionComplete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestID, serviceID, status});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.NotifyServiceDisconnectionCompleteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.NotifyServiceDisconnectionCompleteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.NotifyServiceDisconnectionCompleteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.singtel.group.manageporting_types.v1.CancelPortInResponse cancelPortInRequest(com.singtel.group.manageporting_types.v1.CancelPortInRequest cancelPortInRequest) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("cancelPortInRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancelPortInRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cancelPortInRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.CancelPortInResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.CancelPortInResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.CancelPortInResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.singtel.group.manageporting_types.v1.OrderTicketQueryResponse orderTicketQuery(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, java.util.Calendar dateRangeStart, java.util.Calendar dateRangeEnd, com.singtel.group.manageporting_types.v1.PortingDonor donor) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("orderTicketQuery");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "orderTicketQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestID, dateRangeStart, dateRangeEnd, donor});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.OrderTicketQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.OrderTicketQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.OrderTicketQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.singtel.group.manageporting_types.v1.OrderTicketQueryResultResponse orderTicketQueryResult(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.TQResultCode resultCode, com.singtel.group.manageporting_types.v1.QuotaResult[] quotaResult) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("orderTicketQueryResult");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "orderTicketQueryResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestID, resultCode, quotaResult});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.OrderTicketQueryResultResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.OrderTicketQueryResultResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.OrderTicketQueryResultResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResponse notifyPortOutValidation(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID, com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResult result) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("notifyPortOutValidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "notifyPortOutValidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestID, referenceID, result});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.NotifyPortOutValidationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.singtel.group.manageporting_types.v1.ValidatePortOutResponse validatePortOut(com.singtel.group.manageporting_types.v1.PortingRefernceID referenceId, com.singtel.group.manageporting_types.v1.PortOutDetailsSN portOutDetails) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validatePortOut");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validatePortOut"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {referenceId, portOutDetails});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.ValidatePortOutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.ValidatePortOutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.ValidatePortOutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.singtel.group.manageporting_types.v1.ConfirmPortOutOrderResponse confirmPortOutOrder(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("confirmPortOutOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "confirmPortOutOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestID, referenceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.ConfirmPortOutOrderResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.ConfirmPortOutOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.ConfirmPortOutOrderResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.singtel.group.manageporting_types.v1.DisconnectServiceResponse disconnectService(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.ServiceInfo[] serviceDetailElements) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("disconnectService");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "disconnectService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestID, serviceDetailElements});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.DisconnectServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.DisconnectServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.DisconnectServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.singtel.group.manageporting_types.v1.CancelPortOutResponse cancelPortOut(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceID, com.singtel.group.manageporting_types.v1.CancellationReason cancellationReason) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("cancelPortOut");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancelPortOut"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestID, referenceID, cancellationReason});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.CancelPortOutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.CancelPortOutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.CancelPortOutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.singtel.group.manageporting_types.v1.PortOutNotificationResponse portOutNotification(com.singtel.group.manageporting_types.v1.PortingRequestID requestID, com.singtel.group.manageporting_types.v1.PortingRequestID referenceRequestId, com.singtel.group.manageporting_types.v1.PortingRefernceID referenceId, com.singtel.group.manageporting_types.v1.PortOutError portOutError) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("portOutNotification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "portOutNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestID, referenceRequestId, referenceId, portOutError});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.PortOutNotificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.PortOutNotificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.PortOutNotificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.singtel.group.manageporting_types.v1.QueryCarrierInfoResponse queryCarrierInfo(com.singtel.group.customerproduct_common.types.v1.ProductServiceID serviceID) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("queryCarrierInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "queryCarrierInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.QueryCarrierInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.QueryCarrierInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.QueryCarrierInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.singtel.group.manageporting_types.v1.ConnectServiceResponse connectService(com.singtel.group.manageporting_types.v1.PortingRequestID requestId, com.singtel.group.manageporting_types.v1.ServiceInfo[] serviceDetailElements) throws java.rmi.RemoteException, com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("connectService");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "connectService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestId, serviceDetailElements});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.singtel.group.manageporting_types.v1.ConnectServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.singtel.group.manageporting_types.v1.ConnectServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.singtel.group.manageporting_types.v1.ConnectServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) {
              throw (com.singtel.group.enterpriseapplicationintegration.common_types.v1.SDPStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
