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
    
   protected char[][] pieces = new char[3][3];
    public TicTacToe(){
        //pieces[1][1] = 'O';
        //pieces[2][2] = 'X';
    }
    
    
    public void initializeBoard(){
        
        for(int r = 0; r < 3; r++){
            System.out.println("\n-------");
            
            for(int c = 0; c < 3; c++){
                System.out.print("| ");
                
                if(pieces[r][c] == 'X'){
                    System.out.print('X');
                }
                else if(pieces[r][c] == 'O'){
                    System.out.print('O');
                }
            }
        }
        System.out.println("\n-------");
    }
}
