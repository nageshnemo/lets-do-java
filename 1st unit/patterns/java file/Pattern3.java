class Pattern3{
		public static void main(String args[]){
		int i,j,l;
		for(i=1;i<=5;i++){
			l=i;
			for(j=1;j<=9;j++){
				
				if(j>=6-i && j<=4+i){
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