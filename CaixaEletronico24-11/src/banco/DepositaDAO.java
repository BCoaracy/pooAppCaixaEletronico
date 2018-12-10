package banco;

import testes.Transacao;

public class DepositaDAO extends Transacao{
    
        public void adiciona(DepositaBEAN deposita){
        String query = "INSERT INTO deposita(idconta,valordeposita) values(?,?)";
        MySQLDAO.executeQuery(query, deposita.getIdConta(), deposita.getValorDeposita());
        atualizaSaldoContas(deposita);
    }
    
}
