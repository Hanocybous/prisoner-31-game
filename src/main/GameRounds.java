package main;
public class GameRounds 
{
    private Player[] players = new Player[2];
    private int index0;

    public GameRounds(Player other1, Player other2)
    {
        players[0] = other1;
        players[1] = other2;
    }
    public void playRound()
    {
        int index1 = index0 + 1;
        if(index1 == 2)
        {
            index1 = index1 - 2;
        }
        System.out.println("Player " + players[index0] + " Turn");
        int playresult1 = players[index0].play(players[index1]);
        if(playresult1 > 31)
        {
            System.out.println(players[index0].getName() + " Busted!");
            players[index1].addWin();
        }
        else
        {
            System.out.println("Player " + players[index1] + " Turn");
            int playresult2 = players[index1].play(players[index0]);
            if(playresult2 > 31)
            {
                System.out.println(players[index1].getName() + " Busted!");
                players[index0].addWin();
            }
            else
            {
                if(playresult1 >= playresult2)
                {
                    players[index0].addWin();
                }
                else
                {
                    players[index1].addWin();
                }
            }
        }
        index0 = index1;
        index1 = index0;
    }
    public void printScore()
    {
        System.out.println("Player " + players[0].toString() + " : " + players[0].getWins());
        System.out.println("Player " + players[1].toString() + " : " + players[1].getWins());
    }
}