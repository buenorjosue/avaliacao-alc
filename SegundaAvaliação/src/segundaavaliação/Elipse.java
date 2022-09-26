package segundaavaliação;

public class Elipse extends Forma implements Excentricidade{
    
    private double eixoA;
    private double eixoB;
    private double aux;
    private double excentricidade;
    
     public double getAux() {
        return aux;
    }

    public void setAux(double aux) {
        this.aux = aux;
    }

    public double getEixoA() {
        return eixoA;
    }

    public void setEixoA(double eixoA) {
        this.eixoA = eixoA;
    }

    public double getEixoB() {
        return eixoB;
    }

    public void setEixoB(double eixoB) {
        this.eixoB = eixoB;
    }

    public double getExcentricidade() {
        return excentricidade;
    }

    public void setExcentricidade(double excentricidade) {
        this.excentricidade = excentricidade;
    }
    
    @Override
    public void calcularExcentricidade() {
        this.setExcentricidade(Math.sqrt(1-Math.pow(eixoB, 2)/Math.pow(eixoA, 2)));
    } 

    @Override
    public void calcularArea() {
        this.area = Math.PI * eixoA * eixoB;
    }

    @Override
    public void calcularPerimetro() {
        if(this.getEixoB() > this.getEixoA()){
           this.aux = this.getEixoA();
           this.eixoA = this.getEixoB();
           this.eixoB = this.getAux();
        }
        this.perimetro = Math.PI * Math.sqrt(2*(Math.pow(eixoA, 2) + Math.pow(eixoB, 2)) - (Math.pow(eixoA-eixoB, 2))/2);
    }

    @Override
    public void imprimirValores() {
        System.out.println("Valor do perimetro da elipse: " + this.perimetro);
        System.out.println("Valor do area da elipse: " + this.area);
        System.out.println("Valor do excentricidade da elipse: " + this.excentricidade);
    }
}
