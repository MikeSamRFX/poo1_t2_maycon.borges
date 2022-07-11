public class ContaComum extends ContaCorrente{
    private float limite;

    public ContaComum (float val, int num, int pwd){
        super(val, num, pwd);
        this.limite = 0;
    }

    public boolean debitaValor(int pwd, float val) {
        if (!super.isSenha(pwd))
            return (false);
        if (super.getEstado(pwd) != 1)
            return (false);
        if (val <= 0)
            return (false);
        if (val > super.getSaldo(pwd))
            return (false);

        super.debitaValor(val);
        if(super.getSaldo(pwd) <= limite*-1){
            setEstado(pwd, 2);
        }
        return true;
    }
}
