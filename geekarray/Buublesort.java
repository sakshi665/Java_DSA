package geekarray;
import java.util.*;
public class Buublesort {
	
 static void bubblesort(int arr[])
 {
	 for(int j=0;j<=arr.length;j++)
	 {
	   for(int i=0;i<arr.length-1-j;i++)
	    {
		if(arr[i]>arr[i+1])
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
 }
	 //return 0;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
     for(int i=0;i<n;i++)
     {
    	 arr[i]=sc.nextInt();
     }
     bubblesort(arr);
     for(int i=0;i<arr.length;i++)
	 {
	 	System.out.print(arr[i]+" ");
	 }
	}

}
