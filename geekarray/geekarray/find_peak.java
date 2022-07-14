package geekarray;

public class find_peak {
 static void findpeak(int arr[])
 {
	 int n = arr.length;
     if(n==1)
         System.out.print(arr[0]+" ");
     else if(arr[0]>=arr[1])
         System.out.print(arr[0]+" ");
     if(n>2 && arr[n-1]>=arr[n-2])
         System.out.print(arr[n-1]+" ");
     for(int i=1;i<n-1;i++){
         if(arr[i]>=arr[i+1] && arr[i]>=arr[i-1])
             System.out.print(arr[i]+" ");
     }      
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,3,4,5,3,6,7};
        //int ele = 3;
        findpeak(arr);
	}

}
