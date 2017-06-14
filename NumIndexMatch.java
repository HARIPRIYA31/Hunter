public class NumIndexMatch {

	public static void main(String[] args) {
		int arr[]=new int[args.length];
		int count=0;
		for(int i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		for(int com=0;com<arr.length;com++)
		{
			if(arr[com]==com)
			{
				System.out.println(com);
				count++;
			}
		}
			if(count==0)
				System.out.println("NO MATCHES");
				
		

		
	}

}
