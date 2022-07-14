package geekarray;

import java.util.Scanner;

public class substringwithzerovowels {

	
		// TODO Auto-generated method stub
		
		static void zerovowel(String str)
		{
			int n=str.length();
			//substring of every character
			int count=0;
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n+1;j++)
				{
					boolean flag=true;
					for(int k=i;k<j;k++)
					{
						//boolean flag=true;
					    char ch=str.charAt(k);
					    ch=Character.toLowerCase(ch);
					    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					    {
					    	flag=false;
					    }
					}
					if(flag==true)
					{
						count++;
					}
					
					}
					
				System.out.print(" ");
			}
			System.out.print(count);
			
		}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				String str=sc.next();
				zerovowel(str);
				
			}

		}

