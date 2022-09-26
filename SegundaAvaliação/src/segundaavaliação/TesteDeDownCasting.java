package segundaavaliação;

public class TesteDeDownCasting {
    public static void main(String[] args) {
        Quadrado square = new Quadrado();
        
        square.setComprimento(4);
        square.setLargura(4);
        square.calcularArea();  
        square.calcularPerimetro();
        square.imprimirValores();
        
        Retangulo ret = new Retangulo();
        
        ret.setComprimento(2);
        ret.setLargura(3);
        ret.calcularArea();
        ret.calcularPerimetro();
        ret.imprimirValores();
        
    }
}
