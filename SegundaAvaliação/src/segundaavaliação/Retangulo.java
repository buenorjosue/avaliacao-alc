package segundaavaliação;

public class Retangulo extends Forma {
    
    private double largura;
    private double comprimento;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public void calcularArea() {
        this.area = this.getLargura() * this.getComprimento();
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = 2*(this.getLargura() + this.getComprimento());
    }

    @Override
    public void imprimirValores() {
        System.out.println("Valor do perimetro do retangulo: " + this.perimetro);
        System.out.println("Valor do area do retangulo: " + this.area);
    } 
}