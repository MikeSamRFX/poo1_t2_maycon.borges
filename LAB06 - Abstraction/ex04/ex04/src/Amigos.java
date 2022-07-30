public class Amigos extends Contato{
    public int grau;

    public Amigos (String apelido, String nome, String email, String dataNascimento, int grau){
        super(apelido,nome,email,dataNascimento);
        this.grau = grau;
    }

    public String imprimirContato(){
        return (super.imprimirBasico() + " Grau:" + this.grau);
    }
}
