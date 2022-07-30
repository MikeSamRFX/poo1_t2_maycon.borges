import java.util.Scanner;

public class FaceFriends {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Contato []vet = new Contato[20];
        int pos = 0;

        while(true){
            System.out.println("1 - inserirContato");
            System.out.println("2 - Imprimir todos");
            System.out.println("3 - Imprimir familiares");
            System.out.println("4 - Imprimir amigos");
            System.out.println("5 - Imprimir colegas de trabalho");
            System.out.println("6 - imprimir os Melhores amigos, os Irmaos e os colegas de trabalho");
            System.out.println("7 - Imprimir especifico");
            System.out.println("0 - Sair");
            System.out.println("Insira a opcao:");
            int op = input.nextInt();
            if (op == 1){
                System.out.println("1 - Inserir Amigo");
                System.out.println("2 - Inserir Familiar");
                System.out.println("3 - Inserir Colega de Trabalho");
                System.out.println("Insira a opcao:");
                int ins = input.nextInt();
                if(ins == 1){
                    System.out.println("Apelido:");
                    String apelido = input.nextLine();
                    System.out.println("Nome:");
                    String nome = input.nextLine();
                    System.out.println("Email:");
                    String email = input.nextLine();
                    System.out.println("Data Nascimento:");
                    String data = input.nextLine();
                    System.out.println("Grau:");
                    int grau = input.nextInt();

                    vet[pos] = new Amigos(apelido,nome,email,data,grau);
                    pos++;
                }

                if(ins == 2){
                    System.out.println("Apelido:");
                    String apelido = input.nextLine();
                    System.out.println("Nome:");
                    String nome = input.nextLine();
                    System.out.println("Email:");
                    String email = input.nextLine();
                    System.out.println("Data Nascimento:");
                    String data = input.nextLine();
                    System.out.println("Tipo:");
                    String tipo = input.nextLine();

                    vet[pos] = new Familia(apelido,nome,email,data,tipo);
                    pos++;
                }

                if(ins == 3){
                    System.out.println("Apelido:");
                    String apelido = input.nextLine();
                    System.out.println("Nome:");
                    String nome = input.nextLine();
                    System.out.println("Email:");
                    String email = input.nextLine();
                    System.out.println("Data Nascimento:");
                    String data = input.nextLine();
                    System.out.println("Tipo:");
                    String tipo = input.nextLine();

                    vet[pos] = new Trabalho(apelido,nome,email,data,tipo);
                    pos++;
                }
            }
            if (op == 2){
                for(int i = 0; i < pos+1; i++){
                    System.out.println(vet[i].imprimirContato());
                }
            }
            if (op == 3){
                for(int i = 0; i < pos+1; i++){
                    if(vet[i] instanceof Familia){
                        vet[i].imprimirContato();
                    }
                }
            }
            if (op == 4){
                for(int i = 0; i < pos+1; i++){
                    if(vet[i] instanceof Amigos){
                        vet[i].imprimirContato();
                    }
                }
            }
            if (op == 5){
                for(int i = 0; i < pos+1; i++){
                    if(vet[i] instanceof Trabalho){
                        vet[i].imprimirContato();
                    }
                }
            }
            if (op == 6){
                for(int i = 0; i < pos+1; i++){
                    if(vet[i] instanceof Familia){
                        if(((Familia) vet[i]).parentesco.equals("irmao")){
                            vet[i].imprimirContato();
                        }
                    }
                    if(vet[i] instanceof Amigos){
                        if(((Amigos) vet[i]).grau == 1){
                            vet[i].imprimirContato();
                        }
                    }
                    if(vet[i] instanceof Trabalho){
                        if(((Trabalho) vet[i]).Tipo.equals("colega")){
                            vet[i].imprimirContato();
                        }
                    }
                }
            }
            if (op == 7){
                System.out.println("Qual imprimir");
                int index = input.nextInt();
                if(vet[index] == null){
                    System.out.println("Posicao Vazia");
                }

                if(vet[index] instanceof Familia){
                    System.out.println("Familia");
                    System.out.println(vet[index].imprimirContato());
                }
                if(vet[index] instanceof Amigos){
                    System.out.println("Amigo");
                    System.out.println(vet[index].imprimirContato());
                }
                if(vet[index] instanceof Trabalho){
                    System.out.println("Trabalho");
                    System.out.println(vet[index].imprimirContato());
                }
            }
            if (op == 0){
                break;
            }
        }
    }
}
