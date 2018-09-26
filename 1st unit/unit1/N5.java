import java.util.Scanner;
class N5{
	public static void main(String args[]){
		int p,t;
		double r;
		Scanner b = new Scanner(System.in);
		System.out.println("enter principle");
		p=b.nextInt();
		System.out.println("enter time");
		t = b.nextInt();				  
		System.out.println("enter rate");
		r = b.nextDouble();
		System.out.println("simple interest is :"+(p*r*t)/100);	
			
		

	}	
}