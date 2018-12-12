

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="modelos.Pacientes"%>
<%@page import="controladores.PacientesControlador"%>

<%
    int ci_paciente=Integer.parseInt(request.getParameter("ci_paciente"));
    String tipo="error";
    String mensaje="Datos no encontrados.";
    String nuevo="true";
    
    Pacientes paciente= PacientesControlador.buscarCI(ci_paciente);
    if(paciente!=null){
        tipo="success";
        mensaje ="Datos encontrados";
        nuevo ="false";
    }else{
        paciente=new Pacientes();
    }
    JSONObject obj=new JSONObject();
    obj.put("tipo",tipo);
    obj.put("mensaje",mensaje);
    obj.put("nuevo",nuevo);
    obj.put("ci_paciente", paciente.getCi_paciente());

    
    out.print(obj);
    out.flush();

%>