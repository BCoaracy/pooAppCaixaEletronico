public class Saque extends Transacao{

    public void saque(double valor, Conta conta){
        //this.saldoDisp -= valor;
        conta.setSaldoDisp(conta.getSaldoDisp() - valor);
    }
}
