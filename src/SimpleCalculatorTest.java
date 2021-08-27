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
}
