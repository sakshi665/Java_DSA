package geekarray;
import java.util.*;
public class cheakifstringisbalanced {
static boolean isbalanced(String str)
{
	int n=str.length();
	int m=n/2;
	int sum=0;
	int sum1=0;
	for(int i=0;i<m;i++)
	{
		sum=sum+str.charAt(i);
	}
	if(n%2==0)
	{
	for(int i=m;i<n;i++)
	{
	sum1=sum1+str.charAt(i);	
	}
	}
	else
	{
		for(int i=m+1;i<n;i++)
		{
		sum1=sum1+str.charAt(i);	
		}	
	}
	return sum==sum1;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		System.out.println(isbalanced(str));

}
}
