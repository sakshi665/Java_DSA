package Objectorientedprogramming;

public class classobjcreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		class Human {
		    int age;
		    int height;
		    
		    Human(int age, int height){
		        this.age = age;
		        this.height = height;
		    
		    }
		}
		    
		class ParentClass{
		    int a = 5;
		    protected String name = "Akarsh";
		}

		class ChildClass extends ParentClass{
		    private int age = 89;
		}
		        //Object, Class, Constructor
		         Human akarsh = new Human(23,167);
		         System.out.println(akarsh.age);
		        
		         Human aishwarya = new Human(43,167);
		         System.out.println(aishwarya.age);
		        
		        //Inheritance
		        ChildClass cc = new ChildClass();
		        System.out.println(cc.name);
		        //System.out.println(cc.age);
		        
		        //Polymorphism
		        System.out.println();
	
		        
		    }
		
	}


