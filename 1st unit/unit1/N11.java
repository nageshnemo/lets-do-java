import java.util.Scanner;
class N11{
	public static void main(String args[]){
		int n,count=0;
		System.out.println("enter the number to know the no of digits in that number");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		while(n!=0){
			n=n/10;
			count++;
		}
			System.out.println("the no of digits in the number is:"+count);
	}

}			