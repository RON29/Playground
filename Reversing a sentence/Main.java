import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      s+=" ";
      String st="";
      String w="";
      for(int i=0;i<s.length();i++)
      {
        char c=s.charAt(i);
        if(c==' ')
        {
          st=w+" "+st;
          w="";
        }
        else
        {
          w+=c;
        }
      }
              System.out.println(st);

    }
    // Function to reverse a string
    //public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    //{
        // Type your code here
    //}
}