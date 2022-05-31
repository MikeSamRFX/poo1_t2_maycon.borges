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

    

    public static void apresentarFuncionario(Funcionario f){
        System.out.println(f.id);
        System.out.println(f.nome);
        System.out.println(f.data_i);
        System.out.println(f.data_n);
    }
}