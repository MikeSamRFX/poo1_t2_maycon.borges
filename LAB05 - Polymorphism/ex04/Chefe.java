import java.util.Date;

public class Chefe extends Funcionario{

    public Chefe (String nome, Date dataNascimento, double salario){
        super(nome, dataNascimento, salario);
    }

    public double salario(){
        return super.salario();
    }

}
