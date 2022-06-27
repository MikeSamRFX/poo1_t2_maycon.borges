import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Chefe vetChefe[] = new Chefe[3];
        Vendedor vetVendedor[] = new Vendedor[10];
        Operario vetOperario[] = new Operario[10];
        Horista vetHorista[] = new Horista[10];

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("Insira nome:");
            String nome = input.nextLine();
            System.out.println("Insira a data de nascimento:");

            String date = input.nextLine();

            Date dataNascimento = new Date(date);

            Chefe aux = new Chefe(nome, dataNascimento);

            vetChefe[i] = aux;
        }

        for(int i = 0; i < 10; i++){
            System.out.println("Insira nome:");
            String nome = input.nextLine();
            System.out.println("Insira a data de nascimento:");

            String date = input.nextLine();

            Date dataNascimento = new Date(date);

            System.out.println("Insira a quantidade de vendas:");
            int vendas = input.nextInt();

            Vendedor aux = new Vendedor(nome, dataNascimento, vendas);

            vetVendedor[i] = aux;
        }

        for(int i = 0; i < 10; i++){
            System.out.println("Insira nome:");
            String nome = input.nextLine();
            System.out.println("Insira a data de nascimento:");

            String date = input.nextLine();

            Date dataNascimento = new Date(date);

            System.out.println("Insira o valor da producao:");
            double valor = input.nextInt();

            System.out.println("Insira o quantidade produzida:");
            int quantidade = input.nextInt();

            Operario aux = new Operario(nome, dataNascimento, valor, quantidade);

            vetOperario[i] = aux;
        }

        for(int i = 0; i < 10; i++){
            System.out.println("Insira nome:");
            String nome = input.nextLine();
            System.out.println("Insira a data de nascimento:");

            String date = input.nextLine();

            Date dataNascimento = new Date(date);

            System.out.println("Insira a quantidade de horas trabalhadas:");
            int horas = input.nextInt();

            Horista aux = new Horista(nome, dataNascimento, horas);

            vetHorista[i] = aux;
        }

        for(int i = 0; i < 3; i++){
            vetChefe[i].mostra();
        }

        for(int i = 0; i < 10; i++){
            vetVendedor[i].mostra();
        }

        for(int i = 0; i < 10; i++){
            vetOperario[i].mostra();
        }

        for(int i = 0; i < 10; i++){
            vetHorista[i].mostra();
        }
    }
}