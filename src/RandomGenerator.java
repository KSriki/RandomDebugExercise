import java.util.Random;


public class RandomGenerator{
	public static void main(String[] args)
	{
		//output("Generate 10 random integers between 0 and 6");
		Random rnd = new Random();


		for (int i = 1; i <= 10; ++i){
			// 1 to 6 inclusive
			//int randomInt = 1 + rnd.nextInt(6);
			
			//between inclusive 5 to 95 exclusive
			int randomInt = 5 + rnd.nextInt(90);
			output("Generated number: " + randomInt);
		}
//
//		int temp = (5+rnd.nextInt(90));
//		while( temp != 5){
//			System.out.println(temp);
//			temp = (5+rnd.nextInt(90));
//		}
		output("Done.");
	}

	private static void output(String aMessage)
	{
		System.out.println(aMessage);
	}
}