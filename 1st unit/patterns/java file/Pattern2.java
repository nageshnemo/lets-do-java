import java.util.Scanner;
class Pattern2 {
		public static void main(String args[]){
		int i,j,l,num;
		Scanner a=new Scanner(System.in);
		System.out.println("enter value of num");
		num = a.nextInt();
		for(i = 1;i <= num;i++){
			l=i;
			for(j = 1;j <= num;j++){
				if(j >= (num+1)-i && j <= num){
					System.out.print(l);
                                        l--;
				  }       
                                         else
				         System.out.print(" ");
			}
			System.out.println();
			
			
		}
	}

}