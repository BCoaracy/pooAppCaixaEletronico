package banco;

import testes.Transacao;

public class SaqueDAO extends Transacao{
    
    public void adiciona(SaqueBEAN saque){
        String query = "INSERT INTO saque(idconta,valorsaque) values(?,?)";
        MySQLDAO.executeQuery(query, saque.getIdConta(), saque.getValorSaque());
        atualizaSaldoContas(saque);
    }
    
}
