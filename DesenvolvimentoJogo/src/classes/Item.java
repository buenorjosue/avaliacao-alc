package classes;

abstract class Item {
    private final String nome;
    private final int forca;
    private final int intel;
    private final int vida;
    
    public Item(String nome, int forca, int intel, int vida){
        this.nome = nome;
        this.forca = forca;
        this.intel = intel;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getForca() {
        return forca;
    }

    public int getIntel() {
        return intel;
    }

    public int getVida() {
        return vida;
    }
}
