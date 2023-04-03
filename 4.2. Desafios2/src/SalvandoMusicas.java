import java.util.Scanner;

public class SalvandoMusicas {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner (System.in);
        String arquivoDoPc = leitor.next();
        String partes[] = arquivoDoPc.split("\\.");
        leitor.close();
        
        System.out.println("A segunda parte e:" + partes[1]);

        if(partes[1].equals("mp3")){
            System.out.println("Salvar");
        } else System.out.println("Deletar");



    }
}
