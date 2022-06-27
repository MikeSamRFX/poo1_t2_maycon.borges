public class Normal extends Ingresso{

    public Normal(){
        super();
    }

    public void imprime(){
        System.out.println("Ingresso Normal");
    }

    public double valor(){
        return super.getValor();
    }
}
