package arrayproblem;

import java.util.Scanner;

class Program2
{
  public static void main(String[] args) 
  {
	Scanner scan = new Scanner(System.in);
	System.out.println(" Enter the number");
	int num = scan.nextInt();
	if (num ==1)
	{
		System.out.println("1");
	}
	else
	{
		System.out.print("1");
	for(int i =3; i<= 2*num ; i++)
	{
		if(i%2!=0)
		{
			System.out.print(" , " +i);
		}
	}
	}
}	
}