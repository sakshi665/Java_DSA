package Objectorientedprogramming;
class calc
{
	
	
	int add(int a,int b)
	{
		return a+b;
		
	}
	float add(float a,float b)
	{
		return a+b;
		
	}
	double add(double a,double b)
	{
		return a+b;
		
	}
}
public class additionusingclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc sum=new calc();
		System.out.println(sum.add(6, 9));
		System.out.println(sum.add(8.7, 9.0));
		System.out.println(sum.add(9.8f, 7.8f));

	}

}
