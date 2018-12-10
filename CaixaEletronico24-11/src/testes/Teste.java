package testes;


import banco.Extrato;
import banco.ContasBEAN;
import banco.ContasDAO;
import banco.MySQLDAO;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        //MySQLDAO banco = new MySQLDAO();
        Extrato e = new Extrato();
        Saque s = new Saque();
        Deposito d = new Deposito();
        BancoDados b = new BancoDados();
        CaixaEletronico z = new CaixaEletronico();
        ContasBEAN cBean = new ContasBEAN();
        ContasDAO cDAO = new ContasDAO();
        
        cBean.setIdConta(1);
        cBean.setNumConta("01");
        cBean.setSaldoDispConta(200);
        cBean.setSaldoTotalConta(cBean.getSaldoDispConta()+1000);
        cBean.setSenhaConta("newchave");
        
        System.out.printf("%s\n%.2f\n%.2f\n%s",cBean.getNumConta(), cBean.getSaldoDispConta(), cBean.getSaldoTotalConta(), cBean.getSenhaConta());
        //cDAO.delete(cBean);
        JOptionPane.showMessageDialog(null, "Autor deletado");
        
        //MySQLDAO.getConnection();
        

        /*c.setNumConta(123);
        c.setSaldoDisp(1000.00);
        c.setSaldoTotal(2000.00);
        c.setSenha("rapadura");
        e.viewConta(c);

        s.saque(50.00, c);
        e.viewConta(c);

        d.deposita(2.00, c);
        e.viewConta(c);
         */
        //CRIAR CONTA
//        boolean saida = true;
//        while (saida == true) {
//            Conta c = new Conta();
//            System.out.println("digite o numero da conta: ");
//            c.setNumConta(leia.nextInt());
//            System.out.println("digite disp: ");
//            c.setSaldoDisp(leia.nextDouble());
//            c.setSaldoTotal(c.getSaldoDisp() + 1000);
//            System.out.println("Total: "+ c.getSaldoTotal());
//            System.out.println("digite senha: ");
//            c.setSenha(leia.next());
//            b.salvaConta(c);
//            
//            
//            
//            System.out.println("digite S para sair ou N para continuar: ");
//            String aux = leia.next();
//            if (aux.equals("S")) {
//                saida = false;
//            }
//        }
//            e.imprimeListaConta(b);
//            
//            z.validaSenhaConta(b);
//
    }
}
