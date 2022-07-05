import java.time.LocalDateTime;
import java.util.Date;

@SuppressWarnings("ALL")
public class Principal {
    public static void main(String[] args) {
        Item e1 = new Item("Item", 322, "um item ai");
        Cd e2 = new Cd("Cd", 185, "um cd ae", "um artuista ae");
        DVD e3 = new DVD("DvD", 168, "Um filme ae", "Roberto");

        e1.print();

        e2.print();

        e3.print();
    }
}
