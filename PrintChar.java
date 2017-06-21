import java.util.*;
public class PrintChar
{
  public static void main(String args[])
  { 
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE STRING");
    String str=sc.next();
    char value=' ';
    int num=0;
    for(int i=0;i<str.length();i+=2)
{
value=str.charAt(i);
num=Character.getNumericValue(str.charAt(i+1));
       for(int j=0;j<num;j++)
         System.out.print(value);
       }
      
    }
 }
