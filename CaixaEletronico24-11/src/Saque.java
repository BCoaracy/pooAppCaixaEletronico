public class Saque extends Transacao{

    public void saque(double valor, Conta conta){
        //this.saldoDisp -= valor;
        CaixaEletronico caixa = new CaixaEletronico();
        if(caixa.validaSaque(valor, conta)){
            conta.setSaldoDisp(conta.getSaldoDisp() - valor);   
        }else
            System.out.println("Saldo indisponível, tente um valor menor.");
    }
}
