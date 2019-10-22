/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Quintin Stearns
 */
public class TicTacToe {
    private int count;
    public TicTacToe(){
        
    }
    
    
    public void initializeBoard(){
        
        for(int r = 0; r < 3; r++){
            System.out.print("---------");
            for(int c = 0; c < 3; c++){
                System.out.print(" | ");
            }
        }
        System.out.println("\n------");
    }
}
