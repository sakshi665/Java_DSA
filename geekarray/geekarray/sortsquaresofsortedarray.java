package geekarray;

public class sortsquaresofsortedarray {
	public static void main(String[] args) {
	
	int arr[]= {-6,-3,-1,2,4,5};
	int arr1[]= {};
	int arr2[]= {};
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		if(arr[i]<0)
		{
			arr1[i]=arr[i];
		}
		else
		{
			arr2[i]=arr[i];
		}
	}
	for(int i=0;i<arr1.length;i++)
	{
	  arr1[i]=arr1[i]*arr1[i];	
	}
	for(int i=0;i<arr2.length;i++)
	{
	  arr2[i]=arr2[i]*arr2[i];	
	}
	
	int i=0;
    int j=arr1.length-1;
    
    while(i<=j)
    {
    	
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
    int i1=arr1[0];
    int i2=arr2[0];
    for(int j1=0;j1<n;j1++)
    {
    	if(arr1[i1]<arr2[i2])
    	{
    		
    	}
    	
    }
    	
    
}
}
