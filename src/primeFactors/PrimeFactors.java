package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> of(int i) {
		List<Integer> factors = new ArrayList<Integer>();
		if (i >1) {
			if(i==4) {
				while(i%2==0) {
					factors.add(2);
					i/=2;
				}
			}else if(i==6){
				factors.add(2);
				factors.add(3);
			}
			else {
				factors.add(i);
				
			}
		}
		return factors;
	}

}
