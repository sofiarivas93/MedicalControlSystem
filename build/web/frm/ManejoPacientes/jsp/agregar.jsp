alert("Hola");
<%@page import="controladores.PacientesControlador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelos.Pacientes"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.sql.ResultSet"%>
<%
    //int id_paciente=Integer.parseInt(request.getParameter("id_paciente"));
    int ci_paciente=Integer.parseInt(request.getParameter("ci_paciente"));
    String nombre_paciente=request.getParameter("nombre_paciente");
    String apellido_paciente=request.getParameter("apellido_paciente");
    int edad_paciente=Integer.parseInt(request.getParameter("edad_paciente"));
    String sexo_paciente=request.getParameter("sexo_paciente");
    
    
    String tipo="error";
    String mensaje="Datos no agregados.";

    Pacientes paciente =  new Pacientes();
    //paciente.setId_paciente(id_paciente);
    paciente.setCi_paciente(ci_paciente);
    paciente.setNombre_paciente(nombre_paciente);
    paciente.setApellido_paciente(apellido_paciente);
    paciente.setEdad_paciente(edad_paciente);
    paciente.setSexo_paciente(sexo_paciente);



    if(PacientesControlador.agregar(paciente)){
        tipo="success";
        mensaje="Datos agregados";
    }
    JSONObject obj = new JSONObject();
    obj.put("tipo",tipo);
    obj.put("mensaje", mensaje);
    out.print(obj);
    out.flush();
%>