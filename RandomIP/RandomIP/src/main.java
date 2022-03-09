import java.util.Random;

public class main 
{
	public static void main(String[] args)
	{	
		{
			Random r = new Random();
			String IP = r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256);
			System.out.println("The created IP is " + IP);
		}
	}
}
