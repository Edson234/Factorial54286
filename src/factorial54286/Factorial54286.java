/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial54286;

/**
 *
 * @author Edson
 */
public class Factorial54286 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double num=15;
        double factorial=1;
        
        while (num!=0){
            factorial= factorial*num;
        num--;
    }    
        System.out.println(factorial);
        
    }
    
}
