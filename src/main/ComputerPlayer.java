package main;
import java.util.Random;

public class ComputerPlayer extends Player 
{

    private Random random;

    public ComputerPlayer(String name) {
        super(name);
        random = new Random();
    }

    public int selectNumber(){ return random.nextInt(5) + 1; }       

}
