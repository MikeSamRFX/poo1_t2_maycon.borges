import java.util.Date;

public class Empresa {
    public static void main(String[] args) {
        Funcionario vet[] = new Funcionario[4];
        Date aux = new Date("15/03/2500");
        vet[0] = new Chefe("Cleitinho Arrasta", aux, 9000);
        vet[1] = new Vendedor("Cleitinho Numrrasta", aux, 1000);
        vet[2] = new Operario("Roberto Horhud", aux);
        vet[3] = new Horista("Burger King", aux);

        vet[1].contabilizaVenda(900);
        vet[1].contabilizaVenda(700);
        vet[1].contabilizaVenda(453.88);
        vet[1].contabilizaVenda(976.32);
        vet[2].contabilizaBonus(21,4300);
        vet[3].contabilizaBonus(48);

        FolhaDePagamento.gerarFolha(vet);
    }
}
