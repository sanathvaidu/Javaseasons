package operators;

import java.util.Scanner;

public class TernaryOperatorDemo1 {

	public static void main(String[] args) {
		
		System.out.println("please some integer");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		if(x>=10) 
		{
			System.out.println("+ve");
		}
		else {
			System.out.println("-ve");
	}
	}
}

