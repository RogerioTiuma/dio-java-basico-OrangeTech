

import java.util.Scanner;

public class MaiorMedia {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior=0;
        int contador=0;

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            contador++;
            if(numero > maior) maior = numero;

        }while(contador <5);
        System.out.println("O maior é: " + maior);
        scan.close();
    }
}
