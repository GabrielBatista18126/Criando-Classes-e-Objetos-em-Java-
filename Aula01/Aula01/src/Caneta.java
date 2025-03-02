import java.awt.*;

public class Caneta {
    String modelo;
    String cor;
    Float ponta;
    int carga;
    boolean tampada;
    void status(){

        System.out.print(("Modelo:")+ this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.print("Ponta:"+ this.ponta);
        System.out.print("Carga :"+ this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando!");
        }

    }

    void tampar(){
        this.tampada = true;

    }

    void destampar(){
        this.tampada = false;

    }
}
