public class Deposito extends Transacao{
    
    public void deposita(double valor,Conta conta){
        //this.saldoDisp += valor;
        conta.setSaldoDisp(conta.getSaldoDisp() + valor);
    }
}
