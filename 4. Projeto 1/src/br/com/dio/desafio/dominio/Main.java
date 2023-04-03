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


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila"+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos Concluidos Camila"+ devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularTotalXp());


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao"+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Concluidos Joao"+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularTotalXp());

    }
}