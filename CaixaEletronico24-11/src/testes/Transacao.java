package testes;

import banco.ContasBEAN;
import banco.DepositaBEAN;
import banco.MySQLDAO;
import banco.SaqueBEAN;

public class Transacao {

    public String retornaNumConta(ContasBEAN conta) {
        String numConta = conta.getNumConta();
        return numConta;
    }

    public void atualizaSaldoContas(SaqueBEAN saque) {
        //ContasBEAN conta = new ContasBEAN();
        String query = "UPDATE contas c"
                + "INNER JOIN saque s on (s.idconta = c.idconta)"
                + "SET c.saldodispconta = c.saldodispconta - ?, c.saldototalconta = saldototalconta - ?"
                + "WHERE idconta = ?";
        MySQLDAO.executeQuery(query, saque.getValorSaque(), saque.getValorSaque(),saque.getIdConta());
    }

    public void atualizaSaldoContas(DepositaBEAN deposita) {
        //ContasBEAN conta = new ContasBEAN();
        String query = "UPDATE contas c"
                + "INNER JOIN saque s on (s.idconta = c.idconta)"
                + "SET c.saldodispconta = c.saldodispconta - ?, c.saldototalconta = saldototalconta - ?"
                + "WHERE idconta = ?";
        MySQLDAO.executeQuery(query, deposita.getValorDeposita(),deposita.getValorDeposita(),deposita.getIdConta());
    }
}
/*

UPDATE contas c
INNER JOIN saque s on (s.idconta = c.idconta)
SET c.saldodispconta = c.saldodispconta - ?, c.saldototalconta = saldototalconta - ?
WHERE idconta = ?


UPDATE contas c
INNER JOIN deposita d on (d.idconta = c.idconta)
SET c.saldodispconta = c.saldodispconta + ?, c.saldototalconta = saldototalconta + ?
WHERE idconta = ?

*/
