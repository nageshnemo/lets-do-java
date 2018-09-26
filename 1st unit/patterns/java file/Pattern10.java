import java .util.Scanner;
class Pattern10{
		public static void main(String args[]){
		int i,j,k,num;
		Scanner a=new Scanner(System.in);
		num=a.nextInt();
		System.out.println("enter values of num");
		for(i=1;i<=num;i++){
			k=1;
			for(j=1;j<=(2*num)-1;j++){
				
				if(j>=(num+1)-i && j<=(num-1)+i){
					System.out.print(k);
                                        k=1-k;
				  }       
                                         else
				         System.out.print(" ");
			}
			System.out.println();
			
			
		}
	}

}