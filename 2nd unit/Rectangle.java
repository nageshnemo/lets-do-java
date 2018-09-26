import java.util.Scanner;
class Rectangle{
	private int width;
	private int height;
	
	public int getWidth() {                //getters and setters 							
	return width;
	}
	public int getHeight() {
	return height;
	}
	public void setWidth(int w) {
	width=w;
	
	}
	public void setHeight(int h) {
	height=h;
	}
	public void acceptData() {
	Scanner a=new Scanner(System.in);
	System.out.println("enter width of rectangle:");
	width=a.nextInt();
	System.out.println("enter height of rectangle:");
	height=a.nextInt();
	}
	public void showData() {
	System.out.println("width:"+width);

	System.out.println(" height:"+height);
	}

	public int getArea() {
	return width*height;
	}

	public int getPerimeter() {
	return 2*(width+height);
	}


	public static void main(String []args) {
	Rectangle r=new Rectangle();
	r.acceptData();
	r.showData();
	System.out.println("area is:"+r.getArea());
	System.out.println("perimeter  is:"+r.getPerimeter());

	}
} 