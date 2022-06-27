public class Vip extends Ingresso{

    public double Viptax;
    public Vip(){
        super();
        this.Viptax = 100;
    }
    public double valor(){
        double x = super.getValor();
        return (x + Viptax);
    }

}
