package com.mycompany.torneofutbol;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TorneoFutbol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Equipo - Conjunto de jugadores
        // Estructura de datos: HashMap para equipos → HashSet de jugadores
        Map<String, Set<String>> torneo = new HashMap<>();

        int opcion = 0;
        do {
            // Menú principal
            System.out.println("\n MENU TORNEO DE FUTBOL");
            System.out.println("1. Registrar equipo");
            System.out.println("2. Agregar jugador a un equipo");
            System.out.println("3. Mostrar equipos y jugadores");
            System.out.println("4. Consultar jugadores de un equipo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            // Validar entrada numérica
            if (!sc.hasNextInt()) {
                System.out.println("Opción invalida, ingrese un numero.");
                sc.nextLine(); // Limpiar buffer
                continue;
            }
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    // Registrar un equipo
                    System.out.print("Ingrese nombre del equipo: ");
                    String equipo = sc.nextLine().toLowerCase(); // normalizar
                    if (!torneo.containsKey(equipo)) {
                        torneo.put(equipo, new HashSet<>());
                        System.out.println("Equipo registrado correctamente.");
                    } else {
                        System.out.println("El equipo ya existe.");
                    }
                    break;

                case 2:
                    // Agregar jugador a un equipo existente
                    System.out.print("Ingrese nombre del equipo: ");
                    equipo = sc.nextLine().toLowerCase();
                    if (torneo.containsKey(equipo)) {
                        System.out.print("Ingrese nombre del jugador: ");
                        String jugador = sc.nextLine();
                        Set<String> jugadores = torneo.get(equipo);
                        if (jugadores.add(jugador)) {
                            System.out.println("Jugador agregado al equipo " + equipo);
                        } else {
                            System.out.println("El jugador ya esta registrado en este equipo.");
                        }
                    } else {
                        System.out.println("El equipo no existe. Registrelo primero.");
                    }
                    break;

                case 3:
                    // Mostrar todos los equipos y jugadores
                    if (torneo.isEmpty()) {
                        System.out.println("No hay equipos registrados.");
                    } else {
                        System.out.println("\n LISTADO DE EQUIPOS Y JUGADORES");
                        for (Map.Entry<String, Set<String>> entry : torneo.entrySet()) {
                            System.out.println("Equipo: " + entry.getKey());
                            if (entry.getValue().isEmpty()) {
                                System.out.println("  (Sin jugadores)");
                            } else {
                                for (String j : entry.getValue()) {
                                    System.out.println("  - " + j);
                                }
                            }
                        }
                    }
                    break;

                case 4:
                    // Consultar jugadores de un equipo específico
                    System.out.print("Ingrese nombre del equipo a consultar: ");
                    equipo = sc.nextLine().toLowerCase();
                    if (torneo.containsKey(equipo)) {
                        Set<String> jugadores = torneo.get(equipo);
                        if (jugadores.isEmpty()) {
                            System.out.println("El equipo " + equipo + " no tiene jugadores registrados.");
                        } else {
                            System.out.println("Jugadores del equipo " + equipo + ": " + jugadores);
                        }
                    } else {
                        System.out.println("El equipo no existe.");
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción invalida, intente de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}