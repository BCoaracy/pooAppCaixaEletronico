
public class Deposito extends Transacao {
    
    public void deposita(double valor, Conta conta) {
        //this.saldoDisp += valor;
        CaixaEletronico caixa = new CaixaEletronico();
        if (caixa.validaDeposito(valor, conta)) {
            conta.setSaldoDisp(conta.getSaldoDisp() + valor);
        }else{
            System.out.println("Saldo invalido!");
        }
    }
}
