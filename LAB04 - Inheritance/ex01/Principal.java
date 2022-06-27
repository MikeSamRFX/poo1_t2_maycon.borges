import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira A B C");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        C3 t3 = new C3(a ,b ,c);
        C2 t2 = new C2(a, b, c);
        C1 t1 = new C1(a, b, c);

        System.out.println("C3");
        t3.mostrar_atributos();
        System.out.println("C2");
        t2.mostrar_atributos();
        System.out.println("C1");
        t1.mostrar_atributos();

        C3 k = new C3(a, b, c, 7);
        k.mostrar_atributos();
    }


}
