package geekarray;
import java.util.*;
public class countminmaxdiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          String str=sc.next();
          int i;
          int j=0;
          int ch[]=new int[str.length()];
          for(i=0;i<str.length();i++)
          {
        	  if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
        	  {
        		  ch[j]= i;
        		  j++;
              }  
          }
          ch=Arrays.copyOf(ch, j);
          System.out.println("max="+(ch[ch.length-1]-ch[0]));
          int min=Integer.MAX_VALUE;
          for(int i1=0;i1<ch.length-1;i1++)
          {
        	   min=Math.min(min,ch[i1+1]-ch[i1]);
          }
          System.out.println("min=" +min);
	}

}
