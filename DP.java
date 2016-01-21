public class DP {
	public static int numCombos(int start, int end, int dp)
	{
		return handleLakh(start, end, dp);
	}

	private static int handleLakh(int start, int end, int dp) {
		int num = 0;
		
		for(int n=start;(n<100000 && n<=end);n++)
		{
			int ten_thousands = n / 10000;
			if(n < 10000 && ten_thousands == 0)
				ten_thousands = 1;
			int thousands = (n%10000) / 1000;
			if(n < 1000 && thousands == 0)
				thousands = 1;
			int hundreds = (n%1000) /100;
			if(n < 100 && hundreds == 0)
				hundreds = 1;
			int tens = (n % 100) / 10;
			if(n < 10 && tens == 0)
				tens = 1;
			int unit = n % 10;
			if(ten_thousands * thousands * hundreds * tens * unit == dp)
				num++;
		}
		
		return num;
	}
	
	public interface DigitP
	{
		public double getDP(String number);
	}
}
