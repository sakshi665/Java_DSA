package April_07_2022;
import java.util.Scanner;
public class primenum {

	public static void main(String[] args) {
     		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int i=0;
		int num=0;
		
     for(i=2;i<=n;i++)
     {
    	 int counter=0;
    	 for(num=2;num<=i/2;num++)
    	 {
    		 if(i%num==0)
    		 {
    			 counter=counter+1;
    			 break;
    		 }
    	 }
    	 if(counter==0)
    	 {
    		 System.out.println(i);
    	 }	
     }
}
}