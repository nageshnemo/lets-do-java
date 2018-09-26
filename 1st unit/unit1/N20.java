import java.util.Scanner;
class N20{
	public static void main(String args[]){
		int x=1;
		int y=1;
		int z;
		System.out.println("the fibonacci series upto 20 elements are :\n");
		System.out.println(x);
		System.out.println(y);
		for(int n=2;n<=20;n++){
			z=x+y;
			x=y;
			y=z;
			System.out.println(z);
			}
	}
}
			