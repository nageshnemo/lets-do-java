import java.util.Scanner;
class N6{
	public static void main(String args[]){
		
		int width;
		int height;    
		Scanner n=new Scanner(System.in);       //obj is the object of scanner class
		System.out.println("enter width");
		width=n.nextInt();
		System.out.println("enter height");
		height = n.nextInt();
		System.out.println("area of rectangle is:"+(width*height));
		System.out.println(" perimeter of rectangle is:"+2*(width+height));
		
	}
}