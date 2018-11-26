
import java.util.ArrayList;

public class BancoDados {
    
    ArrayList<Conta> listaConta = new ArrayList<Conta>();
    
    public void salvaConta(Conta conta){
        if(!listaConta.contains(conta))
            this.listaConta.add(conta);
    }
    
    
    
    
}
