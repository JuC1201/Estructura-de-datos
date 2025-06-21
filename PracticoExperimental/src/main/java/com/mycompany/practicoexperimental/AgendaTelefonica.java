package com.mycompany.practicoexperimental;

public class AgendaTelefonica {
     /*Registro: para representar cada contanto
     Vector: almacenar los contactos de los registros
     Matriz: registrar llamadas entre contactos.*/
    
     //Atributos
    private Contacto[] contactos;
    private int[][] llamadas; 
    private int totalContactos;
    
    //Constructor
    public AgendaTelefonica( int capacidad) {
        contactos= new Contacto [capacidad];
        llamadas = new int[capacidad][capacidad];
        totalContactos= 0;
    }
    //Agregar contactos
    public boolean agregarContacto(String nombre, String telefono, String correo){
        if (totalContactos >= contactos.length){
            System.out.println("Ya no tienes espacio para almacenar más contactos");
            return false;
        } else{
            contactos[totalContactos]= new Contacto(nombre, telefono,correo);
        totalContactos= totalContactos+1;
        return true;
        }
    }
    //Mostrar contactos
    public void mostrarContactos(){
        if (totalContactos==0){
            System.out.println("No tienes registros");
        }else{
        for (int i=0; i<totalContactos;i++){
        Contacto c= contactos[i];
            System.out.println("DATOS DEL CONTACTO"+(i+1));
            System.out.println("Nombre:"+c.nombre());
            System.out.println("Telefono:"+c.telefono());
            System.out.println("Correo:"+c.correo());
            }
        }
    }
    //Buscar contacto por nombre
    public Contacto buscarPorNombre(String nombre){
        for (int i = 0; i < totalContactos; i++) {
            if (contactos[i].nombre().equalsIgnoreCase(nombre)) {
                return contactos[i];
            }
        } 
        return null;
    }
    // Registrar una llamada entre contactos
    public void registrarLlamada(int desde, int hacia) {
        if (desde >= 0 && desde < totalContactos && hacia >= 0 && hacia < totalContactos) {
            llamadas[desde][hacia]++;
        } else {
            System.out.println("Índices inválidos para registrar llamada");
        }
    }

    // Mostrar la matriz de llamadas
    public void mostrarMatrizLlamadas() {
        System.out.println("MATRIZ DE LLAMADAS:");
        for (int i = 0; i < totalContactos; i++) {
            for (int j = 0; j < totalContactos; j++) {
                System.out.print(llamadas[i][j] + "\t");
            }
            System.out.println();
        }
    }
}