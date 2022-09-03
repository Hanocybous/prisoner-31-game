import java.util.Scanner;

public class PrisonerGame 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to play 1. Human vs Computer, or 2. Computer vs Computer?");
        String usrin = in.nextLine();
        while(usrin.equalsIgnoreCase("2"))
        {
            ComputerPlayer cp1 = new ComputerPlayer("Computer1");
            ComputerPlayer cp2 = new ComputerPlayer("Computer2");
            GameRounds gr1 = new GameRounds(cp1, cp2);
            gr1.playRound();
            gr1.printScore();
            System.out.println("Do you want to play another round?");
            String usrin2 =  in.next();
            while(usrin2.equalsIgnoreCase("yes"))
            {
                gr1.playRound();
                gr1.printScore();
                System.out.println("Do you want to play another round?");
                usrin2 =  in.next();
            }
            if(usrin2.equalsIgnoreCase("no"))
            {
                if(cp1.declareWinner(cp2) != null)
                {
                    System.out.println("Player " + cp1.declareWinner(cp2) + " has won the game!");
                    System.exit(0);
                }
                System.out.println("No Winner!");
                System.exit(0);
            }
        }
        while(usrin.equalsIgnoreCase("1"))
        {
            HumanPlayer hp1 = new HumanPlayer("Human");
            ComputerPlayer cp3 = new ComputerPlayer("Computer");
            GameRounds gr1 = new GameRounds(hp1, cp3);
            gr1.playRound();
            gr1.printScore();
            System.out.println("Do you want to play another round?");
            String usrin2 =  in.next();
            while(usrin2.equalsIgnoreCase("yes"))
            {
                gr1.playRound();
                gr1.printScore();
                System.out.println("Do you want to play another round?");
                usrin2 =  in.next();
            }
            if(usrin2.equalsIgnoreCase("no"))
            {
                if(hp1.declareWinner(cp3) != null)
                {
                    System.out.println("Player " + hp1.declareWinner(cp3) + " has won the game!");
                    System.exit(0);
                }
                System.out.println("No Winner!");
                System.exit(0);
            }
        }
    }
}
