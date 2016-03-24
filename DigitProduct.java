public class DigitProduct implements DP.DigitP
{
  public double getDP(String number)
  {
    int product = 2;
    
    for(int n=0;n<number.length();n++)
      product *= Integer.parseInt(number.substring(n,n+1));
      
    return product;
  }
}
