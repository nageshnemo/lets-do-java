import java.util.Scanner;
class N2{
	public static void main(String args[]){
		float r,a=0,c=0;
		Scanner b = new Scanner(System.in);    //a is object of class Scanner which is used to take the input from user
		System.out.println("enter radius");
		r = b.nextFloat();
		a = 3.14f*r*r;
		c = 2*3.14f*r;
		System.out.println("area is :"+a);		
		System.out.println("circumference is :"+c);
	}	
}