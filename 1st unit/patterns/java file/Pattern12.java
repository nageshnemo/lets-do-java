import java .util.Scanner;
class Pattern12{
		public static void main(String args[]){
		int i,j,num,k=5;
		Scanner a=new Scanner(System.in);
		num=a.nextInt();
		System.out.println("enter values of num");
		for(i=1;i<=num;i++){
			
			for(j=1;j<=(2*num)-1;j++){
				
				if(j<=(num+1)-i || j>=(num-1)+i){
					System.out.print(k);
					
                                        
				  }       
                                         else
				         System.out.print(" ");
					 
					}
			System.out.println();
			k--;
			
		}
	}

}