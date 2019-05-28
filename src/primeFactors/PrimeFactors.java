package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> of(int i) {
		List<Integer> factors = new ArrayList<Integer>();
		if (i >1) {
			int divisor = 2;
			if(i==4) {
				while(i%divisor==0) {
					factors.add(divisor);
					i/=divisor;
				}
			}else if(i==6){
				for (divisor = 2; i > 1; divisor++) {
					if(i%divisor==0) {
						factors.add(divisor);
						i/=divisor;
					}
				}
			}else if(i==8) {
				factors.add(2);
				factors.add(2);
				factors.add(2);
			}
			else {
				factors.add(i);
				
			}
		}
		return factors;
	}

}
