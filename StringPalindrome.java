// Write a Java program to determine whether a given string is a palindrome or not.

// A string is called a palindrome if it reads the same forward and backward. The program should ignore case sensitivity.

// 📥 Input
// A single string s consisting of alphabets.
// 📤 Output
// Print:
// "The Given String is Palindrome" if the string is a palindrome
// "The Given String is Not Palindrome" otherwise

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the String");
	String s = sc.nextLine();
	s=s.toLowerCase();
	String rev = "";
	for(int i=s.length()-1;i>=0;i--){
	    rev = rev + s.charAt(i);
	}
	if(s.equals(rev)){
	    System.out.println("The Given String is Palindrome  " + s +" = "+ rev);
	}
	else{
	    System.out.println("The Given String is Not Palindrome  " + s +" != "+ rev);
	}
	
	}
}
