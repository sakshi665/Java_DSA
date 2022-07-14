package geekarray;
import java.util.*;
public class removedupliandsort {
 static void duli(String str)
 {
	 int n=str.length();
	 int arr[]=new int[26];
	 //int count =0;
	 str=str.toLowerCase();
	 for(int i=0;i<n;i++)
	 {
		 
		 int idx=str.charAt(i)-97;
		 arr[idx]+=1;
	 }
	 String s=" ";
	 for(int i=0;i<26;i++)
	 {
		 if(arr[i]>=1)
		 {
			 s=s+(char)(i+97);
		 }
	 }
	 System.out.print(s);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc=new Scanner(System.in);
	 String str=sc.next();
	 duli(str);
	}

}
