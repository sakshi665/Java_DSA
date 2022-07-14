package geekarray;
import java.util.*;
public class alternateele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       for(int i=0;i<str.length();i+=2)
       {
    	   System.out.print(str.charAt(i));
       }
	}

}
