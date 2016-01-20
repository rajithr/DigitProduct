public class DP {
	public static int numCombos(int start, int end, int dp)
	{
		int num = 0;
			
		for(int n=start;(n<10 && n<=end);n++)
		{
			if(n==dp)
				num++;
		}
		
		for(int n=11;(n<100 && n<=end);n++)
		{
			int tens = n / 10;
			int unit = n % 10;
			if(tens * unit == dp)
				num++;
		}
		
		for(int n=101;(n<1000 && n<=end);n++)
		{
			int hundreds = n /100;
			int tens = (n % 100) / 10;
			int unit = n % 10;
			if(hundreds * tens * unit == dp)
				num++;
		}
		
		for(int n=1001;(n<10000 && n<=end);n++)
		{
			int thousands = n / 1000;
			int hundreds = (n%1000) /100;
			int tens = (n % 100) / 10;
			int unit = n % 10;
			if(thousands * hundreds * tens * unit == dp)
				num++;
		}
		
		for(int n=10001;(n<100000 && n<=end);n++)
		{
			int ten_thousands = n / 10000;
			int thousands = (n%10000) / 1000;
			int hundreds = (n%1000) /100;
			int tens = (n % 100) / 10;
			int unit = n % 10;
			if(ten_thousands * thousands * hundreds * tens * unit == dp)
				num++;
		}
		
		return num;
	}
}