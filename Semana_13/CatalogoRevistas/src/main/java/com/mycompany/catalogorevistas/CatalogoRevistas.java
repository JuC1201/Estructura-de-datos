package com.mycompany.catalogorevistas;

import java.util.Scanner;

public class CatalogoRevistas {
    // ATRIBUTOS
    // Estructura de datos: arreglo que almacena los títulos de las revistas
    static String[] revistas = {
        "Vistazo",
        "Semana",
        "Mundo Diners",
        "National Geographic",
        "Times",
        "Forbes",
        "Nature",
        "Eutopia",
        "Vogue",
        "Popular Science"
    };

    // MÉTODOS
    // Método recursivo para buscar una revista en el catálogo.
     
    public static boolean buscarRevista(String[] lista, String titulo, int index) {
    // Caso base: si se llega al final del arreglo
        if (index >= lista.length) {
            return false;
        }
    // Comparación del título en la posición actual (ignora mayúsculas/minúsculas)
        if (lista[index].equalsIgnoreCase(titulo)) {
            return true;
        }
    // Llamada recursiva avanzando en el arreglo
        return buscarRevista(lista, titulo, index + 1);
    }

    //Método principal que muestra un menú interactivo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENU CATALOGO DE REVISTAS");
            System.out.println("1. Mostrar catalogo");
            System.out.println("2. Buscar revista");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nCatalogo de revistas:");
                    for (String revista : revistas) {
                        System.out.println("- " + revista);
                    }
                    break;

                case 2:
                    System.out.print("\nIngresa el titulo de la revista a buscar: ");
                    String titulo = sc.nextLine();

                    boolean encontrado = buscarRevista(revistas, titulo, 0);

                    if (encontrado) {
                        System.out.println("Encontrado");
                    } else {
                        System.out.println("No encontrado");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion !=3);
        sc.close();
    }
}