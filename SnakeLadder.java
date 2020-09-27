import java.util.*;

public class SnakeLadder
{
	public static final int NO_PLAY=1;
	public static final int LADDER=2;
	public static final int SNAKE=3;

	public static void main(String args[])
	{
		int position=0,dieNumber=0;

		do
		{	
			if(position<0)
				position=0;
				
			//System.out.println(Math.random()*5);
			dieNumber=1 + (int)(Math.random() * ((6 - 1) + 1));
			System.out.println("Number when die rolled: "+dieNumber);

			int options=1 + (int)(Math.random() * ((3 - 1) + 1));

			switch (options) 
			{
				case NO_PLAY:	System.out.println("NO PLAY");
								position=position+0;
								break;
				case LADDER:	System.out.println("LADDER");
								position=position+dieNumber;
								break;
				case SNAKE:		System.out.println("SNAKE");
								position=position-dieNumber;
								break;
				default:		break;
			}

			System.out.println("Current Die Postion: "+position);
		}while(position<=100);
		
		System.out.println("Final Position: "+position);
	}

}