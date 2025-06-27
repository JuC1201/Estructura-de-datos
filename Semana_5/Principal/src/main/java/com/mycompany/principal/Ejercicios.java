package com.mycompany.principal;
// Contiene 5 ejercicios seleccionados, usando listas y estructuras simples.

import java.util.Scanner;

public class Ejercicios {
    /*Ejercicio 1: Escribir un programa que almacene las asignaturas de un 
    curso y las muestre.*/
    public static void ejercicio1() {
        System.out.println("\nEjercicio 1: Lista de asignaturas");
        ListaAsignaturas lista = new ListaAsignaturas();
        lista.agregar("Matematicas");
        lista.agregar("Fisica");
        lista.agregar("Quimica");
        lista.agregar("Historia");
        lista.agregar("Lengua");
        lista.mostrar();
    }
    
    /*Ejercicio 2: Mostrar el mensaje "Yo estudio <asignatura>" por 
    cada asignatura.*/
    public static void ejercicio2() {
        System.out.println("\nEjercicio 2: Yo estudio <asignatura>");
        ListaAsignaturas lista = new ListaAsignaturas();
        lista.agregar("Matematicas");
        lista.agregar("Fisica");
        lista.agregar("Quimica");
        lista.agregar("Historia");
        lista.agregar("Lengua");
        lista.mostrarConMensaje();
    }
    
    /*Ejercicio 5: Mostrar los números del 1 al 10 en orden inverso separados 
    por comas.*/
    public static void ejercicio3() {
        System.out.println("\nEjercicio 5: Numeros del 1 al 10 en orden inverso");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) System.out.print(", ");
        }
        System.out.println();
    }
    
    /*Ejercicio 8: Pedir una palabra y decir si es un palíndromo.*/
    public static void ejercicio4() {
        System.out.println("\nEjercicio 8: Verificar si una palabra es palindromo");
        Scanner sc = new Scanner(System.in);//se usa Scanner para leer datos ingresados por el usuario
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine().toLowerCase();
        String invertida = new StringBuilder(palabra).reverse().toString();

        if (palabra.equals(invertida)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }
    /*Ejercicio 10: Almacenar precios y mostrar el menor y el mayor.*/
    public static void ejercicio5() {
        System.out.println("\nEjercicio 10: Precio menor y mayor");
        int[] precios = {50, 75, 46, 22, 80, 65, 8};
        int menor = precios[0], mayor = precios[0];

        for (int precio : precios) {
            if (precio < menor) menor = precio;
            if (precio > mayor) mayor = precio;
        }

        System.out.println("Precio menor: " + menor);
        System.out.println("Precio mayor: " + mayor);
    }
}
