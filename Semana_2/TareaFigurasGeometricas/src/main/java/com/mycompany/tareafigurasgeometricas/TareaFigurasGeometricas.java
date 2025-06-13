package com.mycompany.tareafigurasgeometricas;

import com.mycompany.tareafigurasgeometricas.clases.Cuadrado;
import com.mycompany.tareafigurasgeometricas.clases.Triangulo;

public class TareaFigurasGeometricas  {

    public static void main(String[] args) {
        // Crear objeto cuadrado
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5.3); // Asignamos el valor al lado
        
        // Mostrar resultados
        System.out.println("El area de un cuadrado es: " + cuadrado.calcularArea());
        System.out.println("El perimetro de un cuadrado es: " + cuadrado.calcularPerimetro());

        // Crear un objeto Triángulo
        Triangulo triangulo = new Triangulo();
        triangulo.setBase(4.5);
        triangulo.setAltura(3.2);
        triangulo.setLado1(4.5);
        triangulo.setLado2(5.1);
        triangulo.setLado3(6.1);
        
        // Mostrar resultados
        System.out.println("El area de un triangulo es: " + triangulo.calcularArea());
        System.out.println("El perimetro de un triangulo es: " + triangulo.calcularPerimetro());
    }
}