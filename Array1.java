// "static void main" must be defined in a public class.
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int []arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i]==i)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
        
    }
}