import java.util.Scanner;
class Point {
	protected int x;
	protected int y;

	publlic Point() {                //default constructor
	}

	public Point(int x ,int y) {    //parametrised constructor
	this.x=x;
	this.y=y;
	}

	public int getX() {
	return x;
	}
	
	public void setX(int a) {
	x=a;
	}
	
	public void setY(int a) {
 	y=a;
	}
	
	public int getY() {
	return y;
	}
	
	public void acceptData() {
	Scanner a=new Scanner(System.in);
	System.out.println("enter X:");
	x=a.nextInt();
	System.out.println("enter Y:");
	y=a.nextInt();
	}
	
	public void showData() {
	System.out.println(" X is:"+x);
	System.out.println("y is:"+y);
	}
	

	public static void main(String []args) {
	Point p=new Point();
	p.acceptData();
	p.showData();
	Point p1=new Point(34,5);
	p1.showData();
	}
}
	


	
	