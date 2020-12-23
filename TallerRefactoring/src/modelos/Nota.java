/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author jorge
 */
public class Nota {
    double nexamen;
    double ndeberes;
    double nlecciones;
    double ntalleres;
    
    public Nota(double nexamen, double ndeberes, double nlecciones, double ntalleres){
        this.nexamen = nexamen;
        this.ndeberes = ndeberes;
        this.nlecciones = nlecciones;
        this.ntalleres = ntalleres;
    }
    
    public double notaTeorico(){
        return (nexamen+ndeberes+nlecciones)*0.80;
    }
    
    public double notaPractico(){
        return (ntalleres)*0.20;
    }
    
    public double calcularNota(){
        return notaTeorico() + notaPractico();
    }
}

