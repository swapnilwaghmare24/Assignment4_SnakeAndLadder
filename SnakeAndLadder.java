public class SnakeAndLadder
{
	static int startPosition=0;
	static int playerPosition=0;
	static final int NOPLAY=1;
	static final int LADDER=2;
	static final int SNAKE=3;
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
			//playerPosition=playerPosition;
			break;
			case LADDER:
			playerPosition=playerPosition+dieValue;
			break;
			case SNAKE:
			playerPosition=playerPosition-dieValue;
			break;
		}
		return playerPosition;
	}
public static void main(String[] args)
{
	int option=getOption();
	int dieValue=dieValue();
	System.out.println("Welcome to snake and ladder program");
	System.out.println("Start Position "+startPosition);
	System.out.println("Player Position "+playerPosition);
	System.out.println("option "+option);
	System.out.println("dieValue "+dieValue);

	System.out.println("playerPosition "+playGame(option,dieValue));
}
}