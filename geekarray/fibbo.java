package geekarray;

import java.util.Scanner;

public class fibbo {
	static void fibboseries(int n)
	{
		int a=0,b=1;
		int c=0;
			if(n==1)
			{
				System.out.print(a);
			}
			else if(n==2)
			{
				System.out.print(b);
			}
			else
			{
				for(int i=0;i<n-2;i++)
				{
				 c=a+b;
					a=b;
					b=c;
			
				}
				System.out.print(c);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fibboseries(n);
	
	}

}
