import java.util.Random;

public class ComputerPlayer extends Player 
{
    public ComputerPlayer(String name) {
        super(name);
    }

    public int selectNumber()
    {
        Random rand = new Random();
        int computerchoice = rand.nextInt(5) + 1;
        return computerchoice;
    }       
}
