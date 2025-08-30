package com.mycompany.diccionario;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Diccionario {
/*El diccionario debe contener al menos 10 palabras iniciales.
El programa debe permitir al usuario agregar nuevas palabras al diccionario.
El traductor debe procesar frases completas, traduciendo únicamente aquellas 
palabras que estén registradas en el diccionario.
La interfaz debe incluir un menú interactivo con las siguientes opciones:
==================== MENÚ ====================
1. Traducir una frase
2. Agregar palabras al diccionario
0. Salir
Seleccione una opción:*/
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Diccionario base inglés - español
        Map <String, String> diccionario = new HashMap<> ();
       
        diccionario.put("tiempo", "time");  
        diccionario.put("persona", "person");  
        diccionario.put("año", "year");   
        diccionario.put("día", "day");  
        diccionario.put("cosa", "thing");  
        diccionario.put("hombre", "man");  
        diccionario.put("mundo", "world");  
        diccionario.put("vida", "life");  
        diccionario.put("mano", "hand");  
        diccionario.put("parte", "part");  
        diccionario.put("niño/a", "child");  
        diccionario.put("ojo", "eye");  
        diccionario.put("mujer", "woman");  
        diccionario.put("lugar", "place");   
        diccionario.put("gobierno", "government");  
      
        // Conjunto para registrar nuevas palabras agregadas
        Set<String> nuevasPalabras = new HashSet<>();

        int opcion;
        do {
            // Menú
            System.out.println("\nMENU");
            System.out.println("1. Traducir una frase");
            System.out.println("2. Agregar palabras al diccionario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

      if (opcion == 1) {
                System.out.print("Ingrese una frase en español: ");
                String frase = sc.nextLine().toLowerCase(); // todo en minúsculas

                String[] palabras = frase.split(" "); // separar por espacios
                StringBuilder traduccion = new StringBuilder();

                for (String palabra : palabras) {
                    if (diccionario.containsKey(palabra)) {
                        traduccion.append(diccionario.get(palabra)).append(" ");
                    } else {
                        traduccion.append(palabra).append(" ");
                    }
                }
                System.out.println("Traducción: " + traduccion.toString().trim());

            } else if (opcion == 2) {
                System.out.print("Ingrese palabra en español: ");
                String esp = sc.nextLine().toLowerCase();

                System.out.print("Ingrese su traducción en inglés: ");
                String eng = sc.nextLine().toLowerCase();

                diccionario.put(esp, eng);
                nuevasPalabras.add(esp);

                System.out.println("Palabra agregada correctamente.");
            } else if (opcion != 0) {
                System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 0);

        // Mostrar las nuevas palabras añadidas al final
        if (!nuevasPalabras.isEmpty()) {
            System.out.println("\nPalabras nuevas registradas:");
            for (String palabra : nuevasPalabras) {
                System.out.println("-" + palabra + "-" + diccionario.get(palabra));
            }
        }
        System.out.println("\nPrograma finalizado.");
        sc.close();
    }
}
