package rasmus;

import org.junit.Test;
import static org.junit.Assert.*;

public class IooniTest {
	
	@Test
   public void nimeTest(){
		Rakendus r=new Rakendus();
		assertEquals("Iooni nimi on: Na1+", r.IooniTeke());
	}
	
	@Test
	public void iooniNimeTest(){
		Rakendus r=new Rakendus();
		assertEquals("Iooninimi on keedusool Na1+Cl1- ", r.AineTeke());
	}
	
	@Test
	public void massiTest(){
		Rakendus r=new Rakendus();
		assertEquals("Nende kahe molekuli masside summa on: 24 ", r.MolekulideMass());
	}

	
}