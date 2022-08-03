public class Produto implements Classificavel{


    private int codigo;

    public Produto(int cod){
        this.codigo = cod;
    }

    public int getCod() {
        return codigo;
    }

    public boolean eMenorQue(Classificavel o){
        Produto compara = (Produto) o;
        if (this.codigo < compara.codigo){
            return true;
        }else{
            return false;
        }
    }
}
