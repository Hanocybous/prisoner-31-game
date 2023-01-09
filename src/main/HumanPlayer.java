package main;
import java.util.Scanner;

public class HumanPlayer extends Player 
{

    public HumanPlayer(String name) { super(name); }

    public int selectNumber()
    {
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        while(choice<1 || choice>5)
        {
            System.out.println("Give a number between 1 and 5:");
            choice = in.nextInt();
        }
        return choice;
    }
}
