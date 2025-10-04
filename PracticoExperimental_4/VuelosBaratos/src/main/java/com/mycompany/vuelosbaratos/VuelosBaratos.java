
package com.mycompany.vuelosbaratos;

import java.util.Scanner;

public class VuelosBaratos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grafo sistema = new Grafo();

        // Datos de ejemplo
        sistema.agregarRuta("Quito", "Guayaquil", 50);
        sistema.agregarRuta("Quito", "Cuenca", 60);
        sistema.agregarRuta("Guayaquil", "Loja", 40);
        sistema.agregarRuta("Cuenca", "Loja", 30);

        int opcion;
        String origen, destino;
        double costo;

        do {
            System.out.println("\nMENU DE VUELOS BARATOS ");
            System.out.println("1. Mostrar vuelos registrados");
            System.out.println("2. Agregar nueva ruta");
            System.out.println("3. Calcular vuelos más baratos desde una ciudad");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    sistema.mostrarVuelos();
                    break;
                case 2:
                    System.out.print("Ciudad origen:");
                    origen = sc.nextLine();
                    System.out.print("Ciudad destino:");
                    destino = sc.nextLine();
                    System.out.print("Costo del vuelo:");
                    costo = sc.nextDouble();
                    sistema.agregarRuta(origen, destino, costo);
                    System.out.println("Ruta agregada correctamente.");
                    break;
                case 3:
                    System.out.print("Ingrese la ciudad de origen:");
                    origen = sc.nextLine();
                    sistema.vuelosMasBaratos(origen);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);

        sc.close();
    }
}