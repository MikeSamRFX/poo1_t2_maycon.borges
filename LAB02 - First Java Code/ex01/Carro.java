public class Carro {
    
    String marca;
    String modelo;
    String placa;
    
    
    
    public Carro(String marca, String modelo, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
    
    public void acelerar(){
        System.out.println(this.modelo + " acelerou!");
    }
    
    public void frear(){
        System.out.println(this.modelo + " parou!");
    }
    
}