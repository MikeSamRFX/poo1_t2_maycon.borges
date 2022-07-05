public class Triangulo extends FormaBidimensional{
    double b,h;

    public Triangulo (double base, double altura){
        this.b = base;
        this.h = altura;
    }

    public double obterArea(){
        return (super.obterArea(this.b,this.h)/2);
    }

    public void oQ(){
        System.out.print("Triangulo");
    }
}
