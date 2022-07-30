import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Contato {
    String apelido;
    String nome;
    String email;
    Date dataNacimento;

    public Contato(String apelido, String nome, String email, String dataNascimento){
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            data = formato.parse(dataNascimento);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.dataNacimento = data;
    }

    public String imprimirBasico(){
        String r = ("Apelido:" + this.apelido + " nome:" + this.nome + " email:" + this.email + " data:" + this.dataNacimento.toString());
        return r;
    }

    public abstract String imprimirContato();
}
