import java.util.Scanner;
class Pattern3{
		public static void main(String args[]){
		int i,j,k=1,num;
		Scanner a=new Scanner(System.in);
		num=a.nextInt();
		for(i=1;i<=num;i++){
			
			for(j=1;j<=(2*num)-1;j++){
				
				if( j>=(num+1)-i && j<=(num-1)+i){
					
					System.out.print(k*k);
					k++;
                                        
				  }       
                                         else
				         System.out.print(" ");
			}
			System.out.println();
			
			
			
		}
	}

}