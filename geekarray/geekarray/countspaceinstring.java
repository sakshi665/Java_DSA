package geekarray;
import java.util.*;
public class countspaceinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in).useDelimiter("\n");
      String str=sc.next();
      int count=0;
      for(int i=0;i<str.length();i++)
      {
      if(str.charAt(i)==' ')
      {
    	  count++;
      }

	}
      System.out.print(count);

}
}
