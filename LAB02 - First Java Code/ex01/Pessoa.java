public class Pessoa {

    String nome;
    double carteira;

    public Pessoa(String nome){
        this.nome = nome;
        this.carteira = 0;
    }

    public void Receber(double valor){
        this.carteira += valor;
    }

    public void Gastar(double valor){
        this.carteira -= valor;
    }

}