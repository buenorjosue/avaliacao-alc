package classes;

public class Fase {
    private final String nome;
    private int dificuldade;
    public static int numPerson;
    
    public Fase(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void definirDificuldade() {
        if(getNumPerson() > 4){
            this.dificuldade = 5;
        }
        else{
           this.dificuldade = 1 + getNumPerson();
        }
    }

    public static int getNumPerson() {
        return numPerson;
    }

    public void setNumPerson(int numPerson) {
        Fase.numPerson = numPerson;
    }
}
