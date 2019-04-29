import java.util.Scanner;
class Main
{
  	public static int pow(int n)
    {
      return n*n;
    }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      n=pow(n);
      System.out.println(n);
	} 
}