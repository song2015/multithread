
public class Manager implements Stuff {
	public void pickUp(Call c) {
		c.answered=true;
		System.out.println("This is the manager answering the phone.");
		
	}
	@Override
	public void hangUp(Call c) {
		System.out.println("This is the manager. Thanks for your call.");
		
	}

}
