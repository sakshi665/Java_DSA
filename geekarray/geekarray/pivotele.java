package geekarray;

public class pivotele {


		    
		      static int pivot(int[] arr){
		        int n = arr.length;
		        int sum = 0;
		        int leftSum = 0;
		        int rightSum = 0;
		        for(int i=0;i<n;i++)
		            sum = sum+arr[i];
		        
		        for(int i=0;i<n;i++){
		            leftSum = leftSum + arr[i];
		            rightSum = sum - leftSum;
		            if(leftSum == rightSum)
		                return i;
		        }
		        return -1;
		    }
		    
		    
//		    static void printArray(int[] arr){
//		        int n = arr.length;
//		        int i = 0;
//		        while(i<n){
//		            System.out.print(arr[i]+" ");
//		            i++;
//		        }
//		        System.out.println("\n------------");
//		    }
//		    
		    public static void main(String[] args) {
		         int[] arr = {1,-2,2,-4,3,2};
		      
		        System.out.print(pivot(arr));
		     
		    }

	}


