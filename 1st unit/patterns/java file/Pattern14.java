/*
5 5 5 5 5 5 5 5 5
4 4 4 4   4 4 4 4
3 3 3       3 3 3
2 2           2 2
1               1
1               1
2 2           1 2
3 3 3       3 3 3
4 4 4 4   4 4 4 4
5 5 5 5 5 5 5 5 5   
*/
class Pattern14{
		public static void main(String args[]){
		int i,j,k=0,l=6;
		for(i=1;i<=10;i++){
			if(i<=5){
				k++;
				l--;
			}
			else{
				if(i==6){
				
				}
			else{
				k--;
				l++;
			}
			}
			for(j=1;j<=9;j++){
				if(j<= 6-k || j>= 4+k){
					System.out.print(l);
                                        
				  }       
                                         else
				         System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}