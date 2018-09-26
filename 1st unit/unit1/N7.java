import java.util.Scanner;
class N7{
	public static void main(String args[]){
		float centigrade;    
		Scanner n = new Scanner(System.in);       //obj is the object of scanner class
		System.out.println("enter centigrade");
		centigrade=n.nextFloat();
		System.out.println("Fahrenheit is:"+(centigrade*(9/5f)+32));
			
	}
}