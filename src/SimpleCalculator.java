
public class SimpleCalculator {

	public SimpleCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public int add(String str)
	{
		if(str.isEmpty())
			return 0;
		if(str.length() == 1)
		{
			int num = Integer.parseInt(str);
			return num;
		}
		
		str = str.replaceAll("\n", ","); 
		String[] arrOfStr = str.split(",");
		
		int sum = 0;
		for(int i=0;i<arrOfStr.length;i++)
		{
			int num1 = Integer.parseInt(arrOfStr[i]);
			sum += num1;
		}
		return sum;
		
	}
}
