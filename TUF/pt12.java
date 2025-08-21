class pt12{
	public static void main(String... s){
		int i,j,start;
		int n= new java.util.Scanner(System.in).nextInt();
		start=2*(n-1);
		for(i=0;i<n;i++){
			//numbers
			for(j=0;j<=i;j++){
				System.out.print(j+1);
			}
			//spaces
			for(j=0;j<start;j++){
				System.out.print(" ");
			}
			//numbers
			for(j=i;j>=0;j--){
				System.out.print(j+1);
			}
			System.out.println();
			start-=2;
		}
	}
}