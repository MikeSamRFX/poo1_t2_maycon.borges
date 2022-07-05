public class FolhaDePagamento {

    public static void gerarFolha(Funcionario v[]){
        double total = 0;
        String s = " ";
        for(Funcionario funcionario : v){
            String salario = String.valueOf(funcionario.salario());
            int format = 40 - (salario.length() + funcionario.getNome().length());
            System.out.println("Nome: "+ funcionario.getNome() + s.repeat(format) + salario);
            total += funcionario.salario();
        }
        System.out.println("Total: " + s.repeat(40 - (5 + String.valueOf(total)).length()) + total);
    }
}