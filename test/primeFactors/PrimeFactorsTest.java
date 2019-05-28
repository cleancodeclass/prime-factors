package primeFactors;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PrimeFactorsTest {

	private PrimeFactors primeFactors;
	@Before
	public void setUp() {
		primeFactors = new PrimeFactors();
		
	}

	@Test
	public void primeFactorTestOf1() {
		
		//when    어떤 동작을 했을때
		List<Integer> factors = primeFactors.of(1);
		
		//then    어떤값이 나오는지 확인
		assertEquals(Arrays.asList(), factors);
	}
	
	@Test
	public void primeFactorTestOf2() {
		
		//when
		List<Integer> factors = primeFactors.of(2);
		
		//then
		assertEquals(Arrays.asList(2), factors);
	}

}
