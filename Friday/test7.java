class test7{
	public static void main(String... s){
		int i,j,n=7,sp;
			for(i=0;i<n;i++){
				sp=1;
				for(j=0;j<n-i;j++){
					System.out.print(" ");
				}
				for(j=0;j<=i;j++){
					System.out.print(sp+" ");
					sp=sp*(i-j)/(j+1);
				}
			System.out.println();
		}
	}
}