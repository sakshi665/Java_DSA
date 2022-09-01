package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap<Integer,String> map=new HashMap<Integer,String>();
 
 //insertion
 //hash maps are unordered pair 
 
 map.put(1,"dubai");
 map.put(2, "goa");
 map.put(3, "new york");
 
 System.out.println(map);
 
 map.put(2, "delhi");
 System.out.println(map);
 
 
 //search
 if(map.containsKey(2))
 {
	 System.out.println(true);
 }
 else
 {
	 System.out.println(false);
 }
 
 System.out.println(map.get(2));
 System.out.println(map.get(31));
 
 int arr[]= {1,2,3};
 for(int val:arr)
 {
	 System.out.println(val);
 }
 //1
 for(Entry<Integer, String> e: map.entrySet())
 {
	 System.out.print(e.getKey());
	 System.out.println(e.getValue());
 }
 
 //2
 
 Set<Integer> keys=map.keySet(); 
 for(Integer key:keys)
 {
	 System.out.println(key+" "+map.get(key));
 }
 
 map.remove(1);
 System.out.println(map);
 
	}

}
