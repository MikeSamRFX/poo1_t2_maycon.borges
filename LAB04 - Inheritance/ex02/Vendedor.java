import java.util.Date;

public class Vendedor extends Funcionario {

    private int vendas;

    public Vendedor (String nome, Date dataNascimento, int vendas){
        super(nome,dataNascimento,1500+(20*vendas));
    }

    public void mostra(){
        super.mostra();
    }
}
