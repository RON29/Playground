import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int s=1;
      for(int i=1;i<=n;i++)
        s*=i;
      System.out.println(s);
	}
}