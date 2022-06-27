public class Bilheteria {
    public static void main(String[] args) {
        Vip vip = new Vip();
        System.out.println(vip.valor());
        CamaroteSuperior cs = new CamaroteSuperior();
        System.out.println(cs.valor());
        cs.imprimeLocalizacao();
        CamaroteInferior ci = new CamaroteInferior();
        System.out.println(ci.valor());
        ci.imprimeLocalizacao();
        Normal normal = new Normal();
        System.out.println(normal.valor());
        normal.imprime();
    }
}
