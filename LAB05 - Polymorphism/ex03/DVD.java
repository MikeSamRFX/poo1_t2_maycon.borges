import java.util.Date;

public class DVD extends Item{
    public String diretor;

    public DVD (String titulo, int tempo, String comentarios, String director){
        super(titulo,tempo, comentarios);
        this.diretor = director;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Diretor:" + this.diretor);
    }
}
