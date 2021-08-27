
public class SimpleCalculator 
{
	
	String getDelimeter(String s)
	{
		if(s.charAt(0) == '/' && s.charAt(1) == '/' )
			return s.substring(2,3);
		return ",";
	}
	
	public int add(String str)
	{
		if(str.length()<2)
		{
			if(str.isEmpty())
				return 0;
			else 
			{
				int num = Integer.parseInt(str);
				System.out.print(num);
				return num;
			}
		}
		else
		{
			str = str.replaceAll("\n", ",");
			String delimeter = getDelimeter(str);
			// String str2 = new String(c); 
			String[] arrOfStr = str.split(delimeter);
			
			int sum = 0;
			for(int i=0;i<arrOfStr.length;i++)
			{
				int num1 = Integer.parseInt(arrOfStr[i]);
				sum += num1;
			}
			return sum;
		}
		
		
		
	}
}
