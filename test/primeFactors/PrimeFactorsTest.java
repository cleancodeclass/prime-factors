package primeFactors;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PrimeFactorsTest {

	private PrimeFactors primeFactors;

	@Before
	public void setup() {
		primeFactors = new PrimeFactors();
	}
	
	@Test
	public void primefactor_of_1() {
		List<Integer> factors = primeFactors.of(1);
		
		assertEquals(Arrays.asList(), factors);
	}
	
	@Test
	public void primefactor_of_2() {
		List<Integer> factors = primeFactors.of(2);
		
		assertEquals(Arrays.asList(2), factors);
	}
	
	@Test
	public void primefactor_of_3() {
		List<Integer> factors = primeFactors.of(3);
		
		assertEquals(Arrays.asList(3), factors);
	}
	
	@Test
	public void primefactor_of_4() {
		List<Integer> factors = primeFactors.of(4);
		
		assertEquals(Arrays.asList(2,2), factors);
	}

	@Test
	public void primefactor_of_6() {
		List<Integer> factors = primeFactors.of(6);
		
		assertEquals(Arrays.asList(2,3), factors);
	}
	
	@Test
	public void primefactor_of_8() {
		List<Integer> factors = primeFactors.of(8);
		
		assertEquals(Arrays.asList(2,2,2), factors);
	}

}
