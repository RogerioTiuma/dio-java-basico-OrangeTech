package Metodos;
public class PrimeiroPOO {
    
    //classe
    class Carro{

        //atributos
        String cor;
        String modelo;
        int capacidadeTanque;

        //sobrecarga
        Carro(){
            
        }

        Carro(String cor, String modelo, int capacidadeTanque){
            this.cor =cor;
            this.modelo = modelo;
            this.capacidadeTanque = capacidadeTanque;
            
        }

        //construtores

        void setCor(String cor){
            this.cor = cor;
        }

        String getCor(String cor){
            return cor;
        }

        void setModelo(String modelo){
            this.modelo = modelo;
        }

        String getModelo(String modelo){
            return modelo;
        }

        void setCapacidadeTanque(int capacidadeTanque){
            this.capacidadeTanque = capacidadeTanque;
        }

        int getCapacidadeTanque(int capacidadeTanque){
            return capacidadeTanque;
        }


        //Método
        double totalValorTanque(double valorCombustivel){
            return capacidadeTanque*valorCombustivel;
        }

    }
    

}