package flowcontrolstatements;

public class ContinueDemo2 {

	public static void main(String[] args) {
		
		for ( int i =1;i<=5;i++)
		{
         for (int j=1;j<=5;j++)
         {
        	// System.out.println("Before continue");
			if(i==3)
			{
				//continue;
			break ;
		}
			// System.out.println("After continue");
		System.out.println(i+"   "+j);
		}
	}
}
}




