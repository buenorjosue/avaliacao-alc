package classes;

public class BicicletaFuncionando {
    public static void main(String[] args) {
        Bicicleta bikezinha = new Bicicleta(70);
        Bicicleta bikezona = new Bicicleta(50);
        
        bikezinha.acelerar(200);
        bikezinha.mudarMarcha(2);
        bikezinha.imprimirEstados();
        
        bikezona.acelerar(300);
        bikezona.freiar(10);
        bikezona.mudarMarcha(2);
        bikezona.imprimirEstados();
    }
}
