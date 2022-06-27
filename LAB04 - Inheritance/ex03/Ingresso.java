import java.util.Scanner;

public class Ingresso {
    final double valor;
    public double getValor() {
        return valor;
    }

    public Ingresso () {
        this.valor = escreveValor();
    }

    public double escreveValor(){
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

}
