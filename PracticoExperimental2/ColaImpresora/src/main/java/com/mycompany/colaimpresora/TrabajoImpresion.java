package com.mycompany.colaimpresora;

public class TrabajoImpresion {
    private final String documento;
    private final int paginas;
    //Constructor

    public TrabajoImpresion(String documento, int paginas) {
        this.documento = documento;
        this.paginas = paginas;
    }
    // Método que simula la impresión
    public void imprimir(){
        System.out.println("Imprmiendo docuemto: "+documento+"("+ paginas +"paginas)");
    try {
            Thread.sleep(paginas * 500); // Simula el tiempo de impresión
        } catch (InterruptedException e) {
            System.out.println("Error al imprimir " + documento);
        }
    }

    public String getDocumento() {
        return documento;
    }
}
