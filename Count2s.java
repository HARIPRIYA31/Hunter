import java.util.Scanner;
public class Count2s
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER SIZE:");
      int size=sc.nextInt(),count=0;
      System.out.println("ENTER ELEMENTS");
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
         arr[i]=sc.nextInt();
      for(int j=0;j<size;j++)
      {
         String str=String.valueOf(arr[j]);
         if(str.contains("2"))
            count++;
       }
       System.out.println("NO. OF 2s:"+count);
    }
 }
