public class Main {
    public static void main(String[] args) {
        Produto []vetP = new Produto[3];
        Cliente []vetC = new Cliente[3];
        Servico []vetS = new Servico[3];

        vetP[0] = new Produto(3);
        vetP[1] = new Produto(1);
        vetP[2] = new Produto(4);

        vetC[0] = new Cliente("Joao");
        vetC[1] = new Cliente("Maria");
        vetC[2] = new Cliente("Ana");

        vetS[0] = new Servico(12.30);
        vetS[1] = new Servico(15.23);
        vetS[2] = new Servico(2.50);

        Classificador.ordena(vetP);
        Classificador.ordena(vetC);
        Classificador.ordena(vetS);

        for(int i = 0; i < 3; i ++){
            System.out.println("P = " + vetP[i].getCod() + " C = " + vetC[i].getNome() + " S = " + vetS[i].getPreco());
        }


    }
}
