package com.mycompany.colaimpresora;

import java.util.LinkedList;
import java.util.Queue;

public class ColaImpresora {
    public static void main(String[] args) {
        // Crear la cola de impresión
        Queue<TrabajoImpresion> cola = new LinkedList<>();

        // Agregar trabajos a la cola
        cola.add(new TrabajoImpresion("Tarea_EstrucutraDatos.pdf", 3));
        cola.add(new TrabajoImpresion("Informe_Final.docx", 5));
        cola.add(new TrabajoImpresion("Horario_Semanal.png", 1));

        System.out.println("Trabajos agregados a la cola de impresion.\n");

        // Procesar e imprimir los trabajos
        while (!cola.isEmpty()) {
            TrabajoImpresion trabajo = cola.poll(); // Quita y devuelve el primer trabajo
            trabajo.imprimir(); // Imprime el trabajo
        }

        System.out.println("\nTodos los trabajos han sido impresos.");
    }
}
