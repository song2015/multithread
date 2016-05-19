
public class Customer {
	Controller contr=null;
	
	int index=0;
	Call[] arr=new Call[6];
	
	public synchronized void makePhoneCall(Call cal){
		if(index==arr.length){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notifyAll();
	
		arr[index] = cal;
		index++;
		
	}
	
	public synchronized Call beAnswered(){
		if(index==0){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notifyAll();
		
		index--;
		return arr[0];
	}
	
}
