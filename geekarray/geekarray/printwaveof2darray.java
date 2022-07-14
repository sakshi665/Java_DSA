package geekarray;
import java.util.*;
public class printwaveof2darray {

	static void print2darray(int[][] arr)
	{
		int n=arr.length;
		int m=arr[0].length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void wave2darray(int arr[][])
	 {
		 int n=arr.length;
		 int m=arr[0].length;
		 for(int i=0;i<n;i++)
		 {
			 if(i%2==0)
			 {
				 for(int j=0;j<m;j++)
				 {
					 System.out.print(arr[i][j]+" ");
				 }
			 }
			 else
			 {
				 for(int j=m-1;j>=0;j--)
				 {
					 System.out.print(arr[i][j]+" ");
				 }
			 }
			 System.out.println();
		 }
	 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int arr[][]=new int[n][m];
   int brr[][]=new int [n][m];
   for(int i=0;i<n;i++)
   {
   	for(int j=0;j<m;j++)
   	{
   		arr[i][j]=sc.nextInt();
   	}
   }
   wave2darray(arr);
   //print2darray(wave2darray(arr));
	}

}
