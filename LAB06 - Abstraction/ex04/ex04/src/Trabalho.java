public class Trabalho extends Contato{
    public String Tipo;

    public Trabalho(String apelido, String nome, String email, String dataNascimento, String tipo){
        super(apelido, nome, email, dataNascimento);
        this.Tipo = tipo;
    }

    public String imprimirContato() {
        return (super.imprimirBasico() + " tipo:" + this.Tipo);
    }
}
