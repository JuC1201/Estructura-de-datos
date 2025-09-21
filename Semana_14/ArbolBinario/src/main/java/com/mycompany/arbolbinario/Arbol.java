
package com.mycompany.arbolbinario;

public class Arbol {
    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    // Inserción de un nodo
    public void insertar(int dato) {
        raiz = insertarRec(raiz, dato);
    }

    private Nodo insertarRec(Nodo raiz, int dato) {
        if (raiz == null) {
            raiz = new Nodo(dato);
            return raiz;
        }
        if (dato < raiz.dato) {
            raiz.izquierda = insertarRec(raiz.izquierda, dato);
        } else if (dato > raiz.dato) {
            raiz.derecha = insertarRec(raiz.derecha, dato);
        }
        return raiz;
    }

    // Recorrido inorden
    public void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            inOrden(nodo.derecha);
        }
    }

    // Recorrido preorden
    public void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preOrden(nodo.izquierda);
            preOrden(nodo.derecha);
        }
    }

    // Recorrido postorden
    public void postOrden(Nodo nodo) {
        if (nodo != null) {
            postOrden(nodo.izquierda);
            postOrden(nodo.derecha);
            System.out.print(nodo.dato + " ");
        }
    }

    // Buscar nodo
    public boolean buscar(int dato) {
        return buscarRec(raiz, dato);
    }

    private boolean buscarRec(Nodo raiz, int dato) {
        if (raiz == null) return false;
        if (raiz.dato == dato) return true;
        return dato < raiz.dato ? buscarRec(raiz.izquierda, dato):buscarRec(raiz.derecha, dato);
    }

    // Eliminar nodo
    public Nodo eliminar(Nodo raiz, int dato) {
        if (raiz == null) return raiz;

        if (dato < raiz.dato) {
            raiz.izquierda = eliminar(raiz.izquierda, dato);
        } else if (dato > raiz.dato) {
            raiz.derecha = eliminar(raiz.derecha, dato);
        } else {
            if (raiz.izquierda == null) return raiz.derecha;
            else if (raiz.derecha == null) return raiz.izquierda;

            raiz.dato = valorMinimo(raiz.derecha);
            raiz.derecha = eliminar(raiz.derecha, raiz.dato);
        }
        return raiz;
    }

    private int valorMinimo(Nodo raiz) {
        int min = raiz.dato;
        while (raiz.izquierda != null) {
            min = raiz.izquierda.dato;
            raiz = raiz.izquierda;
        }
        return min;
    }
}
