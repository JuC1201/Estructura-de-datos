package com.mycompany.listas;

public class ListaSimple {
  
Nodo cabeza;
// Agregar un nuevo nodo al final de la lista
    public void agregar (int valor){
    Nodo nuevo = new Nodo(valor);
    if (cabeza==null){
        cabeza = nuevo;
    }else {
        Nodo actual=cabeza;
        while(actual.siguiente!=null){
        actual=actual.siguiente;
        }
        actual.siguiente=nuevo;
        }
   }  
// Mostrar todos los elementos de la lista
public void mostrar(){
    Nodo actual=cabeza;
    while (actual!=null){
        System.out.print(actual.dato+"->");
        actual=actual.siguiente;
    } 
    System.out.print("null\n");
  }
//Eliminar un nodo por valor
public void eliminar(int valor){
    //Lista vacia
    if (cabeza==null){
        System.out.println("La lista esta vacia");
        return;
    }
    //Caso especial: el nodo a eliminar es la cabeza
    if (cabeza.dato== valor){
    cabeza = cabeza.siguiente;
    return;
    }
    //Buscar el nodo anterior al que se debe eliminar
    Nodo anterior= cabeza;
    Nodo actual= cabeza.siguiente;
    
    while (actual!=null){
        if(actual.dato==valor){
        anterior.siguiente= actual.siguiente;
        return;
        }
        anterior=actual;
        actual=actual.siguiente;   
    }
        System.out.println("El valor no se encontro en la lista");
  }

//Ejercicio 1: Contar cuantos nodos hay en la lista
public int contarElementos() {
    int contador = 0;
    Nodo actual = cabeza; 
    while (actual != null) {
        contador++;
        actual = actual.siguiente;
        }
    return contador;
    }

//Ejercicio 3: Buscar cuántas veces aparece un número en la lista
public int buscarValor(int valor){
    int contador = 0;
    Nodo actual = cabeza;
    while (actual != null) {
        if (actual.dato ==valor){
            contador++; // Cada vez que lo encuentra, suma 1
            }
        actual = actual.siguiente;
        }
    if (contador ==0){
        System.out.println("El valor " +valor+ " no fue encontrado en la lista");
        }
    return contador;
    }
}
