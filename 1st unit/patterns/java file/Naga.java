import java.util.Scanner;
class Naga{
		public static void main(String args[]){
		int i,j,k=1,l;
		int num;
		Scanner a=new Scanner(System.in);
		num=a.nextInt();
		for(i=1;i<=num;i++){
			l=k;
			for(j=1;j<=num;j++){
				if(j>=(num+1)-i && j<=num){
					System.out.print(" "+l);
                                        l--;
				  }       
                                         else
				         System.out.print(" ");
			}
			System.out.println();
			k++;
			
		}
	}

}