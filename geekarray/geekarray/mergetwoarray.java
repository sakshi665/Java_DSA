package geekarray;

public class mergetwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr1[]= {1,3,5,7};
        int arr2[]= {2,6,8};
        int n=arr1.length;
        int m=arr2.length;
        int i=0,j=0,k=0;
        int[] arr3 = new int[n+m]; 
        while(i<n && j<n+m){
            if(arr1[i]<arr2[j]){
                arr3[k] = arr1[i];
                k++;
                i++;
            }
            else{
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            arr3[k] = arr1[i];
            k++;
            i++;
        }
        while(j<m){
            arr3[k] = arr2[j];
            k++;
            j++;
        }
        for(int i1=0;i1<arr3.length;i1++)
        {
        	System.out.print(arr3[i1]);
	}
	}
}


