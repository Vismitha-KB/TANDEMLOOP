package arrayproblem;

import java.util.Scanner;

public class Program1
{
public static void main(String[] args) 
{
     Scanner scan = new Scanner(System.in);
     System.out.println(" Enter the first number");
     double a = scan.nextDouble();
     System.out.println(" Enter the second number");
     double b = scan.nextDouble(); 
     System.out.println(" Enter add for addition , Enter mul for multiplication , Enter sub for Substraction , Enter div for division");
     String choice= scan.next();
	switch (choice)
     {
	    case "add" : System.out.println(a+b);
        break;
	    case "mul" : System.out.println(a*b);
	    break;
	    case "sub" : System.out.println(a-b);
        break;
	    case "div" : System.out.println(a/b);
	    break;
	    default : System.out.println("Enter the incorrect operation");
}
}
}