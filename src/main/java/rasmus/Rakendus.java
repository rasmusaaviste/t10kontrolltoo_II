package rasmus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication
public class Rakendus {
	@Autowired
	@RequestMapping("/iooniteke")
	public String IooniTeke(){
		Ioon i1=new Ioon("Na", 1, "+");
		return "Iooni nimi on: " + i1.nimetus + i1.aatommassideSumma + i1.laeng;
	}
	
	@Autowired
	@RequestMapping("/ioonideliitmine")
	public String AineTeke(){
		String nimetus = "keedusool";
		Ioon i1 = new Ioon("Na", 1, "+");
		Ioon i2 = new Ioon("Cl", 1, "-");
		IooniLiitmine a1=new IooniLiitmine(nimetus, i1, i2);
		return a1.toString();
	}
	
	@Autowired
	@RequestMapping("/ioonimass")
	public String MolekulideMass(){
		IooniMass m1= new IooniMass("Na", 23);
		IooniMass m2= new IooniMass("H", 1);
		return "Nende kahe molekuli masside summa on: " + (m1.molekulmass+m2.molekulmass) + " ";
	}
		
	public static void main(String[] args){
		System.getProperties().put("server.port", 6537);
		SpringApplication.run(Rakendus.class);
	}
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar
