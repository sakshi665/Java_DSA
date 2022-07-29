package hashmap;

import java.util.Arrays;
import java.util.HashMap;
public class sortonsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		int arr[]= {-5,0,2,3,-7};
		for(int i=0;i<arr.length;i++)
		{
			int t=arr[i]*arr[i];
			h.put(t,arr[i]);
		}
		for(int x:h.keySet())
		{
			System.out.println(h.get(x));
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		int arr[]= {-5,0,2,3,-7};
//		int n=arr.length;
//		int brr[]=new int[n];
//		for(int i=0;i<arr.length;i++)
//		{
//			brr[i]=arr[i]*arr[i];
//			//System.out.println(brr[i]);
//
//		}
//		Arrays.sort(brr);
//		for(int i=0;i<n;i++)
//		{
//		System.out.print(Math.sqrt(brr[i]));
//		}
		
	}
}
