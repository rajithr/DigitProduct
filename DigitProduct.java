public class DigitProduct implements DP.DigitP
{
  public double getDP(String number)
  {
    int product = 1;
    
    for(int n=0;n<number.length();n++)
      product *= Integer.parseInt(number.subString(n,n+1));
      
    return product;
  }
}
