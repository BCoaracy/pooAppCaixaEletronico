package banco;

import testes.Transacao;

public class SaqueBEAN extends Transacao{
    
    private int idSaque;
    private double valorSaque;
    private int idConta;

    public int getIdSaque() {
        return idSaque;
    }

    public void setIdSaque(int idSaque) {
        this.idSaque = idSaque;
    }

    public double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }
    
    
    
}
