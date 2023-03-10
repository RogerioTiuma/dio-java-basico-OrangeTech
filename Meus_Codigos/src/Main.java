import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;


public class Temperaturas(){
{
    public Temperaturas() {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturasSemestral = new ArrayList<>();
        double soma = 0.0;

        for(int i = 1; i<=6; ++i){
            System.out.print("Qual a temperatura do mês " +i+":");
            double temp = scan.nextDouble();
            temperaturasSemestral.add(temp);
            soma += temp;
        }

        double mediaTemperaturaSemestral = soma/temperaturasSemestral.size();
        System.out.println("As temperaturas registradas foram:" + temperaturasSemestral);
        System.out.println("A média das temperaturas foi: "+mediaTemperaturaSemestral);

        iterator var7 = temperaturasSemestral.iterator();

        while (var7.hasNext()){
            Double temp = (Double)var7.next();
            if(temp > mediaTemperaturaSemestral){
                int index = temperaturasSemestral.indexOf(temp);
                switch(index){
                    case 0:
                        System.out.println(index+1+"- Janeiro:"+temp+"ºC");
                        break;
                    case 1:
                        System.out.println(index+1+"- Fevereiro:"+temp+"ºC");
                        break;
                    case 2:
                        System.out.println(index+1+"- Março:"+temp+"ºC");
                        break;
                    case 3:
                        System.out.println(index+1+"- Abril:"+temp+"ºC");
                        break;
                    case 4:
                        System.out.println(index+1+"- Maio:"+temp+"ºC");
                        break;
                    case 5:
                        System.out.println(index+1+"- Junho:"+temp+"ºC");


            }
        }


    }

}}