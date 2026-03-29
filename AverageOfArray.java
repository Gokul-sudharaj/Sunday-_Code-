

/*
Problem: Average of Array

Description:
Given an array of N integers, write a program to calculate the average (mean)
of all elements in the array.

The average is defined as:
(Sum of all elements) / N

Input:
First line: An integer N representing the size of the array
Second line: N space-separated integers

Output:
Print the average value as a floating-point number

Example:

Input:
5
1 2 3 4 5

Output:
3.0
*/


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int [] arr = new int[n];
		int sum =0;
		double average = 1;
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    sum = sum+arr[i];
		}
		 average = (double)sum/n;
		System.out.println("The Average = " + average);
	}
}
