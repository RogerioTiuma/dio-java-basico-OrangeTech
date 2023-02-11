// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 

public class MesadaDoSobrinho {

    public static void main() {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        int meses=0;
        
        do{
            System.out.println("Digite o número de meses que você irá junta a mesada");
            meses = entrada;
        }while(meses<0);

        System.out.println("Você terá "+ (meses*mesada) + "reais");
        leitor.close();
    }
}