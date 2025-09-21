package com.mycompany.arbolbinario;

import java.util.Scanner;

public class ArbolBinario {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arbol arbol = new Arbol();
        int opcion, valor;

        do {
            System.out.println("\n--- MENU ÁRBOL BINARIO ---");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Recorrido Inorden");
            System.out.println("3. Recorrido Preorden");
            System.out.println("4. Recorrido Postorden");
            System.out.println("5. Buscar elemento");
            System.out.println("6. Eliminar nodo");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el valor a insertar: ");
                    valor = sc.nextInt();
                    arbol.insertar(valor);
                    break;
                case 2:
                    System.out.println("Recorrido Inorden:");
                    arbol.inOrden(arbol.raiz);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Recorrido Preorden:");
                    arbol.preOrden(arbol.raiz);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Recorrido Postorden:");
                    arbol.postOrden(arbol.raiz);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Valor a buscar: ");
                    valor = sc.nextInt();
                    System.out.println(arbol.buscar(valor) ? "Encontrado" : "No encontrado");
                    break;
                case 6:
                    System.out.print("Valor a eliminar: ");
                    valor = sc.nextInt();
                    arbol.raiz = arbol.eliminar(arbol.raiz, valor);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);

        sc.close();
    }
    }