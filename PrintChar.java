import java.util.*;
public class PrintChar
{
  public static void main(String args[])
  { 
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE STRING LENGTH");
     int n=sc.nextInt();
    int num=0;
    String value="";
     for(int i=0;i<n;i=i+2)
     {
       value=sc.nextLine();
       num=sc.nextInt();
       if(num!=0)
       {
       for(int j=0;j<num;j++)
         System.out.print(value);
       }
      }
    }
 }
