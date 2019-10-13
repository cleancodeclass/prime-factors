package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> of(int number) {
		List<Integer> factors = new ArrayList<Integer>();
		if(number==2) {
			factors.add(2);
		}
		return factors;
	}

}
