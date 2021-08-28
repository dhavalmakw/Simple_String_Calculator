
public class SimpleCalculator 
{
	private String[] splitNumbers(String str1, String str2) 
	{
		return str1.split(str2);
	}
	public int add(String str) throws Exception
	{ 
		if(str.length()<2)
		{
			
			if(str.isEmpty())
				return 0;
			int num = Integer.parseInt(str);
			if(num<0)
			{
				throw new Exception("negatives not allowed");
			}
			else 
			{
				return num;
			}
		}
		else
		{
	
	        String delimiter = ",";
	        if (str.matches("//(.*)\n(.*)")) 
	        {
	        	delimiter = Character.toString(str.charAt(2));
	            str = str.substring(4);
	        }
			
			String[] arrOfStr = splitNumbers(str,delimiter+"|\n");
			
			int sum = 0;
			for(int i=0;i<arrOfStr.length;i++)
			{
				int num1 = Integer.parseInt(arrOfStr[i]);
				if(num1<0)
				{
					throw new Exception("negatives not allowed");
				}
				else if(num1 < 1000)
					sum += num1;
			}
			return sum;
		}
		
		
	}
}
