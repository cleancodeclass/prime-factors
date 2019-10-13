package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> of(int number) {
		List<Integer> factors = new ArrayList<Integer>();
		
		for(int divisor = 2;number>1;divisor++) {
			while(number % divisor == 0) {
				factors.add(divisor);
				number /= divisor;
			}
			
		}
		return factors;
	}

}
