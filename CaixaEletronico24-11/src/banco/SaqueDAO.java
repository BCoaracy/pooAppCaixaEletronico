package banco;

public class SaqueDAO extends Transacao{
    
    public void adiciona(SaqueBEAN saque){
        String query = "INSERT INTO saque(idconta,valorsaque) values(?,?)";
        MySQLDAO.executeQuery(query, saque.getIdConta(), saque.getValorSaque());
        atualizaSaldoContas(saque);
    }
    
    public void deleta(SaqueBEAN saque){
        String query = "DELETE FROM saque WHERE idsaque = ?";
        removeSaldoContas(saque);
        MySQLDAO.executeQuery(query, saque.getIdSaque());
    }
    
}
