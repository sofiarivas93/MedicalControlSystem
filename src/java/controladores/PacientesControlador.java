/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;
import modelos.Pacientes;
import utiles.Conexion;
import utiles.Utiles;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ALUMNO
 */
public class PacientesControlador {
    public static boolean agregar(Pacientes paciente){
        boolean valor=false;
        if (Conexion.conectar()){
            String sql="insert into pacientes(ci_paciente, nombre_paciente, apellido_paciente, edad_paciente, "
                    + "sexo_paciente)" + "values('"+paciente.getCi_paciente()+"','" +paciente.getNombre_paciente()+"','"+paciente.getApellido_paciente()+
                    "','"+paciente.getEdad_paciente()+"','"+paciente.getSexo_paciente()+"')";
            System.out.println(sql);
            try{
                Conexion.getSt().executeUpdate(sql);
                valor=true;
            }catch (SQLException ex){
                System.err.println("Error: "+ex);
            }
        }
        return valor;
    }
    
    public static boolean modificar(Pacientes paciente) {
        boolean valor = false;
        if (Conexion.conectar()) {

            String sql = "update pacientes set nombre_paciente= '" + paciente.getNombre_paciente()
                   + "where ci_paciente=" + paciente.getCi_paciente();
            // System.out.println("Mensj" + sql);
            try {
                Conexion.getSt().executeUpdate(sql);
                valor = true;

            } catch (SQLException ex) {
                System.out.println("Error Modif:" + ex);
            }
        }
        return valor;
    }

    public static boolean eliminar(Pacientes paciente) {
        boolean valor = false;
        if (Conexion.conectar()) {
            String sql = "delete from pacientes where ci_paciente=" + paciente.getCi_paciente() ;

            try {
                Conexion.getSt().executeUpdate(sql);
                valor = true;
            } catch (SQLException ex) {
                System.err.println("Error BORRAR:" + ex);
            }
        }
        return valor;
    }

}
