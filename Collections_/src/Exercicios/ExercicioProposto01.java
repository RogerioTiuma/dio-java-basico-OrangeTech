package Exercicios;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ExercicioProposto01 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        //Adicionando as temperaturas na lista:
        int count = 0;

        while(true){
            if (count == 6) break;

            System.out.println("Digite a temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("--------------");

        //exibindo todas as temperaturas:

        System.out.print("Todas as temperaturas: ");

    }

}