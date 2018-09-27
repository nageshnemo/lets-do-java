// example of inheritence
//base class =point.java
//derived class = Circle.java




import java.util.Scanner;                                                    //their is another package lang is present in all classes invoked by java
class Circle extends Point {
	protected float radius;
	
	public Circle() {                                                    //default constructor
		super(10,10);                                                //super keyword is used to call the constructor of base class
		radius=10f;
		System.out.println("value of x::"+x);
		System.out.println("value of y::"+y);
		System.out.println("value of radius::"+radius);
	}
	
	public Circle(int x,int y,float radius) {
		super(x,y);
		this.radius=radius;
		System.out.println("value of x::"+x);
		System.out.println("value of y::"+y);
		System.out.println("value of radius::"+radius);

	
	}
	
	public static void main(String []args) {                              //function main recieves an argument of String                       
	Circle c1= new Circle();
	Circle c2= new Circle(2,4,4.09f);
		 	
	}
}