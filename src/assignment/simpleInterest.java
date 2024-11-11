package assignment;

import java.util.Scanner;

public class simpleInterest  {
	
	public static void main(String[]args) {
		
		simpleInterest.calc1();
		simpleInterest.calc2(10000, 10 ,2);
		System.out.println(simpleInterest.calc3());
		System.out.println(simpleInterest.calc4(20000,18,5));
		
	
}
	
	// 1 methods with no return-type and no arguments/parameters
	
	public static void calc1() {
		Scanner input=new Scanner(System.in);
				
		System.out.println("Enter principal amout");
		Float p= input.nextFloat();
		System.out.println("Enter time petriod");
		Float t= input.nextFloat();
		System.out.println("Enter rate of interest");
		Float r= input.nextFloat();
		Float SimpleInterest=(p*t*r)/100;
		
		System.out.println("simpleInterest");
	

	}

	//2 methods no return type and with arguments/parameters
	
	public static void calc2(float p,float t,float r) {
		float simpleInterest=(p*t*r)/100;
		System.out.println("simpleInterest:"+simpleInterest);
	}
	//3)Methods with return-type and without arguments/parameters
	
	public static float calc3() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter principal amount:");
		float p=input.nextFloat();
		System.out.println("Enter time period:");
		float t=input.nextFloat();
		System.out.println("Enter rate of Interest:");
		float r=input.nextFloat();
		float simpleInterest=(p*t*r)/100;
		return simpleInterest;
	}
	//4)Methods with return-type and arguments/parameters
	public static float calc4(float p,float t,float r) {
		float simpleInterest=(p*t*r)/100;
		return simpleInterest;
	}	
}
	
