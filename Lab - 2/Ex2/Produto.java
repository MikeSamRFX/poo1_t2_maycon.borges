public class Produto {
    
    private int id;
    private String nome;
    private String fabricante;
    private double preco;

public Produto(int id, String nome, String fabricante, double preco) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    
    public static void apresentarProduto(Produto p) {
        System.out.println(p.id);
        System.out.println(p.nome);
        System.out.println(p.fabricante);
        System.out.println(p.preco);
    }
}