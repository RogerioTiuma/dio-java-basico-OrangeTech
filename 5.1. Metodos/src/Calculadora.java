/*Faça um método para calular as quatro operações entre 
 * dois números
 */


public class Calculadora {
    
        
        public static void soma(double numeroUm , double numeroDois){
            double resultado = numeroUm+numeroDois;
            System.out.println("A soma entre " + numeroUm + " e " + numeroDois + " é:  " +resultado);
        }

        public static void subtração(double numeroUm , double numeroDois){
            double resultado = numeroUm-numeroDois;
            System.out.println("A subtração entre " + numeroUm + " e " + numeroDois +" é:  "+resultado);
        }

        public static void multiplicao(double numeroUm , double numeroDois){
            double resultado = numeroUm*numeroDois;
            System.out.println("A multiplição entre " + numeroUm + " e " + numeroDois +" é:  "+resultado);
        }

        public static void divisao(double numeroUm , double numeroDois){
            double resultado = numeroUm/numeroDois;
            System.out.println("A divisão entre " + numeroUm + " e " + numeroDois +" é:  "+resultado);
        }

                  
        
    }

