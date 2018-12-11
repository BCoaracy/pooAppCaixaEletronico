package banco;

public class ContasBEAN {
    
    private int idConta;
    private String numConta;//idconta das outras tabelas
    private double saldoDispConta;
    private double saldoTotalConta;
    private String senhaConta;
    
    

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldoDispConta() {
        return saldoDispConta;
    }

    public void setSaldoDispConta(double saldoDispConta) {
        this.saldoDispConta = saldoDispConta;
    }

    public double getSaldoTotalConta() {
        return saldoTotalConta;
    }

    public void setSaldoTotalConta(double saldoTotalConta) {
        this.saldoTotalConta = saldoTotalConta;
    }

    public String getSenhaConta() {
        return senhaConta;
    }

    public void setSenhaConta(String senhaConta) {
        this.senhaConta = senhaConta;
    }
    
    
    
}
