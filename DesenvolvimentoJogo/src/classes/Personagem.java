package classes;

abstract class Personagem {
    private final String nome;
    private int pontuacao;
    private int qtdForca;
    private int qtdIntel;
    private int qtdVida = 100;
    private Sexo sexo;
    private Item[] itens = new Item[100];
    
    public Personagem(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getQtdForca() {
        return qtdForca;
    }

    public void setQtdForca(int qtdForca) {
        this.qtdForca = qtdForca;
    }

    public int getQtdIntel() {
        return qtdIntel;
    }

    public void setQtdIntel(int qtdIntel) {
        this.qtdIntel = qtdIntel;
    }

    public int getQtdVida() {
        return qtdVida;
    }

    public void setQtdVida(int qtdVida) {
        this.qtdVida = qtdVida;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
        if(sexo == Sexo.MASCULINO){
            setQtdForca(10);
            setQtdIntel(5);
        }
        else if(sexo == Sexo.FEMININO){
            setQtdForca(5);
            setQtdIntel(10);
        }
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
    
    public class Guerreiro extends Personagem{
        private int estamina;
        private int danoCausado;

        public int getEstamina() {
            return estamina;
        }

        public void setEstamina(int estamina) {
            this.estamina = estamina;
        }
        
        public int getDanoCausado() {
            return danoCausado;
        }

        public void setDanoCausado(int danoCausado) {
            this.danoCausado = danoCausado;
        }
        
        public int ataquePoderoso(int estamina){
            if(getEstamina() > 0){
                this.setDanoCausado(getEstamina() * getQtdForca());
            }
            else{
                this.setDanoCausado(0);
            }
            return this.getDanoCausado();
        }
    }
    
    public class Mago extends Personagem{
        private int mana;
        private int danoCausado;

        public int getMana() {
            return mana;
        }

        public void setMana(int mana) {
            this.mana = mana;
        }

        public int getDanoCausado() {
            return danoCausado;
        }

        public void setDanoCausado(int danoCausado) {
            this.danoCausado = danoCausado;
        }
        
        public int lancarMagia(int mana){
            if(getMana() > 0){
                this.setDanoCausado(getMana() * getQtdIntel());
            }
            else{
                this.setDanoCausado(0);
            }
            return this.getDanoCausado();
        }
    }
}
