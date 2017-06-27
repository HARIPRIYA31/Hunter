import java.util.Arrays;
import java.util.Scanner;

public class DivideArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("ENTER SIZE:");
         int size=sc.nextInt();
         int suma=0,sumb=0,avga=0,avgb=0,flag=0;
         System.out.println("ENTER ARRAY ELEMENTS:");
         int arr[]=new int[size];
         for(int i=0;i<size;i++)
         {
        	arr[i]=sc.nextInt(); 
         }
         int a[]=new int[size];
         int b[]=new int[size];
         for(int i=0;i<size;i++)
         {
        	 a=Arrays.copyOfRange(arr, 0, i+1);
        	 b=Arrays.copyOfRange(arr,i+1,size+1);
        	 for(int j=0;j<a.length;j++)
        	 {
        		 suma=suma+a[j];
        	 }
        	 avga=suma/a.length;
        	 for(int k=0;k<b.length;k++)
        	 {
        		 sumb=sumb+b[k];
        	 }
        	 avgb=sumb/b.length;
        	 
        	 if(avga==avgb)
        	   flag++;
      } 
        	 if(flag>0)
        		 System.out.println("POSSIBLE");
        	 else
        		 System.out.println("NOT POSSIBLE");
        	 sc.close();
        	 
         }
	}

