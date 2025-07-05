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
        //Probar el método contar (ejercicio 1)
        int total = lista.contarElementos();
        System.out.println("Cantidad de elementos en la lista:"+total);

        //Probar el método buscar (ejercicio 3)
        int buscar = 10;
        int veces = lista.buscarValor(buscar);
        if (veces > 0) {
        System.out.println("El valor"+buscar+ "aparece"+ veces+"veces en la lista");
        }
        lista.eliminar(15);
        System.out.println("Valores agregados despues de eliminar el nodo");
        lista.mostrar();
    }
}
