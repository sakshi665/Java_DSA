package geekarray;

import java.util.Scanner;

public class Cheakprime {
	static boolean prime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		return false;
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
	int count=0;
	for(int i=0;i<n;i++)
	{
	if(prime(arr[i])==true)
	{
		count++;
	}
	}
	System.out.println(count);

	}
}