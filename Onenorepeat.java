import java.util.*;
public class onenorepeat
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER ARRAY SIZE:");
    int size=sc.nextInt();
    int count=0;
    System.out.println("ENTER ARRAY ELEMENTS");
    int arr[]=new int[size];
    for(int i=0;i<size;i++)
       arr[i]=sc.nextInt();
   for(int j=0;j<size;j++)
   {
     for(int k=0;k<size;k++)
     {
       if(arr[j]==arr[k] && j!=k)
          count++;
     }
       if(count==0)
        {
          System.out.println(arr[j]);
          break;
         }
        
        }
     }
}



