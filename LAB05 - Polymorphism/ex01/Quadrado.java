public class Quadrado extends FormaBidimensional {
    double lado;

    public Quadrado (double lado) {
        this.lado = lado;
    }
    public double obterArea(){
        return super.obterArea(this.lado,this.lado);
    }

    public void oQ(){
        System.out.print("Quadrado");
    }

}
