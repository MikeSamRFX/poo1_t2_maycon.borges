public class Servico implements Classificavel{
    private double preco;

    public Servico(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public boolean eMenorQue(Classificavel o){
        Servico compara = (Servico) o;
        if(this.preco < compara.preco){
            return true;
        }else{
            return false;
        }
    }
}
