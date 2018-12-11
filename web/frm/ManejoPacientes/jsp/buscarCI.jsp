<%-- 
    Document   : buscarId
    Created on : 12-abr-2018, 9:02:08
    Author     : ALUMNO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="modelos.Rubros"%>
<%@page import="controladores.RubrosControlador"%>

<%
    int id_rubro=Integer.parseInt(request.getParameter("id_rubro"));
    String tipo="error";
    String mensaje="Datos no encontrados.";
    String nuevo="true";
    
    Rubros rubro= RubrosControlador.buscarId(id_rubro);
    if(rubro!=null){
        tipo="success";
        mensaje ="Datos encontrados";
        nuevo ="false";
    }else{
        rubro=new Rubros();
    }
    JSONObject obj=new JSONObject();
    obj.put("tipo",tipo);
    obj.put("mensaje",mensaje);
    obj.put("nuevo",nuevo);
    obj.put("id_rubro",rubro.getId_rubro());
    obj.put("nombre_rubro",rubro.getNombre_rubro());
    
    out.print(obj);
    out.flush();

%>