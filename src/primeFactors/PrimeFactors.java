package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> of(int number) {
		List<Integer> factors = new ArrayList<Integer>();
		int divisor = 2;
		while(number>1) {
			while(number % divisor == 0) {
				factors.add(divisor);
				number /= divisor;
			}
			divisor++;
		}
		return factors;
	}

}
