package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> of(int number) {
		List<Integer> factors = new ArrayList<Integer>();
		if(number>1) {
			while(number % 2 == 0) {
				factors.add(2);
				number /= 2;
			}
			if(number >1) {
				factors.add(number);
			}
		}
		return factors;
	}

}
