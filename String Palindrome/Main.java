import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String s="";
      for(int i=0;i<str.length();i++)
      {
        s=str.charAt(i)+s;
      }
      if(s.equals(str)==true)
        System.out.println("Yes");
      else     
        System.out.println("No");

        
    } 
}