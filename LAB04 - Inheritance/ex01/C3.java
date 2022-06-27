public class C3 extends C2{
    public int a3;
    protected int b3;
    private int c3;

    public C3(){
        System.out.println("Class C3, sem parametros");
    }


    public C3(int a, int b, int c){
        super(a,b,c);
        this.a3 = a*a;
        this.b3 = b*b;
        this.c3 = c*c;
        System.out.println("Class C3, com parametros");
    }

    public int getC3() {
        return c3;
    }

    public C3(int a, int b, int c, int x){
        super(a*x,b*x,c*x);
        this.a3 = a*a;
        this.b3 = b*b;
        this.c3 = c*c;
    }

    public void mostrar_atributos(){
        System.out.println(this.a3);
        System.out.println(this.b3);
        System.out.println(this.c3);
        super.mostrar_atributos();
    }

    public void mostra_atributos_super(){
        System.out.println(super.a);
        System.out.println(super.a2);
        System.out.println(this.a3);
        System.out.println(super.b);
        System.out.println(super.b2);
        System.out.println(this.b3);
        System.out.println(super.getC());
        System.out.println(super.getC2());
        System.out.println(this.c3);
    }
}
