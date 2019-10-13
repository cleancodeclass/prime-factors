package primeFactors;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest {

	@Test
	public void primefactor_of_1() {
		PrimeFactors primeFactors = new PrimeFactors();
		List<Integer> factors = primeFactors.of(1);
		
		assertEquals(Arrays.asList(), factors);
	}
	
	@Test
	public void primefactor_of_2() {
		PrimeFactors primeFactors = new PrimeFactors();
		List<Integer> factors = primeFactors.of(2);
		
		assertEquals(Arrays.asList(2), factors);
	}

}
