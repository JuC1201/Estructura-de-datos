package com.mycompany.conjuntosvacunacion;

import java.util.HashSet;
import java.util.Set;


public class ConjuntosVacunacion {

    public static void main(String[] args) {
    //CREACIÓN DE CONJUNTOS
        //Población total ficticia (500 ciudadanos)
        Set<String> poblacion = new HashSet<>();
        for (int i = 1; i <= 500; i++) {
            poblacion.add("Ciudadano " + i);
        }

        //Conjunto de vacunados con Pfizer (75 ciudadanos)
        Set<String> vacunadosPfizer = new HashSet<>();
        for (int i = 1; i <= 75; i++) {
            vacunadosPfizer.add("Ciudadano " + i);
        }

        //Conjunto de vacunados con AstraZeneca (75 ciudadanos)
        Set<String> vacunadosAstra = new HashSet<>();
        for (int i = 50; i < 125; i++) { // se cruzan con Pfizer en algunos
            vacunadosAstra.add("Ciudadano " + i);
        }
  
    //OPERACIONES DE CONJUNTOS
        //1.Ciudadanos que NO se han vacunado
        Set<String> noVacunados = new HashSet<>(poblacion);
        noVacunados.removeAll(vacunadosPfizer);
        noVacunados.removeAll(vacunadosAstra);

        //2.Ciudadanos con ambas dosis (Pfizer ∩ AstraZeneca)
        Set<String> ambasDosis = new HashSet<>(vacunadosPfizer);
        ambasDosis.retainAll(vacunadosAstra);

        //3.Ciudadanos que solo tienen Pfizer (Pfizer – AstraZeneca)
        Set<String> soloPfizer = new HashSet<>(vacunadosPfizer);
        soloPfizer.removeAll(vacunadosAstra);

        //4.Ciudadanos que solo tienen AstraZeneca (AstraZeneca – Pfizer)
        Set<String> soloAstra = new HashSet<>(vacunadosAstra);
        soloAstra.removeAll(vacunadosPfizer);

    //MOSTRAR RESULTADOS
        System.out.println("Ciudadanos NO vacunados: " + noVacunados.size());
        System.out.println(noVacunados);

        System.out.println("\n Ciudadanos con ambas dosis: " + ambasDosis.size());
        System.out.println(ambasDosis);

        System.out.println("\n Ciudadanos solo Pfizer: " + soloPfizer.size());
        System.out.println(soloPfizer);

        System.out.println("\n Ciudadanos solo AstraZeneca: " + soloAstra.size());
        System.out.println(soloAstra);

    }
}
