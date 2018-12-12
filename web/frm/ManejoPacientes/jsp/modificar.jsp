
<%@page import="controladores.PacientesControlador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelos.Pacientes"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.sql.ResultSet"%>

<%
    int ci_paciente=Integer.parseInt(request.getParameter("ci_paciente"));
    String nombre_paciente=request.getParameter("nombre_paciente");
    String tipo="error";
    String mensaje="datos no modificados";
    Pacientes paciente=new Pacientes();
    paciente.setCi_paciente(ci_paciente);
    paciente.setNombre_paciente(nombre_paciente);
    if(PacientesControlador.modificar(paciente)){
        tipo="success";
        mensaje="Datos modificados";
       
    }
    JSONObject obj=new JSONObject();
    obj.put("tipo",tipo);
    obj.put("mensaje",mensaje);
    out.print(obj);
    out.flush();
%>