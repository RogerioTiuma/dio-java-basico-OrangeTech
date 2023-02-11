public class Mensagem{
    public static void obterMensagem(int hora) {
        if ((hora>=5) && (hora <=12)) mensagemBomDia();

        if((hora >12) && (hora<=17)) mensagemBoaTarde();

        if((hora >17) && (hora<=24)) mensagemBoaNoite();

        if((hora >=0) && (hora<5)) mensagemBoaNoite();

    }
    
    public static void mensagemBomDia() {
        System.out.println("Bom dia");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa Tarde");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa Noite");
    }
}
