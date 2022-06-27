public class C1 {
    public int a;
    protected int b;

    public int getC() {
        return c;
    }

    private int c;

    public C1(){
        System.out.println("Class C1, sem parametros");
    }

    public C1(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Class C1, com parametros");
    }

    public void mostrar_atributos(){
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
    }

    public void mostra_atributos_super(){
        System.out.println("Nao tem super");
    }

}
