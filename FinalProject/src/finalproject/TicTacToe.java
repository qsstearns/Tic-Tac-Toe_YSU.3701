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
<<<<<<< HEAD
    
   protected char[][] board = new char[3][3];
   
=======
    private int count;
>>>>>>> master
    public TicTacToe(){
        
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                board[a][b] = '-';
            }
        }
    }
    
    
    public void initializeBoard(){
        
        for(int r = 0; r < 3; r++){
<<<<<<< HEAD
            System.out.println("\n-------------");
            System.out.print("| ");
=======
            System.out.print("---------");
>>>>>>> master
            for(int c = 0; c < 3; c++){
                System.out.print(board[r][c] + " | ");
            }
        }
<<<<<<< HEAD
        System.out.println("\n-------------");
=======
        System.out.println("\n------");
>>>>>>> master
    }
}
