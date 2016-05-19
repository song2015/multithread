
public class Supervisor implements Stuff {
	public void pickUp(Call c) {
		c.answered=true;
		System.out.println("This is the supervisor answering the phone.");
		
	}
	@Override
	public void hangUp(Call c) {
		System.out.println("This is the supervisor. Thanks for your call.");
		
	}
	
}
