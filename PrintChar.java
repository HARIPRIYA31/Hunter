import java.util.*;
public class PrintChar
{
  public static void main(String args[])
  { 
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE STRING");
     String str=sc.nextLine();
     for(int i=0;i<str.length();i=i+2)
     {
       char c=str.charAt(i);
       int value=Integer.parseInt(str.charAt(i+1));
       for(int j=0;j<value;j++)
         System.out.print(c);
      }
    }
 }
