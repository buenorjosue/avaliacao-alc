package classes;

public class Cachorros {
    public void latir(){
        System.out.println(getNome());
    }
    
    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public static void main(String[] args){
        Cachorros bingo = new Cachorros();
        Cachorros dingo = new Cachorros();
        bingo.setNome("Bingo");
        bingo.latir();
        dingo.setNome("Dingo");
        dingo.latir();
    }
}
