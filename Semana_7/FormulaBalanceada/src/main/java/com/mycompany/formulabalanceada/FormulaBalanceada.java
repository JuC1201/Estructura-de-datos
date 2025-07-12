package com.mycompany.formulabalanceada;
/** Verificación de paréntesis balanceados en una expresión matemática
     * Implemente un programa que determine si los paréntesis, llaves y 
     * corchetes en una expresión matemática están correctamente balanceados.
     * Ejemplo: Entrada: {7 + (8 * 5) - [(9 - 7) + (4 + 1)]}
     * Salida esperada: Fórmula balanceada.*/

public class FormulaBalanceada {

    public static void main(String[] args) {
        String expresion = "{7 + (8 * 5) - [(9 - 7) + (4 + 1)]}";
        Balanceador balanceador = new Balanceador();
        // Verificar si la expresión está balanceada
        boolean resultado = balanceador.estaBalanceado(expresion);
        // Mostrar el resultado
        if (resultado) {
            System.out.println("Formula balanceada.");
        } else {
            System.out.println("Formula no balanceada.");
        }
    }
}
