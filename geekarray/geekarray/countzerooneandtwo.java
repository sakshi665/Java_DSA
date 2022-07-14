package geekarray;

public class countzerooneandtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr2 = {0,1,2,1,1,2,0,2,0,1,0};
       int  n = arr2.length;
       int count0 = 0;
       int count1 = 0;
       for(int i=0;i<n;i++){
           if(arr2[i]==0)
        	   count0++;
           else if(arr2[i]==1)
               count1++;
       }
       System.out.println(count0+" "+count1);
       for(int i=0;i<count0;i++)
           arr2[i] = 0;
       for(int i=count0;i<count1+count0;i++)
		 arr2[i] = 1;
       for(int i=count1+count0;i<n;i++)
           arr2[i] = 2;
	
 for(int i=0;i<n;i++)
 {
	 System.out.println(arr2[i]);
 }
}
}
