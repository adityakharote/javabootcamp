package assignment1;

import java.util.ArrayList;
import java.util.Comparator;

class PriceComparator implements Comparator {

	public int priceToBeCompared;
	public int compare(Object o1, Object o2) {
		Pricesinitiate p1 = (Pricesinitiate) o1;
		Pricesinitiate p2 = (Pricesinitiate) o2;
		if (p1.pricevalue == p2.pricevalue)
			return 0;
		else if (p1.pricevalue > p2.pricevalue && p1.pricevalue != priceToBeCompared)
			return 1;
		else
			return -1;

	}

	public void getpriceToBeCompared(int priceToBeCompared) {
		this.priceToBeCompared = priceToBeCompared;
		
		
		
	}
	
	

}