package geekarray;
import java.util.*;
public class sumingivenrange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int p = 0,q = 0;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a=sc.nextInt();
		//int sum=0;
		
	    for(int i=0;i<a;i++)
		{
	    	int sum=0;
	    	int p=sc.nextInt();
			 int q=sc.nextInt();
			 for(int i1=p-1;i1<q;i1++)
				{
					sum=sum+arr[i1];
				}
			
			 System.out.print(sum);
	}
	
}
	}


