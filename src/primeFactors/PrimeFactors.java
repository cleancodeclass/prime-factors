package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> of(int i) {
		List<Integer> factors = new ArrayList<Integer>();
		if (i > 1) {
			int divisor = 2;
			if (i == 4 || i == 6 || i == 8 || i == 12) {
				for (divisor = 2; i > 1; divisor++) {
					while (i % divisor == 0) {
						factors.add(divisor);
						i /= divisor;
					}
				}
			} else {
				factors.add(i);

			}
		}
		return factors;
	}

}
