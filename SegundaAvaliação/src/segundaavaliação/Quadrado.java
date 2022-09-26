package segundaavaliação;

public class Quadrado extends Retangulo {
    
    @Override
    public void imprimirValores() {
        System.out.println("Valor do perimetro do quadrado: " + this.perimetro);
        System.out.println("Valor do area do quadrado: " + this.area);
    } 
}