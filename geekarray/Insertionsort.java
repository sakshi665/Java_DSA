package geekarray;
import java.util.*;
public class Insertionsort {
static void insertionsort(int[] arr)
{
	for(int i=0;i<arr.length;i++)
	{
	int j=i-1;
	while(j>0 && arr[j]>arr[j+1])
	{
		int temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
		j--;
		
	}
	}
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	System.out.print(arr[i]+" ");
}
insertionsort(arr);
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
}
}