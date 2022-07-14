package geekarray;

import java.util.Scanner;

public class printdiagonalofmatrix {
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
	static void diagof2darray(int arr[][])
	 {
		 int n=arr.length;
		 int m=arr[0].length;
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
				 if(i==j)
				 {
				 System.out.print(arr[i][j]+" ");
		 }
			 }
	 //System.out.println();
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
		   diagof2darray(arr);
		   //print2darray(wave2darray(arr));

	}

	}


//time complexity:-O(n^2)