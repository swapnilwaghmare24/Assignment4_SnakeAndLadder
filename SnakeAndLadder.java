public class SnakeAndLadder
{
	static int startPosition=0;
	static int playerPosition=0;
	static final int NOPLAY=1;
	static final int LADDER=2;
	static final int SNAKE=3;
	static final int WININGPOSITION=100;
	static int dieValue()
	{
		int dieValue=(int)(Math.random()*6)+1;
		return dieValue;
	}
	static int getOption()
	{
		int option=(int)(Math.random()*3)+1;
		return option;
	}
	static int playGame(int option,int dieValue)
	{
		switch(option)
		{
			case NOPLAY:
			playerPosition=playerPosition;
			break;
			case LADDER:
			if(playerPosition+dieValue>WININGPOSITION)
			{
				playerPosition=playerPosition;
			}
			else
			{
			playerPosition=playerPosition+dieValue;
			}
			break;
			case SNAKE:
			if(playerPosition-dieValue<startPosition)
			{
				playerPosition=startPosition;
			}
			else
			{
			playerPosition=playerPosition-dieValue;
			}
			break;
		}
		return playerPosition;
	}
public static void main(String[] args)
{
	
	System.out.println("Welcome to snake and ladder program");
	System.out.println("Start Position "+startPosition);
	while(playerPosition<WININGPOSITION)
	{
	int option=getOption();
	int dieValue=dieValue();
	System.out.println("option "+option);
	System.out.println("dieValue "+dieValue);
	playerPosition=playGame(option,dieValue);
	System.out.println("playerPosition "+playerPosition);
	}
}
}