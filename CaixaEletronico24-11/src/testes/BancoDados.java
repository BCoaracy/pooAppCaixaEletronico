package testes;


import banco.MySQLDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BancoDados {
    
        public Boolean isExist(String senha) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM contas WHERE senhaconta= ?", senha);
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