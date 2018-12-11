package banco;

public class SaqueDAO extends Transacao {

    public SaqueDAO() {
        MySQLDAO.getConnection();
    }


    public void adiciona(SaqueBEAN saque) {
        String query = "INSERT INTO saque(numcontasaque,valorsaque) values(?,?)";
        MySQLDAO.executeQuery(query, saque.getIdConta(), saque.getValorSaque());

        atualizaSaldoContas(saque);
    }

    public void deleta(SaqueBEAN saque) {
        String query = "DELETE FROM saque WHERE idsaque = ?";
        removeSaldoContas(saque);
        MySQLDAO.executeQuery(query, saque.getIdSaque());
    }

}
