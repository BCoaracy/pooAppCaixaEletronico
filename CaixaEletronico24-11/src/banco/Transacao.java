package banco;

import banco.ContasBEAN;
import banco.ContasDAO;
import banco.DepositaBEAN;
import banco.MySQLDAO;
import banco.SaqueBEAN;

public class Transacao {

    private static final String QUERYSAQUE = "UPDATE contas c "
            + "INNER JOIN saque s on (s.numcontasaque = c.numconta) "
            + "SET c.saldodispconta = c.saldodispconta - ?, c.saldototalconta = saldototalconta - ? "
            + "WHERE numconta = ?";
    private static final String QUERYDEPOSITO = "UPDATE contas c "
            + "INNER JOIN deposita d on (d.numcontadeposita = c.numconta) "
            + "SET c.saldodispconta = c.saldodispconta + ?, c.saldototalconta = saldototalconta + ? "
            + "WHERE c.numconta = ?";

    public String retornaNumConta(ContasBEAN conta) {
        String numConta = conta.getNumConta();
        return numConta;
    }

    public void atualizaSaldoContas(SaqueBEAN saque) {
        System.out.println("transacao:" + saque.getValorSaque() + "" + saque.getIdConta());
        MySQLDAO.executeQuery(QUERYSAQUE, saque.getValorSaque(), saque.getValorSaque(), saque.getIdConta());
    }

    public void atualizaSaldoContas(DepositaBEAN deposita) {
        System.out.println("transacao:" + deposita.getValorDeposita()+ "" + deposita.getIdConta());
        MySQLDAO.executeQuery(QUERYDEPOSITO, deposita.getValorDeposita(), deposita.getValorDeposita(), deposita.getIdConta());
    }

    public void removeSaldoContas(SaqueBEAN saque) {
        String query = "UPDATE contas c "
                + "INNER JOIN saque s on (s.numcontasaque = c.numconta)"
                + "SET c.saldodispconta = c.saldodispconta + s.valorsaldo, c.saldototalconta = saldototalconta + s.valorsaldo"
                + "WHERE c.numconta = ?";
        MySQLDAO.executeQuery(query, saque.getIdConta());
    }

    public void removeSaldoContas(DepositaBEAN deposita) {
        String query = "UPDATE contas c"
                + "INNER JOIN deposita d on (d.numcontadeposita = c.numconta)"
                + "SET c.saldodispconta = c.saldodispconta - d.valordeposita, c.saldototalconta = saldototalconta - d.valordeposita"
                + "WHERE c.numconta = ?";
        MySQLDAO.executeQuery(query, deposita.getIdConta());
    }
}
/*

UPDATE contas c
INNER JOIN saque s on (s.idconta = c.numconta)
SET c.saldodispconta = c.saldodispconta - ?, c.saldototalconta = saldototalconta - ?
WHERE numconta = ?


UPDATE contas c
INNER JOIN deposita d on (d.idconta = c.idconta)
SET c.saldodispconta = c.saldodispconta + ?, c.saldototalconta = saldototalconta + ?
WHERE idconta = ?

        //ContasBEAN conta = new ContasBEAN();
//        String query = "UPDATE contas c"
//                + "INNER JOIN deposita d on (d.idconta = c.idconta)"
//                + "SET c.saldodispconta = c.saldodispconta + ?, c.saldototalconta = saldototalconta + ?"
//                + "WHERE c.idconta = ?";

        //ContasBEAN conta = new ContasBEAN();
//        String query = "UPDATE contas c"
//                + "INNER JOIN saque s on (s.idconta = c.idconta)"
//                + "SET c.saldodispconta = c.saldodispconta - ?, c.saldototalconta = saldototalconta - ?"
//                + "WHERE c.idconta = ?";

 */
