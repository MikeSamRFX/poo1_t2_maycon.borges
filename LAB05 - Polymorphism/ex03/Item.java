import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Item {
    public String titulo;
    public int tempo;
    public String comentarios;

    public Item(String titulo, int tempo, String comentarios){
        this.titulo = titulo;
        this.tempo = tempo;
        this.comentarios = comentarios;
    }

    public void print(){
        System.out.println("Titulo:" + this.titulo);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Tempo:" + format(this.tempo));
        System.out.println("Comentarios:");
        System.out.println(this.comentarios);
    }

    public String format(int min){
        int h = min/60;
        int m = min%60;

        String r = String.format("%02d:%02d",h,m);


        return r;
    }
}
