package classes;

public class Jogo {
    private Fase[] fases = new Fase[3];
    private Personagem[] personagens;
    private Estados estado;

    public Jogo(){
        this.personagens = new Personagem[Fase.getNumPerson()];
    }

    public Fase[] getFases() {
        return fases;
    }

    public void setFases(Fase[] fases) {
        this.fases = fases;
    }

    public Personagem[] getPersonagens() {
        return personagens;
    }

    public void setPersonagens(Personagem[] personagens) {
        this.personagens = personagens;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
}
