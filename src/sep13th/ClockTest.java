package sep13th;

public class ClockTest {

	public static void main(String[] args) {
		//user1
		Clock c1=new Clock();
		c1.setClock(9);
		c1.getClock();

//user2

		c1.setClock(9,18);
		c1.getClock();
		//user3
		c1.setClock(9,18,01);
		c1.getClock();
		
		

	}

}
