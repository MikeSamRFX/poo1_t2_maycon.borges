public class Familia extends Contato {
    public String parentesco;

    public Familia(String apelido, String nome, String email, String dataNascimento, String parentesco){
        super(apelido, nome, email, dataNascimento);
        this.parentesco = parentesco;
    }

    public String imprimirContato(){
        String r = super.imprimirBasico() + " Parentesco:" + this.parentesco;
        return r;
    }

}
