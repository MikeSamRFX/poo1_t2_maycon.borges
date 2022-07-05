import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        Formas[] vet = new Formas[6];

        vet[0] = new Circulo(12.5);
        vet[1] = new Quadrado(5);
        vet[2] = new Triangulo(3,3);
        vet[3] = new Esfera(8);
        vet[4] = new Cubo(9);
        vet[5] = new Tetraedro(100,15);



        for(int i = 0; i < 6; i++){
            if(vet[i] instanceof FormaBidimensional ){
                vet[i].oQ();
                System.out.println(" tem como area = " + vet[i].obterArea());
            }else if(vet[i] instanceof FormaTridimensional){
                vet[i].oQ();
                System.out.println(" tem como volume = " + vet[i].obterVolume());
            }
        }

    }
}
