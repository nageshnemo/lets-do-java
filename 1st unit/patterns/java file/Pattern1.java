import java.util.Scanner;
class Pattern1 {
		public static void main(String args[]){
		int i,j;
		int num;
		System.out.println("enter value of num");
		Scanner a=new Scanner(System.in);
		num = a.nextInt();
		for(i=1;i<=num;i++){
			for(j=1;j<=num;j++){
				if(j<=i){
					System.out.print(j);
                                        
				  }       
                                         else
				         System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}