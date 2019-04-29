import java.util.Scanner;
class Main{
    public static int pow(int n,int m){
      int x=1;
      for(int i=1;i<=m;i++)
        x=x*n;
      return x;
    
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int p=pow(n,m);
      System.out.println(p);
	}
}