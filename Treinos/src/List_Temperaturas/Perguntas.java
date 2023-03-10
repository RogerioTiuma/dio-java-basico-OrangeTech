package List_Temperaturas;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

public class Perguntas {
    public Perguntas(){

    }

    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String resposta;

        System.out.println("Telefonou para a vítima?");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Esteve no local do crime?");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Mora perto da vítima?");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Devia para a vítima?");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        
        System.out.println("Já trabalhou com a vítima?");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        
        Iterator <String> resultado = respostas.iterator();
        int count=0;

        while (resultado.hasNext()){
            String resp = (String) resultado.next();
            if(resp.contains("s"))
                ++count;
        }

        switch (count) {
            case 2 -> System.out.println("Suspeito.");
            case 3, 4 -> System.out.println("Cúmplice.");
            case 5 -> System.out.println("Assassino.");
            default -> System.out.println("Inocente.");
        }


    }
}
