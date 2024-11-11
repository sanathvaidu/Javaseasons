package arrays;

public class varArgsDemo1 {

	public static void main(String[] args) {
		Sum obj=new Sum();
		
		obj.add(10, 20);
		
		obj.add(10, 20, 30);
		obj.add(10,20,30,40,50,60,70);
		obj.add(10,20,30,40,50,60,70,0,20,30,40,50,60,70);
		obj.add();
		
		obj.add(10.33,20.22);
 
	}

}
