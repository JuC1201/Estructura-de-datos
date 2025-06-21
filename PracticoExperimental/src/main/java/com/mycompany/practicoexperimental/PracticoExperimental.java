package com.mycompany.practicoexperimental;

public class PracticoExperimental {

    public static void main(String[] args) {
    /*
       AGENDA TELEFONICA
       Requerimientos: vectores, matrices, registros, estructuras.
       Registro: para representar cada contanto
       Vector: almacenar los contactos de los registros
       Matriz: se usa una matriz (int[][] llamadas) para registrar la cantidad 
       de llamadas entre contactos.*/
       
        //Scanner  
        AgendaTelefonica agenda=new AgendaTelefonica(3);
        
        String nombre= "Julia Tipan";
        String telefono= "0995235518";
        String correo= "jd.tipans@uea.edu.ec";  
        
        String nombreUno= "Lauri Vera";
        String telefonoUno= "0999900087";
        String correoUno= "la.vera@uea.edu.ec";
        
        agenda.agregarContacto(nombre, telefono, correo);
        agenda.agregarContacto(nombreUno, telefonoUno, correoUno);
        agenda.mostrarContactos();
        // Registrar llamadas entre ellas
        agenda.registrarLlamada(0, 1); // Julia llama a Lauri
        agenda.registrarLlamada(1, 0); // Lauri llama a Julia

        // Mostrar la matriz de llamadas
        agenda.mostrarMatrizLlamadas();
    }
}