public class DP {
	public static int numCombos(int start, int end, int dp)
	{
		int num = 0;
			
		//num = handle10(start, end, dp, num);
		
		//num = handle100(start, end, dp, num);
		
		//num = handleK(start, end, dp, num);
		
		//num = handle10K(start, end, dp, num);
		
		num = handleLakh(start, end, dp, num);
		
		return num;
	}

	private static int handle10(int start, int end, int dp, int num) {
		for(int n=start;(n<10 && n<=end);n++)
		{
			if(n==dp)
				num++;
		}
		return num;
	}

	private static int handle100(int start, int end, int dp, int num) {
		if(start < 11)
			start = 11;
		for(int n=start;(n<100 && n<=end);n++)
		{
			int tens = n / 10;
			int unit = n % 10;
			if(tens * unit == dp)
				num++;
		}
		return num;
	}

	private static int handleK(int start, int end, int dp, int num) {
		if(start < 101)
			start = 101;
		for(int n=start;(n<1000 && n<=end);n++)
		{
			int hundreds = n /100;
			int tens = (n % 100) / 10;
			int unit = n % 10;
			if(hundreds * tens * unit == dp)
				num++;
		}
		return num;
	}

	private static int handle10K(int start, int end, int dp, int num) {
		if(start < 1001)
			start = 1001;
		for(int n=start;(n<10000 && n<=end);n++)
		{
			int thousands = n / 1000;
			int hundreds = (n%1000) /100;
			int tens = (n % 100) / 10;
			int unit = n % 10;
			if(thousands * hundreds * tens * unit == dp)
				num++;
		}
		return num;
	}

	private static int handleLakh(int start, int end, int dp, int num) {
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
}
