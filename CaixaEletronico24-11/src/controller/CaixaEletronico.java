package controller;

import java.util.Scanner;
import model.ContasBEAN;

public abstract class CaixaEletronico {    
    
    public abstract Boolean isExist(String senha, String nconta);
    
    public abstract boolean validaValor(double valor);
    
    public abstract boolean validaTransacao(double valor, ContasBEAN conta);
    
//    private boolean validaValor(double valor){
//        if(valor<=0){
//            return false;
//        }
//        return true;
//    }
//    
//    public boolean validaSaque(double valor, Conta conta){
//        if(validaValor(valor) || conta.getSaldoDisp()<valor){
//            return false;
//        }
//        return true;
//    }
//    
//    public boolean validaDeposito(double valor, Conta conta){
//        if(validaValor(valor)){
//            return true;
//        }
//        return false;
//    }
}
