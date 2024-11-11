package exceptions;

import java.util.Scanner;

public class VoterRegistrationApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to voting Registration Website..");
		System.out.println("Enter below details");
		System.out.println("Enter your age");
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		
		if(age>=18)
		{
			System.out.println("please proceed with regidtration");
		}
		else
		{
			try
			{
			throw new InvalidAgeException();
		}
			catch(InvalidAgeException e)
			{
				System.out.println(e.getMessage());
			}
		System.out.println("end of program..");
		
		}

	}
}


