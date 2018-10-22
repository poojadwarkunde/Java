package practice.java.numericexamples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactorialNumberTest {

	private FactorialNumber factorialNumber;

	@Before
	public void setUp() {
		factorialNumber = new FactorialNumber();
	}

	@Test
	public void testFactWhile() throws Exception {
		final int expected = 120;
		int actual = factorialNumber.factWhile(5);
		assertEquals(expected, actual);
	}

	@Test // (expected = Exception.class) OR use try catch to Assert the exception message
	public void testFactWhile_Negative() throws Exception {
		try {
			factorialNumber.factWhile(-1);
		} catch (Exception e) {
			assertEquals("Number can't be negative", e.getMessage());
		}
	}

	@Test
	public void testFactWhile_Zero() throws Exception {
		final int expected = 1;
		int actual = factorialNumber.factWhile(0);
		assertEquals(expected, actual);
	}

}
