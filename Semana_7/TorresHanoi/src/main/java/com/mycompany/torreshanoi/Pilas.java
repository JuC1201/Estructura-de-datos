package com.mycompany.torreshanoi;

public class Pilas {
    
    private Nodo cima;  
    // nombre de la pila (torre A, B, C)
    private final String nombre; 

    // constructor
    public Pilas(String nombre){
        this.cima = null;
        this.nombre = nombre;
    }

    // agregar
    public void push(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        System.out.println("Push " + dato + " en torre " + nombre);
    }

    // eliminar
    public int pop() throws Exception{
        if(estaVacia()){
            throw new Exception("La pila está vacía");
        }
        int dato = cima.dato;
        cima = cima.siguiente;
        System.out.println("Pop " + dato + " de torre " + nombre);
        return dato;
    }

    // verificar si la pila está vacía
    public boolean estaVacia(){
        return cima == null;
    }

    // obtener el valor de la cima
    public int cima(){
        return cima != null ? cima.dato : -1;
    }

    // obtener nombre de la pila
    public String getNombre(){
        return nombre;
    }

    // mostrar pila
    public void mostrar(){
        Nodo actual = cima;
        System.out.print("Torre " + nombre + ": ");
        while (actual != null){
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("Null");
    }
    
}
