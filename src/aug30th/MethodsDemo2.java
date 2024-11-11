package aug30th;

import java.util.Scanner;

public class MethodsDemo2 {

	public static void main(String[] args) {
		 
  MethodsDemo2 obj1=new MethodsDemo2();
  System.out.println("1) Methods no return-type and no arguments/para,eters");
		 obj1.natSum1();
		 //obj1.natsum();
		//obj1.natsum();
		 
		  System.out.println("2) Methods no return-type and no arguments/para,eters");
		  System.out.println("Enter a natural number");
		  Scanner input=new Scanner(System.in);
		  int n=input.nextInt();
		  obj1.natsum2(n);

	}

	public void natSum1()
	{
		System.out.println("Enter a natural number");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int res=(n*(n+1))/2;
		System.out.println(res);
		
	}
	public void natsum2(int n)
	{
		int res=(n*(n+1))/2;
				System.out.println(res);
}

}
