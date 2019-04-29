import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String s1=sc.nextLine();
      s+=s;
      int l=s.indexOf(s1);
      if(l>=0)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}