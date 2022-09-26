package testedoido;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteDoido {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        try{
        int n = teclado.nextInt();
        
        System.out.println(30/n);
        }catch(ArithmeticException erro){
            System.out.println("O n não pode ser 0!");
        }catch(InputMismatchException erro){
            System.out.println("Insira um inteiro, por favor!");
        }finally{
            System.out.println("Houve um erro!");
        }
    }   
}
