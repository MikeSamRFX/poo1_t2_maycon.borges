import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserir ponto, 'x y' :");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.print("Insira o raio do cirulo :");
        double r = input.nextDouble();

        Ponto p1 = new Ponto(x,y);
        Circulo circ1 = new Circulo(p1,r);

        System.out.println("A area do circulo inserido e de " + circ1.calc_area());

        System.out.println();

        System.out.print("Insira um raio: ");
        double r2 = input.nextDouble();
        System.out.println("O circulo com raio " + r2 + " tem perimetro de " + Circulo.calc_perimetro(r2));

        System.out.println();

        System.out.print("Insira a quantia de circulos a serem lidos");
        int n = input.nextInt();
        Circulo vetor[] = new Circulo[n];
        for(int i = 0; i < n; i++){
            System.out.print("Inserir ponto, 'x y' :");
            int xt = input.nextInt();
            int yt = input.nextInt();
            Ponto pt = new Ponto(xt,yt);
            System.out.print("Insira o raio do cirulo :");
            double rt = input.nextDouble();
            Circulo ct = new Circulo(pt,rt);
            vetor[i] = ct;
        }
        Circulo menor = new Circulo( 2147483647);
        for(int i = 0; i < n; i++){
            Circulo temp = vetor[i];
            if(temp.raio < menor.raio){
                menor = temp;
            }
            temp.print_circ();
        }



        System.out.println();
        int mx = menor.center.getX();
        int my = menor.center.getY();
        System.out.print("O menor circulo tem cordenadas X = " + mx + " Y = " + my + " com raio " + menor.raio);
    }
}
