package Exercicios;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ExercicioTemperatura {
    public static void main(String[] args) {
        List<Temperaturas> temperaturasRegistradas = new ArrayList<>(){{}};
        Scanner scan = new Scanner(System.in);
        int temp,i=0;
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};

        do {
            System.out.println("Escreva a media de temperatura do mês de " + mes[i]);
            temp = scan.nextInt();
            temperaturasRegistradas.add(mes[i], temp);

        } while (i<=5);


    }

}
        class Temperaturas {
            private String mes[];
            private Integer media;

            public Temperaturas(String mes[], Integer media) {
                this.mes = mes;
                this.media = media;
            }

            public String getMes() {
                return mes[];
            }

            public Integer getMedia() {
                return media;
            }

            @Override
            public String toString() {
                return "Temperaturas{" +
                        "mes='" + mes[] + '\'' +
                        ", media=" + media +
                        '}';
            }
        }
