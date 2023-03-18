package br.com.dio.desafio.dominio;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setDescricao("SolidWorks");
        curso1.setTitulo("Descrição do curso");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setDescricao("Inventor");
        curso2.setTitulo("Descrição do curso");
        curso2.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setDescricao("Mentoria java");
        mentoria.setTitulo("Titulo da mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);



    }
}