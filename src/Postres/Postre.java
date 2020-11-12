/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import Leche.PuedeUsarLeche;

import java.util.ArrayList;

/**
 *
 * @author micar
 */
public abstract class Postre {

    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;

    public Postre(String sabor, double precioParcial) {
        this.sabor = sabor;
        this.precioParcial = precioParcial;
        this.aderezos = new ArrayList<>();
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public void setAderezos(ArrayList<Aderezo> aderezos) {
        this.aderezos = aderezos;
    }
    public void addAderezo(Aderezo aderezo){
        this.aderezos.add(aderezo);
        
    }
    public void quitarAderezo(Aderezo aderezo){
        this.aderezos.remove(aderezo);
        
    }
    
    @Override
    public String toString(){
        return "sabor=" + getSabor() + ", precioParcial=" + getPrecioParcial() + ", aderezos=" + getAderezos() + '}';
    }
}
