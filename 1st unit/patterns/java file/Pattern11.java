import java .util.Scanner;
class Pattern11{
		public static void main(String args[]){
		int i,j,k,num;
		Scanner a=new Scanner(System.in);
		num=a.nextInt();
		System.out.println("enter values of num");
		for(i=1;i<=num;i++){
			k=num;
			for(j=1;j<=(2*num)-1;j++){
				
				if(j<=(num+1)-i || j>=(num-1)+i){
					System.out.print(k);
					if(j<num)
					k--;
					else
					k++;
                                        
				  }       
                                         else
				         System.out.print(" ");
					 
					}
			System.out.println();
			
			
		}
	}

}