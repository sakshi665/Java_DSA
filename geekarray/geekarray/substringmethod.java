package geekarray;

import java.util.Scanner;

public class substringmethod {
static void methsubstring(String str)
{
	int n=str.length();
	//substring of every character
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n+1;j++)
		{
			for(int k=i;k<j;k++)
			{
				System.out.print(str.charAt(k));
			}
		}
		System.out.print(" ");
	
	}
	//substring 
//	for(int i=0;i<n;i++)
//		{
//				for(int k=0;k<=i;k++)
//				{
//					System.out.print(str.charAt(k));
//				}
//			
//			System.out.print(" ");
//		
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		methsubstring(str);
		
	}

}
