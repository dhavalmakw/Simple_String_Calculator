
import junit.framework.TestCase;

public class SimpleCalculatorTest extends TestCase 
{
	SimpleCalculator simpleCalculator;
	public void setUp()
	{
		simpleCalculator = new SimpleCalculator();
	}
	
	public void testEmptyString()
	{
		assertTrue(simpleCalculator.add("") == 0);
	}
	
	public void testForFirstString()
	{
		assertTrue(simpleCalculator.add("2") == 2);
	}
	
	public void testFortwotString()
	{
		assertTrue(simpleCalculator.add("5,3") == 8);
	}
	
	public void testForMultipletString()
	{
		assertTrue(simpleCalculator.add("1,2,3,4") == 10);
	}
	
	public void testForNewlinetString()
	{
		assertTrue(simpleCalculator.add("1\n4,3") == 8);
	}
}
