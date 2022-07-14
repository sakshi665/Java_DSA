package geekarray;
import java.util.*;
public class uniquecharacters {
    static boolean unique(String str)
    {
    	//int max=Integer.MIN_VALUE;
    	 int n=str.length();
    	 int c=0;
    	 boolean flag=false;
    	 int arr[]=new int[256];
    	 str=str.toLowerCase();
    	 for(int i=0;i<n;i++)
    	 {
    		 
    		 int idx=str.charAt(i);
    		 arr[idx]+=1;
    	 }
    	 for(int i1=0;i1<256;i1++)
    	 {
            if(arr[i1]>0)
            {
            	c++;
            }

    	}
    	 if(c==1)
    	 {
    	 return true;
    	 }
    	 return false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String str=sc.next();
    System.out.print( unique(str));
     
     
	}

}
