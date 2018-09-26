import java.util.Scanner;
class N4{
	public static void main(String args[]){
		
		String name,add,num;    
		Scanner n=new Scanner(System.in);       //obj is the object of scanner class
		System.out.println("enter name");
		name = n.nextLine();
		System.out.println("enter address");
		add = n.nextLine();
		System.out.println("enter number");
		num = n.nextLine();
		System.out.println(" name is :"+name);
		System.out.println(" adress is :"+add);
		System.out.println(" number is:"+num);
	}
}