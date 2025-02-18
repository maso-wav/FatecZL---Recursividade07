package Controller;

public class MultiplicaçãoController {
    
    public MultiplicaçãoController(){
        
        super();
    }
    
    public int multiplicacaoRec(int num1, int num2){
        
        if(num2 == 0){
            
            return 0;
            
        } else {
            
            return num1 + multiplicacaoRec(num1, num2 - 1);
        }
        
    }
}
