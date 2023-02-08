public class MinhaClasse{
    public static void main(String[] args) {
        String nome1= "Rogério";
        String nome2= "Tiúma";

        String nomeCompleto = nomeCompleto (nome1, nome2);

        System.out.print(nomeCompleto);


    }

    public static String nomeCompleto (String nome1, String nome2){
        return "Resultado do método " + nome1.concat(" ").concat(nome2);
    }
}