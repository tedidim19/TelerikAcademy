package Main;

import java.util.Scanner;

public class First {
	
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++)
		{
			System.out.print(i+" ");
		}
	}
}
	 

