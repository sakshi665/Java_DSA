package hashmap;

import java.util.HashMap;
import java.util.Map;

public class implementhashmapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		 h.put(21,"sak");
		 h.put(20,"sakhi");
		 h.put(87,"gaye");
		 System.out.println(h.get(21));
		 System.out.println(h.remove(87));
		 
		for(Map.Entry<Integer,String> e:h.entrySet())
		 {
			 System.out.println(e.getKey()+"->"+e.getValue());
		 }
//		for(Map.Entry<Integer,String> e : h.entrySet())
//            System.out.println(e.getKey()+" -> "+e.getValue());
		h.put(87, "sam");
		 System.out.println(h.containsKey(87));
		 
	}

}
