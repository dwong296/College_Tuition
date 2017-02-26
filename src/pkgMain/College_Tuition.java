package pkgMain;

import java.util.Scanner;

public class College_Tuition 
{
	public static void main (String[] args)
	{
		
	Scanner input =new Scanner (System.in);
	
	System.out.println("Please enter the initial tuition: ");
	double initial = input.nextDouble();
	
	System.out.println("Please enter the percentage increase of tuition(n means n%): ");
	double increase = input.nextDouble()/100;
	
	double total = 0;
	
	for (int i = 0; i < 4; i++) 
		{
			total += (initial * Math.pow((1 + increase), i));
		}
	System.out.printf("Total Tuition: $%.2f", total);
	}
}
