package classes;

public class Jogador {
    
    private PosicaoTatica posicao;
    private String nome;
    
    public Jogador(String n, PosicaoTatica p){
     this.nome = n;
     this.posicao = p;
}

    public PosicaoTatica getPosicao() {
        return posicao;
    }

    public void setPosicao(PosicaoTatica posicao) {
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
