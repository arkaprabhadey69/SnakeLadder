public class Snake
{
	 static final int NO_PLAY=0;
	 static final int LADDER=1;
	 static final int SNAKE=2;
	public static void main(String[] args) {

		double start_position=0;
		double new_position=0;
		
		
		double dice=(Math.floor(Math.random()*10)%6)+1;
		int options=(int)Math.floor(Math.random()*10)%3;
		//System.out.println(dice);
		//double new_position=0;

		
		System.out.println("Dice number:"+dice);
		System.out.println("Option"+ options);
		switch(options)
		{
			case NO_PLAY:
			new_position=new_position;
			
			break;
			case LADDER:
			new_position=new_position+dice;
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
		
	
		
		





		}

		
}






