import java.util.Arrays;


public class Sum2numbers {

	public static void main(String[] args) {
		
		int arr[]=new int[args.length-1];
		int sum=0,flag=1;;
		for(int i=0;i<args.length-1;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		int target=Integer.parseInt(args[arr.length]);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
        	if(i!=arr.length-1)
        	{
        	   for(int j=i+1;j<arr.length;j++)
        	   {
        		   sum=arr[i]+arr[j];
        		   if(sum==target)
        		   {
        			   System.out.println("NUMBERS ARE:"+arr[i]+" "+arr[j]);
        			   flag=0;
        			   break;
        		   }
        		   
        	   }
        	}
        }
        if(flag!=0)
        		System.out.println("No Matches");
            

}
}
