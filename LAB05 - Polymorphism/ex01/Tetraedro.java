public class Tetraedro extends FormaTridimensional{
    public double b,h;

    public Tetraedro (double base,double altura){
        this.b = base;
        this.h = altura;
    }

    public double obterArea() {
        return (b*b)*Math.sqrt(3);
    }

    public double obterVolume() {
        return ((1.0/3.0)*((b*3)*h));
    }

    public void oQ(){
        System.out.print("Tetraedro");
    }
}
