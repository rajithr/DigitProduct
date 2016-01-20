import static org.junit.Assert.*;

import org.junit.Test;

public class TestDP extend TestCase {
	int input[][] = {
						{1,2,3,0},
						{1,3,3,1},
						{1,3,2,1},
						{1,9,8,1},
						{1,9,9,1},
						{1,11,1,2},
						{2,12,2,2},
						{3,12,2,1},
						{2,11,2,1},
						{3,18,8,2},
						{1,25,8,3},
						{1,50,18,2},
						{1,100,6,5},
						{1,100,48,2},
						{1,150,6,8},
						{1,1000,20,11},
						{1,1000,12,19},
						{1,1000,24,25},
						{1,1000,48,23},
						{1,10000,24,89},
						{1,10000,48,111},
						{1,100000,24,239},
						{1,100000,48,366},
						{0,0,0,0} //last row
					};
		
	@Test
	public void test() {
		int n = 0;
		
		while(true)
		{
			if(input[n][1] != 0)
			{
				int res = DP.numCombos(input[n][0], input[n][1], input[n][2]); 
				if(res != input[n][3])
					fail(input[n][0]+" "+input[n][1]+" "+input[n][2]+"="+res+"!="+input[n][3]);
				n++;
			}
			else
				break;
		}
	}

}
