import java.util.Date;

public class Operario extends Funcionario {

    public Operario (String nome, Date dataNascimento, double valorProducao, int quantidade){
        super(nome, dataNascimento, valorProducao*quantidade);
    }

    public void mostra(){
        super.mostra();
    }

}
