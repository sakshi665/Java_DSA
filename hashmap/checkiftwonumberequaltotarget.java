package hashmap;

import java.util.HashMap;

public class checkiftwonumberequaltotarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		int arr[]= {1,3,4,5};
		int t=9;
		for(int i=0;i<arr.length;i++)
		{
			if(h.containsKey(t-arr[i]))
			{
				System.out.println("true");
				return;
		}
			else
			{
				h.put(arr[i], 1);
			}
		}
			System.out.println("False");
	}

}
