public class Caneta {
    public String modelo;
    public String cor;
    private Float ponta;
    protected int carga;
    protected boolean tampada;
    public void status(){

        System.out.print(("Modelo:")+ this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.print("Ponta:"+ this.ponta);
        System.out.print("Carga :"+ this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando!");
        }

    }

    public void tampar(){
        this.tampada = true;

    }

    public void destampar(){
        this.tampada = false;

    }
}