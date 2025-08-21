class pt2{
	public static void main(String... s){
		int i,j;
		int n= new java.util.Scanner(System.in).nextInt();
		for(i=0; i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}