import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    s+=" ";
    String w="";
    String st="";
    for(int i=0;i<s.length();i++)
    {
      char c=s.charAt(i);
      if(c==' ')
      {
        int r=s.indexOf(w);
        if(r>=(i-w.length()))
        {
          st+=w+" ";
        }
        w="";
      }
      else
        w+=c;
      
      
    }
      
    System.out.println(st);
  }
}