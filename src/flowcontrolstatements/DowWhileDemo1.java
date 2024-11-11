package flowcontrolstatements;

import java.util.Scanner;

public class DowWhileDemo1 {

	public static void main(String[] args) {
		Scanner input	=new Scanner(System.in);
		String Uname=null;
		String pwd=null;
		
		do
		{
			System.out.println("Enter Username :");
			Uname=input.next();
			System.out.println("Enter password :");
			pwd=input.next();
			if(Uname.equals("reyaz0607")&& pwd.equals("reyaz123"));
			{
		}
				System.out.println("Welcome to dashboard..");
				break;
	
		}while(Uname.equals("reyaz0607")&& pwd.equals("reyaz123"));
		System.out.println("End of program..");

		}
		}


