package geekarray;

public class maxandminele {
 static void diffofmaxandminele(int arr[])
 {
	 int max=Integer.MIN_VALUE;
	 int min=Integer.MAX_VALUE;
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]>max)
		 {
			 max=arr[i];
		 }
		 if(arr[i]<min)
		 {
			 min=arr[i];
		 }
	 }
		 int a=max-min;
	 System.out.print(a);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,7,1,9,8};
		diffofmaxandminele(arr);
	}

}
