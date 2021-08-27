
import junit.framework.TestCase;

public class SimpleCalculatorTest extends TestCase 
{
	SimpleCalculator simpleCalculator;
	public void setUp()
	{
		simpleCalculator = new SimpleCalculator();
	}
	
	public void testEmptyString() throws Exception
	{
		assertTrue(simpleCalculator.add("") == 0);
	}
	
	public void testForFirstString() throws Exception
	{
		assertTrue(simpleCalculator.add("2") == 2);
	}
	
	public void testFortwotString() throws Exception
	{
		assertTrue(simpleCalculator.add("5,3") == 8);
	}
	
	public void testForMultipletString() throws Exception
	{
		assertTrue(simpleCalculator.add("1,2,3,4") == 10);
	}
	
	public void testForNewlinetString()  throws Exception
	{
		assertTrue(simpleCalculator.add("1\n4,3") == 8);
	}

	public void testDiffDelimiterString() throws Exception
	{
		assertTrue(simpleCalculator.add("//;\n1;2") == 3);
	}
	
	public void testForNegativeString() throws Exception
	{
		try 
		{
			simpleCalculator.add("-1,-2");
		    fail("Missing exception");
		} 
		catch( Exception e ) 
		{
			if(!e.getMessage().contains("negatives not allowed"))
			{
				throw new Exception("Test case faild");
			}
		}
	}
}
