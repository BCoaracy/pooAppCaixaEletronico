package banco;

import banco.MySQLDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BancoDados extends CaixaEletronico {

    public BancoDados() {
        MySQLDAO.getConnection();
    }

    @Override
    public Boolean isExist(String senha, String nconta) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM contas WHERE senhaconta= ? AND idconta=?", senha, nconta);
        try {
            if (rs.next()) {
                result = true;
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean validaValor(double valor) {
        if (valor <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean validaTransacao(double valor, ContasBEAN conta) {

        if (validaValor(valor) || conta.getSaldoDispConta() < valor) {
            return false;
        }
        return true;
    }

//        public Boolean isExist(String senha) {
//        Boolean result = false;
//        ResultSet rs = null;
//        rs = MySQLDAO.getResultSet("SELECT * FROM contas WHERE senhaconta= ?", senha);
//        try {
//            if (rs.next()) {
//                result = true;
//            }
//            rs.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
}

//    ArrayList<Conta> listaConta = new ArrayList<Conta>();
//    boolean iguais;
//    public void salvaConta(Conta conta){
//         for(Conta c : listaConta){
//             if(c.getNumConta()==conta.getNumConta())
//                 iguais = true;
//             else
//                 iguais = false;
//         }
//        if(iguais == false){
//            this.listaConta.add(conta);
//        }
//        
//    } 
