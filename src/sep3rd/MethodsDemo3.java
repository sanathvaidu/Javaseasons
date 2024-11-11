package sep3rd;

import java.util.Scanner;

public class MethodsDemo3 {

	public static void main(String[] args) {
		MethodsDemo3 obj1=new MethodsDemo3();
		
		int res1=obj1.natSum3();
		System.out.println(res1);
		
		System.out.println(obj1.natSum3());
		

	}
	
	//Methods with return-type and no arguments/parameters
	public int natSum3() {
		
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		
		int res=(n*(n+1))/2;
		
		return res;
		

		
		
	}

}
