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

    public static void apresentarCliente(Cliente c){
        System.out.println(c.id);
        System.out.println(c.nome);
        System.out.println(c.data_n);
        System.out.println(c.cep);
    }

}