import java.util.Date;

public class Vendedor extends Funcionario{
    public int vendas;
    public double comissao;

    public Vendedor (String nome, Date dataNascimento, double salario){
        super(nome, dataNascimento, salario);
    }

    public void contabilizaVenda(double valor){
        this.vendas++;
        this.comissao += (valor/100) * 5;
    }

    public double salario(){
        double v = super.salario() + this.comissao;
        return v;
    }

}
