package geekarray;
import java.util.*;
public class paliornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
        int i=0;
        int j=n-1;
        boolean flag=true;
        while(i<=j)
        {
            if(arr[i]!=arr[j])
            	flag=false;
            i++;
            j--;
        }
      
            System.out.println(flag);
        }
  
	}


