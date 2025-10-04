
package com.mycompany.vuelosbaratos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Grafo {
    
    private Map<String, List<Nodo>> grafo;

    public Grafo() {
        grafo = new HashMap<>();
    }

    // Agregar ruta (arista)
    public void agregarRuta(String origen, String destino, double costo) {
        grafo.putIfAbsent(origen, new ArrayList<>());
        grafo.get(origen).add(new Nodo(destino, costo));
    }

    // Mostrar todos los vuelos
    public void mostrarVuelos() {
        System.out.println("\nLISTA DE VUELOS");
        for (String ciudad : grafo.keySet()) {
            System.out.print(ciudad + " -");
            for (Nodo destino : grafo.get(ciudad)) {
                System.out.print(destino + " | ");
            }
            System.out.println();
        }
    }

    // Calcular vuelos más baratos (Dijkstra)
    public void vuelosMasBaratos(String origen) {
        Map<String, Double> distancias = new HashMap<>();
        Set<String> visitados = new HashSet<>();
        PriorityQueue<Nodo> cola = new PriorityQueue<>(Comparator.comparingDouble(n -> n.costo));

        for (String ciudad : grafo.keySet()) {
            distancias.put(ciudad, Double.MAX_VALUE);
        }
        distancias.put(origen, 0.0);
        cola.add(new Nodo(origen, 0));

        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            if (!visitados.add(actual.nombre)) continue;

            if (grafo.containsKey(actual.nombre)) {
                for (Nodo vecino : grafo.get(actual.nombre)) {
                    double nuevaDistancia = distancias.get(actual.nombre) + vecino.costo;
                    if (nuevaDistancia < distancias.get(vecino.nombre)) {
                        distancias.put(vecino.nombre, nuevaDistancia);
                        cola.add(new Nodo(vecino.nombre, nuevaDistancia));
                    }
                }
            }
        }

        System.out.println("\nVuelos mas baratos desde "+origen + " ");
        for (Map.Entry<String, Double> entrada : distancias.entrySet()) {
            System.out.println("Destino: " + entrada.getKey() + " → Costo: $" + entrada.getValue());
        }
    }
}
