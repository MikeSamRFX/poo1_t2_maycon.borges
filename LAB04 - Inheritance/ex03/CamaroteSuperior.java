public class CamaroteSuperior extends Vip{

    public double CamSupTax;

    public CamaroteSuperior(){
        super();
        this.CamSupTax = 100;
    }

    public void imprimeLocalizacao(){
        System.out.println("Camarote Superior");
    }

    public double valor(){
        return (super.valor() + CamSupTax);
    }

}
