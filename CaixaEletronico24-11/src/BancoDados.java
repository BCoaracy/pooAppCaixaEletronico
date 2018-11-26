
import java.util.ArrayList;

public class BancoDados {
    
    ArrayList<Conta> listaConta = new ArrayList<Conta>();
    boolean iguais;
    public void salvaConta(Conta conta){
         for(Conta c : listaConta){
             if(c.getNumConta()==conta.getNumConta())
                 iguais = true;
             else
                 iguais = false;
         }
        if(iguais == false){
            this.listaConta.add(conta);
        }
        
    }    
}
