<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleMnpservicePortPortTypeProxyid" scope="session" class="xsd.xvneMNPProtocol.MnpservicePortPortTypeProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleMnpservicePortPortTypeProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleMnpservicePortPortTypeProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleMnpservicePortPortTypeProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        xsd.xvneMNPProtocol.MnpservicePortPortType getMnpservicePortPortType10mtemp = sampleMnpservicePortPortTypeProxyid.getMnpservicePortPortType();
if(getMnpservicePortPortType10mtemp == null){
%>
<%=getMnpservicePortPortType10mtemp %>
<%
}else{
        if(getMnpservicePortPortType10mtemp!= null){
        String tempreturnp11 = getMnpservicePortPortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String version_2id=  request.getParameter("version18");
            java.lang.String version_2idTemp = null;
        if(!version_2id.equals("")){
         version_2idTemp  = version_2id;
        }
        %>
        <jsp:useBean id="xsd1xvneMNPProtocol1XvneMNPFrame_1id" scope="session" class="xsd.xvneMNPProtocol.XvneMNPFrame" />
        <%
        xsd1xvneMNPProtocol1XvneMNPFrame_1id.setVersion(version_2idTemp);
        sampleMnpservicePortPortTypeProxyid.xvnesend(xsd1xvneMNPProtocol1XvneMNPFrame_1id);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>