package rasmus;

public class IooniLiitmine implements Aine{
	Ioon i1;
	Ioon i2;
	public String nimetus(){
		return nimetus;
	}
	public int molekulmass(){
		return molekulmass;
	}

	String nimetus;
	int molekulmass;
	
	public IooniLiitmine(String nimetus, Ioon i1, Ioon i2){
		this.nimetus = nimetus;
		this.i1=i1;
		this.i2=i2;
	}
	public String toString(){
		if(i1.aatommassideSumma==i2.aatommassideSumma && i1.laeng!=i2.laeng){return "Iooninimi on " + nimetus + " " + i1.nimetus + i1.aatommassideSumma + i1.laeng + i2.nimetus + i2.aatommassideSumma + i2.laeng;} return null;
	}
	
}