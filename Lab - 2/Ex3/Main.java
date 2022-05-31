public class Main {

    public static void main(String[] args){

        Ponto p1 = new Ponto(0, 0);
        Ponto p2 = new Ponto(0, 4);
        
        //Ponto.soma_ponto(p1, p2, p3);

        //p3.imprime_ponto();

        System.out.println(Ponto.calc_area(p1, p2));

        p1.inc_dir('n');
        p1.inc_dir('l');
        p1.imprime_ponto();
        p1.ind_diag("sudoeste");
        p1.imprime_ponto();
    }

}