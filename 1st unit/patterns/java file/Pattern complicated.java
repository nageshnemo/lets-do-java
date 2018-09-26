class Pattern3{
		public static void main(String args[]){
		int i,j,k=1;
		for(i=1;i<=5;i++){
			for(j=1;j<=9;j++){
				if(j>=6-i && j<=4+i){
					System.out.print("   "+(k*k));
                                        k++;
				  }       
                                         else
				         System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}