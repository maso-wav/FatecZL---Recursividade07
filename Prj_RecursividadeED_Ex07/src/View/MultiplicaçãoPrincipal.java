package View;

import Controller.MultiplicaçãoController;

public class MultiplicaçãoPrincipal {
    
    public static void main (String args[]){
        
        MultiplicaçãoController mc = new MultiplicaçãoController();
        
        int numero1 = 4;
        int numero2 = 5;
        
        int produto = mc.multiplicacaoRec(numero1, numero2);
        
        System.out.println("O PRODUTO DE " + numero1 + "x" + numero2 + " É IGUAL A: " + produto + ".");
        
    }
    
}
