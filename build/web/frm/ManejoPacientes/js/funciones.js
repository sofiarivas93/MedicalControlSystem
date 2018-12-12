/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function agregarPaciente() {
    var datosFormulario = $("#formPrograma").serialize();
    $.ajax({
        type: 'POST',
        url: '../jsp/agregar.jsp',
        data: datosFormulario,
        dataType: 'json',
        beforeSend: function (objeto) {
            $("#mensajes").html("Enviando datos al Servidor ...");
        },
        success: function (json) {
            $("#mensajes").html(json.mensaje);
            limpiarFormulario();
            $("#ci_paciente").focus();
            $("#ci_paciente").select();
        },
        error: function (e) {
            $("#mensajes").html("No se pudo agregar los datos.");
        },
        complete: function (objeto, exito, error) {
            $("#ci_paciente").focus();
        }
    });
}

function limpiarFormulario() {
    $("#nombre_paciente").val("");
    $("#apellido_paciente").val("");
    $("#ci_paciente").val("0");
    $("#edad_paciente").val("0");
    $("#sexo_paciente").val("0");
}
function validarFormulario() {
    var valor = true;
    if ($("#nombre_paciente").val().trim() === "") {
        valor = false;
        $("#mensajes").html("Nombre no puede estar vacio.");
        $("#nombre_paciente").focus();
    }

    return valor;
}

function buscarPacientes() {

    $.ajax({
        type: "POST",
        url: "../jsp/pacienteBusqueda.jsp",
        dataType: 'json',
        
        success: function (json)
        {
            $("#lista_pacientes").html(json.pacientes).fadeIn();
           
        }
    });

}


function buscarCIPaciente() {
    var datosFormulario = $("#formPrograma").serialize();
    //alert(datosFormulario);
    $.ajax({
        type: 'POST',
        url: '../jsp/buscarCI.jsp',
        data: datosFormulario,
        dataType: 'json',
        beforeSend: function (objeto) {
            $("#mensajes").html("Enviando datos al Servidor ...");
        },
        success: function (json) {
            $("#mensajes").html(json.mensaje);
            $("#ci_paciente").val(json.ci_paciente);
            $("#nombre_paciente").val(json.nombre_paciente);
            
           
        },

        error: function (e) {
            $("#mensajes").html("No se pudo recuperar los datos.");
        },
        complete: function (objeto, exito, error) {
            if (exito === "success") {

            }
        }
    });
}