package com.linecomparison;
import java.util.*;
import java.math.*;

public class LineComparison {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//Creating object of Scanner
			Scanner sc=new Scanner(System.in);

			//Displaying welcome message.
			System.out.println("Welcome to Line Comparison Computation Proram.");
			
			//Taking first co-ordinate as input.
			System.out.println("Enter first co-ordinate.");
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			
			
			//Taking second co-ordinate as input.
			System.out.println("Enter second co-ordinate.");
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
			
			//Calculating length
			double ans=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
			
			//Printing final answer
			System.out.print("Length is: "+ans);
			
			
	}

}
