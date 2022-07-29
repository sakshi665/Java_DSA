package Objectorientedprogramming;
class cal
{
	 int a;
	 float b;
	 double c;
	public cal(int a,float b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	void s3(int m,int n)
	{
		System.out.println(m+n);
	}
	void s1(float m,float n)
	{
		System.out.println(m+n);
	}
	void s2(double m,double n)
	{
		System.out.println(m+n);
	}
}
public class additionusingconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal sum=new cal(2,5.6f,8.0);
	    sum.s3(5,6);
		
	}

}
