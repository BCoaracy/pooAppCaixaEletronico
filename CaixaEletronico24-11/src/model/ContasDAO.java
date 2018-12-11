package model;

public class ContasDAO {

    public ContasDAO() {
        MySQLDAO.getConnection();
    }
    
    public void create(ContasBEAN conta) {
        String query = "INSERT INTO contas (numconta,saldodispconta,saldototalconta,senhaconta) VALUES(?,?,?,?)";
        MySQLDAO.executeQuery(query, conta.getNumConta(), conta.getSaldoDispConta(), conta.getSaldoTotalConta(), conta.getSenhaConta());
    }

    public void updateAll(ContasBEAN conta) {
        String query = "UPDATE contas SET numconta=?, saldodispconta=?, saldototalconta=?, senhaconta=? WHERE idconta=?";
        MySQLDAO.executeQuery(query, conta.getNumConta(), conta.getSaldoDispConta(), conta.getSaldoTotalConta(), conta.getSenhaConta(), conta.getIdConta());
    }

    public void delete(ContasBEAN conta) {
        MySQLDAO.executeQuery("DELETE FROM contas WHERE idconta = ?", conta.getIdConta());
    } 
}
