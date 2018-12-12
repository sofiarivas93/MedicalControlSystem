
<%@page import="controladores.PacientesControlador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelos.Pacientes"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.sql.ResultSet"%>

<%
    int ci_paciente=Integer.parseInt(request.getParameter("ci_paciente"));
    String tipo="error";
    String mensaje="Datos no eliminados";
    Pacientes paciente=new Pacientes();
    paciente.setCi_paciente(ci_paciente);
    
    if(PacientesControlador.eliminar(paciente)){
        tipo="success";
        mensaje="Datos eliminados";
    }
    JSONObject obj=new JSONObject();
    obj.put("tipo",tipo);
    obj.put("mensaje",mensaje);
    out.print(obj);
    out.flush();
%>