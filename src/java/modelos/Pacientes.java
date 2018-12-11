/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author ALUMNO
 */

public class Pacientes {
    
    private int id_paciente;
    private String nombre_paciente;
    private String apellido_paciente;
    private int ci_paciente;
    private int edad_paciente;
    private String sexo_paciente;

    public Pacientes() {
    }
    
    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public String getApellido_paciente() {
        return apellido_paciente;
    }

    public void setApellido_paciente(String apellido_paciente) {
        this.apellido_paciente = apellido_paciente;
    }

    public int getCi_paciente() {
        return ci_paciente;
    }

    public void setCi_paciente(int ci_paciente) {
        this.ci_paciente = ci_paciente;
    }

    public int getEdad_paciente() {
        return edad_paciente;
    }

    public void setEdad_paciente(int edad_paciente) {
        this.edad_paciente = edad_paciente;
    }

    public String getSexo_paciente() {
        return sexo_paciente;
    }

    public void setSexo_paciente(String sexo_paciente) {
        this.sexo_paciente = sexo_paciente;
    }

    public Pacientes(int id_paciente, String nombre_paciente, String apellido_paciente, int ci_paciente, int edad_paciente, String sexo_paciente) {
        this.id_paciente = id_paciente;
        this.nombre_paciente = nombre_paciente;
        this.apellido_paciente = apellido_paciente;
        this.ci_paciente = ci_paciente;
        this.edad_paciente = edad_paciente;
        this.sexo_paciente = sexo_paciente;
    }

       
}