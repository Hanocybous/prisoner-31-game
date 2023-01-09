package main;
public abstract class Player 
{
    private String name;
    private int wins;

    protected Player(String name)
    {
        this.name = name;
    }
    
    public abstract int selectNumber();

    public int play(Player other)
    {
        int card1 = this.selectNumber();
        int card2 = other.selectNumber();
        int var1 = card1 + card2;
        System.out.println("Player " + this.name + " has " + var1);
        
        while((card1+card2) < 26)
        {
            card1 += this.selectNumber();
            card2 += other.selectNumber();
            var1 = card1 + card2;
            System.out.println("Player " + this.name + " has " + var1 );
        }
        return var1;
    }

    public String getName()
    {
        return name;
    }

    public Player declareWinner(Player other)
    {
        if (this.getWins() > other.getWins())
        {
            return this;
        }
        else if (this.getWins() < other.getWins())
        {
            return other;
        }
        else
        {
            return null;
        } 
    }

    public String toString()
    {
        return name;
    }

    public int getWins()
    {
        return wins;
    }
    
    public void addWin()
    {
        wins = wins + 1;
    }
}
