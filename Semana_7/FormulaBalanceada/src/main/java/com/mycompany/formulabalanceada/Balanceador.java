package com.mycompany.formulabalanceada;

import java.util.Stack;

public class Balanceador {
    public boolean esApertura (char c){
        return c == '('||c == '['||c == '{';
    }
    public boolean esCierre (char c){
        return c == ')'||c == ']'||c == '}';
    }
    public boolean sonPareja (char apertura, char cierre){
        return (apertura =='(' &&cierre== ')'
               || apertura =='[' &&cierre== ']'
               ||apertura =='{' &&cierre== '}');
    }
    public boolean estaBalanceado(String expresion){
        Stack<Character> pila = new Stack<>();
        for (int i=0; i<expresion.length(); i++){
            char c=expresion.charAt(i);
            if(esApertura(c)){
            pila.push(c);
           } else if (esCierre(c)){
               if (pila.isEmpty()|| !sonPareja(pila.pop(),c))
            return false;
            }           
        }
        return pila.isEmpty();
    }
    
}

