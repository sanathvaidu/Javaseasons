package sep11;

public class personTest {
	




	 public static void main(String[] args) {
		 
		 	Person obj1=new Person();
			System.out.println(obj1.name);
			System.out.println(obj1.age);
			System.out.println(obj1.phone);
			
			Person p1=new Person();
			System.out.println(p1.name);
			System.out.println(p1.age);
			System.out.println(p1.phone);
			//System.out.println(p1.status);


			p1.name="Sivamani";

			p1.age=35;

			p1.phone=9848022338L;

			System.out.println(p1.name);
			System.out.println(p1.age);
			System.out.println(p1.phone);
			p1.greet();


			Person p2=new Person();
			p2.name="DJ Tillu";
			p2.age=30;
			p2.phone=9609333222L;
			System.out.println(p2.name);
			System.out.println(p2.age);
			System.out.println(p2.phone);

			System.out.println("End of program..");




	}

}
