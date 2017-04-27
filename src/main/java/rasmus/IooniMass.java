package rasmus;

public class IooniMass implements Aine{
	public String nimetus(){
		return nimetus;
	}
	public int molekulmass(){
		return molekulmass;
	}

	String nimetus;
	int molekulmass;
	
	public IooniMass(String nimetus, int molekulmass){
		this.nimetus=nimetus;
		this.molekulmass=molekulmass;
	}
}