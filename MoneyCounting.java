import java.util.*;
public class MoneyCounting
{
	public static void main(String args[])
	{
		int[]notes=new int[]{1000,500,200,100,50};
		int[]noteCounter=new int[5];
		Scanner s=new Scanner(System.in);
    System.out.println("Welcome to My Atm:")
    System.out.println();
		System.out.println("Enter the amount:-");
		int amount=s.nextInt();
		
		for(int i=0; i<5; i++)
		{
			if(amount>=notes[i])
			{
				noteCounter[i]=amount/notes[i];
				amount=amount-noteCounter[i]*notes[i];
			}
		}
		System.out.println("Currency->");
		
		for(int i=0; i<5; i++)
		{
			if(noteCounter[i]!=0)
			{
				System.out.println(notes[i]+":"+noteCounter[i]);
			}
		}
	}
}
