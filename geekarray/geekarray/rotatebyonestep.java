package geekarray;

public class rotatebyonestep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     int []arr= {1,5,7,6,4,3};
     int x=arr[(arr.length-1)];
     for(int i=arr.length-1;i>0;i--)
     {
    	 arr[i]=arr[i-1];
     }
     arr[0]=x;
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}

}
}
