public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial (float val, int num, int pwd, float limite){
        super(val, num, pwd);
        this.limite = limite;
    }

    public boolean debitaValor(int pwd, float val) {
        if (!super.isSenha(pwd))
            return (false);
        if (super.getEstado(pwd) != 1)
            return (false);
        if (val <= 0)
            return (false);
        if (val > super.getSaldo(pwd) + limite)
            return (false);

        super.debitaValor(val);
        if(super.getSaldo(pwd) <= limite*-1){
            setEstado(pwd, 2);
        }
        return true;
    }
}