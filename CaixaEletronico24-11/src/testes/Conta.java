package testes;


import java.util.ArrayList;



public class Conta {
    
    private int numConta;
    private String senha;
    private double saldoDisp;
    private double saldoTotal;
    
    public Conta(){ 
    }
    
    public Conta(int codConta, String senha, double disp, double tota){
        setNumConta(codConta);
        setSaldoDisp(disp);
        setSaldoTotal(tota);
        setSenha(senha);
    }    
    
//    public void creditar(double valor){
//        //this.saldoDisp -= valor;
//        setSaldoDisp(getSaldoDisp() - valor);
//    }
    
//    public void deposita(double valor){
//        //this.saldoDisp += valor;
//        setSaldoDisp(getSaldoDisp() + valor);
//    }
    
    public boolean validaSenha(String input, BancoDados banco, int nConta){
        for(int i=0; i<banco.listaConta.size();i++){
            if(nConta==banco.listaConta.get(i).getNumConta() && input.equals(banco.listaConta.get(i).getSenha())){
                return true;
            }
        }
        System.out.println("false!");
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
    
    public String toString() {        
        return String.format("Conta: "+this.getNumConta()+
                "\nSaldo Disp: "+this.getSaldoDisp()+
                "\nSaldo Total: "+this.getSaldoTotal()+
                "\nSenha: "+this.getSenha()
                  );
    }
}
