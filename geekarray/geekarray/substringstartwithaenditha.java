package geekarray;

import java.util.Scanner;

public class substringstartwithaenditha {
	static void countAndMaxLengthSubstring(String str){
        int n = str.length();
        int count = 0;
        int len = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n+1;j++){
                char first = '-';
                char last = '-';
                for(int k=i;k<j;k++){
                    char ch = str.charAt(k);
                    if(first=='-')
                        first = ch;
                    last = ch;
                    
                }
                if(first=='a' && last=='a'){
                    count++;
                    len = Math.max(len,j-i);
                }
            }
        }
        System.out.println(count+" "+len);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		countAndMaxLengthSubstring(str);

	}

}
