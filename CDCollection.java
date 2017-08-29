import java.text.NumberFormat;
import java.util.Collection;


public class CDCollection 
{
	
	private CD[] collection;
	private int count;
	private double totalCost;
	private CD[] nlist;


	
	
	public CDCollection()
	{
		collection = new CD[10];
		count = 0;
		totalCost = 0.0;
		
		

	}

	public Integer numberOfCDs() 
	{
		
		
		return count;
	}

	public Double totalCost() 
	{
		double k=0;
		
	  for( int i = 0; i < count; i++)
		  k+= collection[i].getCost();
	  
		return k;
	}

	public double averageCost() 
	{
		if(count == 0)
			throw new ArithmeticException (" collection cannot be empty");
		
		return (totalCost()/ numberOfCDs());
	}

	public void add(CD cd) 
	{
		if(count == collection.length)
			nlist = new CD [collection.length *2];
	 collection[count]= cd;
	 count++;
		
	}
	public void remove(CD item)
	{
		collection[count] = collection[count-1];
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		for(int j = 0; j < collection.length; j++  )
		{
			CD lo = collection[j];
		}
		 return "collection is " + collection;
	}

}
