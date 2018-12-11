package banco;

public class DepositaBEAN extends Transacao{
    
    private int idDeposita;
    private double valorDeposita;
    private String idConta;

    public DepositaBEAN() {
        this.valorDeposita = 0;
    }

    public DepositaBEAN(int idDeposita, double valorDeposita, String idConta) {
        this.idDeposita = idDeposita;
        this.valorDeposita = valorDeposita;
        this.idConta = idConta;
    }

    public int getIdDeposita() {
        return idDeposita;
    }

    public void setIdDeposita(int idDeposita) {
        this.idDeposita = idDeposita;
    }

    public double getValorDeposita() {
        return valorDeposita;
    }

    public void setValorDeposita(double valorDeposita) {
        this.valorDeposita = valorDeposita;
    }

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }
    
    
    
}
