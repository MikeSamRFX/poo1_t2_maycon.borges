import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("1-");

        entradaDeUmPonto();

        System.out.println("2-");

        soma2pontos1();

        System.out.println("3-");

        soma2pontos2();
        
        System.out.println("4-");

        area();

        System.out.println("5-");
        
        multiplicaPonto();

        System.out.println("6 , 7-");
        
        direcao();

    }

    public static void entradaDeUmPonto(){
        try (Scanner myScan = new Scanner(System.in)) {
            System.out.print("Digite o valor x:");
            int x = myScan.nextInt();
            System.out.print("Digite o valor y:");
            int y = myScan.nextInt();
            Ponto p = new Ponto(x,y);
            System.out.print("O ponto digitado e: ");
            p.imprime_ponto();
        }
    }

    public static void soma2pontos1(){
        try (Scanner myScan = new Scanner(System.in)) {
            System.out.print("Digite o valor x1:");
            int x = myScan.nextInt();
            System.out.print("Digite o valor y1:");
            int y = myScan.nextInt();
            Ponto p1 = new Ponto(x,y);
            System.out.print("Digite o valor x2:");
            x = myScan.nextInt();
            System.out.print("Digite o valor y2:");
            y = myScan.nextInt();
            Ponto p2 = new Ponto(x,y);
            Ponto p3 = new Ponto();
            p3.soma_ponto(p1,p2);
            System.out.print("A soma de ");
            p1.imprime_ponto();
            System.out.print(" com ");
            p2.imprime_ponto();
            System.out.print(" e ");
            p3.imprime_ponto();
        }
    }

    public static void soma2pontos2(){
        try (Scanner myScan = new Scanner(System.in)) {
            System.out.print("Digite o valor x1:");
            int x = myScan.nextInt();
            System.out.print("Digite o valor y1:");
            int y = myScan.nextInt();
            Ponto p1 = new Ponto(x,y);
            System.out.print("Digite o valor x2:");
            x = myScan.nextInt();
            System.out.print("Digite o valor y2:");
            y = myScan.nextInt();
            Ponto p2 = new Ponto(x,y);
            Ponto p3 = new Ponto();

            Ponto.soma_ponto(p1,p2,p3);

            System.out.print("A soma de ");
            p1.imprime_ponto();
            System.out.print(" com ");
            p2.imprime_ponto();
            System.out.print(" e ");
            p3.imprime_ponto();
        }
    }

    public static void area(){
        try (Scanner myScan = new Scanner(System.in)){
            System.out.print("Digite o ponto 1: ");
            String ponto = myScan.nextLine();
            int x = Integer.parseInt(ponto.substring(0,1));
            int y = Integer.parseInt(ponto.substring(2,3));
            Ponto p1 = new Ponto(x,y);

            System.out.print("Digite o ponto 2: ");
            ponto = myScan.nextLine();
            x = Integer.parseInt(ponto.substring(0,1));
            y = Integer.parseInt(ponto.substring(2,3));
            Ponto p2 = new Ponto(x,y);

            System.out.print("A area do retangulo definido por ");
            p1.imprime_ponto();
            System.out.print(" e ");
            p2.imprime_ponto();
            int r = Ponto.calc_area(p1,p2);
            System.out.print(" e " + r);
        }
    }

    public static void multiplicaPonto(){
        try (Scanner myScan = new Scanner(System.in)) {
            System.out.print("Digite o ponto:");
            String ponto = myScan.nextLine();
            int x = Integer.parseInt(ponto.substring(0,1));
            int y = Integer.parseInt(ponto.substring(2,3));
            Ponto p = new Ponto(x,y);
            System.out.print("Digite a constante:");
            int c = myScan.nextInt();
            Ponto pr = new Ponto(x,y);
            pr.multiplica_ponto(c);
            System.out.print("Resultado: ");
            p.imprime_ponto();
            System.out.print(" * " + c + " = ");
            pr.imprime_ponto();
        }
    }

    public static void direcao(){
        try (Scanner myScan = new Scanner(System.in)) {
            Ponto p = new Ponto(0,0);
            while(true){
                System.out.println("");
                System.out.print("Insira a direcao ('sair' finaliza o programa) :");
                switch(myScan.nextLine()){
                    case "n":
                    p.imprime_ponto();
                    System.out.print(" norte ");
                    p.inc_dir('n');
                    p.imprime_ponto();
                    break;
                    case "nordeste":
                    p.imprime_ponto();
                    System.out.print(" nordeste ");
                    p.ind_diag("nordeste");
                    p.imprime_ponto();
                    break;
                    case "l":
                    p.imprime_ponto();
                    System.out.print(" leste ");
                    p.inc_dir('l');
                    p.imprime_ponto();
                    break;
                    case "sudeste":
                    p.imprime_ponto();
                    System.out.print(" sudeste ");
                    p.ind_diag("sudeste");
                    p.imprime_ponto();
                    break;
                    case "s":
                    p.imprime_ponto();
                    System.out.print(" sul ");
                    p.inc_dir('s');
                    p.imprime_ponto();
                    break;
                    case "sudoeste":
                    p.imprime_ponto();
                    System.out.print(" sudoeste ");
                    p.ind_diag("sudoeste");
                    p.imprime_ponto();
                    break;
                    case "o":
                    p.imprime_ponto();
                    System.out.print(" oeste ");
                    p.inc_dir('o');
                    p.imprime_ponto();
                    break;
                    case "noroeste":
                    p.imprime_ponto();
                    System.out.print(" noroeste ");
                    p.ind_diag("noroeste");
                    p.imprime_ponto();
                    break;
                    case "sair":
                    return;
                }

            }
        }
    }

}