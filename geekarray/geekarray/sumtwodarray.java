package geekarray;
import java.util.*;
public class sumtwodarray {
	static void print2darray(int[][] arr)
	{
		int n=arr.length;
		int m=arr[0].length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
 static int[][] sum2darray(int arr[][],int brr[][])
 {
	 int n=arr.length;
	 int m=arr[0].length;
	 int[][] crr=new int[n][m];
	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<m;j++)
		 {
			 crr[i][j]=arr[i][j]+brr[i][j];
		 }
	 }
	 return crr;
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
    for(int i=0;i<n;i++)
    {
    	for(int j=0;j<m;j++)
    	{
    		brr[i][j]=sc.nextInt();
    	}
    } 
    int[][] subarray=sum2darray(arr,brr);
    print2darray(sum2darray(arr,brr));
	}
}
