import java.util.Scanner;
class Pattern4{
		public static void main(String args[]){
		int i,j,k=1,num;
		Scanner a=new Scanner(System.in);
		num=a.nextInt();
		for(i=1;i<=num;i++){
			
			for(j=1;j<=num;j++){
				
				if( j<=i){
					
					System.out.print(k*j);
                                        
				  }       
                                         else
				         System.out.print(" ");
			}
			System.out.println();
			k++;
			
			
		}
	}

}