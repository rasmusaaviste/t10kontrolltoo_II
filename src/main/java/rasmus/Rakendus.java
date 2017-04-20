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
	public String IooniNimi(){
		Ioon ioon=new Ioon();
		return kysiNimetus(H, +);
	}
		
	public static void main(String[] args){
		System.getProperties().put("server.port", 6537);
		SpringApplication.run(Rakendus.class);
	}
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar
