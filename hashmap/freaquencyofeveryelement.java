package hashmap;

import java.util.HashMap;
import java.util.Map;

public class freaquencyofeveryelement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		int arr[]= {5,6,6,7,5,7,7};
		for(int i=0;i<arr.length;i++)
		{
			if(h.containsKey(arr[i]))
			{
				h.put(arr[i],h.get(arr[i])+1
						
						);
		}
			else
			{
				h.put(arr[i], 1);
			}
		}
		
		//System.out.println(h);
		int maxFreq = 0;
        int maxEle = -1;
        for(Map.Entry<Integer,Integer> mm : h.entrySet()){
            if(mm.getValue()>maxFreq){
                maxFreq = mm.getValue();
                maxEle = mm.getKey();
            }
        }
        System.out.println(maxEle);
        

}
}
