package exceptions;

public class ThrowDemo1 {

	public static void main(String[] args) {
		
		int x=10;
		int y=2;
		try
		{
			if(y==0)
			{
				try
				
				{
					
				throw new ArithmeticException();
				}
				catch(ArithmeticException e)
				{
					System.out.println("please assign non-zero value for y");
				}
			}
			else
			{
				System.out.println("Quotient is"+(x/y));
			}
		}
		finally
		{
		System.out.println("End program..");
	}
	}
}
