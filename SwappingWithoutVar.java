/*
Problem: Swap Two Numbers (Without Temporary Variable)

Description:
Given two integers A and B, write a program to swap their values
without using any third (temporary) variable.

The swapping must be done using arithmetic or bitwise operations only.

Input:
Two integers A and B

Example:
A = 5
B = 10

Output:
Print the values of A and B after swapping

Example:
A = 10
B = 5
*/



import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Value 1");
		int a = sc.nextInt();
	    System.out.println("Enter the Value 2");
		int b = sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("A is" + a);
		System.out.println("B is" + b);
		a = a+b;
		b = a-b;
		a = a-b;
        System.out.println("After Swapping");
        System.out.println("A is" + a);
        System.out.println("B is" + b);

	}
}
