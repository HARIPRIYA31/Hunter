public class FirstString
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER STRING ARRAY LENGTH");
    int len=sc.nextInt();
    String arr[]=new String[len];
    for(int i=0;i<len;i++)
       arr[i]=sc.next();
    for(int j=0;j<len;j++)
    {
      if(arr[j].length()==1)
      {
         System.out.println(arr[j]);
         break;
       }
      }
    }
  }
