
public class Recepist implements Stuff{
	
	public void pickUp(Call c) {
		
		c.answered=true;
		System.out.println("This is a stuff answering the phone.");
		
	}
	@Override
	public void hangUp(Call c) {
		System.out.println("This is a stuff. Thanks for your call.");
		
	}

		

}
