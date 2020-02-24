package elkins_problem1;
//Import plugins
import java.security.SecureRandom;
import java.util.Scanner;


public class CAI1 {

	static SecureRandom rand = new SecureRandom();
	public static void main(String[] args) {
		quiz();
	}

	private static void quiz()
		{
		int num1,num2,ans;
		boolean correct=false;

		num1=rand.nextInt(10);
		num2=rand.nextInt(10);
		askQuestion(num1,num2);
		while(!correct)
			{
				ans=readResponse();
				if(isAnswerCorrect(num1,num2,ans))
				{
					correct=true;
					System.out.println("Very good!");
				}
				else
					System.out.println("No. Please try again.");
			}
		}

	private static void askQuestion(int num1, int num2)
		{
		System.out.println("How much is "+num1+" times "+num2+"?"); //Ask for user input
		}

	private static int readResponse() //Read the user input
		{
		Scanner input=new Scanner(System.in);
		return input.nextInt();
		}


	private static boolean isAnswerCorrect(int num1, int num2, int ans) {
		return (num1*num2)==ans;//Calculates correct answer
	}
  
  
}

