public class Ponto {
    
    private double x, y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void imprime_ponto(){
        System.out.printf("(%.0f,%.0f)", x, y);
    }

    public static Ponto soma_ponto(Ponto p1, Ponto p2){
        double newX = p1.x + p2.x;
        double newY = p1.y + p2.y;
        Ponto p3 = new Ponto(newX, newY);
        return p3;
    }

    public static void soma_ponto(Ponto p1, Ponto p2, Ponto p3){
        double newX = p1.x + p2.x;
        double newY = p1.y + p2.y;
        p3.x = newX;
        p3.y = newY;
    }

    public static void multiplica_ponto(Ponto p1, int valor){
        double newX = p1.x + valor;
        double newY = p1.y + valor;
        Ponto newP = new Ponto(newX, newY);
        newP.imprime_ponto();
    }

    public static double calc_area(Ponto p1, Ponto p2){
        double currentX, currentY;
        if(p1.x == p2.x || p1.y == p2.y){
            throw new RuntimeException("Erro Area = 0");
        }

        if(p1.x > p2.x) currentX = p1.x - p2.x;
        else currentX = p2.x - p1.x;

        if(p1.y > p2.y) currentY = p1.y - p2.y;
        else currentY = p2.y - p1.y;

        return currentX * currentY;
    }

    public void inc_dir(char dir){
        
        if(dir == 'l'){
            this.x++;
        }
        if(dir == 'o'){
            this.x--;
        }
        if(dir == 'n'){
            this.y++;
        }
        if(dir == 's'){
            this.y--;
        }
        
    }

    public void ind_diag(String dir){
        if(dir.equalsIgnoreCase("sudeste")){
            this.inc_dir('s');
            this.inc_dir('l');
        }
        if(dir.equalsIgnoreCase("nordeste")){
            this.inc_dir('n');
            this.inc_dir('l');
        }
        if(dir.equalsIgnoreCase("noroeste")){
            this.inc_dir('n');
            this.inc_dir('o');
        }
        if(dir.equalsIgnoreCase("sudoeste")){
            this.inc_dir('s');
            this.inc_dir('o');
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

}
