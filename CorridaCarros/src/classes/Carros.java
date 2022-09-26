package classes;

public class Carros {
    
    private String nome;
    private int velocidade = 0;
    private int tempo = 0;
    private int distper = 0;
    private int disttotal = 0;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    public void aumentarVel(int vel){
        velocidade += vel;
    }
    
    public void diminuirVel(int vel){
        velocidade -= vel;
    }
    
    public void percorrer(int tempo){
        distper = tempo * velocidade;
        distanciaPercorrida();
    }
    
    public void distanciaPercorrida(){
        disttotal = disttotal + distper;
    }
    
    public void teste(){
        System.out.println("Velocidade = " + velocidade + " " + "Distancia total = " + disttotal + " " + "Nome = " + getNome());
    }
}
