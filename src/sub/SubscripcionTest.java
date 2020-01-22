package sub;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class SubscripcionTest {
	@Test
	public void testprecioPorMes() {
		double esperado = 100;
		Subscripcion s = new Subscripcion(200, 2);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}

	@Test
	public void testprecioPorMes2() {
		double esperado = 67;
		Subscripcion s = new Subscripcion(200, 3);
		double resultado = s.precioPorMes();
		assertEquals((int)esperado, (int)resultado, 0);
	}
	
	@Test
	public void testprecioPorMes0() {
		double esperado = 0;
		Subscripcion s = new Subscripcion(0, 3); //Subscripcion free
		double resultado = s.precioPorMes();
		assertEquals((int)esperado, (int)resultado, 0);
	}
	
	@Test
	public void testprecioPorMesCancel() {
		double esperado = 0;
		Subscripcion s = new Subscripcion(10, 3);
		s.cancel();
		double resultado = s.precioPorMes();
		assertEquals((int)esperado, (int)resultado, 0);
	}
}

