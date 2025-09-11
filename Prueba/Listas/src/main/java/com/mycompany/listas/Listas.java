package com.mycompany.listas;

public class Listas {

    public static void main(String[] args) {
        ListaSimple lista= new ListaSimple();
        lista.agregar(5);
        lista.agregar(10);
        lista.agregar(15);
        lista.agregar(20);
        lista.agregar(25);
        System.out.println("Valores agregados");
        lista.mostrar();
        lista.eliminar(15);
        System.out.println("Valores agregados despues de eliminar el nodo");
        lista.mostrar();
    }
}
