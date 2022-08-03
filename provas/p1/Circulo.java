public class Circulo {
    Ponto center;
    double raio;
    // check:<<<erro: get/sets>>>>

    public Circulo (){
        this.center = null;// check:<<<erro: melhor não fazer isso... pois ao chamar o print dá erro>>>>
        this.raio = 0;
    }

    public Circulo (double raio){
        this.center = new Ponto (0,0);
        this.raio = raio;
    }

    public Circulo (Ponto center, double raio){
        this.center = center;
        this.raio = raio;
    }

    public double calc_area(){
        double area = Math.PI * (Math.pow(raio, 2));
        return area;
    }

    public static double calc_perimetro(double raio){
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }

    public void print_circ(){
        int x = this.center.getX();
        int y = this.center.getY();

        System.out.println("Cordenadas X = " + x + " Y = " + y + " Com raio = " + this.raio);
    }
}
