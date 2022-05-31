public class Main {

    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Julio");
        Pessoa p2 = new Pessoa("Pablo");
        String str1 = " esta com o nome sujo no seraza, logo esta devendo: " ;
        String str2 = " esta muito bem economicamente, esta com o saldo de: " ;


        p1.Receber(10000);
        p2.Gastar(1500.99);
        p2.Gastar(1300.75);

        if(p1.carteira < 0){
            System.out.println(p1.nome + str1 + p1.carteira);
        }else{
            System.out.println(p1.nome + str2 + p1.carteira);
        }


        if(p2.carteira < 0){
            System.out.println(p2.nome + str1 + p2.carteira);
        }else{
            System.out.println(p2.nome + str2 + p2.carteira);
        }
    }

}