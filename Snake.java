public class Snake
{
	
	public static void main(String[] args) {

		double start_position=0;
		double new_position=0;
		

		while(new_position<8)
	{
		
		double dice=(Math.floor(Math.random()*10)%6)+1;
		new_position=new_position+dice;
		System.out.println("New position is:" +new_position);
		
	}
		
		





		}

		
}






