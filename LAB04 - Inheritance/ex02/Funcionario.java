import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Funcionario {
    private String nome;
    private Date dataNascimento;
    private double salario;

    public Funcionario (String nome,Date dataNascimento, double salario){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public void mostra(){
        System.out.println(this.nome);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(this.dataNascimento));
        System.out.println(this.salario);
    }

}
