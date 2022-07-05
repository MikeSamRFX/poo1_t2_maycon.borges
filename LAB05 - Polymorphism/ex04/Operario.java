import java.util.Date;

public class Operario extends Funcionario{
    public double bonusProducao;

    public Operario (String nome, Date dataNascimento){
        super(nome,dataNascimento,0);
        this.bonusProducao = 0;
    }

    public void contabilizaBonus(int quantidadeProducao, double valorProducao){
        this.bonusProducao = ((valorProducao/100)*5)*quantidadeProducao;
    }

    public double salario(){
        return this.bonusProducao;
    }
}
