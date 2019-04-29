import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=n;
      int c=0;
      while(x>0)
      {
        x/=10;
        c++;
      }
      
      x=n;
      int s=0;
      while(x>0)
      {
        int d=x%10;
        s+=(int)Math.pow(d,c);
        x/=10;
      }
      if(s==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}