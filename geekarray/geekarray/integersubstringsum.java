package geekarray;

import java.util.Scanner;

public class integersubstringsum {
  static int substringsum(String str)
  {
	  int n=str.length();
	  int sum=0;
		//substring of every character
		for(int i=0;i<n;i++)
		{
			//String temp="";
			for(int j=i+1;j<n+1;j++)
			{
				String temp="";
				for(int k=i;k<j;k++)
				{
				   temp=temp+str.charAt(k);
				}
				sum=sum+Integer.parseInt(temp);
			}
		}
	  return sum;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(substringsum(str));

	}

}
