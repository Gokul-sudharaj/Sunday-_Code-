// Write a Java program to count the number of vowels and consonants in a given string.

// The program should read a string input from the user and determine how many characters are vowels and how many are consonants.

// 📥 Input
// A single string s containing alphabets and spaces.
// 📤 Output
// Print:
// "Vowels: X" → Number of vowels
// "Consonants: Y" → Number of consonants

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the String");
	String s = sc.nextLine();
	int vowels =0;
	int consonants = 0;
	s=s.toLowerCase();
	
	for(int i=0;i<s.length();i++){
	    char ch = s.charAt(i);
	    if(ch == ' '){
	        continue;
	    }
	    else if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
	        vowels ++;
	    }
	    else if(ch>='a' && ch<='z'){
	        consonants ++;
	    }
	}
	System.out.println("Vowels = " + vowels);
	System.out.println("Consonants = " + consonants);
	}
}
