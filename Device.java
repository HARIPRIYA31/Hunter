import java.util.*;
import java.lang.*;
public class Device
{
public static void main(String args[])
{
   int arr[]=new int[args.length];
   String ans="";
   for(int i=0;i<args.length;i++)
     arr[i]=Integer.parseInt(args[i]);
    Arrays.sort(arr);
    for(int j=1;j<=arr.length;j++)
    {
    if(j%3!=0)
      ans=ans+String.valueOf(arr[j]);
     else
      ans=ans+String.valueOf(arr[j])+",";
     }
     System.out.println(ans);
    }
   }
   
   
