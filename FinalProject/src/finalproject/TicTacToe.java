/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.util.Scanner;
/**
 *
 * @author Quintin Stearns
 */
public class TicTacToe {
    Scanner in = new Scanner(System.in);
    
    protected char[][] board = new char[3][3];
    protected int p1Move,
                    p2Move;

    private int count;
    public TicTacToe(){
        
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                board[a][b] = '-';
            }
        }
    }
    
    
    public void initializeBoard(){
        
        for(int r = 0; r < 3; r++){
            System.out.println("\n-------------");
            System.out.print("| ");
            for(int c = 0; c < 3; c++){
                System.out.print(board[r][c] + " | ");
            }
        }
        System.out.println("\n-------------");
    }
    
    
    public void playerInput(){
        System.out.println("Player 1, where would you like to place your O?");
        p1Move = in.nextInt();
    }
    
    
    private void checkBoard(){
        
    }
}
