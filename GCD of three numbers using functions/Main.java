import java.util.Scanner;
public class Main{
	public static int min(int a,int b)
    {
      if(a>b)
        return b;
      else
        return a;
    }
  	public static int gcd(int a,int b)
    {
       int m=min(a,b);
       for(int i=m;i>=1;i--)
       {
         if(a%i==0 && b%i==0)
           return i;
       }
      return 1;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int great=gcd(a,b);
      great=gcd(great,c);
      System.out.println(great);
		
    }
	
}