public class Cliente{

    private int id;
    private String nome;
    private int data_n;
    private int cep;

    public Cliente(int id, String nome, int data_n, int cep){
        this.id = id;
        this.nome = nome;
        this.data_n = data_n;
        this.cep = cep;
    }

    public void apresentarCliente(){
        System.out.println(this.id);
        System.out.println(this.nome);
        System.out.println(this.data_n);
        System.out.println(this.cep);
    }

}