package sub;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OperadorAritmeticoTest {
	@Test
	void testSuma() {
		int esperado = 5;
		int resultado = OperadorAritmetico.suma(3, 2);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testDiv() throws Exception {
		int esperado = 5;
		int resultado = OperadorAritmetico.division(10, 2);
		assertEquals(esperado, resultado);
	}

	@Test
	void testException() {
		assertThrows(Exception.class, () -> OperadorAritmetico.division(10, 0));
	}
	
	@Test
	void testConstruct() {
		new OperadorAritmetico();
		assertTrue(true);
	}

}
