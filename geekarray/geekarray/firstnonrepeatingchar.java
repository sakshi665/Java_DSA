package geekarray;
import java.util.*;
public class firstnonrepeatingchar {
   static void nonrepeat(String str)
   {
	   int n=str.length();
	   str=str.toLowerCase();
	   //int count=0;
	   for(int i=0;i<n;i++)
	   {
		   int count=0;
		   for(int j=i+1;j<n-1;j++) {
	   if(str.charAt(i)==str.charAt(j))
	   {
		   count++;
		   
	   }
	   }
	   if(count==0)
	   {
		   System.out.print(str.charAt(i));
		   break;
	   }
	   }
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    nonrepeat(str);
	}

}
