package geekarray;

public class bythreeptrcountonetwoanzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {0,1,2,1,1,2,0,2,0,1,0};
        int n = arr1.length;
        int i = 0;
        int j = 0;
        int k = n-1;
        while(j<=k){
            if(arr1[j]==0){
                int temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
                j++;
                i++;
            }
            else if(arr1[j]==1){
                j++;
            }
            else{
                int temp = arr1[k];
                arr1[k] = arr1[j];
                arr1[j] = temp;
                k--;
            }
        }
        for(int i1=0;i1<n;i1++)
        {
        	System.out.print(arr1[i1]+" ");
        }
	}
}
