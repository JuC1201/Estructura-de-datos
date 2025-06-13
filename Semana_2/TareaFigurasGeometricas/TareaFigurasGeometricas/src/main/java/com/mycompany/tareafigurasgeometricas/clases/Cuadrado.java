package com.mycompany.tareafigurasgeometricas.clases;

public class Cuadrado {
    //ATRIBUTOS
    private double lado;
    
    //CONSTRUCTORES
    //constructor con datos
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    //constructor vacio
    public Cuadrado() {
    }
    
    //SETTER Y GETTER

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //METODOS  
    public double calcularArea(){
        return this.lado*this.lado;
    }
    public double calcularPerimetro(){
        return this.lado*4;
    }
    
}
