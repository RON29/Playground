import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int s=0;
      while(n>0)
      {
        int d=n%10;
        s+=d;
        n=n/10;
        
      }
      System.out.println(s);
	}
}