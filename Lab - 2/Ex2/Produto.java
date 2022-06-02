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

    
    public void apresentarProduto() {
        System.out.println(this.id);
        System.out.println(this.nome);
        System.out.println(this.fabricante);
        System.out.println(this.preco);
    }
}