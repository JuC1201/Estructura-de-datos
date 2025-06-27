package com.mycompany.principal;

public class ListaAsignaturas {
     Nodo cabeza;
     public void agregar(String valor){
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
     
     public void mostrar(){
        Nodo actual=cabeza;
        while (actual!=null){
            System.out.println(actual.dato);
            actual=actual.siguiente;
    } 
    System.out.println("null");
  }

        public void mostrarConMensaje() {
         Nodo actual = cabeza;
        while (actual != null) {
            System.out.println("Yo estudio " + actual.dato);
            actual = actual.siguiente;
        }
    }
}
 