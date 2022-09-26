package TestDemo.TestDemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TCalculator {
	
	ICalculator C = null;
	
	@Before
	public void setup() {
		System.out.println("Before");
		C = new Calculator();
	}
	
	@After
	public void done() {
		System.out.println("After");
		C = null;
	}
	
	@Test
	public void testadd() {
		System.out.println(C);
		assertEquals(5, C.add(2, 3));
	}
	
	@Test
	public void testproduct() {
		System.out.println(C);
		assertEquals(6, C.product(2, 3));
	}
	@Test
	public void testtotal() {
		System.out.println(C);
		assertEquals(1275, C.total(50));
	}
}
