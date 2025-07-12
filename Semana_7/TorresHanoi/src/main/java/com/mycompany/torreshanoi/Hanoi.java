package com.mycompany.torreshanoi;

public class Hanoi{
   //método para mover los discos usando recursividad
public void moverDiscos(int n,Pilas origen,Pilas auxiliar,Pilas destino)throws Exception{
    if(n == 1){
        // eliminar
        int disco = origen.pop();         
        // agregar
        destino.push(disco);             
        System.out.println("Mover disco"+disco+"de"+origen.getNombre()+"a"+destino.getNombre());
    } else {
        moverDiscos(n - 1, origen, destino, auxiliar);
        moverDiscos(1, origen, auxiliar, destino);
        moverDiscos(n - 1, auxiliar, origen, destino);
        }
    } 
}
