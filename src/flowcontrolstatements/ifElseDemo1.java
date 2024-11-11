package flowcontrolstatements;

import java.util.Scanner;

public class ifElseDemo1 {

	public static void main(String[] args) {
		System.out.println("enter your salary..");
		
		Scanner input1 =new Scanner(System.in);
		
		//int;
		//double int nextDouble();
		
System.out.println("enter your dept..");
		Scanner input2 =new Scanner(System.in);
		String dept=input2.next();
		
		int sal=11000;
		if (dept=="non-it")
		{
		if(sal>0 && sal<=10000)
		{
		sal=(int) (sal+(sal*0.1));
		}
		else if(sal>10000  && sal<=20000)
		{
			sal=(int) (sal+(sal*0.2));
		
			
		}
		else if(sal>20000 && sal<=30000)
		{
			sal=(int) (sal+(sal*0.3));
		}
		else 
		{
			sal=(int) (sal+(sal*0.4));
		}
		}
		else if(dept=="it")
		{
			if(sal>0 && sal<=10000)
			{
			sal=(int) (sal+(sal*0.2));
			}
			else if(sal>10000  && sal<=20000)
			{
				sal=(int) (sal+(sal*0.3));
			
				
			}
			else if(sal>20000 && sal<=30000)
			{
				sal=(int) (sal+(sal*0.4));
			}
			else 
			{
				sal=(int) (sal+(sal*0.5));
			}
		}
		System.out.println("net salary"+sal);

		}

}

		
	

	
		



	

	
		
	
		

	


