<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServicioPersonaImplProxyid" scope="session" class="servicios.ServicioPersonaImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServicioPersonaImplProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleServicioPersonaImplProxyid.getEndpoint();
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
        sampleServicioPersonaImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        servicios.ServicioPersonaImpl getServicioPersonaImpl10mtemp = sampleServicioPersonaImplProxyid.getServicioPersonaImpl();
if(getServicioPersonaImpl10mtemp == null){
%>
<%=getServicioPersonaImpl10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String id_1id=  request.getParameter("id24");
        int id_1idTemp  = Integer.parseInt(id_1id);
        modelo.Persona getPersona15mtemp = sampleServicioPersonaImplProxyid.getPersona(id_1idTemp);
if(getPersona15mtemp == null){
%>
<%=getPersona15mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">edad:</TD>
<TD>
<%
if(getPersona15mtemp != null){
%>
<%=getPersona15mtemp.getEdad()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(getPersona15mtemp != null){
java.lang.String typenombre20 = getPersona15mtemp.getNombre();
        String tempResultnombre20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre20));
        %>
        <%= tempResultnombre20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getPersona15mtemp != null){
%>
<%=getPersona15mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 26:
        gotMethod = true;
        String id_2id=  request.getParameter("id29");
        int id_2idTemp  = Integer.parseInt(id_2id);
        boolean borrarPersona26mtemp = sampleServicioPersonaImplProxyid.borrarPersona(id_2idTemp);
        String tempResultreturnp27 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(borrarPersona26mtemp));
        %>
        <%= tempResultreturnp27 %>
        <%
break;
case 31:
        gotMethod = true;
        modelo.Persona[] getAllPersonas31mtemp = sampleServicioPersonaImplProxyid.getAllPersonas();
if(getAllPersonas31mtemp == null){
%>
<%=getAllPersonas31mtemp %>
<%
}else{
        String tempreturnp32 = null;
        if(getAllPersonas31mtemp != null){
        java.util.List listreturnp32= java.util.Arrays.asList(getAllPersonas31mtemp);
        tempreturnp32 = listreturnp32.toString();
        }
        %>
        <%=tempreturnp32%>
        <%
}
break;
case 34:
        gotMethod = true;
        String edad_4id=  request.getParameter("edad39");
        int edad_4idTemp  = Integer.parseInt(edad_4id);
        String nombre_5id=  request.getParameter("nombre41");
            java.lang.String nombre_5idTemp = null;
        if(!nombre_5id.equals("")){
         nombre_5idTemp  = nombre_5id;
        }
        String id_6id=  request.getParameter("id43");
        int id_6idTemp  = Integer.parseInt(id_6id);
        %>
        <jsp:useBean id="modelo1Persona_3id" scope="session" class="modelo.Persona" />
        <%
        modelo1Persona_3id.setEdad(edad_4idTemp);
        modelo1Persona_3id.setNombre(nombre_5idTemp);
        modelo1Persona_3id.setId(id_6idTemp);
        boolean addPersona34mtemp = sampleServicioPersonaImplProxyid.addPersona(modelo1Persona_3id);
        String tempResultreturnp35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addPersona34mtemp));
        %>
        <%= tempResultreturnp35 %>
        <%
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