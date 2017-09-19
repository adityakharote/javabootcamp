package assignment1;

import java.util.*;

public class Prices {

	public static void main(String[] args) {
		ArrayList<Pricesinitiate> priceslist = new ArrayList<Pricesinitiate>();
		priceslist.add(new Pricesinitiate(3));
		priceslist.add(new Pricesinitiate(5));
		priceslist.add(new Pricesinitiate(6));
		priceslist.add(new Pricesinitiate(7));
		int priceToBeCompared = 5;

		PriceComparator pc = new PriceComparator();
		pc.getpriceToBeCompared(priceToBeCompared);
		Collections.sort(priceslist, new PriceComparator());
         
		Sorter sort = new Sorter();
		sort.sortPricesByPriceToBeCompared(priceToBeCompared,priceslist);
		
		

	}

}