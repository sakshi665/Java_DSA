package geekarray;

public class reversebytwoptr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] arr={1,2,3,2,1};
		        int n=arr.length;
		        int i=0;
		        int j=n-1;
		        
		        while(i<=j)
		        {
		            int temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		            i++;
		            j--;
		        }
		        i=0;
		        while(i<n)
		        {
		            System.out.println(arr[i]+" ");
		            i++;
		        }
		  
	}

}
