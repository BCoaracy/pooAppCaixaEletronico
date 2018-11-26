public class CaixaEletronico {    
    
    public void validaSenhaConta(BancoDados banco){
        Conta conta = null;
        conta.validaSenha("senha", banco, 1);
    }
}
