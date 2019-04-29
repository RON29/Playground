import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=nsum(n);
      System.out.println(sum);
    }
  public static int nsum(int n)
  {
    if(n==0)
      return 0;
    else
    {
      return (n+nsum(n-1));
      
    }
  }
}