package estrutura.dados.algoritmo.java;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EstruturaDadosAlgoritmoJava {
    
    public static void main(String[] args) {
        try {
            Vetor vetor = new Vetor(2);
            
            
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
