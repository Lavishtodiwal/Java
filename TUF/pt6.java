class pt6{
	public static void main(String... s){
		int i,j;
		int n= new java.util.Scanner(System.in).nextInt();
		for(i=0; i<n;i++){
			for(j=0;j<n-i;j++){
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
}