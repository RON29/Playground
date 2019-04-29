import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=nsum(n);
      System.out.println(sum);
    }
  public static int nsum(int n)
  {
    if(n==1)
      return 1;
    else
    {
      return (n*nsum(n-1));
      
    }
  }
  
}