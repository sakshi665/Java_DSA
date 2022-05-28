package geekarray;

public class firstandlast {

	static void firstandlastoccurence(int[] arr,int ele)
	{
		int first=-1;
		int last=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				first=i;
				break;
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==ele)
			{
				last=j;
			}
		}
		System.out.print(first+" "+last);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,2,3,4,3,3,7};
      int ele=3;
      firstandlastoccurence(arr,ele);
	}

}
