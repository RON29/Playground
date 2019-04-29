import java.util.Scanner;
class Main{
    public static int max(int a,int b)
    {
      if(a>b)
        return a;
      else
        return b;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int great=max(a,b);
      great=max(great,c);
      System.out.println(great);
		
    }
}