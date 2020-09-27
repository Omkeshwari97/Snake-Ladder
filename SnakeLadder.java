import java.util.*;

public class SnakeLadder
{
	public static final int NO_PLAY=1;
	public static final int LADDER=2;
	public static final int SNAKE=3;

	public static int game(int position,String player)
	{
			
			//System.out.println(Math.random()*5);
			int dieNumber=1 + (int)(Math.random() * ((6 - 1) + 1));
			System.out.println("Number when die rolled: "+dieNumber);

			int options=1 + (int)(Math.random() * ((3 - 1) + 1));

			switch (options) 
			{
				case NO_PLAY:	System.out.println("NO PLAY");
								position=position+0;
								break;
				case LADDER:	System.out.println("LADDER");
								if(position+dieNumber<=100)
								{
									position=position+dieNumber;
									position=game(position,player);
								}	
								break;
				case SNAKE:		System.out.println("SNAKE");
								position=position-dieNumber;
								if(position<0)
									position=0;
								break;
				default:		break;
			}	
		return position;
	}

	public static void main(String args[])
	{
		int p1=0,p2=0,count=0,f=0;

		while(p1!=100 && p2!=100)
		{
			if(count%2==0)
			{
				p1=game(p1,"Player 1");
				System.out.println("Position of Player 1: "+p1);

				if(p1==100)
				{
					System.out.println("Player 1 wins.");
					f=1;
				}
			}
			if(count%2==1)
			{
				p2=game(p2,"Player 2");
				System.out.println("Position of Player 2: "+p2);

				if(p2==100)
				{
					System.out.println("Player 2 wins.");
					f=1;
				}
			}
			count++;
			
			if(f==1)
				break;
		}
	}

}