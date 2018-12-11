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
public class PresionArterial {
    private int sistolica;
    private int diastolica;

    public PresionArterial(int sistolica, int diastolica) {
        this.sistolica = sistolica;
        this.diastolica = diastolica;
    }

    public int getSistolica() {
        return sistolica;
    }

    public void setSistolica(int sistolica) {
        this.sistolica = sistolica;
    }

    public int getDiastolica() {
        return diastolica;
    }

    public void setDiastolica(int diastolica) {
        this.diastolica = diastolica;
    }

    
    
    
    
}
