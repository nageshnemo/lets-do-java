class Pattern13{
		public static void main(String args[]){
		int i,j,k=0,l=5;
		for(i=1;i<=10;i++){
			l=5;
			if(i<=5){
				k++;
			}
			else{
				if(i==6){
				
				}
			else{
				k--;
			}
			}
			for(j=1;j<=9;j++){
				if(j<= 6-k || j>= 4+k){
					System.out.print(l);
                                        if(j<5)
					l--;
					else 
					l++;
				  }       
                                         else
				         System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}