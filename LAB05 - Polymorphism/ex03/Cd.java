import java.util.Date;

public class Cd extends Item{
    public String artista;

    public Cd (String titulo, int tempo, String comentarios, String artista){
        super(titulo, tempo, comentarios);
        this.artista = artista;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Artista:" + this.artista);
    }
}
