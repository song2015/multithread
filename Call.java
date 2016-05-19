
public class Call {

	int id;
	//long startTimestamp;
	//long endTimestamp;
	boolean answered;
	
	/*
	Call(int id, long startTimestamp, long endTimestamp){
		this.id = id;
		this.startTimestamp=startTimestamp;
		this.endTimestamp = endTimestamp;
	}*/
	
	
	Call(int id){
		this.id = id;
	}
	
	public String toString(){
		return "Call "+id;
	}
	

}
