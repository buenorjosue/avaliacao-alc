package segundaavaliação;

public class Circulo extends Elipse {
    
    @Override
    public void calcularExcentricidade() {
        this.setExcentricidade(0);
    } 
    
    @Override
    public void calcularPerimetro() {
        this.perimetro = 2 * Math.PI * this.getEixoA();
    }
    
    @Override
    public void imprimirValores() {
        System.out.println("Valor do perimetro do circulo: " + this.perimetro);
        System.out.println("Valor do area do circulo: " + this.area);
        System.out.println("Valor do excentricidade do circulo: " + this.getExcentricidade());
    }
}
