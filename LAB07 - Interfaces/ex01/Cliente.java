public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean eMenorQue(Classificavel o){
        Cliente compara = (Cliente) o;
        if(0 > this.nome.compareTo(compara.nome)){
            return true;
        }else{
            return false;
        }
    }
}
