import tester.Tester;

public class TestCDCollection 
{

	public static void main(String[] args)
	{
		Tester.run(new TestCDCollection());
	}

	public void test(Tester t)
	{
		CDCollection collection = new CDCollection();
		t.checkExpect (collection.numberOfCDs(), 0);
		t.checkExpect(collection.totalCost(), 0.0);
		try
		{
			double ave = collection.averageCost();
			t.fail("failed to catch division by 0 when calculating average cost");
		}
		catch (ArithmeticException e)
		{
			t.success();
		}
		
		collection.add(new CD ("total garbage", "bubba", 5, 12));
		t.checkExpect(collection.numberOfCDs(), 1);
		t.checkExpect(collection.totalCost(), 5.0);
		t.checkExpect(collection.averageCost(), 5.0);
		
		collection.add(new CD("pure noise", "screaming dawgs", 1, 1));
		t.checkExpect(collection.numberOfCDs(), 2);
		t.checkExpect(collection.totalCost(), 6.0);
		t.checkExpect(collection.averageCost(), 3.0);

	}

}