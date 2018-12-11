package banco;

public class DepositaDAO extends Transacao{

    public DepositaDAO() {
        MySQLDAO.getConnection();
    }
    
    public void adiciona(DepositaBEAN deposita){
        String query = "INSERT INTO deposita(numcontadeposita,valordeposita) values(?,?)";
        MySQLDAO.executeQuery(query, deposita.getIdConta(), deposita.getValorDeposita());
        atualizaSaldoContas(deposita);
    }
    
    public void deleta(DepositaBEAN deposita){
        String query = "DELETE FROM deposita WHERE iddeposita = ?";
        removeSaldoContas(deposita);
        MySQLDAO.executeQuery(query, deposita.getIdDeposita());
    }
    
}
