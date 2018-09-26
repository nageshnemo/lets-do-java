class Pattern1{
		public static void main(String args[]){
		int i,j,k=0;
		char l;
		for(i=1;i<=20;i++){
			l='A';
			if(i<10)
			k++;
			else
			if(i==10){
			}
			else
			k--;
			for(j=1;j<=19;j++){
				
				if(j<=11-k || j>=10+k){
					System.out.print(l);
					if(j<10)
					l++;
					else
					
					
					l--;
					}       
                                         else{
				         System.out.print(" ");
					 if(j==10)
					 l--;
					 }
			}
			System.out.println();
			
			
			
		}
	}

}