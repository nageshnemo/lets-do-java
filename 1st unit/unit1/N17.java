import java.util.Scanner;
class N17{
	public static void main(String args[]){
		int i,n;
		System.out.println("enter the number to reverse its multiplication table");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
		for(i = 10;i >= 1;i--){
		System.out.println(n*i);
			}
	}
}			