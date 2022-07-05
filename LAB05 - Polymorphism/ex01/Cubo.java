public class Cubo extends FormaTridimensional{
    double lado;

    public Cubo (double lado) {
        this.lado = lado;
    }

    public double obterArea(){
        return 6*(lado*lado);
    }

    public double obterVolume(){
        return (lado*lado*lado);
    }

    public void oQ(){
        System.out.print("Cubo");
    }
}
