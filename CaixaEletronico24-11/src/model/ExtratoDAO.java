package model;

import model.DepositaBEAN;
import model.MySQLDAO;
import model.SaqueBEAN;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExtratoDAO extends Transacao {

    public ExtratoDAO() {
        MySQLDAO.getConnection();
    }
    
    
//-----------------SAQUE-------------------------------------------------------------------------------------------
    public ArrayList<SaqueBEAN> findAllSaques(String conta) {
        return listaSaques("SELECT * FROM saque WHERE numcontasaque = ? ORDER BY idsaque", conta);
    }

    public ArrayList<SaqueBEAN> listaSaques(String query, String conta) {
        ArrayList<SaqueBEAN> lista = new ArrayList<SaqueBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query,conta);
        try {
            while (rs.next()) {
                lista.add(new SaqueBEAN(rs.getInt("idsaque"), rs.getDouble("valorsaque"), rs.getString("numcontasaque")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
//-----------------SAQUE-------------------------------------------------------------------------------------------
    
//-----------------DEPOSITO----------------------------------------------------------------------------------------    
    public ArrayList<DepositaBEAN> findAllDeposita(String conta) {
        return listaDepositos("SELECT * FROM deposita WHERE numcontadeposita = ? ORDER BY iddeposita", conta);
    }

    public ArrayList<DepositaBEAN> listaDepositos(String query, String conta) {
        ArrayList<DepositaBEAN> lista = new ArrayList<DepositaBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query, conta);
        try {
            while (rs.next()) {
                lista.add(new DepositaBEAN(rs.getInt("iddeposita"), rs.getDouble("valordeposita"), rs.getString("numcontadeposita")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
//-----------------DEPOSITO----------------------------------------------------------------------------------------    
}

//    public void imprimeListaConta(BancoDados banco) {
//        for (Conta conta : banco.listaConta) {
//            System.out.println(conta.toString());
//        }
//    }
