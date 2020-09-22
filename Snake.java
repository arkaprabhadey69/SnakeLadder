public class Snake
{
	 static final int NO_PLAY=0;
	 static final int LADDER=1;
	 static final int SNAKE=2;
	 static int no_of_times=0;
	public static void main(String[] args) {

		double start_position1=0;
		double start_position2=0;
		double new_position1=0;
		double new_position2=0;
		int ch=(int)Math.floor(Math.random()*10)%2;

		while(new_position1!=100||new_position2!=100)
{
		
		if(ch==0)
	{
		System.out.println("player1");

		new_position1=diceroll(new_position1,start_position1);
		System.out.println("New Position for P1 is: "+new_position1);

		if(new_position1==100)
		{
			System.out.println("Player 1 won");
		}
		ch=1;
	}
	else
	{
		System.out.println("Player2");

		new_position2=diceroll(new_position2,start_position2);
		System.out.println("New position for P2 is: "+new_position2);
		
		if(new_position2==100)
		{
			System.out.println("Player 2 won");
		}
		ch=0;

		
	}
}
	System.out.println("Dice was rolled : "+no_of_times+" times");
		





 }
 public static double diceroll(double new_position, double start_position)
		{
			no_of_times++;
			double dice=(Math.floor(Math.random()*10)%6)+1;
		int options=(int)Math.floor(Math.random()*10)%3;
		//System.out.println(dice);
		//double new_position=0;

		//while()
		System.out.println("Dice number:"+dice);
		System.out.println("Option"+ options);
		switch(options)
		{
			case NO_PLAY:
			new_position=new_position;
			
			break;
			case LADDER:
			new_position=new_position+dice;
			if(new_position>100)
			{
				new_position=new_position-dice;
				System.out.println("Stays in same position");
			}
			diceroll(new_position,start_position);
			break;
			case SNAKE:
			new_position=new_position -dice;
			if(new_position<0)
			{
				new_position=start_position;
				System.out.println("Starts from starting position");
			}
			break;
			 default:
			break;
		}
		//System.out.println("New Position after dice roll: "+new_position);


		return new_position;
		}

		
}






