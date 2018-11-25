
public class Extrato extends Transacao {

    
    public void imprimeListaConta(BancoDados banco) {
        for (Conta conta : banco.listaConta) {
            conta.toString();
        }
    }
}
