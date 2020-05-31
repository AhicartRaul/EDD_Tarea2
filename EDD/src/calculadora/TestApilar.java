package calculadora;

import junit.framework.TestCase;

public class TestApilar extends TestCase {
	/* metodo main */
	public void testApilar() {

		String linea = "4 5 +";

		RPN calc = new RPN(linea);

		assertEquals(9.000000, calc.resultado());
		// assertEquals(5.000000, calc.resultado());

	}

}