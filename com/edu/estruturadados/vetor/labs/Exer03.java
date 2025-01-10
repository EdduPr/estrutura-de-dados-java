package com.edu.estruturadados.vetor.labs;

import estrutura.dados.algoritmo.java.Lista;

public class Exer03 {
    
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(1);
        
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("A");
        
        lista.remove("A");
        
        System.out.println(lista);
        
        lista.remove("A");
        
        System.out.println(lista);
    }

}
