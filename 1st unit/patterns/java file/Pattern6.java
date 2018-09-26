import java.util.Scanner;
class Pattern6 {
		public static void main(String args[]){
		int i,j,l=1,num;
		Scanner a=new Scanner(System.in);
		System.out.println("enter value of num");
		num = a.nextInt();
		for(i = 1;i <= num;i++){
			for(j = 1;j <= num;j++){
				if(j >=(num+1)-i && j <=(num-1)+i ){
					System.out.print(l);
                                        l=1-l;
				  }       
                                         else
				         System.out.print(" ");
			}
			System.out.println();
			
			
		}
	}

}