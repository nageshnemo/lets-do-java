import java.util.Scanner;
class N10 {
	public static void main(String args[]) {
		char ch;
		Scanner a=new Scanner(System.in);
		System.out.println("enter the character to check whether it is upper case ,lower case or unique:");
		ch=a.nextLine().charAt(0);
		if(ch >= 'a') {
			if(ch <='z')
			System.out.println("character is in lower  case");
			else
			System.out.println("character is unique");
			
		}	
		else if(ch >= 'A') {
				if(ch <= 'Z')
				System.out.println("character is in upper case");
				else
				System.out.println("character is unique");
		}
		else {
		System.out.println("character is unique");
		}			
		
	
	}
}