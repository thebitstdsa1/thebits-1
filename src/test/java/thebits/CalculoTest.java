package thebits;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class CalculoTest {

	@Test
	void testMultiplicar() {
		//fail("todavía no está implementado");
	}
	
	@Test
	void testDebeFallar() {
		Calculo test = new Calculo();
		assertNotEquals(4, test.multiplicar(2, 3), "multiplicar(2,3) debe dar 6");
	}
	
	@Test
	void testDebeAndar() {
		Calculo test = new Calculo();
		assertEquals(4, test.multiplicar(2, 4), "multiplicar(2,4) debe dar 8");
	}
	

}
