import java.util.Scanner; 

public class Mesada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int mesada = 50;
        int meses=0;
        do{
            System.out.println("Digite o número de meses que você irá junta a mesada");
            meses = leitor.nextInt();
        }while(meses<0);

        System.out.println("Você terá "+ (meses*mesada) + " reais");
        leitor.close();
    
        
    }
    
}
