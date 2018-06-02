package thebits;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class CalculoTest {

	@Test
	void testMultiplicar() {
		//fail("todavía no está implementado");
	}
	
	@Test //debe fallar pq esta enviando 2*3 y tiene que dar 6
	void testDebeFallar() {
		Calculo test = new Calculo();
		assertNotEquals(4, test.multiplicar(2, 3), "multiplicar(2,3) debe dar 6");
	}
	
	@Test //debe pasar pq 2 por 4 es 8
	void testDebeAndar() {
		Calculo test = new Calculo();
		assertEquals(8, test.multiplicar(2, 4), "multiplicar(2,4) debe dar 8");
	}
	

}
