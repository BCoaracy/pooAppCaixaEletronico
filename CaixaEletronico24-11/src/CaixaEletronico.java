
import java.util.Scanner;

public class CaixaEletronico {    
    
    public void validaSenhaConta(BancoDados banco){
        Scanner leia = new Scanner(System.in);
        Conta conta = new Conta();
        
        System.out.println("Digite o numero da conta: ");
        int auxConta = leia.nextInt();
        System.out.println("Digite a senha: ");
        String auxSenha = leia.next();
        
        if(conta.validaSenha(auxSenha, banco, auxConta)){
            System.out.println("Senha Correta");
        }
    }
    
    private boolean validaValor(double valor){
        if(valor<=0){
            return false;
        }
        return true;
    }
    
    public boolean validaSaque(double valor, Conta conta){
        if(validaValor(valor) || conta.getSaldoDisp()<valor){
            return false;
        }
        return true;
    }
    
    public boolean validaDeposito(double valor, Conta conta){
        if(validaValor(valor)){
            return true;
        }
        return false;
    }
}
