import java.util.Scanner;
class N16{
	public static void main(String args[]){
		int i,n;
		System.out.println("enter the number to print  its multiplication table");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		for(i = 1;i <= 10;i++){
		System.out.println(n*i);
			}
	}
}			