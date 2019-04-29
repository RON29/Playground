import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int s=n%10;
      int d=0;
      while(n>0)
      {
        d=n%10;
        n=n/10;
      }
      s=s+d;
      System.out.println(s);
	}
}