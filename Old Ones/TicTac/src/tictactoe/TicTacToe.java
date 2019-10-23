/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import Keyboard.Input;
import java.util.ArrayList;
/**
 *
 * @author 18smithal
 */
public class TicTacToe {
    static Input cin = new Input();
    static ArrayList top = new ArrayList();
    static ArrayList mid = new ArrayList();
    static ArrayList low = new ArrayList();
    static boolean win = false;
    /**
     * @param args the command line arguments
     */
    static int p1move = 0;
    static int p2move = 0;
    static int location = 0;
    static int turn = 0;
    public static void main(String[] args) 
    {
        top.add(1);
        top.add(2);
        top.add(3);
        mid.add(4);
        mid.add(5);
        mid.add(6);
        low.add(7);
        low.add(8);
        low.add(9);
        TicTacToe dime = new TicTacToe();
        System.out.println("Player 1: Your are X's");
        System.out.println("Plater 2: You are O's");
        dime.board();
        dime.play();
    }
    
    public static void playagain()
    {
        
    }
    public static void board()
    {
        System.out.println(top);
        System.out.println(mid);
        System.out.println(low);
    }
    public static void play()
    {
        while(win == false && turn<9)
        {
        System.out.println("Player 1 where would you like to go?");
        p1move = cin.Readint() - 1;
        move1();
        board();
        turn++;
        System.out.println(top.get(1));
        System.out.println("Player 2 where would you like to go?");
        p2move = cin.Readint() - 1;
        move2();
        board();
        turn++;
        win();
        }
    }
    public static void move1()
    {
        if (p1move>9 || p1move<0)
            System.out.println("Please input a valid number.");
        if(p1move>=0 && p1move<=2)
            top.set(p1move, 'X');
        if(p1move>=3 && p1move<=5)
        {
            location = mid.indexOf(p1move +1);
            mid.set(location, 'X');
        }
        if(p1move>=6 && p1move<=8)
        {
            location = low.indexOf(p1move +1);
            low.set(location, 'X');
        }
    }
    public static void move2()
    {
        if (p2move>9 || p2move<0)
            System.out.println("Please input a valid number.");
        if(p2move>=0 && p2move<=2)
            top.set(p2move, 'O');
        if(p2move>=3 && p2move<=5)
        {
            location = mid.indexOf(p2move +1);
            mid.set(location, 'O');
        }
        if(p2move>=6 && p2move<=8)
        {
            location = low.indexOf(p2move +1);
            low.set(location, 'O');
        }
    }
    public static void win()
    {
        if (top.get(0) == top.get(1) == top.get(2)) {
        } else {
            System.out.println(top.get(1));
        }
    }
}
