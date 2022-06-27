import java.util.Date;

public class Horista extends Funcionario{
    public Horista (String nome, Date dataNascimento,int Horas){
        super(nome,dataNascimento,8.70*Horas);
    }

    public void mostra(){
        super.mostra();
    }
}
