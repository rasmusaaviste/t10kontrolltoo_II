package rasmus;

public class Ioon implements IooniNimi{
	public String nimetus(){
		return nimetus;
	}
	public int aatommassideSumma(){
		return aatommassideSumma;
	}
	public String laeng(){
		return laeng;
	}

	String nimetus, laeng;
	int aatommassideSumma;
	public Ioon(String nimetus, int aatommassideSumma, String laeng){
		this.nimetus=nimetus;
		this.laeng=laeng;
		this.aatommassideSumma=aatommassideSumma;
	}
	
}