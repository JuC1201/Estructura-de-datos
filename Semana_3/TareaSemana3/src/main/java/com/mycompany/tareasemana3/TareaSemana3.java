package com.mycompany.tareasemana3;


import com.mycompany.tareasemana3.Estudiante;

public class TareaSemana3 {

    public static void main(String[] args) {
     
        /*Elabore un documento PDF que contenga la definición de las clases, 
        arrays y/o matrices necesarias en C# o Java para manejar el registro 
        de un estudiante que posea los siguientes datos (id, nombres, apellidos,
        dirección y tres teléfonos9.*/ 
        // Crear array con tres teléfonos
       String[] telefonos = { "0994567318", "0995235517", "0987078551" };    
       Estudiante  estudiantes = new Estudiante(1, "Julia Daniela", "Tipan Santafe", "Latacunga",telefonos);
       estudiantes.mostrarDatos();
    }
}
