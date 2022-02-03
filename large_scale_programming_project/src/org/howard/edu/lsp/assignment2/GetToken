package org.howard.edu.lsp.assignment2;

import java.util.Scanner;
//import java.util.Arrays;

/**
 * 
 * @author Sydnie Sewell
 * February 3,2022
 *
 */
public class GetToken {

	
	public static void main(String[] args) {
		/**
		 * 
		 * This purpose of this java program is to Write a Java program that processes input lines until the user enters a terminating newline character. Each of the other lines is expected to be a string consisting of digits and space characters. 
		 * Each digit sequence is a token detected by the scanner and can be converted into a number. 
		 * The program scans the string and prints the tokens (digit sequences in the string).
		 *  It also prints the sum and product of the numbers denoted by the tokens on the line. 
		 * It should print each token and the sum and product on a different line. 
		 */
		Scanner myObj = new Scanner(System.in);
		System.out.println("String?");
		String check_userinput=myObj.nextLine();
		String special_character="Goodbye";
		
		while(!(check_userinput.equals(special_character)))
		{
			int sum=0;
			int product=1;
			String [] tokens = check_userinput.split(" ");
			
			System.out.println("Tokens:");
			
			for(String element : tokens)
			{
				System.out.println(element);
				
			     sum = sum + Integer.parseInt(element);
			     product=product* Integer.parseInt(element); 
			}
		System.out.println("Sum:" + sum);
		System.out.println("Product: "+ product);
		
		System.out.println("String?");
		check_userinput=myObj.nextLine();
		}

	}

}
