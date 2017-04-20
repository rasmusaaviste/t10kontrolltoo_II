package rasmus;

public class Ioon implements IooniNimi{
	String nimetus, laeng;
	double aatommassideSumma;
	public Ioon(String nimetus, double aatommassideSumma, String laeng){
		this.nimetus=nimetus;
		this.laeng=laeng;
		this.aatommassideSumma=aatommassideSumma;
	}
	
	public kysiNimetus(String nimetus, String laeng){
		this(nimetus, laeng);
	}	
}