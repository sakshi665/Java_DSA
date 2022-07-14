package geekarray;

import java.util.Scanner;

public class printsumofindices {
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
	static void indexof2darray(int arr[][])
	 {
		 int n=arr.length;
		 int m=arr[0].length;
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
				 System.out.print((i+j)+" ");
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
		   indexof2darray(arr);
		   //print2darray(wave2darray(arr));

	}

}
