package assignment1;

import java.util.ArrayList;
import java.util.Iterator;

public class Sorter {

	public void sortPricesByPriceToBeCompared(int priceToBeCompared, ArrayList<Pricesinitiate> priceslist)
	
	{
		
       ArrayList<Integer> al1 = new ArrayList<Integer>();
       ArrayList<Integer> al2 = new ArrayList<Integer>();
       ArrayList<Integer> al3 = new ArrayList<Integer>();
       for(Pricesinitiate pi : priceslist){  
    	   if ( pi.pricevalue == priceToBeCompared )
    	   {
    		   al1.add(pi.pricevalue);
    	   }
    	   
    	   if ( pi.pricevalue < priceToBeCompared)
    	   {
    		   al2.add(pi.pricevalue);
    	   }
    	   
    	   if ( pi.pricevalue > priceToBeCompared)
    	   {
    		   al3.add(pi.pricevalue);
    	   }
    	   
    	   Iterator itr1 = al1.iterator();
    	   while(itr1.hasNext())
    	   {
    		   System.out.println(itr1.next());
    	   }
    	   
    	   Iterator itr2 = al2.iterator();
    	   while(itr2.hasNext())
    	   {
    		   System.out.println(itr2.next());
    	   }
    	   
    	   Iterator itr3 = al3.iterator();
    	   while(itr3.hasNext())
    	   {
    		   System.out.println(itr3.next());
    	   }
       
		
	}

	
	
	
}
}
