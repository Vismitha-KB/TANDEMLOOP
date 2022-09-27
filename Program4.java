package arrayproblem;

import java.util.Scanner;

public class Program4
{
public static void main(String[] args) 
{
	int count=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of elements in the array");
	int n = scan.nextInt();
	int arr[]= new int [n];
	System.out.println("Enter the array elements");
	for(int i=0;i<n; i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.print(1+ ":" +n);
	for(int i=2;i<=9;i++)
	{
		for(int j=0;j<n ;j++)
	{
		if(arr[j]%i==0)
		{
			count++;
		}
	}
	System.out.print(" , " + i + ":"+count);	
	count =0;
}
}
}
