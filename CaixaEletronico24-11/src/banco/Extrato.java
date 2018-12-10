package banco;

import banco.DepositaBEAN;
import banco.MySQLDAO;
import banco.SaqueBEAN;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Extrato extends Transacao {
//-----------------SAQUE-------------------------------------------------------------------------------------------
    public ArrayList<SaqueBEAN> findAllSaques() {
        return listaSaques("SELECT * FROM saque ORDER BY idsaque");
    }

    public ArrayList<SaqueBEAN> listaSaques(String query) {
        ArrayList<SaqueBEAN> lista = new ArrayList<SaqueBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new SaqueBEAN(rs.getInt("idsaque"), rs.getDouble("valorsaque"), rs.getInt("idconta")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
//-----------------SAQUE-------------------------------------------------------------------------------------------
    
//-----------------DEPOSITO----------------------------------------------------------------------------------------    
    public ArrayList<DepositaBEAN> findAllDeposita() {
        return listaDepositos("SELECT * FROM deposita ORDER BY iddeposita");
    }

    public ArrayList<DepositaBEAN> listaDepositos(String query) {
        ArrayList<DepositaBEAN> lista = new ArrayList<DepositaBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new DepositaBEAN(rs.getInt("iddeposita"), rs.getDouble("valordeposita"), rs.getInt("idconta")));
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
