package flowcontrolstatements;

import java.util.Scanner;

public class ifElseDemo3 {

	public static void main(String[] args) {
		System.out.println("enter some integer");
		
		Scanner input =new Scanner(System.in);
		int x= input.nextInt();
		if(x>=0)
		{
			System.out.println(x+"is positive");
		}
		else
		{
			System.out.println(x+"is negative");
		}
	}
		}

	


