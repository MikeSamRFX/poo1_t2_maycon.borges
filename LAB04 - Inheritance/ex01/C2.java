public class C2 extends C1{
    public int a2;
    protected int b2;

    public int getC2() {
        return c2;
    }

    private int c2;

    public C2(){
        System.out.println("Class C2, sem parametros");
    }

    public C2(int a, int b, int c){
        super(a,b,c);
        this.a2 = a+1;
        this.b2 = a + b;
        this.c2 = a + b + c;
        System.out.println("Class C2, com parametros");
    }

    public void mostrar_atributos(){
        System.out.println(this.a2);
        System.out.println(this.b2);
        System.out.println(this.c2);
        super.mostrar_atributos();
    }

    public void mostra_atributos_super(){
        System.out.println(super.a);
        System.out.println(this.a2);
        System.out.println(super.b);
        System.out.println(this.b2);
        System.out.println(super.getC());
        System.out.println(this.c2);
    }
}
