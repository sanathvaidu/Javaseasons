package arrays;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		int[][]a=new int[2][5];
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
				
			System.out.println(a[i][j]+"   ");
		}
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[0][3]=4;
		a[0][4]=5;
		
		a[1][0]=a[0][0]*a[0][0];
		a[1][0]=a[0][1]*a[0][1];
		a[1][0]=a[0][2]*a[0][2];
		a[1][0]=a[0][3]*a[0][3];
		a[1][0]=a[0][4]*a[0][4];
		for(int i=0;i<a.length;i++)
		{
		
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[i][j]+"   ");
		}
		System.out.println();
		}
				
	}
}
				
		

	

