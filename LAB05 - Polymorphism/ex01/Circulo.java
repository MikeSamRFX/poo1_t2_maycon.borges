public class Circulo extends FormaBidimensional{

    public double raio;

    public Circulo(double r) {
        this.raio = r;
    }

    public double obterArea(){
        return Math.PI*(Math.pow(raio,2));
    }

    public void oQ(){
        System.out.print("Circulo");
    }

}
