package classes;

public class Bicicleta {    
    private int velocidade = 0;
    private int marcha = 1;
    public int velocidadeMaxima;
    
    public Bicicleta(int vm){
        velocidadeMaxima = vm;
    }

    public void mudarMarcha(int valor){
        marcha = valor;
    }
    
    public void acelerar(int incremento){
        velocidade = velocidade + incremento;
        if(velocidade > velocidadeMaxima){
            velocidade = velocidadeMaxima;
        }
    }
    
    public void freiar(int decremento){
        velocidade = velocidade - decremento;
    }
    
    public void imprimirEstados(){
        System.out.println("Velocidade: " + velocidade + " " + "Marcha: " + marcha);
    }  
}