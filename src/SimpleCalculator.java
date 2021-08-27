
public class SimpleCalculator 
{

	public int add(String str)
	{
		if(str.length()<2)
		{
			if(str.isEmpty())
				return 0;
			else 
			{
				int num = Integer.parseInt(str);
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
			
			String[] arrOfStr = str.split(delimiter +"|\n");
			
			
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
