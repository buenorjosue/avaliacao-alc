package scannermedias;

import java.util.Scanner;

public class ScannerMedias {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Insira a primeira nota: ");
        double n1 = teclado.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double n2 = teclado.nextDouble();
        System.out.print("Insira a terceira nota: ");
        double n3 = teclado.nextDouble();
        
        double media = (n1 + n2 + n3)/3;
        
        if(media > 9){
            System.out.println("Conceito A");
        }
        else if(media > 8 && media < 9){
            System.out.println("Conceito B");
        }
        else if(media > 7 && media < 8){
            System.out.println("Conceito C");
        }
        else if(media > 6 && media < 7){
            System.out.println("Conceito D");
        }
        else{
            System.out.println("Aluno Reprovado");
        }
    }  
}
