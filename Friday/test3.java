class Test3{
	public static void main(String... s){
		int i,j,n=8;
		for(i=0;i<n;i++){
			//numbers
			for(j=0;j<=i;j++){
				System.out.print(j+1);
			}
			//spaces
			for(j=0;j<2*n-i;j++){
				System.out.print(" ");
			}
			//numbers
			for(j=i;j>=0;j--){
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
}