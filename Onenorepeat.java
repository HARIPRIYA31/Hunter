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
    Arrays.sort(arr);
   for(int j=0;j<size;j+=2)
   {
     if(j<size-1)
     
     {
       if(arr[j]!=arr[j+1])
       {
          System.out.println(arr[j]);
          break;
         }
        
     }
     }
     }
}



