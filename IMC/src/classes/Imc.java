package classes;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu peso: ");
        double massa = teclado.nextDouble();
        System.out.print("Digite a sua altura: ");
        double altura = teclado.nextDouble();
        
        double imc;
        
        imc = (massa/(altura*altura)) * 10000;
        
        System.out.println("Seu IMC é: " + imc);
    }
}