import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=n;
      int s=0;
	  while(x>0)
      {
        int d=x%10;
        int m=1;
      	for(int i=1;i<=d;i++)
        	m*=i;
        s+=m;
        x/=10;
      }
      if(s==n)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}