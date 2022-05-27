public class Main {

    public static void main(String[] args){

        Produto p = new Produto(1,"Produto","Fabricante",12.5);
        Produto.apresentarProduto(p);

        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        Funcionario f = new Funcionario(7,"Funcionario 1", 12, 12);
        Funcionario.apresentarFuncionario(f);

        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        Cliente c = new Cliente(1,"Cliente 1", 12, 38312111);
        Cliente.apresentarCliente(c);


    }

}