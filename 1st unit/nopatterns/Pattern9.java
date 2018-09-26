/*
1
2 3 2
3 4 5 4 3 
4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5
*/
class Pattern9{
		public static void main(String args[]){
		int i,j,k=1,l=1;
		
		for(i=1 ; i<=5 ; i++){
			l=i;
			for(j=1 ; j<=9 ; j++){
				
				if( j>=1 && j<=k){
					
					System.out.print(l);
					if(j>=i)
					l--;
					else
					l++;
                                        
				  }       
                                         else
				         System.out.print(" ");
			}
			System.out.println();
			k+=2;
			
			
		}
	}

} 