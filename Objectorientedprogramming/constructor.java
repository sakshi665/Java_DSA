package Objectorientedprogramming;
class car
{
    String name;
	String color;
	int model;
	float price;

car(String name,String color ,int model,float price)
{
	this.name=name;
	this.color=color;
	this.model=model;
	this.price=price;	
}

void printmodel()
{
	System.out.print(this.model+" ");
}
void b()
{
	System.out.print("1");
}

void a(int c)
{
	System.out.print("3");
}
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car("Alto","White",800,40000);
		c.printmodel();
		c.b();
		c.a(6);
	}
}


