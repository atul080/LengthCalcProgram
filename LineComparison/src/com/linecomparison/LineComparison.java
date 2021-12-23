package com.linecomparison;
import java.util.*;
import java.math.*;

public class LineComparison {

	//function for length calculation
	public static double lengthCalc(double x1,double y1,double x2,double y2)
	{
		//Calculating length
		double ans=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//Creating object of Scanner
			Scanner sc=new Scanner(System.in);

			//Displaying welcome message.
			System.out.println("Welcome to Line Comparison Computation Proram.");
			
			//Taking first co-ordinate as input for first line.
			System.out.println("Enter first co-ordinate for first line.");
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			
			
			//Taking second co-ordinate as input for first line.
			System.out.println("Enter second co-ordinate for first line..");
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
			

			//Taking first co-ordinate as input for second line.
			System.out.println("Enter first co-ordinate for second line.");
			double x3=sc.nextDouble();
			double y3=sc.nextDouble();
			
			
			//Taking second co-ordinate as input for second line.
			System.out.println("Enter second co-ordinate for second line..");
			double x4=sc.nextDouble();
			double y4=sc.nextDouble();

			
			//calling function for length calculation
			double firstLength=LineComparison.lengthCalc(x1, y1, x2, y2);
			double secondLength=LineComparison.lengthCalc(x3, y3, x4, y4);

			
			//checking equality
			if(firstLength==secondLength)
			{
				System.out.print("Both the lengths are equal.");
			}
			else if(firstLength<secondLength)
				System.out.print("First line is smaller than Second line.");
			else
				System.out.print("First line is greater than Second line.");

			
			
	}

}
