import java.util.Date;

public class Funcionario {
    public String getNome() {
        return nome;
    }

    private String nome;
    private Date dataNascimento;

    public double getSalario() {
        return salario;
    }

    private double salario;

    public Funcionario (String nome, Date dataNascimento, double salario){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }


    public void contabilizaBonus(int i, double i1) {
    }

    public void contabilizaBonus(int i) {
    }

    public void contabilizaVenda(double i) {
    }

    public double salario(){
        return this.salario;
    }
}
