package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> of(int number) {
		List<Integer> factors = new ArrayList<Integer>();
		if(number>1) {
			int divisor = 2;
			while(number % divisor == 0) {
				factors.add(divisor);
				number /= divisor;
			}
			divisor++;
			
			while(number % divisor ==0) {
				factors.add(divisor);
				number /= divisor;
			}
			if(number >1) {
				factors.add(number);
			}
		}
		return factors;
	}

}
