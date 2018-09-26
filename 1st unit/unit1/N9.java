import java.util.Scanner;
class N2{
	public static void main(String args[]){
		char ch;
		Scanner a = new Scanner(System.in);
		System.out.println("enter the character to check whether it is upper case ,lower case or unique:");
		ch = a.nextLine().charAt(0);
		if(ch >= 'a' && ch <= 'z')
		System.out.println("character is in lower  case");		
		else if(ch >= 'A' && ch <= 'Z')
		System.out.println("character is in upper case");
		else
		System.out.println("character is unique");				
	}	
}