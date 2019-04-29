import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    int l=st.length();
    String st1="";
    int k=0;
    for(int i=0;i<l;i++)
    {
      for(int j=l-1;j>i;j--)
        System.out.print(" ");
      if(i<=l/2)
      {
        st1+=st.charAt(l/2+i);
        System.out.println(st1);
      }
      else
      {
        st1+=st.charAt(k++);
        System.out.println(st1);
      }
    }
  }
}