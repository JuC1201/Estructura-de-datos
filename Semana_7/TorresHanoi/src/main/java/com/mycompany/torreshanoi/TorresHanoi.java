package com.mycompany.torreshanoi;

/**Resolución del problema de las Torres de Hanoi.
* Desarrolle un algoritmo que resuelva el problema de las Torres de Hanoi 
* utilizando pilas. El programa debe mostrar paso a paso cómo se mueven 
* los discos entre las torres. */
public class TorresHanoi {
    public static void main(String[] args) throws Exception {
        int n = 3; // cantidad de discos

        // crear torres (pilas)
        Pilas torreA = new Pilas("A");
        Pilas torreB = new Pilas("B");
        Pilas torreC = new Pilas("C");

        // agregar discos en torre A
        for (int i = n; i >= 1; i--) {
            torreA.push(i);
        }
        // mostrar torres al inicio
        torreA.mostrar();
        torreB.mostrar();
        torreC.mostrar();

        // resolver las Torres de Hanoi
        Hanoi hanoi = new Hanoi();
        hanoi.moverDiscos(n, torreA, torreB, torreC);
        
        // mostrar torres al final
        System.out.println("\nEstado final:");
        torreA.mostrar();
        torreB.mostrar();
        torreC.mostrar();
    }
}
