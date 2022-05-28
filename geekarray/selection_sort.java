package geekarray;
import java.util.*;

public class selection_sort {
	static void selectionsort(int arr[])
	{
		for(int j=0;j<arr.length;j++){
            int fixed = j;
            for(int i=j+1;i<arr.length;i++){
                if(arr[fixed]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[fixed];
                    arr[fixed] = temp;
                }
            }
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int []arr=new int[n];
  for(int i=0;i<n;i++)
  {
	  arr[i]=sc.nextInt();
	 }
  selectionsort(arr);
  for(int i=0;i<arr.length;i++)
	 {
	 	System.out.print(arr[i]+" ");
	 }
  
	}

}
