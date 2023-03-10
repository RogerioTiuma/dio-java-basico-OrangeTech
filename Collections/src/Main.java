import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18, "preto"));
            add(new Gato("Simba",6, "tigrado"));
            add(new Gato("Jon",12, "amarelo"));
        }};

        System.out.println(meusGatos);
    }
}

class Gato {
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    private String nome;
    private Integer idade;
    private String cor;

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }
}