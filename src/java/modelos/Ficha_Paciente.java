/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author sofia
 */
public class Ficha_Paciente {
    private int ci_paciente;
    private PresionArterial presion ;
    private int frecuencia_card;
    private String signos_vitales;

    public Ficha_Paciente(int ci_paciente, PresionArterial presion, int frecuencia_card, String signos_vitales) {
        this.ci_paciente = ci_paciente;
        this.presion = presion;
        this.frecuencia_card = frecuencia_card;
        this.signos_vitales = signos_vitales;
    }

    public int getCi_paciente() {
        return ci_paciente;
    }

    public void setCi_paciente(int ci_paciente) {
        this.ci_paciente = ci_paciente;
    }

    public PresionArterial getPresion() {
        return presion;
    }

    public void setPresion(PresionArterial presion) {
        this.presion = presion;
    }

    public int getFrecuencia_card() {
        return frecuencia_card;
    }

    public void setFrecuencia_card(int frecuencia_card) {
        this.frecuencia_card = frecuencia_card;
    }

    public String getSignos_vitales() {
        return signos_vitales;
    }

    public void setSignos_vitales(String signos_vitales) {
        this.signos_vitales = signos_vitales;
    }
    
}
