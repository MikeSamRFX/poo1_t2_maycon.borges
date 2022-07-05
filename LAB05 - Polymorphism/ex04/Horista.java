import java.util.Date;

public class Horista extends Funcionario{
    public double bonusHoras;

    public Horista(String nome, Date dataNascimento){
        super(nome, dataNascimento,0);
        this.bonusHoras = 0;
    }

    public void contabilizaBonus(int quantidadeHoras){
        this.bonusHoras += 10*quantidadeHoras;
    }

    public double salario(){
        return this.bonusHoras;
    }
}
