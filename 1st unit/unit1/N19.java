import java.util.Scanner;
class N19{
	public static void main(String args[]){
		int i,j,n,count=0;
		System.out.println("the prime numbers from 100 to 200 is");
		for(i = 100;i <= 200;i++){
			count=0;
			for(j = 2;j <= i / 2;j++){
				if(i%j == 0)
					count++;
					break;
			        }
				if(count == 1)	
				System.out.println("the no is prime::"+i);
				else
				System.out.println("the no is composite::"+i);
		}
	}
}
