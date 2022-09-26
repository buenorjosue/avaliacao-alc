package classes;

public class CarroFuncionando {
    public static void main(String[] args) {
        Carros carrito = new Carros();
        Carros carrones = new Carros();
        Carros carrada = new Carros();
        
        carrito.aumentarVel(100);
        carrones.aumentarVel(200);
        carrada.aumentarVel(50);
        
        carrito.setNome("Jacinto");
        carrones.setNome("Mario");
        carrada.setNome("Miro");
        
        Corrida copapiston = new Corrida();
        
        copapiston.adicionarCarro(carrito);
        copapiston.adicionarCarro(carrones);
        copapiston.adicionarCarro(carrada);
        
        carrito.percorrer(2);
        carrones.percorrer(3);
        carrada.percorrer(1);
        
        carrito.teste();
        carrones.teste();
        carrada.teste();
    }
}
