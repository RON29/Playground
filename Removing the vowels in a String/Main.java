import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String st="";
    for(int i=0;i<s.length();i++)
    {
      char c=s.charAt(i);
      if(c!='A' && c!='E' && c!='I' && c!='O' && c!='U' && c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
        st+=c;
      
    }
    System.out.println(st);
  }
}