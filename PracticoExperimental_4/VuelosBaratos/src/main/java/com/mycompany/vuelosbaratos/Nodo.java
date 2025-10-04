package com.mycompany.vuelosbaratos;


public class Nodo {
      String nombre;
    double costo;

    public Nodo(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    @Override //reescribir un método heredado
    public String toString() {
        return nombre + " ($" + costo + ")";
    }    
}
