public class Teste {
    public static void main(String[] args) {
        
        Conta c = new Conta();
        Extrato e = new Extrato();
        Saque s = new Saque();
        Deposito d = new Deposito();
        
        c.setNumConta(123);
        c.setSaldoDisp(1000.00);
        c.setSaldoTotal(2000.00);
        c.setSenha("rapadura");
        e.viewConta(c);
        
        s.saque(50.00, c);
        e.viewConta(c);
        
        d.deposita(2.00, c);
        e.viewConta(c);
        
        
        
    }
}
