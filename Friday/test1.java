class test1{
	public static void main(String... s){
		int i,j,n=10;
		for(i=0;i<n/2;i++){
			//hash
			if(i==0){
				for(j=0;j<n;j++){
				System.out.print("#");
			}
			}
			else{
			for(j=1;j<n/2-i;j++){
				System.out.print(" ");
			}
			for(j=0;j<2*i+1;j++){
				System.out.print("#");
			}
			}
			System.out.println();
		}
		for(i=1;i<n/2;i++){

			//hash
			if(i==(n/2)-1){
			for(j=0;j<n;j++){
				System.out.print("#");
			}	
			}
			else{
			for(j=0;j<i;j++){
				System.out.print(" ");
			}
			for(j=0;j<2*n/2-2*i-1;j++){
				System.out.print("#");
			}
			}
			System.out.println();
		}
	}
}