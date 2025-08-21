class pt9{
	public static void main(String... s){
		int i,j;
		int n= new java.util.Scanner(System.in).nextInt();
		for(i=0;i<n;i++){
			//space
			for(j=0;j<n-i-1;j++){
				System.out.print(" ");
			}
			//star
			for(j=0;j<2*i-1;j++){
				System.out.print("*");
			}
			//space
			for(j=0;j<n-i-1;j++){
				System.out.print(" ");
			}
			System.out.println();
		}
		//below pyramid
		for(i=1;i<n;i++){
			//space
			for(j=0;j<i-1;j++){
				System.out.print(" ");
			}
			//star
			for(j=0;j<2*n-2*i-1;j++){
				System.out.print("*");
			}
			//space
			for(j=0;j<i;j++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}