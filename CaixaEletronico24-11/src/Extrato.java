
public class Extrato extends Transacao {

    
    public void imprimeListaConta(BancoDados banco) {
        for (Conta conta : banco.listaConta) {
            System.out.println(conta.toString());
        }
    }
}
