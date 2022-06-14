public class Funcionario{

    private int id;
    private String nome;
    private int data_i;
    private int data_n;

    public Funcionario(int id, String nome, int data_i, int data_n){
        this.id = id;
        this.nome = nome;
        this.data_i = data_i;
        this.data_n = data_n;
    }

    public void apresentarFuncionario(){
        System.out.println(this.id);
        System.out.println(this.nome);
        System.out.println(this.data_i);
        System.out.println(this.data_n);
    }
}