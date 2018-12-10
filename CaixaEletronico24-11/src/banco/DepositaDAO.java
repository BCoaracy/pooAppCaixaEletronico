package banco;

public class DepositaDAO extends Transacao{
    
    public void adiciona(DepositaBEAN deposita){
        String query = "INSERT INTO deposita(idconta,valordeposita) values(?,?)";
        MySQLDAO.executeQuery(query, deposita.getIdConta(), deposita.getValorDeposita());
        atualizaSaldoContas(deposita);
    }
    
    public void deleta(DepositaBEAN deposita){
        String query = "DELETE FROM deposita WHERE iddeposita = ?";
        removeSaldoContas(deposita);
        MySQLDAO.executeQuery(query, deposita.getIdDeposita());
    }
    
}
