package estrutura.dados.algoritmo.java;

public class VetorObjetos {
    private Object[] elementos;
    private int tamanho;
    
    public VetorObjetos(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }   
    
    public boolean adiciona(Object elemento){
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    
    public void adiciona(int posicao, Object elemento){
        
        if(!(posicao >= 0 && posicao <= tamanho)){
            throw new IllegalArgumentException("Posicao Invalida");
        }
        this.aumentaCapacidade();
                
        for(int i = this.tamanho; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }
    
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for(int i = 0 ; i<elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    public int getTamanho(){
        return this.tamanho;
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i<this.tamanho-1;i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        
        if(this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");
        return s.toString();
    }
    
    public Object busca(int posicao){
        if(!(posicao >= 0 && posicao <= tamanho)){
            throw new IllegalArgumentException("Posicao Invalida");
        }
        
        return this.elementos[posicao];
    }
    
    public void remove(int posicao){
        if(!(posicao >= 0 && posicao <= tamanho)){
            throw new IllegalArgumentException("Posicao Invalida");
        }
        
        for(int i = posicao; i < this.tamanho-1;i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }
    
    public int busca(Object elemento){
        for(int i = 0; i< this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
}
