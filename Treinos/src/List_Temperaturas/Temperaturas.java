package List_Temperaturas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Temperaturas {

    public Temperaturas(){

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturasSemestral = new ArrayList<>();
        int cont = 0;
        double soma = 0.0;

        while (cont<6){
            System.out.println("Informe a temperatura do mês: " + (cont + 1));
            double temp = scan.nextDouble();
            temperaturasSemestral.add(temp);
            cont++;
            soma +=temp;
        }

        double mediaTemperaturas = soma/temperaturasSemestral.size();

        System.out.println("As temperaturas foram: " + temperaturasSemestral);
        System.out.println("A media de temperaturas é: " + mediaTemperaturas );

        Iterator var7 = temperaturasSemestral.iterator();

        while (var7.hasNext()){
            Double temp = (Double)var7.next();
            int index = temperaturasSemestral.indexOf(temp);
            if(temp>mediaTemperaturas){
            switch (index) {
                case 0:
                    System.out.println(index + 1 + "-Janeiro a média foi de: " + temp);
                    break;
                case 1:
                    System.out.println(index + 1 + "-Fevereiro a média foi de: " + temp);
                    break;
                case 2:
                    System.out.println(index + 1 + "-Março a média foi de: " + temp);
                    break;
                case 3:
                    System.out.println(index + 1 + "-Abril a média foi de: " + temp);
                    break;
                case 4:
                    System.out.println(index + 1 + "-Maio a média foi de: " + temp);
                    break;
                case 5:
                    System.out.println(index + 1 + "-Janeiro a média foi de: " + temp);
                    break;
                }
            }
        }


    }

}
