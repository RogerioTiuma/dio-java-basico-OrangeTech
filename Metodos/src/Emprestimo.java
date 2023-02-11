public class Emprestimo {
    
    public static double definirTaxa (int parcelas) {

        if ((parcelas <4)&&(parcelas>0)){
            switch(parcelas){
                
                case 1:
                return 0.1;
                
                case 2:
                return 0.2;
                
                case 3:
                return 0.3;
            }

         } else {System.out.println("Quantidade de parcelar inválida.");}
        return parcelas;

    }
    
    public static void calcular (double valor, int parcelas ){

        System.out.println("O valor final do emprestimo é: R$" + valor*(1+definirTaxa(parcelas)));

    } 

}

    