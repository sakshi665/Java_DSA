
package Geeks;
import java.util.Scanner;
public class LinearSearch{
static int search(int[] arr,int ele)
{
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==ele)
        {
            return i;
        }
    }
    return -1;
}
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int c=search(arr,n);
    System.out.println(c); 
}
}