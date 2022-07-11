public class UsaBanco {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaEspecial(500, 123, 111, 50);
        ContaCorrente conta2 = new ContaComum(500, 321, 222);

        System.out.println(conta1.getSaldo(111));
        System.out.println(conta2.getSaldo(222));

        conta1.debitaValor(111,500);
        conta2.debitaValor(222,500);

        System.out.println(conta1.getEstado(111));
        System.out.println(conta1.getEstado(222));

        System.out.println(conta1.getSaldo(111));
        conta1.debitaValor(111,50);
        System.out.println(conta1.getSaldo(111));
        System.out.println(conta1.getEstado(111));
    }

}
