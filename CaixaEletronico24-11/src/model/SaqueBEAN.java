package model;

public class SaqueBEAN extends Transacao{
    
    private int idSaque;
    private double valorSaque;
    private String idConta;

    public SaqueBEAN(int idSaque, double valorSaque, String idConta) {
        this.idSaque = idSaque;
        this.valorSaque = valorSaque;
        this.idConta = idConta;
    }
    
    public SaqueBEAN(){
        this.valorSaque = 0;
    }

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

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }
    
    
    
}
