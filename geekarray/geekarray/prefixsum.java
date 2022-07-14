package geekarray;

public class prefixsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,5,7,8};
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{
			sum=sum+arr1[i];
			arr1[i]=sum;
			System.out.println(arr1[i]);
		}
	}

}
