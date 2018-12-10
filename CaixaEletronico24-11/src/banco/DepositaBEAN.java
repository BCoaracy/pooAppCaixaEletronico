package banco;

import testes.Transacao;

public class DepositaBEAN extends Transacao{
    
    private int idDeposita;
    private double valorDeposita;
    private int idConta;

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

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }
    
    
    
}
