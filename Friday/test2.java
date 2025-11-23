class test2{
	public static void main(String... s){
		int i,j,n=6;
			for(i=0;i<n;i++){
			//space
			for(j=0;j<i;j++){
				System.out.print(" ");
			}
			//star
			for(j=0;j<(2*n-2*i-1)/2;j++){
				System.out.print(j+1);
			}
			//space
			for(j=(2*n-2*i-1)/2;j>=0;j--){
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
}