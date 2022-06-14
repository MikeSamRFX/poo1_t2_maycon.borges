public class Ponto {
    
    private int x, y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ponto(){
        //inicia ponto vazio
    }

    public void imprime_ponto(){
        System.out.printf("(%d,%d)", this.x, this.y);
    }

    public void soma_ponto(Ponto p1, Ponto p2){
        this.x = p1.x + p2.x;
        this.y = p1.y + p2.y;
    }
    
    public static void soma_ponto(Ponto p1, Ponto p2, Ponto p3){
        int newX = p1.x + p2.x;
        int newY = p1.y + p2.y;
        p3.x = newX;
        p3.y = newY;
    }

    public void multiplica_ponto(int valor){
        this.x = this.x * valor;
        this.y = this.y * valor;
    }

    
    public static int calc_area(Ponto p1, Ponto p2){
        int currentX, currentY;
        if(p1.x == p2.x || p1.y == p2.y){
            throw new RuntimeException("Erro Area = 0");
        }

        if(p1.x > p2.x) currentX = p1.x - p2.x;
        else currentX = p2.x - p1.x;

        if(p1.y > p2.y) currentY = p1.y - p2.y;
        else currentY = p2.y - p1.y;

        return currentY * currentX;
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
