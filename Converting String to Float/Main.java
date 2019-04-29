import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int l=s.indexOf('.');
    if(l<0)
      s=s+".000000";
    else
    {
      int k=s.length()-1;
      for(int i=0;i<6-(k-l);i++)
		s+="0";
    }
    System.out.println(s);
  }
}