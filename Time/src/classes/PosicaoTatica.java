package classes;

public enum PosicaoTatica {
    GOLEIRO(0), ZAGUEIRO(1), LATERAL(2), MEIA(3), ATACANTE(4);
    
    private int valor;
    
    PosicaoTatica(int v){
        this.valor = v;
    }
    
    public int getValor(){
        return this.valor;
    }
}
