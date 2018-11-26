public class Saque extends Transacao{

    public void saque(double valor, Conta conta){
        //this.saldoDisp -= valor;
        if(conta.getSaldoTotal()>= valor)
            conta.setSaldoDisp(conta.getSaldoDisp() - valor);
        else
            System.out.println("Saldo indisponível, tente um valor menor.");
    }
}
