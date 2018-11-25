public class Conta {
    
    private int numConta;
    private String senha;
    private double saldoDisp;
    private double saldoTotal;
    
    public Conta(int codConta, String senha, double disp, double tota){
        setNumConta(codConta);
        setSaldoDisp(disp);
        setSaldoTotal(tota);
        setSenha(senha);
    }
    
    public void creditar(double valor){
        //this.saldoDisp -= valor;
        setSaldoDisp(getSaldoDisp() - valor);
    }
    
    public void debitar(double valor){
        //this.saldoDisp += valor;
        setSaldoDisp(getSaldoDisp() + valor);
    }
    
    public boolean validaSenha(String input){
        if(this.senha.equals(input)){
            return true;
        }
        return false;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int input) {
        this.numConta = input;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String input) {
        this.senha = input;
    }

    public double getSaldoDisp() {
        return saldoDisp;
    }

    public void setSaldoDisp(double input) {
        this.saldoDisp = input;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double input) {
        this.saldoTotal = input;
    }
    
}
