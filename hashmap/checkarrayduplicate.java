package hashmap;

import java.util.HashMap;

public class checkarrayduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		int arr[]= {30,10,20,40,30};
		for(int i=0;i<arr.length;i++)
		{
			if(h.containsKey(arr[i]))
			{
				System.out.println("false");
				return;
		}
			else
			{
				h.put(arr[i], 1);
			}
		}
			System.out.println("true");
	}

}
