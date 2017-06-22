import java.util.*;
public class Decoder
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String arr[]=str.split("x");
      int num=Character.getNumericValue(arr[0].charAt(arr[0].length()-1));
      char value=arr[1].charAt(0);
      String res="";
      for(int i=0;i<arr[0].length()-1;i++)
         res=res+String.valueOf(arr[0].charAt(i));
      for(int i=0;i<num;i++)
         res=res+String.valueOf(value);
      for(int i=1;i<arr[1].length();i++)
         res=res+String.valueOf(arr[1].charAt(i));
         
       System.out.println(res);
     }
   }
         
      
